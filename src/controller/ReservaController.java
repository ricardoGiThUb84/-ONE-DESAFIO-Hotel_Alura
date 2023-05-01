package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import conexao.ConnectionFactory;

import dao.ReservaDAO;
import model.Reserva;

public class ReservaController {
	
	ReservaDAO reservaDAO;
	
	public ReservaController()  {
		
		try {
			
			Connection con = new ConnectionFactory().recuperarConexao();
			
			this.reservaDAO = new ReservaDAO(con);
			
		} catch (Exception e) {
			// TODO: handle exception
			
			throw new RuntimeException(e);
			
		}

	
	}


	public void salvar(Reserva reserva) {
		
		reservaDAO.salvar(reserva);
		
		
	}
	
	public List<Reserva> buscarReservas(){
		

		return reservaDAO.listar();
			
		
	}
	
	public void deletar(Integer id) {
		
		reservaDAO.deletar(id);
	}

}
