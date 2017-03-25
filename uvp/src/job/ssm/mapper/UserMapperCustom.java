package job.ssm.mapper;

import java.util.List;

import job.ssm.po.UserCustom;
import job.ssm.po.UserQueryVo;

public interface UserMapperCustom {

	//用户查询列表
	public List<UserCustom> findUsersList(UserQueryVo userQueryVo)throws Exception;
	
	//获取密码
	public String findUserPassword(UserQueryVo userQueryVo)throws Exception;
	
	//查询用户
	public UserCustom findUserByUsernameAndPassword(UserQueryVo userQueryVo)throws Exception;
	
}

