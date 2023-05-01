package views;


import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

import conexao.ConnectionFactory;
import controller.HospedeController;
import controller.ReservaController;
import dao.HospedesDAO;
import dao.ReservaDAO;
import model.Hospede;
import model.Reserva;
import java.lang.String;

public class TesteView {
	
	public static void main(String[] args) {
		
		HospedeController cont = new HospedeController();
	
		
		ReservaController reservaController = new ReservaController();
		
		
		List<Reserva> lista = reservaController.buscarReservas();
		
		System.out.println(lista);
		
	}
	
	
	
	
	
	
	

	
	


}
