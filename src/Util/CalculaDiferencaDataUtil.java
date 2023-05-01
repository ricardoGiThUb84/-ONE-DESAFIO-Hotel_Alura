package Util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import Exceptions.DataInicioMaiorQueFinalException;

public class CalculaDiferencaDataUtil{
	
	 public static long calculoDias(Date dataInicio , Date dataFim) throws Exception   {

		
		    	
		   long diferencaEntreDatas = ChronoUnit.DAYS.between(
	                       LocalDate.parse(dataInicio.toString()),
	                       LocalDate.parse(dataFim.toString()));
	        

	               if(diferencaEntreDatas < 0) {
	                   throw new DataInicioMaiorQueFinalException("Data início maior que a data final");
	               }

	               return diferencaEntreDatas == 0 ? 1l : diferencaEntreDatas ;

		

	    }

}
