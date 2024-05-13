package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class RomanPrinterTest {
//    static RomanPrinter printer;
//
//    @BeforeClass
//    public static void initializePrinter() {
//        printer = new RomanPrinter();
//    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(30);

    @Test
    public void testRomanD()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 500;
        String expected =
                " _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanC()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 100;
        String expected =
                "  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanL()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 50;
        String expected =
                " _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanX()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 10;
        String expected =
                "__   __\n"+
                "\\ \\ / /\n"+
                " \\ V / \n"+
                "  > <  \n"+
                " / . \\ \n"+
                "/_/ \\_\\\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanV()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 5;
        String expected =
                "__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }
    @Test
    public void testRomanI()
            throws NumberBelowZeroException,
            NumberOverOneThousand,
            InvalidLetterException
    {
        int n = 1;
        String expected =
                " _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n";
        String ascii_art_D = RomanPrinter.print(n);
        assertEquals(expected, ascii_art_D);
    }

}
