package Util;

import java.math.BigDecimal;

public class FormatadorMensagemDesconto {

    public static String mensagem(BigDecimal valor, double desconto){

        StringBuilder mensagem = new StringBuilder();

        if(desconto > 0) mensagem.append(String.format("R$ %.2f (%.0f%% desconto).", valor, desconto));
        else mensagem.append(String.format("R$ %.2f", valor));


        return mensagem.toString();
    }
}