package Util;

import java.math.BigDecimal;

public class CalculoDesconto {

    public static BigDecimal calcular(long dias, double desconto) {

        BigDecimal fatorDesconto = BigDecimal.valueOf((100 - desconto) / 100);

        BigDecimal valor = new BigDecimal(dias).multiply(ValorEstadia.DIARIA.diaria());

        BigDecimal calculo = valor.multiply(fatorDesconto);
        return calculo;
    }
}
