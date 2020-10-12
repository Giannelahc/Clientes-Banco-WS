package com.banco.clientes.factorymethod;

import java.util.Properties;

import com.banco.clientes.factorymethod.impl.MariaDBAdapter;
import com.banco.clientes.factorymethod.impl.OracleDBAdapter;
import com.banco.clientes.util.PropertiesUtil;

public class DBFactory {

	private final static  String DB_FACTORY = "DBFactory.properties";
	
	private final static String DEFAULT_DB_CLASS = "DB";
	
	public static IDBAdapter getAdapter(DBType type) {
		
		switch(type) {
			
			case MariaDB: return new MariaDBAdapter();
			
			case OracleDB: return new OracleDBAdapter();
			
			default: return null;
		}
	}
	
	public static IDBAdapter getDefaultDb() {
		
		try {
			
			Properties properties = PropertiesUtil.loadProperty(DB_FACTORY);
			return (IDBAdapter) Class.forName(properties.getProperty(DEFAULT_DB_CLASS)).newInstance();
		
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
