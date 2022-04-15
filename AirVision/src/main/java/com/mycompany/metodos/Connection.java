/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodos;


import org.apache.commons.dbcp2.BasicDataSource;

/**
 *
 * @author jsantos
 */
public class Connection {
     private BasicDataSource dataSource;

    public Connection() {
        dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/airvision");
        dataSource.setUsername("root");
        dataSource.setPassword("310897");
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }
}
