package com.lzGeorge.app.controller.servlet;

import com.lzGeorge.app.dao.db.JdbcUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by admin on 2017/6/15.
 */
public class AddMsg extends HttpServlet {

    /**
     *
     */
    private static final long serialVersionUID = 1902421937636029993L;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String path = request.getContextPath() + "/";
        String requestUri = request.getRequestURI();
        String midUrl = requestUri.replaceFirst(path, "");
        String lasturl = midUrl.substring(0, midUrl.lastIndexOf("."));
        System.out.println(lasturl);
        System.out.println(request.getRemoteAddr());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String college = request.getParameter("college");
        String name = request.getParameter("name");
        String sex = request.getParameter("sex");
        String snum = request.getParameter("snum");
        String classes = request.getParameter("classes");
        String address = request.getParameter("address");
        String tel = request.getParameter("tel");
        String dur_Time = request.getParameter("dur_Time");
        String reason = request.getParameter("reason");
        String teacher = request.getParameter("teacher");
        String teacher_tel = request.getParameter("teacher_tel");
        String record_time = new Date().toString();

        try {
            Connection conn = JdbcUtil.getConnection();
            String sql = "insert into stay_inschool (college,name,sex,snum,classes,address,tel,dur_Time,reason,teacher,teacher_tel,record_time) values (?,?,?,?,?,?,?,?,?,?,?,?) ";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, college);
            ps.setString(2, name);
            ps.setString(3, sex);
            ps.setString(4, snum);
            ps.setString(5, classes);
            ps.setString(6, address);
            ps.setString(7, tel);
            ps.setString(8, dur_Time);
            ps.setString(9, reason);
            ps.setString(10, teacher);
            ps.setString(11, teacher_tel);
            ps.setString(12, record_time);
            ps.executeUpdate();
            JdbcUtil.free(null, ps, conn);
            request.setAttribute("flag", "操作成功！");
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            request.setAttribute("flag", "操作失败！");
        }
        request.getRequestDispatcher("/pages/insert.jsp").forward(request, response);
    }

}
