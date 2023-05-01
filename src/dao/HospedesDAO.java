package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Hospede;
import model.Reserva;

public class HospedesDAO {
	
private Connection connection;
	
	public HospedesDAO(Connection connection) {
		
		this.connection = connection;
	}

	
	public void salvar(Hospede hospede) {
		
		
			StringBuilder query = new StringBuilder();
			
			query.append("INSERT INTO hotel.hospedes ");
			query.append("VALUES(DEFAULT, ?, ?, ?, ?, ? , ?);");
			
			try (PreparedStatement pst = connection.prepareStatement(query.toString(), 
					Statement.RETURN_GENERATED_KEYS)){
				

							
				pst.setString(1, hospede.getNome());
				pst.setString(2, hospede.getSobrenome());
				pst.setDate(3, hospede.getDataNascimento());
				pst.setString(4, hospede.getNacionalidade());
				pst.setString(5, String.valueOf(hospede.getTelefone()));
				pst.setInt(6, Math.toIntExact(hospede.getNumeroReserva()));
				
				pst.executeUpdate();
				
				
			} catch (SQLException e) {
				
				throw new RuntimeException(e.getMessage());
			}
		

	}
	
	public List<Hospede> listar() {
		
		List<Hospede> hospedes = new ArrayList<>();
		
		try {
			
			StringBuilder query = new StringBuilder();
			
			query.append("SELECT * FROM hotel.hospedes;");
			
			
			try (PreparedStatement pst = connection.prepareStatement(query.toString())){
				
			
				pst.execute();
				
				
				try (ResultSet rst = pst.getResultSet()){
					
					while(rst.next()) {
						
						Hospede hospede = new Hospede();

						
						hospede.setId(rst.getInt(1));
						hospede.setNome(rst.getString(2));
						hospede.setSobrenome(rst.getString(3));
						hospede.setDataNascimento(rst.getDate(4));
						hospede.setNacionalidade(rst.getString(5));
						hospede.setTelefone(rst.getLong(6));
						hospede.setNumeroReserva((long) rst.getInt(7));
						
						hospedes.add(hospede);
					}
					
					
				} 
				
			}
			
			} catch (SQLException e) {
				
				throw new RuntimeException(e.getMessage());
			}
		
		return hospedes;
		
	}
	
	public void atualizar(Hospede hospede) {
		
		
		
		StringBuilder query = new StringBuilder();
		
		query.append("UPDATE hotel.hospedes SET nome = ?, sobrenome = ?, nacionalidade = ? WHERE id = ?;");
//		query.append("SET nome = ?, sobrenome = ?, ");
//		query.append("nacionalidade = ? WHERE id = ?;");
		
		try (PreparedStatement pst = connection.prepareStatement(query.toString())){
			

						
			pst.setString(1, hospede.getNome());
			pst.setString(2, hospede.getSobrenome());
//			pst.setDate(3, hospede.getDataNascimento());
			pst.setString(3, hospede.getNacionalidade());
//			pst.setString(5, String.valueOf(hospede.getTelefone()));
//			pst.setLong(6, hospede.getNumeroReserva());
			pst.setInt(4, hospede.getId());
			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e.getMessage());
		}
	

}
	
public void atualizarReserva(int idReserva) {
		
		

		StringBuilder query = new StringBuilder();
		
		query.append("UPDATE hotel.hospedes SET idReserva = null WHERE idReserva = ?");
		
		
		try (PreparedStatement pst = connection.prepareStatement(query.toString())){
			
			pst.setInt(1,idReserva);

			
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e.getMessage());
		}
	

}
	
public void deletar(Integer id) {
		
		
		StringBuilder query = new StringBuilder();
		
		query.append("DELETE FROM hotel.hospedes WHERE id = ?;");
	
		try (PreparedStatement pst = connection.prepareStatement(query.toString())){
			

			pst.setInt(1, id);
		
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e.getMessage());
		}
	

}
	
}
