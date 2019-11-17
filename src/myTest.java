import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class myTest {
    public static void main(String[] args) throws Exception{
        //注册JDBC驱动
        Class.forName("com.mysql.jdbc.Driver");

        //创建连接对象
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/tiangou", "root", "123");
        //创建Statement对象
        Statement statement = connection.createStatement();
        //通过Statement对象执行sql语句
        String sql = "SELECT * FROM t_user ";
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String username = resultSet.getString("username");
            String password = resultSet.getString("password");
            System.out.println("USERName:"+username+"----"+"PASSWORD:"+password);
        }
        connection.close();
    }
}
