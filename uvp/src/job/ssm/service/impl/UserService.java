package job.ssm.service.impl;

import java.util.List;

import job.ssm.po.UserCustom;
import job.ssm.po.UserQueryVo;

/**
 *  <p>Title: UserService </p>
 *  <p>Description:用户管理service</p>
 */
public interface UserService {
	
	//用户查询列表
	public List<UserCustom> findUsersList(UserQueryVo userQueryVo)throws Exception;
	
	//根据用户id查询用户
	public UserCustom findUserById(Integer id) throws Exception;
	
	//用户信息修改
	public void updateItemsById(Integer id,UserCustom userCustom) throws Exception;
	
	//添加用户
	public void insertUser(UserCustom userCustom)throws Exception;
	
	//根据用户id删除用户
	public void deleteUserById(Integer id) throws Exception;
	
	//判断用户名与密码是否匹配
	public boolean isMatch(String username,String password) throws Exception;
	
	//查询用户
	public UserCustom findUserByUsernameAndPassword(String username,String password)throws Exception;
		
}

