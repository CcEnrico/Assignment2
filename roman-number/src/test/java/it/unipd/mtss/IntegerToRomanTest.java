package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class IntegerToRomanTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void testZero() throws NumberBelowZeroException, NumberOverOneThousand {
        int n = 0;
        String result = "";

        String roman = IntegerToRoman.convert(n);
        assertEquals(roman, result);
    }

    @Test(expected = NumberBelowZeroException.class)
    public void testNumberUnderZero() throws NumberBelowZeroException, NumberOverOneThousand {
        int n = -69;

        IntegerToRoman.convert(n);
    }

    @Test(expected = NumberOverOneThousand.class)
    public void testNumberAbove4999() throws NumberBelowZeroException, NumberOverOneThousand {
        int n = 6666;

        IntegerToRoman.convert(n);
    }

}
