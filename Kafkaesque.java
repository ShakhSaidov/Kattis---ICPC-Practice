import java.io.IOException;
import java.util.Scanner;

public class Kafkaesque {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            int desks = scan.nextInt();
            int passes = 1;
            int max = 0;

            for (int i = 0; i < desks; i++) {
                int deskNum = scan.nextInt();
                if(max > deskNum) passes++;
                max = deskNum;
            }

            System.out.println(passes);

            scan.close();
        } catch (Exception e) {
            System.out.println("Encountered exception: " + e);
        }
    }
}
