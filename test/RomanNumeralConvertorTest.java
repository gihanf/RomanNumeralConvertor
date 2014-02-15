import junit.framework.TestCase;

/**
 * Created by bigboss on 14/02/2014.
 */
public class RomanNumeralConvertorTest extends TestCase {

    RomanNumeralConvertor convertor;

    public void setUp() throws Exception {
        convertor = new RomanNumeralConvertor();
        super.setUp();
    }

    public void testConvertSingleValues() throws Exception {
        assertEquals(1,convertor.convertRomanNumeralToDecimal("I"));
        assertEquals(5,convertor.convertRomanNumeralToDecimal("V"));
        assertEquals(10,convertor.convertRomanNumeralToDecimal("X"));
        assertEquals(50,convertor.convertRomanNumeralToDecimal("L"));
        assertEquals(100,convertor.convertRomanNumeralToDecimal("C"));
        assertEquals(500,convertor.convertRomanNumeralToDecimal("D"));
        assertEquals(1000,convertor.convertRomanNumeralToDecimal("M"));
    }

    public void testConvertMultipleRomanNumeralsWithoutPrefixes() throws Exception {
        assertEquals(2,convertor.convertRomanNumeralToDecimal("II"));
        assertEquals(3,convertor.convertRomanNumeralToDecimal("III"));
        assertEquals(8,convertor.convertRomanNumeralToDecimal("VIII"));
        assertEquals(13,convertor.convertRomanNumeralToDecimal("XIII"));
        assertEquals(53,convertor.convertRomanNumeralToDecimal("LIII"));
        assertEquals(80,convertor.convertRomanNumeralToDecimal("LXXX"));
        assertEquals(103,convertor.convertRomanNumeralToDecimal("CIII"));
        assertEquals(153,convertor.convertRomanNumeralToDecimal("CLIII"));
        assertEquals(503,convertor.convertRomanNumeralToDecimal("DIII"));
        assertEquals(553,convertor.convertRomanNumeralToDecimal("DLIII"));
        assertEquals(1003,convertor.convertRomanNumeralToDecimal("MIII"));
        assertEquals(1502,convertor.convertRomanNumeralToDecimal("MDII"));
        assertEquals(1553,convertor.convertRomanNumeralToDecimal("MDLIII"));
    }

    public void testconvertRomanNumeralToDecimalsWithPrefixes() throws Exception {
        assertEquals(4,convertor.convertRomanNumeralToDecimal("IV"));
        assertEquals(9,convertor.convertRomanNumeralToDecimal("IX"));
        assertEquals(40,convertor.convertRomanNumeralToDecimal("XL"));
        assertEquals(49,convertor.convertRomanNumeralToDecimal("XLIX"));
        assertEquals(90,convertor.convertRomanNumeralToDecimal("XC"));
        assertEquals(99,convertor.convertRomanNumeralToDecimal("XCIX"));
        assertEquals(140,convertor.convertRomanNumeralToDecimal("CXL"));
        assertEquals(159,convertor.convertRomanNumeralToDecimal("CLIX"));
        assertEquals(400,convertor.convertRomanNumeralToDecimal("CD"));
        assertEquals(409,convertor.convertRomanNumeralToDecimal("CDIX"));
        assertEquals(900,convertor.convertRomanNumeralToDecimal("CM"));
        assertEquals(1004,convertor.convertRomanNumeralToDecimal("MIV"));
        assertEquals(1400,convertor.convertRomanNumeralToDecimal("MCD"));
        assertEquals(1449,convertor.convertRomanNumeralToDecimal("MCDXLIX"));
        assertEquals(2459,convertor.convertRomanNumeralToDecimal("MMCDLIX"));
    }
}
