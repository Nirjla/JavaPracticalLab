public class Skipping {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i++)
        {
        if(i==25 || i==40 || i==90)
        {
            continue;
        }
        System.out.println(i);
    }
    }
}
