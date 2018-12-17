import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {
    private static BasicDataSource basicDataSource = null;//数据库连接

    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");// 装载驱动
            // 获取mysql数据库连接
            basicDataSource = new BasicDataSource();
            basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
            basicDataSource.setUrl("jdbc:mysql://localhost:3306/test");
            basicDataSource.setUsername("root");
            basicDataSource.setPassword("root");
            basicDataSource.setInitialSize(5);// 初始化连接数
            basicDataSource.setMaxActive(30);// 最大连接数
            basicDataSource.setMaxIdle(5);// 最大空闲连接数
            basicDataSource.setMinIdle(2);// 最小空闲连接数

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void printlnResult(ResultSet resultSet) throws SQLException {
        // 遍历结果集，获取数据
        while (resultSet.next()) {
            Long id = resultSet.getLong("id");
            String name = resultSet.getString("name");
            Integer age = resultSet.getInt("age");
            System.out.println("User[id=" + id + ",name=" + name + ",age=" + age + "]");
        }
    }

    private static String sql = "select * from user";

    private static Connection getJdbcConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
    }

    private static void executeSql(Connection conn, Boolean usePs) throws SQLException {
        ResultSet resultSet = null;
        Statement statement = null;
        PreparedStatement ps = null;
        if (usePs) {
            ps = conn.prepareStatement(sql);  // 创建sql执行对象
            resultSet = ps.executeQuery(); // 执行sql，返回结果集
        } else {
            statement = conn.createStatement();  // 创建sql执行对象
            resultSet = statement.executeQuery(sql); // 执行sql，返回结果集
        }

        if (resultSet != null) resultSet.close();
        if (statement != null) statement.close();
        if (ps != null) ps.close();
    }


    private static void executeJdbc(Boolean usePs) throws SQLException {
        Connection conn = getJdbcConnection();
        executeSql(conn, usePs);
        conn.close();
    }

    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Connection jdbcConnection = getJdbcConnection();
        int count = 1000;
        long start;
        try {
            start = System.currentTimeMillis();
            System.out.println("Connection: new， pool: false， PrepareStatement: false");
            for (int i = 0; i < count * 1; i++) {
                getJdbcConnection().close();
                if (i % 1000 == 999) {
                    System.out.println(System.currentTimeMillis() - start);
                    start = System.currentTimeMillis();
                }
            }

            System.out.println("Connection: new， PrepareStatement: false");
            start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                executeJdbc(false);   //
            }
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Connection: new， PrepareStatement: true");
            start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                executeJdbc(false);   //
            }
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Connection: one， PrepareStatement: false");
            start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                executeSql(jdbcConnection, true);
            }
            System.out.println(System.currentTimeMillis() - start);


            System.out.println("Connection: one， PrepareStatement: true open");
            start = System.currentTimeMillis();
            conn = getJdbcConnection();
            PreparedStatement ps = conn.prepareStatement(sql);  // 创建sql执行对象
            // 获取mysql数据库连接
            for (int i = 0; i < count; i++) {
                ResultSet resultSet = ps.executeQuery(sql); // 执行sql，返回结果集
                if (resultSet != null) resultSet.close();
            }
            if (ps != null) ps.close();
            conn.close();
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Connection: one， PrepareStatement: true close");
            start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                executeSql(jdbcConnection, true);
            }
            System.out.println(System.currentTimeMillis() - start);


            System.out.println("Connection: pool， PrepareStatement: false");
            start = System.currentTimeMillis();
            for (int i = 0; i < count; i++) {
                conn = basicDataSource.getConnection();
                executeSql(conn, false);
                conn.close();
            }
            System.out.println(System.currentTimeMillis() - start);

            System.out.println("Connection: pool， PrepareStatement: true");
            start = System.currentTimeMillis();
            // 获取mysql数据库连接
            for (int i = 0; i < count; i++) {
                conn = basicDataSource.getConnection();
                executeSql(conn, true);
                conn.close();
            }
            System.out.println(System.currentTimeMillis() - start);



        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            basicDataSource.close();
            jdbcConnection.close();
        }
    }
}
