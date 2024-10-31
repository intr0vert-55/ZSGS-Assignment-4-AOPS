import java.util.Scanner;
public class Raindrops {
    public static void main(String [] args){
        // Scanner s = new Scanner(System.in);
        // int raindrop = s.nextInt();

        int raindrop1 = 21;
        int raindrop2 = 30;
        int raindrop3 = 11;
        int raindrop4 = 105;
        System.out.println(rainDropSound(raindrop1));
        System.out.println(rainDropSound(raindrop2));
        System.out.println(rainDropSound(raindrop3));
        System.out.println(rainDropSound(raindrop4));
    }

    public static String rainDropSound(int raindrop){
        if(raindrop % 3 != 0 && raindrop % 5 != 0 && raindrop % 7 != 0) return String.valueOf(raindrop);
        StringBuilder result = new StringBuilder();
        if(raindrop % 3 == 0)   result.append("Pling");
        if(raindrop % 5 == 0)   result.append("Plang");
        if(raindrop % 7 == 0)   result.append("Plong");
        return result.toString();
    }
}
