import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumber {
    static String findLargestNumber(int[] A){
        ArrayList<Integer> singleDigitArray = new ArrayList<>();
        for(int i = 0; i < A.length; i++){
            singleDigitArray.add(A[i]);
        }
        Collections.sort(singleDigitArray, (a, b) -> (String.valueOf(a) + String.valueOf(b)).compareTo(String.valueOf(b) + String.valueOf(a)));
        String str = "";
        for(int i = 0; i < singleDigitArray.size(); i++){
            str = singleDigitArray.get(i)+str;
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A[] = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = scanner.nextInt();
        }
        System.out.println(findLargestNumber(A));
    }
}
