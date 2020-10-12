package com.banco.clientes.factorymethod.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import com.banco.clientes.factorymethod.IDBAdapter;
import com.banco.clientes.util.PropertiesUtil;

public class MariaDBAdapter implements IDBAdapter{

private static final String DB_PROPERTIES = "MariaDB.properties";
	
	private static final String URL = "url";

    static {
        //Bloque para registrar el Driver de MySQL
        try {
            new org.mariadb.jdbc.Driver();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Connection getConnection() {
        try {
            String connectionString = createConnectionString();
            Connection connection = DriverManager.getConnection(connectionString);
            System.out.println("Connection class ==> " + connection.getClass().getName());
            return connection;
        } catch (Exception e) {System.out.println("No se pudo conectar");
            e.printStackTrace();
            return null;
        }

    }

    private String createConnectionString() {
        Properties prop = PropertiesUtil.loadProperty(DB_PROPERTIES);

        return prop.getProperty(URL);
    }
}
