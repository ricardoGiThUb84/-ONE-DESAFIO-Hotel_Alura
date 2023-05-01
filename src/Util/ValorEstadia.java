package Util;

import java.math.BigDecimal;

public enum ValorEstadia  {
    DIARIA(348);

    private int diaria;


    ValorEstadia(int diaria) {
        this.diaria = diaria;
    }

    public BigDecimal diaria(){

        return BigDecimal.valueOf(diaria);
    }
}
