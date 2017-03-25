package job.ssm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import job.ssm.po.Pm;
import job.ssm.po.PmExample;

public interface PmMapper {
    int countByExample(PmExample example);

    int deleteByExample(PmExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pm record);

    int insertSelective(Pm record);

    List<Pm> selectByExample(PmExample example);

    Pm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pm record, @Param("example") PmExample example);

    int updateByExample(@Param("record") Pm record, @Param("example") PmExample example);

    int updateByPrimaryKeySelective(Pm record);

    int updateByPrimaryKey(Pm record);
}