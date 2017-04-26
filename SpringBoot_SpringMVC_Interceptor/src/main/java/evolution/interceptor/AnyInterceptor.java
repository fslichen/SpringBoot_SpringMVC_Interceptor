package evolution.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class AnyInterceptor extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler)
					throws Exception {
		System.out.println("The request method has been invoked.");
		request.setAttribute("beginTime", System.currentTimeMillis());
		return true;
	}

	//after the handler is executed
	@Override
	public void postHandle(
			HttpServletRequest request, HttpServletResponse response,
			Object handler, ModelAndView modelAndView)
					throws Exception {
		long beginTime = (Long) request.getAttribute("beginTime");
		long endTime = System.currentTimeMillis();
		long executeTime = endTime - beginTime;
		if (modelAndView != null) {
			modelAndView.addObject("executeTime",executeTime);
		}
		System.out.println("The method is executed. Total execution time = " + executeTime + " ms.");
	}
}
