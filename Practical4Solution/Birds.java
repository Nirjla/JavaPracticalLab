public class Birds {
    public static void main(String[] args) {
        String[] birds = {"Sparrow", "Swan", "Seagull", "Stork", "Starling"};
        System.out.println("Birds starting with 's':");
        for (String bird : birds) {
            if (bird.startsWith("S")) {
                System.out.println(bird);
            }
    
    }
}
}
