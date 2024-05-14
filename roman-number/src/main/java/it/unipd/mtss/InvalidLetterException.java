////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class InvalidLetterException extends Exception {
    public InvalidLetterException (char l) {
        super("Lettera non valida: " + l);
    }
}
