package com.banco.clientes.factorymethod;

import java.sql.Connection;

public interface IDBAdapter {

	public Connection getConnection();
}
