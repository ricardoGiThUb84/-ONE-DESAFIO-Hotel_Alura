package Util.baseCalculoDesconto;

import java.math.BigDecimal;

import Util.CalculoDesconto;
import Util.FormatadorMensagemDesconto;

public class BaseCalculoDezPorcento extends BaseCalculo {


    public BaseCalculoDezPorcento(BaseCalculo next) {
        super(next);
    }

    @Override
    public String calcular(long dias) {
        if(dias > 15){
            double desconto = 10;

            return imprimeDesconto(CalculoDesconto.calcular(dias, desconto), desconto);
        }

        return next.calcular(dias);
    }

    @Override
    protected String imprimeDesconto(BigDecimal valor, double desconto) {
        return FormatadorMensagemDesconto.mensagem(valor, desconto);
    }
}
