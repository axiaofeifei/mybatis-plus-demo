package hhf.mybatisplusdemo.serviceImpl;

import hhf.mybatisplusdemo.entity.Student;
import hhf.mybatisplusdemo.mapper.StudentMapper;
import hhf.mybatisplusdemo.service.IStudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author hhf
 * @since 2022-06-01
 */
@Service("IStudentService")
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

}
