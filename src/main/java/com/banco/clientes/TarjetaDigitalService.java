package com.banco.clientes;

import java.util.List;

import javax.jws.WebService;

import com.banco.clientes.model.Tarjeta;

@WebService
public interface TarjetaDigitalService {

	Tarjeta crearTarjeta(Tarjeta tarjeta);
	
	List<Tarjeta> obtenerTarjeta();
}
