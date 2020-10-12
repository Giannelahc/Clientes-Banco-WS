package com.banco.clientes;

import java.util.List;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;

import com.banco.clientes.dao.TarjetaDao;
import com.banco.clientes.dao.TarjetaDaoImpl;
import com.banco.clientes.model.Tarjeta;

@WebService(endpointInterface = "com.banco.clientes.TarjetaDigitalService")
public class TarjetaDigitalServiceImpl implements TarjetaDigitalService{

	TarjetaDao tarjetaDao = new TarjetaDaoImpl();
	
	@Override
	public Tarjeta crearTarjeta(Tarjeta tarjeta) {
		// TODO Auto-generated method stub
		return tarjetaDao.guardarTarjeta(tarjeta);
	}

	@Override
	public List<Tarjeta> obtenerTarjeta() {
		// TODO Auto-generated method stub
		return tarjetaDao.obtenerTarjetas();
	}
	
}
