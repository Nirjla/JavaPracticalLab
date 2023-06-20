        public class BitiwiseOperators {
            public static void main(String[] args) {
                // Bitwise AND operator (&)
                int a = 5; // 101
                int b = 3; // 011
                int c = a & b; // 001
        
                System.out.println("a & b = " + c);
        
                // Bitwise OR operator (|)
                int d = a | b; // 111
        
                System.out.println("a | b = " + d);
        
                // Bitwise XOR operator (^)
                int e = a ^ b; // 110
        
                System.out.println("a ^ b = " + e);
        
                // Bitwise complement operator (~)
                int f = ~a; // 11111111 11111111 11111111 11111010 (32-bit representation)
        
                System.out.println("~a = " + f);
        
                // Left shift operator (<<)
                int g = a << 1; // 1010
        
                System.out.println("a << 1 = " + g);
        
                // Right shift operator (>>)
                int h = a >> 1; // 10
        
                System.out.println("a >> 1 = " + h);
        
                // Unsigned right shift operator (>>>)
                int i = -5; // 11111111 11111111 11111111 11111011 (32-bit representation)
                int j = i >>> 1; // 01111111 11111111 11111111 11111101 (32-bit representation)
        
                System.out.println("i >>> 1 = " + j);
            }
        }
    
