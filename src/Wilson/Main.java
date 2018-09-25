package Wilson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean correct = false;
        int randomnum = (int)(10.0*Math.random());
        Scanner scan = new Scanner(System.in);
        //System.out.println(randomnum);

        while (correct == false);
        {
            int number = scan.nextInt();
            if (number != randomnum) {
                System.out.println("wrong");
            }
            if (number == randomnum)
            {
                correct =true;
            }
        }
        if (correct ==true)
        {
            System.out.println("wrong");

        }
    }
}//eeeeeeeeeeeeeee