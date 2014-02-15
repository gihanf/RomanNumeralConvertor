import java.util.Vector;

/**
 * Created by bigboss on 14/02/2014.
 */
public class RomanNumeralConvertor {

    // Converts a roman numeral string into a decimal value
    public int convertRomanNumeralToDecimal(String romanNumeral) {
        Vector numbers = convertRomanNumeralsToNumbers(romanNumeral);
        int decimalValue = convertToDecimalNumber(numbers);
        return decimalValue;
    }

    /* Converts a string of roman numeral letters to their corresponding number values. Given a string containing many
    roman numerals, the method translates EACH roman numeral to its number equivalent. */
    public Vector convertRomanNumeralsToNumbers(String romanNumeral) {

        String literal = romanNumeral.toUpperCase();
        Vector numbers = new Vector();

        char letter;
        for (int i = 0; i < literal.length(); i++) {
            letter = romanNumeral.charAt(i);
            Integer number = 0;
            switch (letter) {
                case 'I':
                    number = 1;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'M':
                    number = 1000;
                    break;
                default:
                    break;
            }
            numbers.add(number);
        }
        return numbers;
    }

    // Converts a vector of numbers which were translated from individual roman numeral letters into a single decimal value
    public int convertToDecimalNumber(Vector numbers) {
        int summation = 0;
        for (int i = 0; i < numbers.size(); i++) {
            int currentDigit = (Integer)numbers.elementAt(i);
            int subsequentDigit = 0;
            if (numbers.size() > i + 1) {
                subsequentDigit = (Integer)numbers.elementAt(i + 1);
            }
            if (currentDigit < subsequentDigit) {
                summation += subsequentDigit - currentDigit;
                i++;
            }
            else {
                summation += currentDigit;
            }
        }
        return summation;
    }
}
