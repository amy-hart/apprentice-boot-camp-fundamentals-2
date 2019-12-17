package refactoring;

import javax.xml.bind.DatatypeConverter;
import java.nio.charset.StandardCharsets;

class BinaryFizzBuzz {

    public static final int FIZZ_BUZZ_LIMIT = Byte.MAX_VALUE - 27;
    public static final int THREE = 0b11;
    public static final int FIVE = new int[]{0, 0, 0, 0, 0}.length;

    private int Iterator;
    private int FizzCounter;
    private int buzzCounter = FIVE;

    String fizzBuzzIterator() {

        String FizzBuzzOutput = "";

        for (; Iterator < FIZZ_BUZZ_LIMIT; Iterator++) {
            FizzBuzzOutput += fizzBuzzCalculator(Iterator) + " ";
        }

        return trimLastChar(FizzBuzzOutput);
    }

    private String trimLastChar(String result) {
        return result.substring(0, result.length() - 1);
    }

    private String fizzBuzzCalculator(int number) {

        FizzCounter++;
        buzzCounter--;

        String string = isMultipleOfThree() || isMultipleOfFive() ? "" : String.valueOf(number + 1);

        if(isMultipleOfThree()){
            string += fizz();
        }

        if(isMultipleOfFive()){
            string += buzz();
        }

        return string;
    }

    private boolean isMultipleOfFive() {
        return buzzCounter == 0;
    }

    private boolean isMultipleOfThree() {
        return FizzCounter == THREE;
    }

    private String buzz() {
        buzzCounter = FIVE;
        return parseHexBinary("42757a7a");
    }

    private String fizz() {
        FizzCounter = 0;
        return parseHexBinary("46697a7a");
    }

    private String parseHexBinary(String s) {
        return new String(DatatypeConverter.parseHexBinary(s), StandardCharsets.UTF_8);
    }

}
