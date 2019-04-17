package com.springapp;

import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiepeng on 16/8/26.
 */
@Repository
public class FinanceDao {

    private static Connection getConnection()  {
        String url = "jdbc:mysql://localhost:3306/Qingjia?user=root&password";

        try {
            Class.forName("com.mysql.jdbc.Driver");// 动态加载mysql驱动
            Connection connection = DriverManager.getConnection(url);
            return connection;
        }catch (Exception e){

        }
        return null;
    }

    public static List<LeaveVo> getAllLeaveList() throws SQLException {
        Statement stmt = getConnection().createStatement();
        String sql = "select * from TableForLeave where type in ('事假','病假','探亲假') and pass = 1";

        ArrayList<LeaveVo> list = new ArrayList<LeaveVo>();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            LeaveVo vo = new LeaveVo(rs.getString(1),rs.getString(2),rs.getInt(11),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(8));
            list.add(vo);
        }

        return list;
    }

    public static List<LeaveVo> getOneLeaveList(Integer id) throws SQLException {
        Statement stmt = getConnection().createStatement();
        String sql = "select * from TableForLeave where type in ('事假','病假','探亲假') and pass = 1 and bankID = "+id;

        ArrayList<LeaveVo> list = new ArrayList<LeaveVo>();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            LeaveVo vo = new LeaveVo(rs.getString(1),rs.getString(2),rs.getInt(11),rs.getString(3),rs.getString(6),rs.getString(7),rs.getString(8));
            list.add(vo);
        }

        return list;
    }

    public static List<WorkOverTimeVo> getAllWorkOverTimeList() throws SQLException {
        Statement stmt = getConnection().createStatement();
        String sql = "select * from Jiaban where pass = 1";

        ArrayList<WorkOverTimeVo> list = new ArrayList<WorkOverTimeVo>();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            WorkOverTimeVo vo = new WorkOverTimeVo(Integer.valueOf(rs.getString(1)),rs.getInt(8),rs.getString(7),rs.getString(6));
            list.add(vo);
        }

        return list;
    }

    public static List<WorkOverTimeVo> getOneWorkOverTimeList(Integer id) throws SQLException {
        Statement stmt = getConnection().createStatement();
        String sql = "select * from Jiaban where pass = 1 and bankID ="+id;

        ArrayList<WorkOverTimeVo> list = new ArrayList<WorkOverTimeVo>();

        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            WorkOverTimeVo vo = new WorkOverTimeVo(Integer.valueOf(rs.getString(1)),rs.getInt(8),rs.getString(7),rs.getString(6));
            list.add(vo);
        }

        return list;
    }

}
