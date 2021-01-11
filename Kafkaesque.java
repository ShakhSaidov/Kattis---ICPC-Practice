import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kafkaesque {

    /**
     *
     * @param list - arrayList of desk numbers to be passed
     * @return the number of passes required to get all clerks' signatures
     */
    private static int getPasses(List<Integer> list) {
        int passes = 0;

        while (!list.isEmpty()) {
            int curr = list.get(0);
            int size = list.size();
            int index = 0;
            for (int i = 0; i < size; i++) {
                if (curr <= list.get(index)) {
                    if (!list.isEmpty())
                        curr = list.get(index);
                    list.remove(index);
                } else
                    index++;
            }
            passes++;
        }

        return passes;
    }

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int desks = scan.nextInt();

            List<Integer> deskList = new ArrayList<Integer>();
            for (int i = 0; i < desks; i++) {
                int deskNum = scan.nextInt();
                deskList.add(deskNum);
            }

            int passes = getPasses(deskList);
            System.out.println(passes);

            scan.close();
        } catch (Exception e) {
            System.out.println("Encountered exception: " + e);
        }
    }
}
