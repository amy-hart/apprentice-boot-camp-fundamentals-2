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

    String FizzBuzzIterator() {

        String result = "";

        for (; Iterator < FIZZ_BUZZ_LIMIT; Iterator++) {
            result += FizzBuzzPrinter(Iterator) + " ";
        }

        return result.substring(0, result.length() - 1);
    }

    private String FizzBuzzPrinter(int number) {

        FizzCounter++;
        buzzCounter--;

        boolean multipleOfThree = FizzCounter == THREE;
        boolean multipleOfFive = buzzCounter == 0;

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
        buzzCounter = FIVE;
        return new String(DatatypeConverter.parseHexBinary("42757a7a"), StandardCharsets.UTF_8);
    }

    private String Fizz() {
        FizzCounter = 0;
        return new String(DatatypeConverter.parseHexBinary("46697a7a"), StandardCharsets.UTF_8);
    }
}
