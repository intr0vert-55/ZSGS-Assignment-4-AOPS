import java.util.Scanner;

public class BottleSong {
    public static void main(String [] args){

        // Scanner s = new Scanner(System.in);
        // int start = s.nextInt();
        // int end = s.nextInt();

        System.out.println(bottleSong(10, 1));

    }

    public static String bottleSong(int start, int end){
        String [] count = {"No", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        StringBuilder sb = new StringBuilder();
        if(start >= count.length)   start = 10;
        if(end < 1) end = 1;
        for(int i = start; i >= end; i--){
            sb.append(count[i]);
            sb.append(" green bottles hanging on the wall, \n");
            sb.append(count[i]);
            sb.append(" green bottles hanging on the wall, \n");
            sb.append("And if one green bottle should accidentally fall, \n");
            sb.append("There'll be ");
            sb.append(count[i - 1].toLowerCase());
            sb.append(" green bottles hanging on the wall. \n\n");
        }
        return sb.toString();
    }
}
