////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class NumberBelowZeroException extends Exception {
    public NumberBelowZeroException() {
        super("ERRORE: i numeri sotto lo 0 non sono accettati"
        );
    }
}
