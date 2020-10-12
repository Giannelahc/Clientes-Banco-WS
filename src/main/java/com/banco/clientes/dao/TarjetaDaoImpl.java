package com.banco.clientes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.banco.clientes.factorymethod.DBFactory;
import com.banco.clientes.factorymethod.IDBAdapter;
import com.banco.clientes.model.Tarjeta;

public class TarjetaDaoImpl implements TarjetaDao{

	private IDBAdapter dbAdapter;

	public TarjetaDaoImpl() {
		dbAdapter = DBFactory.getDefaultDb();
	}

	@Override
	public List<Tarjeta> obtenerTarjetas() {

		Connection connection = dbAdapter.getConnection();
		List<Tarjeta> tarjetasList = new ArrayList<>();

		try {
			PreparedStatement statement = connection
					.prepareStatement("SELECT idTarjeta, numeroTarjeta, banco FROM tarjetas");

			ResultSet tarjetaResult = statement.executeQuery();

			while (tarjetaResult.next()) {
				tarjetasList.add(
						new Tarjeta(tarjetaResult.getInt(1), tarjetaResult.getString(2), tarjetaResult.getString(3)));
			}

			return tarjetasList;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			
		}
	}

	@Override
	public Tarjeta guardarTarjeta(Tarjeta tarjeta) {
		Connection connection = dbAdapter.getConnection();

		try {
			PreparedStatement statement = connection
					.prepareStatement("INSERT INTO tarjetas (numeroTarjeta, banco) VALUES (?,?)");

			statement.setString(1, tarjeta.getNumeroTarjeta());
			statement.setString(2, tarjeta.getBanco());
			statement.executeUpdate();

			return tarjeta;

		} catch (SQLException e) {
			e.printStackTrace();

			return null;
		}

	}
}
