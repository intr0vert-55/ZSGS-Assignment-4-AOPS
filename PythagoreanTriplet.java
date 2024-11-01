import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class PythagoreanTriplet{
    public static void main(String [] args){

        // Scanner s = new Scanner(System.in);
        // int n = s.nextInt();

        System.out.println(pythagoreanTriplet(36));

    }

    public static List<List<Integer>> pythagoreanTriplet(int n){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(n, 1, new ArrayList<Integer>(), result);
        return result;
    }

    public static void helper(int n, int start, List<Integer> list, List<List<Integer>> result){
        if(list.size() == 2){
            int a = list.get(0);
            int b = list.get(1);
            int res = n - (a + b);
            if(res > b && ((a * a) + (b * b) == res * res)){
                list.add(res);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        for(int i = start; i < n; i++){
            list.add(i);
            helper(n, i + 1, list, result);
            list.remove(list.size() - 1);
        }
    }
}