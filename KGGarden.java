import java.util.Arrays;
import java.util.Scanner;
public class KGGarden{
    public static void main(String [] args){
        String [] students = {"Alice", "Bob", "Charlie", "David", "Eve", "Fred", "Ginny", "Harriet", "Ileana", "Joseph", "Kincaid", "Larry"};
        String [] plants = {"Grass", "Clover", "Radish", "Violet"};
        String row1 = "VRCGVVRVCGGCCGVRGCVCGCGV";
        String row2 = "VRCCCGCRRGVCGCRVVCVGCGCV";

        // Scanner s = new Scanner(System.in);
        // String row1 = s.nextLine();
        // String row2 = s.nextLine();

        
        String [] result = plantsOfEveryone(students, plants, row1, row2);

         // plants planted by all students

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i] + " - " + result[i]);
        }

        // plants planted by a particular student

        // String student = s.nextLine();

        plantsOfAStudent("Alice", students, result);
        plantsOfAStudent("joseph", students, result);
        plantsOfAStudent("Fred", students, result);
    }

    public static void plantsOfAStudent(String name, String [] students, String [] result){
        name = name.toLowerCase();
        int index = 0;
        for(String student : students){
            if(student.toLowerCase().equals(name))  break;
            index++;
        }
        if(index >= students.length){
            System.out.println("Invalid student name");
            return;
        }
        System.out.println(students[index] + " - " + result[index]);
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
