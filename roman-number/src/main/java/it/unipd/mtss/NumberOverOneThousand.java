////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberOverOneThousand extends Exception{
    public NumberOverOneThousand() {
        super("ERRORE: i numeri sopra 1000 non sono accettati");
    }
}
