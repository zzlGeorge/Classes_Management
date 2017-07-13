package com.lzGeorge.app.controller;

import com.alibaba.fastjson.JSONObject;
import com.lzGeorge.app.dao.db.JdbcUtil;
import com.lzGeorge.app.service.ActivityService;
import com.lzGeorge.app.utils.BackMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by George on 2017/7/13.
 */

@Controller
@RequestMapping("/alterTable")
public class AlterTable {

    @ResponseBody
    @RequestMapping("/clearTable")
    public BackMessage clearTable(String tablename) throws SQLException {
        String sql = "truncate table " + tablename + ";";
        executeSql(sql);
        return BackMessage.success("清除表成功!");
    }

    @ResponseBody
    @RequestMapping("/updateTable")
    public BackMessage updateTable(HttpServletRequest request) throws SQLException {

        String obj = request.getParameter("mdata");
        JSONObject json = JSONObject.parseObject(obj);

        String tablename = json.getString("tablename");
        String sql = "alter table " + tablename;

        Iterator iterator = json.keySet().iterator();
        String key = null;
        String value = null;
        while (iterator.hasNext()) {
            key = (String) iterator.next();
            if (key.equals("tablename"))
                continue;
            value = json.getString(key);
            sql += " change " + key + " " + value + " varchar(12), ";
        }
        sql = sql.substring(0, sql.length() - 2);
        //批量修改
        executeSql(sql);
        return BackMessage.success("修改表成功!");
    }

    @ResponseBody
    @RequestMapping("/getColData")
    public BackMessage getColData(String tableName) {
        List<String> list = new ArrayList<String>();

        String sql = "select * from " + tableName;
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.createStatement();
            ResultSet set = statement.executeQuery(sql);
            ResultSetMetaData data = set.getMetaData();
            for (int i = 0; i < data.getColumnCount(); i++) {
                list.add(data.getColumnName(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.free(null, statement, connection);
        }
        return BackMessage.successData("操作成功！", "cols", list);
    }

    void executeSql(String sql) {
        Connection connection = null;
        Statement statement = null;
        try {
            connection = JdbcUtil.getConnection();
            statement = connection.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JdbcUtil.free(null, statement, connection);
        }
    }

}
