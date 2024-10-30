import java.util.Arrays;
public class KGGarden{
    public static void main(String [] args){
        String [] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
        String [] plants = {"Grass", "Clover", "Radish", "Violet"};
        String row1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
        String row2 = "VRCCCGCRRGVCGCRVVCVGCGCV";
        String [] result = plantsOfEveryone(students, plants, row1, row2);
        for(int i = 0; i < students.length; i++){
            System.out.println(students[i] + " - " + result[i]);
        }
    }

    public static String [] plantsOfEveryone(String [] students, String [] plants, String row1, String row2){
        int index = -1;
        String [] result = new String[students.length];
        Arrays.fill(result, "");
        for(int i = 0; i < row1.length(); i += 2){
            if(i % 2 == 0)  index++;
            result[index] += plantName(row1.charAt(i), plants) + " , " + plantName(row1.charAt(i + 1), plants) + " , "
             + plantName(row2.charAt(i), plants) + " , " + plantName(row2.charAt(i + 1), plants);
        }
        return result;
    }

    public static String plantName(char ch, String [] plants){
        switch(ch){
            case 'G':
                return plants[0];
            case 'C':
                return plants[1];
            case 'R':
                return plants[2];
            case 'V':
                return plants[3];
        }
        return ".";
    }
}