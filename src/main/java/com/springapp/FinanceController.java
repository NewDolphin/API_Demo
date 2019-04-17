package com.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by xiepeng on 16/8/26.
 */
@Controller
public class FinanceController {

    @Autowired
    private FinanceDao financeDao;

    @ResponseBody
    @RequestMapping(value = "/getAllLeaveList", method = RequestMethod.GET)
    public List<LeaveVo> getAllLeaveList() throws SQLException {

        String str = "1";
        Integer.valueOf(str);


        return financeDao.getAllLeaveList();
    }

    @ResponseBody
    @RequestMapping(value = "/getOneLeaveList", method = RequestMethod.GET)
    public List<LeaveVo> getOneLeaveList(@RequestParam(value="id") Integer id) throws SQLException {

        return financeDao.getOneLeaveList(id);
    }

    @ResponseBody
    @RequestMapping(value = "/getAllWorkOverTimeList", method = RequestMethod.GET)
    public List<WorkOverTimeVo> getAllWorkOverTimeList() throws SQLException {

        return financeDao.getAllWorkOverTimeList();
    }

    @ResponseBody
    @RequestMapping(value = "/getOneWorkOverTimeList", method = RequestMethod.GET)
    public List<WorkOverTimeVo> getOneWorkOverTimeList(@RequestParam(value="id") Integer id) throws SQLException {

        return financeDao.getOneWorkOverTimeList(id);
    }
}
