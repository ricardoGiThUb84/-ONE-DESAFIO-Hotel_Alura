package Util.baseCalculoDesconto;

import java.math.BigDecimal;

import Util.CalculoDesconto;
import Util.FormatadorMensagemDesconto;

public class BaseCalculoPadrao extends BaseCalculo{

	public BaseCalculoPadrao(BaseCalculo next) {
		super(next);
		
	}

	@Override
	public String calcular(long dias) {
		
		 double desconto = 0;

	     return imprimeDesconto(CalculoDesconto.calcular(dias, desconto), desconto);
	}

	@Override
	protected String imprimeDesconto(BigDecimal valor, double desconto) {
		
		return FormatadorMensagemDesconto.mensagem(valor, desconto);
	}

}
