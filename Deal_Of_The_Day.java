import java.io.IOException;
import java.util.Scanner;

public class Class {
    private static int cardsNum;

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int[] arr = new int[10];

            for (int i = 0; i < 10; i++) {
                arr[i] = in.nextInt();
            }

            cardsNum = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            recursion(0, list, -1);

            System.out.println(ans);
            scan.close();

        } catch (Exception e) {
            System.out.println("Encountered exception: " + e);
        }
    }

    private static void recursion(int i, ArrayList<Integer> list, int prev) {
        if (i == cardsNum) {
            // out.println(list);
            BigInteger ones = new BigInteger("1");
            for (int x : list) {
                BigInteger bg = new BigInteger(String.valueOf(arr[x]));
                ones = ones.multiply(bg);
            }
            ans = ans.add(ones);
        } else if (i < cardsNum) {
            for (int j = prev + 1; j < 10; j++) {
                list.add(j);
                recursion(i + 1, list, j);
                list.remove(list.size() - 1);
            }
        }
    }
}
