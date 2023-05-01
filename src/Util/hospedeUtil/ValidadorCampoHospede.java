package Util.hospedeUtil;



public class ValidadorCampoHospede {
	
	
	public static boolean validarTelefone(String telefone) {
		
		return telefone.matches("^\\d{11}$");
	}

}
