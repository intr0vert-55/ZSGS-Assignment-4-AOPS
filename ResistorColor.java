import java.util.Scanner;
public class ResistorColor {
    public static void main(String [] args){
        String [] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        // Scanner s = new Scanner(System.in);
        // String input = s.nextLine();
        // System.out.println(findResistance(input, colors));

        System.out.println(findResistance("red", colors));
        System.out.println(findResistance("black", colors));
        System.out.println(findResistance("purple", colors));

    }

    public static int findResistance(String color, String [] colors){
        for(int i = 0; i < colors.length; i++){
            if(colors[i].equals(color)) return i;
        }

        return -1;  //  Invalid input
    }
}
