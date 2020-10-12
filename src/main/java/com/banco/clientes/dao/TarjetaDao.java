package com.banco.clientes.dao;

import java.util.List;

import com.banco.clientes.model.Tarjeta;

public interface TarjetaDao {

	Tarjeta guardarTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTarjetas();
}
