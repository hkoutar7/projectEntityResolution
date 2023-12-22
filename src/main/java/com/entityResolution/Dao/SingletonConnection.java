package com.entityResolution.Dao;

import java.sql.*;

public class SingletonConnection {

    private static SingletonConnection instance;
    private Connection connection;
    private String url = "jdbc:mysql://localhost:3306/db_entity_resolution";
    private String username = "root";
    private String password = "";


    private SingletonConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
            System.out.println("connection established successfully ");
        } catch (ClassNotFoundException ex) {
            System.out.println("Something is wrong with the DB connection String : " + ex.getMessage());
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public static SingletonConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new SingletonConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new SingletonConnection();
        }
        return instance;
    }

}

/**
 * access : SingletonConnection connection = SingletonConnection.getInstance();
 *          connection.getConnection();
 */


