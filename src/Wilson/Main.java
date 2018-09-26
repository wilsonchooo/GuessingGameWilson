package Wilson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean correct = false;
        int randomnum = (int) (9.0 * Math.random()+1);
        Scanner scan = new Scanner(System.in);
        System.out.println("guess a number");

        int number =0;


        while (number != randomnum) {
            number = scan.nextInt();


            if (number != randomnum) {
                System.out.println("wrong");

            }

            if (number == randomnum) {
                correct = true;
                System.out.println("correct");

            }
        }
    }
}//eeeeeeeeeeeeeee