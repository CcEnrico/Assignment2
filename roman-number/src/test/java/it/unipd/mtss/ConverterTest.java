package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ConverterTest {
    private String expected = null;
    private int input;

    public ConverterTest(String input, String expected) {
        this.expected = expected;
        this.input = Integer.parseInt(input);
    }

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Parameters
    public static Collection<String[]> data() {
        String[][] data = {
                { "0", "" },
                { "1", "I" },
                { "2", "II" },
                { "3", "III" },
                { "4", "IV" },
                { "5", "V" },
                { "6", "VI" },
                { "7", "VII" },
                { "8", "VIII" },
                { "9", "IX" },
                { "10", "X" },
                { "20", "XX" },
                { "30", "XXX" },
                { "40", "XL" },
                { "50", "L" },
                { "60", "LX" },
                { "70", "LXX" },
                { "80", "LXXX" },
                { "90", "XC" },
                { "100", "C" },
                { "200", "CC" },
                { "300", "CCC" },
                { "400", "CD" },
                { "500", "D" },
                { "600", "DC" },
                { "700", "DCC" },
                { "800", "DCCC" },
                { "900", "CM" },
                { "999", "CMXCIX" },
                { "326", "CCCXXVI" },
                { "843", "DCCCXLIII" },
                { "123", "CXXIII" },
                { "567", "DLXVII" },
                { "789", "DCCLXXXIX" },
                { "222", "CCXXII" },
                { "456", "CDLVI" },
                { "678", "DCLXXVIII" },
                { "901", "CMI" },
                { "432", "CDXXXII" },
                { "123", "CXXIII" },
                { "235", "CCXXXV" },
                { "347", "CCCXLVII" },
                { "459", "CDLIX" },
                { "562", "DLXII" },
                { "674", "DCLXXIV" },
                { "786", "DCCLXXXVI" },
                { "898", "DCCCXCVIII" },
                { "910", "CMX" },
                { "200", "CC" },
                { "333", "CCCXXXIII" },
                { "464", "CDLXIV" },
                { "587", "DLXXXVII" },
                { "620", "DCXX" },
                { "752", "DCCLII" },
                { "874", "DCCCLXXIV" },
                { "997", "CMXCVII" },
                { "444", "CDXLIV" },
                { "666", "DCLXVI" },
                { "888", "DCCCLXXXVIII" },
                { "111", "CXI" },
                { "222", "CCXXII" },
                { "333", "CCCXXXIII" },
                { "555", "DLV" },
                { "777", "DCCLXXVII" },
                { "999", "CMXCIX" },
                { "123", "CXXIII" },
                { "234", "CCXXXIV" },
                { "345", "CCCXLV" },
                { "456", "CDLVI" },
                { "567", "DLXVII" },
                { "678", "DCLXXVIII" },
                { "789", "DCCLXXXIX" },
                { "890", "DCCCXC" },
                { "901", "CMI" },
                { "567", "DLXVII" },
                { "654", "DCLIV" },
                { "432", "CDXXXII" },
                { "123", "CXXIII" },
                { "456", "CDLVI" },
                { "789", "DCCLXXXIX" },
                { "987", "CMLXXXVII" },
                { "654", "DCLIV" },
                { "987", "CMLXXXVII" },
                { "321", "CCCXXI" },
                { "876", "DCCCLXXVI" },
                { "543", "DXLIII" },
                { "765", "DCCLXV" },
                { "321", "CCCXXI" },
                { "234", "CCXXXIV" },
                { "876", "DCCCLXXVI" },
                { "543", "DXLIII" },
                { "876", "DCCCLXXVI" },
                { "111", "CXI" },
                { "222", "CCXXII" },
                { "333", "CCCXXXIII" },
                { "444", "CDXLIV" },
                { "555", "DLV" },
                { "666", "DCLXVI" },
                { "777", "DCCLXXVII" },
                { "888", "DCCCLXXXVIII" },
                { "999", "CMXCIX" }
        };
        return Arrays.asList(data);
    }

    @Test
    public void testConverter() throws NumberBelowZeroException, NumberOverOneThousand{
        int integer = input;
        String roman = IntegerToRoman.convert(integer);
        assertEquals(roman, expected);
    }

}
