package com.lzGeorge.app.dao.db;

import java.sql.*;
import java.util.Properties;

public final class JdbcUtil {
    private static String driver = "";
    private static String url = "";
    private static String user = "";
    private static String password = "";
    private static Properties pr = new Properties();

    private JdbcUtil() {
    }

    static {
        try {
            pr.load(JdbcUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            driver = pr.getProperty("jdbc.driver");
            url = pr.getProperty("jdbc.url");
            user = pr.getProperty("jdbc.username");
            password = pr.getProperty("jdbc.password");
            Class.forName(driver);
        } catch (Exception e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public static void free(ResultSet rs, Statement st, Connection conn) {
        try {
            if (rs != null) rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                if (conn != null)
                    try {
                        conn.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
            }
        }
    }


    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            free(null, null, connection);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println("good");
    }
}