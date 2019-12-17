package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class BinaryFizzBuzz {

    private int index;
    private int numberUnderTest;
    private int arrayLength = new int[]{0, 0, 0, 0, 0}.length;

    String FizzBuzzIterator() {

        String result = "";

        // While index is less than MAX VALUE - 27
        for (; index < Byte.MAX_VALUE - 27; index++) {
            // Append outcome of method B to string
            result += FizzBuzzPrinter(index) + " ";
        }

        // Return the string with the last character chopped off?
        return result.substring(0, result.length() - 1);
    }

    private String FizzBuzzPrinter(int number) {

        numberUnderTest++;
        arrayLength--;

        boolean multipleOfThree = numberUnderTest == 0b11;
        boolean multipleOfFive = arrayLength == 0;

        String string = multipleOfThree || multipleOfFive ? "" : String.valueOf(number + 1);

        if(multipleOfThree){
            string += Fizz();
        };

        if(multipleOfFive){
            string += Buzz();
        }

        return string;
    }

    private String Buzz() {
        arrayLength = new int[]{0, 0, 0, 0, 0}.length;
        return new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    }

    private String Fizz() {
        numberUnderTest = 0;
        return new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
    }
}
