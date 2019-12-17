package tody.springboot.springbootproject.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * CommonInterceptor
 */
public class CommonInterceptor extends HandlerInterceptorAdapter{

    protected Log log = LogFactory.getLog(this.getClass());

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        if(log.isDebugEnabled()) {
            log.debug("===================        END        ===================\n");
        }
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        if(log.isDebugEnabled()) {
            log.debug("===================       START       ===================");
            log.debug("Request URI \t:" + request.getRequestURI());
        }
        return super.preHandle(request, response, handler);
    }

}
