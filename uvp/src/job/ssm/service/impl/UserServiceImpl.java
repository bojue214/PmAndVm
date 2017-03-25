package job.ssm.service.impl;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import job.ssm.mapper.UserMapper;
import job.ssm.mapper.UserMapperCustom;
import job.ssm.po.User;
import job.ssm.po.UserCustom;
import job.ssm.po.UserQueryVo;
/**
 *  <p>Title: UserService </p>
 *  <p>Description:用户管理service的实现</p>
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapperCustom userMapperCustom;
	@Autowired
	private UserMapper userMapper;
	
	/**
	 * <p>Title: findUsersList</p>
	 * <p>Description:用户查询列表</p>
	 * @see job.ssm.service.impl.UserService#findUsersList(job.ssm.po.UserQueryVo)
	 */
	@Override
	public List<UserCustom> findUsersList(UserQueryVo userQueryVo) throws Exception {
		
		return userMapperCustom.findUsersList(userQueryVo);
		
	}

	/**
	 * <p>Title: updateItemsById</p>
	 * <p>Description: 修改用户信息</p>
	 * @see job.ssm.service.impl.UserService#updateItemsById(java.lang.Integer, job.ssm.po.UserCustom)
	 */
	@Override
	public void updateItemsById(Integer id, UserCustom userCustom) throws Exception {
		
		userCustom.setId(id);
		
		userMapper.updateByPrimaryKey(userCustom);
		
	}

	@Override
	public UserCustom findUserById(Integer id) throws Exception {
		
		User user = userMapper.selectByPrimaryKey(id);
		
		if(null == user)
		{
			//查询出来的用户信息异常待处理
			return null;
		}
		
		UserCustom userCustom = new UserCustom();
		
		BeanUtils.copyProperties(user, userCustom);
		
		return userCustom;
	}

	/**
	 * <p>Title: insertUser</p>
	 * <p>Description: 添加用户</p>
	 * @see job.ssm.service.impl.UserService#insertUser(job.ssm.po.UserCustom)
	 */
	@Override
	public void insertUser(UserCustom userCustom) throws Exception {
		
		if(null == userCustom)
		{
			//要添加的用户信息异常待处理
			return ;
		}
		
		User user = new User();
		
		BeanUtils.copyProperties(userCustom, user);
		//做插入操作
		userMapper.insert(user);
		
	}

	/**
	 * <p>Title: deleteUserById</p>
	 * <p>Description:根据用户id删除用户 </p>
	 * @see job.ssm.service.impl.UserService#deleteUserById(java.lang.Integer)
	 */
	@Override
	public void deleteUserById(Integer id) throws Exception {
		
		//参数的合法性校验
		
		//做删除操作
		userMapper.deleteByPrimaryKey(id);
		
	}

	/**
	 * <p>Title: isMatch</p>
	 * <p>Description:判断用户名与密码是否匹配</p>
	 * @see job.ssm.service.impl.UserService#isMatch(java.lang.String, java.lang.String)
	 */
	@Override
	public boolean isMatch(String username, String password) throws Exception {
		//参数的合法性校验
		
		UserCustom userCustom = new UserCustom();
		userCustom.setUsername(username);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		userQueryVo.setUserCustom(userCustom);
		
		String passwordTrue = userMapperCustom.findUserPassword(userQueryVo);
		
		if(password.equals(passwordTrue))
		{
			return true;
		}
		
		//userMapper.selectByExample(null);
		
		return false;
	}

	/**
	 * <p>Title: findUserByUsernameAndPassword</p>
	 * <p>Description: 根据用户名和密码查询用户</p>
	 * @see job.ssm.service.impl.UserService#findUserByUsernameAndPassword(java.lang.String, java.lang.String)
	 */
	@Override
	public UserCustom findUserByUsernameAndPassword(String username, String password) throws Exception 
	{
		
		UserCustom userCustom = new UserCustom();
		userCustom.setUsername(username);
		userCustom.setPassword(password);
		
		UserQueryVo userQueryVo = new UserQueryVo();
		userQueryVo.setUserCustom(userCustom);
		
		UserCustom userCustomRet = userMapperCustom.findUserByUsernameAndPassword(userQueryVo);
		if(null != userCustomRet)
		{
			return userCustomRet;
		}
		
		return null;
	}

}

