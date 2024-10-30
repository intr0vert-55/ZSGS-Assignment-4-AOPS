import java.util.Scanner;
public class ResistorColorDuo {
    public static void main(String [] args){
        String [] colors = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        // Scanner s = new Scanner(System.in);
        // String input = s.nextLine();
        // System.out.println(findResistance(input, colors));

        System.out.println(findResistance("red-white", colors));
        System.out.println(findResistance("black-orange-yellow", colors));
        System.out.println(findResistance("purple-violet", colors));

    }

    public static int findResistance(String color, String [] colors){
        String [] cols = color.split("[ -]");
        int result = 0;
        for(int i = 0; i < cols.length && i < 2; i++){
            boolean validColor = false;
            for(int j = 0; j < colors.length; j++){
                if(cols[i].equals(colors[j])){
                    result = (result * 10) + j;
                    validColor = true;
                }
            }
            if(!validColor)   return -1;  //  Invalid input
        }

        return result;  
    }
}
