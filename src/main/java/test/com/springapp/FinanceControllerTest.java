package test.com.springapp;

import com.springapp.FinanceDao;
import com.springapp.LeaveVo;
import com.springapp.WorkOverTimeVo;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * FinanceController Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>十二月 10, 2016</pre>
 */
public class FinanceControllerTest {
    FinanceDao financeDao = new FinanceDao();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getAllLeaveList()
     */
    @Test
    public void testGetAllLeaveList() throws Exception {
        List<LeaveVo> list = financeDao.getAllLeaveList();
        for (LeaveVo vo : list){
            System.out.println(vo);
        }
    }

    /**
     * Method: getOneLeaveList(@RequestParam(value="id") Integer id)
     */
    @Test
    public void testGetOneLeaveList() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: getAllWorkOverTimeList()
     */
    @Test
    public void testGetAllWorkOverTimeList() throws Exception {
        List<WorkOverTimeVo> list = financeDao.getAllWorkOverTimeList();
        for (WorkOverTimeVo vo : list){
            System.out.print(vo);
        }
    }

    /**
     * Method: getOneWorkOverTimeList(@RequestParam(value="id") Integer id)
     */
    @Test
    public void testGetOneWorkOverTimeList() throws Exception {
//TODO: Test goes here... 
    }


} 
