package prx.sunx.eureka.server.demo.service;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 浙江卓锐科技有限公司
 * <p>
 * Created by sunx on 2017/11/29.
 * Description: 过滤一些请求
 */
@Component
public class MyFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(MyFilter.class);

    /**
     * 路由过滤时机
     * @return
     * pre：路由之前
     * routing：路由之时
     * post： 路由之后
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤的顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 可以写逻辑判断，是否要过滤，为true,永远过滤。
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }
}
