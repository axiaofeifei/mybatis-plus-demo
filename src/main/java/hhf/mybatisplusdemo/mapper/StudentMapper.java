package hhf.mybatisplusdemo.mapper;

import hhf.mybatisplusdemo.entity.Student;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

}
