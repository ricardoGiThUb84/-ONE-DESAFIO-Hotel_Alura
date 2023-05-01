package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Reserva;


public class ReservaDAO{
	
	private Connection connection;
	
	public ReservaDAO(Connection connection) {
		
		this.connection = connection;
	}

	
	public void salvar(Reserva reserva) {
		
		try {
			
			StringBuilder query = new StringBuilder();
			
			query.append("INSERT INTO hotel.reservas ");
			query.append("VALUES(DEFAULT, ?, ?, ?, ?);");
			
			try (PreparedStatement pst = connection.prepareStatement(query.toString(), 
					Statement.RETURN_GENERATED_KEYS)){
				
				pst.setDate(1, reserva.getDiaEntrada());
				pst.setDate(2, reserva.getDiaSaida());
				pst.setDouble(3, Double.valueOf(reserva.getValor()));
				pst.setString(4, reserva.getFormaPagamento());
				
				pst.executeUpdate();
				
				try (ResultSet rst = pst.getGeneratedKeys()){
					
					while(rst.next()) {
						
						reserva.setId(rst.getInt(1));
					}
					
					
				} 
				
			}
			
			} catch (SQLException e) {
				
				throw new RuntimeException(e.getMessage());
			}
		
	}
	
	
	public List<Reserva> listar() {
		
		List<Reserva> reservas = new ArrayList<>();
		
		try {
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM hotel.reservas;");
			
			
			try (PreparedStatement pst = connection.prepareStatement(query.toString())){
				
			
				pst.execute();
				
				
				try (ResultSet rst = pst.getResultSet()){
					
					while(rst.next()) {
						
						Reserva reserva = new Reserva();
						
						reserva.setId(rst.getInt(1));
						reserva.setDiaEntrada(rst.getDate(2));
						reserva.setDiaSaida(rst.getDate(3));
						reserva.setValor(String.valueOf(rst.getDouble(4)));
						reserva.setFormaPagamento(rst.getString(5));
						
						reservas.add(reserva);
					}
					
					
				} 
				
			}
			
			} catch (SQLException e) {
				
				throw new RuntimeException(e.getMessage());
			}
		
		return reservas;
		
	}


		
	public void deletar(Integer id) {
		
		try {
			
			StringBuilder query = new StringBuilder();
			
			query.append("DELETE FROM hotel.reservas h WHERE h.id = ?;");
			
		
			try (PreparedStatement pst = connection.prepareStatement(query.toString())){
				
					pst.setInt(1, id);
			
					pst.executeUpdate();
				} 
			
		
			} catch (SQLException e) {
				
				throw new RuntimeException(e.getMessage());
			}
		
	}
		
		
	
	
	
	
	
	
	

}
