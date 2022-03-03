package com.company.ORDER;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Newly implements Order {
    @Override
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.print("请输入序号:");
        int eno = in.nextInt();
        System.out.print("请输入事项:");
        String matter = in.next();
        System.out.print("请输入备注:");
        String remark = in.next();
        System.out.print("请输入日期：");
        String ddate = in.next();
        java.util.Date edate = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            edate = sdf.parse(ddate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        try {
            conn = DbUtils.getConnection();
            String sql = "insert into employee(eno,matter,remark,date) values(?,?,?,?,?)";
            pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, eno);
            pstmt.setString(2, matter);
            pstmt.setFloat(3, remark);
            pstmt.setString(4, ddate);
            int cnt = pstmt.executeUpdate();//所有写操作都使用executeUpdate
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeConnection(null, pstmt, conn);
        }
    }
