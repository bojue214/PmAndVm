package job.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import job.ssm.po.UserCustom;
import job.ssm.po.UserQueryVo;
import job.ssm.service.impl.UserService;

/**
 *  <p>Title: UserController </p>
 *  <p>Description: 用户Controller类</p>
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	/**
	 * @Title: queryUsers
	 * @Description: 用户列表的查询(系统管理员)
	 */
	@RequestMapping("/queryUsers")
	public ModelAndView  queryUsers(HttpSession session,UserQueryVo userQueryVo) throws Exception
	{
		
//		UserCustom userCustom = (UserCustom)session.getAttribute("userCustom");
//		if(null != userCustom)
//		{
//			userQueryVo.setUserCustom(userCustom);
//		}
		
		List<UserCustom> usersList = userService.findUsersList(userQueryVo);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("usersList", usersList);
		
		modelAndView.setViewName("users/admin/usersList");
		
		return modelAndView;
	}
	
	/**
	 * @Title: editUser
	 * @Description: 修改用户信息
	 */
	@RequestMapping("/editUser")
	public ModelAndView editUser(Integer id) throws Exception
	{
		UserCustom userCustom = userService.findUserById(id);
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("userCustom", userCustom);
		
		modelAndView.setViewName("users/editUser");
		
		return modelAndView;
	}
	
	/**
	 * @Title: editUserSubmit
	 * @Description: 提交修改后的用户信息
	 */
	@RequestMapping("/editUserSubmit")
	public String editUserSubmit(Integer id,UserCustom userCustom) throws Exception
	{
		userService.updateItemsById(id, userCustom);
		return "redirect:queryUsers.action";
	}
	
	/**
	 * @Title: addUser
	 * @Description: 添加用户
	 */
	@RequestMapping("/addUser")
	public String addUser() 
	{
		return "users/admin/addUser";
	}
	
	/**
	 * @Title: addUserSubmit
	 * @Description:提交要添加的用户信息
	 */
	@RequestMapping("/addUserSubmit")
	public String addUserSubmit(UserCustom userCustom) throws Exception
	{
		userService.insertUser(userCustom);
		return "redirect:queryUsers.action";
	}
	
	/**
	 * @Title: deleteUser
	 * @Description: 删除用户
	 */
	@RequestMapping("/deleteUser")
	public String deleteUser(Integer id) throws Exception
	{
		userService.deleteUserById(id);
		return "redirect:queryUsers.action";
	}
	
}

