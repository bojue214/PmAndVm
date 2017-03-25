package job.ssm.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	//执行Handler之前要执行
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

		//获取请求url
		String url = request.getRequestURI();
		//对特殊的url进行放行,也可以在springmvc.xml中的拦截器配置
//		if(url.lastIndexOf("login.action") >= 0 || url.lastIndexOf("register.action") >= 0)
//		{
//			return true;
//		}
		
		HttpSession session = request.getSession();
		
		String username = (String)session.getAttribute("username");
		
		if(null != username)
		{
			return true;
		}
		//进行拦截,页面回到登陆界面
		request.getRequestDispatcher("/WEB-INF/views/users/login.jsp").forward(request, response);
		
		return false;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exx)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

}

