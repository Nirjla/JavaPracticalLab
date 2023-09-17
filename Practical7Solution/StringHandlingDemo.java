public class StringHandlingDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // 1. length()
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt()
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // 3. substring()
        String substring = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);

        // 4. toLowerCase() and toUpperCase()
        String lowerCase = str.toLowerCase();
        String upperCase = str.toUpperCase();
        System.out.println("Lowercase string: " + lowerCase);
        System.out.println("Uppercase string: " + upperCase);

        // 5. trim()
        String trimmed = "   Hello, World!   ".trim();
        System.out.println("Trimmed string: " + trimmed);

        // 6. isEmpty()
        boolean isEmpty = str.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);

        // 7. startsWith() and endsWith()
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Starts with 'Hello'? " + startsWithHello);
        System.out.println("Ends with 'World!'? " + endsWithWorld);

        // 8. replace() and replaceAll()
        String replaced1 = str.replace("o", "x");
        String replaced2 = str.replaceAll("[aeiou]", "x");
        System.out.println("String after replacing 'o' with 'x': " + replaced1);
        System.out.println("String after replacing vowels with 'x': " + replaced2);
    }
}