import java.io.IOException;
import java.util.Scanner;

public class Some_Sum {
    public static void main(String[] args){
        try {
            Scanner scan = new Scanner(System.in);
            int number = scan.nextInt();
            String output;

            if(number % 2 == 0){
                if(number == 2 || number % 4 != 0) output = "Odd";
                else output = "Even";
            }
            else output = "Either";

            System.out.println(output);
            scan.close();
        } catch (Exception e) {
            System.out.println("Encountered exception: " + e);
        }
    }
}
