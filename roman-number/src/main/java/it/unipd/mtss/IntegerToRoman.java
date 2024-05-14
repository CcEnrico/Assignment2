////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] VALUES = { 900, 500, 400, 100, 90,
            50, 40, 10, 9, 5, 4, 1 };
    private static final String[] SYMBOLS = { "CM", "D", "CD", "C",
            "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public static String convert(int number)
            throws NumberBelowZeroException,
            NumberOverOneThousand
    {
        // se numero e' negativo
        if (number < 0) { throw new NumberBelowZeroException(); }
        // se numero supera i primi 1000 interi ovvero (0 ... 999)
        else if (number > 999) { throw new NumberOverOneThousand();}

        StringBuilder roman = new StringBuilder();
        int current = number;
//        prende il valore intero corrente,
//        scorre l'array valori partendo dal piu alto, fintanto che il valore e'
//        maggiore del corrispondente numero per quell'indice
//        aggiunge il numero romano e sotrae all'intero altrimenti scorre
        for (int i = 0; i < VALUES.length; i++) {
            while (current >= VALUES[i]) {
                roman.append(SYMBOLS[i]);
                current -= VALUES[i];
            }
        }
        return roman.toString();
    }
}
