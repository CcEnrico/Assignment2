////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    private static final int[] VALUES = { 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
    private static final String[] SYMBOLS = { "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

    public String intToRoman(int number) throws NumberNegativeExeption, NumberOverOneThousand {
        if (number < 0) { throw new NumberNegativeExeption(); } // se numero e' negativo
        else if (number > 999) { throw new NumberOverOneThousand();} // se numero supera i primi 1000 interi ovvero (0 ... 999)

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
