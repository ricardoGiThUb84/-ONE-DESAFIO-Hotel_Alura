package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import dao.HospedesDAO;

import model.Hospede;
import model.Reserva;


public class HospedeController {
	
	
	HospedesDAO hospedeDAO;
	
	public HospedeController()  {
		
		try {
			
			Connection con = new ConnectionFactory().recuperarConexao();
			
			this.hospedeDAO = new HospedesDAO(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			throw new RuntimeException(e);
			
		}

	
	}


	public void salvar(Hospede hospede) {
		
		hospedeDAO.salvar(hospede);
		
		
	}
	
	public List<Hospede> buscar() {
		
		return hospedeDAO.listar();
	}
	
	public void atualizar(Hospede hospede) {
		
		hospedeDAO.atualizar(hospede);
	}
	
	public void atualizarReserva(Integer idReserva) {
		
		hospedeDAO.atualizarReserva(idReserva);
	}
	
	public void deletar(Integer id) {
		
		hospedeDAO.deletar(id);
	}
	
	
	

}
