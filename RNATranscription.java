import java.util.Scanner;
public class RNATranscription {
    public static void main(String [] args){
        // Scanner s = new Scanner(System.in);
        // String dna = s.nextLine();

        String dna = "GATC";
        System.out.println(RnaTranscription(dna));

    }

    public static String RnaTranscription(String dna){
        StringBuilder result = new StringBuilder();
        for(char ch : dna.toCharArray()){
            switch(ch){
                case 'G' :
                    result.append('C');
                    break;
                case 'C' :
                    result.append('G');
                    break;
                case 'T' :
                    result.append('A');
                    break;
                case 'A' :
                    result.append('U');
                    break;
            }
        }
        return result.toString();
    }
}
