import com.yyh.dao.DeptDao;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author YanYuHang
 * @create 2020-04-22-14:38
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-*.xml"})
public class Test {

    @Autowired
    private DeptDao deptDao;


    @org.junit.Test
    public void testDeptSelectAll(){
        deptDao.selectAll().forEach(System.out::println);
    }





}
