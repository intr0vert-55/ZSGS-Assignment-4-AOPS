import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class KillerSudokuHelper {
    public static void main(String [] args){
        // Scanner s = new Scanner(System.in);
        // int sum = s.nextInt();
        // int lim = s.nextInt();

        List<List<Integer>> result = killerSudokuHelper(7, 3);

        System.out.println(result);

    }

    public static List<List<Integer>> killerSudokuHelper(int sum, int limit){
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        helper(sum, limit, 1, result, new ArrayList<Integer>(), new ArrayList<Integer>());
        return result;
    }

    public static void helper(int sum, int limit, int index, List<List<Integer>> result, List<Integer> list, List<Integer> exists){
        if(sum < 0){
            return;
        }
        if(list.size() == limit){
            if(sum == 0)    result.add(new ArrayList<>(list));
            return;
        }
        for(int i = index; i < 10; i++){
            if(!list.contains(i)){
                list.add(i);
                helper(sum - i, limit, i + 1, result, list, exists);
                list.remove(list.size() - 1);
            }
        }
    }
}
