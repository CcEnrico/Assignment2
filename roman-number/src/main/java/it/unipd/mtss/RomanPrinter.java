////////////////////////////////////////////////////////////////////
// [Carmelo] [Russello] [2076421]
// [Enrico] [Cottini] [2077993]
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

import java.util.Arrays;
import java.util.HashMap;

public class RomanPrinter {
    private static HashMap<Character, String[]> roman_number_map = null;
    static {
        HashMap<Character,String[]> conMap = new HashMap<Character,String[]>();
        conMap.put('I', new String[] {
                " _____ ",
                "|_   _|",
                "  | |  ",
                "  | |  ",
                " _| |_ ",
                "|_____|"
        });
        conMap.put('V', new String[] {
                "__      __",
                "\\ \\    / /",
                " \\ \\  / / ",
                "  \\ \\/ /  ",
                "   \\  /   ",
                "    \\/    "
        });
        conMap.put('X', new String[] {
                "__   __",
                "\\ \\ / /",
                " \\ V / ",
                "  > <  ",
                " / . \\ ",
                "/_/ \\_\\"
        });
        conMap.put('L', new String[] {
                " _      ",
                "| |     ",
                "| |     ",
                "| |     ",
                "| |____ ",
                "|______|" });
        conMap.put('C', new String[] {
                "  _____ ",
                " / ____|",
                "| |     ",
                "| |     ",
                "| |____ ",
                " \\_____|"
        });
        conMap.put('D', new String[] {
                " _____  ",
                "|  __ \\ ",
                "| |  | |",
                "| |  | |",
                "| |__| |",
                "|_____/ "
        });
        roman_number_map = conMap;
    }

    public static String print(int num)
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber)
            throws InvalidLetterException
    {
        if (romanNumber.isEmpty()) {
            return "";
        }
        for (int i = 0; i < romanNumber.length(); i++) {
            // controlla la validita' della sringa
            // di Lettere di numeri romani
            // carattere per carattere
            char c = romanNumber.charAt(i);
            if (!(Arrays.asList('D','C','L','X','V','I').contains(c)))
            {
                throw new InvalidLetterException(c);
            }
        }

        // Per ogni riga (ovvero 6) viene creato uno strato di asciart
        // prende la prima riga di asciart per ogni lettera
        // del numero romano intero e la concatena,
        // poi si passa alla seconda riga e cosi via fino alla sesta
        StringBuilder asciiArt = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < romanNumber.length(); j++) {
                asciiArt.append(roman_number_map.get(romanNumber.charAt(j))[i]);
            }
            asciiArt.append('\n');
        }
        return asciiArt.toString();
    }
}
