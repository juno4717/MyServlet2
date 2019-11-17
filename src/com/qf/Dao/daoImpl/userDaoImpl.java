package com.qf.Dao.daoImpl;

import com.qf.Dao.userDao;
import com.qf.entity.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class userDaoImpl implements userDao {
    @Override
    public User getUser() {


        return null;
    }

    @Override
    public List<User> getUserList() {
        List<User> list = new ArrayList<>();

        //注册JDBC驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //创建连接对象
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiangou", "root", "123");
            //创建Statement对象
            Statement statement = connection.createStatement();
            //通过Statement对象执行sql语句
            String sql = "SELECT * FROM t_user ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                User user = new User();
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                /*System.out.println("USERName:"+username+"----"+"PASSWORD:"+password);*/
                user.setUserName(username);
                user.setPassword(password);
                list.add(user);
            }
            connection.close();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }


        return null;
    }
}
