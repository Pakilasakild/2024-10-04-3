import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("Enter how many numbers (Only an odd amount): ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number " + (i+1) + ": ");
            arr.add(sc.nextInt());
        }
        int middle = arr.get(arr.size() / 2);
        int first = arr.getFirst();
        int second = arr.getLast();
        int max = Math.max(first, Math.max(second, middle));
        System.out.println(max);
    }
}