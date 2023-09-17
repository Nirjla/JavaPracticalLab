// Wrapper class and methods
public class WrapperClassDemo {
    public static void main(String[] args) {
        // Wrapper class: Integer
        Integer number = 10;

        // Wrapper class methods
        int intValue = number.intValue();
        System.out.println("intValue: " + intValue);

        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);

        Integer max = Integer.max(number, 5);
        System.out.println("Max value: " + max);

        // Wrapper class: Character
        Character ch = 'A';

        // Wrapper class methods
        char charValue = ch.charValue();
        System.out.println("charValue: " + charValue);

        boolean isDigit = Character.isDigit(ch);
        System.out.println("Is a digit? " + isDigit);

        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is a letter? " + isLetter);
    }
}