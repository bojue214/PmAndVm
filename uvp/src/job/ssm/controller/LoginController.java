package job.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import job.ssm.po.UserCustom;
import job.ssm.service.impl.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService userService;
	
	// 登陆
	@RequestMapping(value="/login",method={RequestMethod.GET,RequestMethod.POST})
	public String login(Model model,HttpSession session, String username, String password)throws Exception
	{
		if(null == username || null == password)
		{
			return "users/login";		
		}
		
		//调用service进行用户身份验证
		boolean result = userService.isMatch(username, password);
//		System.out.println("reslut : " + result);
		
		if(result)
		{
			UserCustom userCustom = userService.findUserByUsernameAndPassword(username, password);
			//在session中保存用户身份信息
			session.setAttribute("username",username);
			
			if(userCustom.getIsroot().equals("0"))
			{
				//普通用户页面
				model.addAttribute("userCustom", userCustom);
				
				return "users/ordinary/usersList";
				
//				session.setAttribute("userCustom",userCustom);
//				return "redirect:/queryUsers.action";
			}
			else 
			{
				//管理员页面
				return "redirect:/queryUsers.action";
			}
		}
		else
		{
			//用户名与密码不一致
			//.....页面提示操作
		}
		
		return "users/login";
	}

	// 退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到登陆页面
		return "redirect:/login.action";
	}

}

