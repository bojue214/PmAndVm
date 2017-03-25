package job.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import job.ssm.po.Vm;
import job.ssm.po.VmExample;

public interface VmMapper {
    int countByExample(VmExample example);

    int deleteByExample(VmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Vm record);

    int insertSelective(Vm record);

    List<Vm> selectByExample(VmExample example);

    Vm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Vm record, @Param("example") VmExample example);

    int updateByExample(@Param("record") Vm record, @Param("example") VmExample example);

    int updateByPrimaryKeySelective(Vm record);

    int updateByPrimaryKey(Vm record);
}