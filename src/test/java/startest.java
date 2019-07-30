import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;

/**
 * @author Juniors
 */
public class startest {

    private ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");

    @Test
    public void testDataSource() throws Exception{

        // 测试数据源
        DataSource ds = ioc.getBean("dataSource",DataSource.class);
        System.out.println(ds);

        // 测试数据库连接
        Connection con = ds.getConnection();
        System.out.println(con);
    }
}
