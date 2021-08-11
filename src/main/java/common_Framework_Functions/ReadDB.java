package common_Framework_Functions;

import java.sql.*;

public class ReadDB {

    public static String connectDBAndGetValue(String columnName) {

        String host = "localhost";
        int port = 3306;
        String returnValue = null;
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/FlipKart",
                    "root", "root");

            Statement statement = conn.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from FlipKartMobilesemployee");

            while (resultSet.next()) {
                returnValue = resultSet.getString(columnName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return returnValue;
    }
}
