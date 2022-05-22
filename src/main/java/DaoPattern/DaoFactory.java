package DaoPattern;

import java.sql.*;
public class DaoFactory {
    private final String url;
    private final String username;
    private final String password;
    DaoFactory(String url, String username, String password) {
        this.url = url;
        this.username = username;
        this.password = password;
    }
    public static DaoFactory getInstance() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        }
        DaoFactory instance = new DaoFactory("jdbc:mysql://localhost/tpjavaee", "root", "");
        return instance;
    }
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, username, password);
    }
    // Récupération du Dao
    public CompteClientsDao getCompteClientsDao() {
        return new CompteClientImp(this);
    }
}
