package org.example.model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class Formata {
    public static String real(BigDecimal valor) {
        NumberFormat formato = NumberFormat.getInstance(Locale.getDefault()); //https://stackoverflow.com/a/4323628
        //sempre 2 dígitos após vírgula
        formato.setMinimumFractionDigits(2);
        formato.setMaximumFractionDigits(2);

        return formato.format(valor);
    }
}
