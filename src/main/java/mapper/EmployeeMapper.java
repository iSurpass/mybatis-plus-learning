package mapper;

import bean.Employee;
import com.baomidou.mybatisplus.mapper.BaseMapper;

/**
 * Mapper 接口
 *
 * 基于 Mybatis : 在 Mapper 接口中编写 CRUD 相关方法 提供 Mapper 接口所对应的 SQL 映射文件
 *               对应的 SQL 语句
 * 基于 MP : 让 XxxMapper 接口集成 BaseMapper 即可
 *          BaseMapper<T>: 泛型指定的就是当前 Mapper 接口所操作的实体类型
 * @author Juniors
 */
public interface EmployeeMapper extends BaseMapper<Employee> {


}
