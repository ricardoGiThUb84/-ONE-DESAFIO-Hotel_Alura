package Util.baseCalculoDesconto;

import java.math.BigDecimal;

public abstract class BaseCalculo {
	
	 protected BaseCalculo next;

	    public BaseCalculo(BaseCalculo proximo) {
	        this.next = proximo;
	    }

	    public abstract String calcular(long dias);

	    protected abstract String imprimeDesconto(BigDecimal valor, double desconto);

}
