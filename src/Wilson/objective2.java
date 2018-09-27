package Wilson;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class objective2 {

    public static void main(String[] args) {
        boolean correct = false;
        int min = 1;
        int max = 100;
        int guesses = 0;
        int number = (int) (max * Math.random()+1);
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scan.nextLine();

        System.out.println("is your number " + number +", " + name +"?");
        String str = "";


        while (correct == false) {
            try {
                 str = scan.nextLine();
            }
            catch (IllegalStateException e)
            {

                System.out.println("");
                scan.close();
            }

            if (str.equals("correct")) {

                System.out.println("WE GOT A WINNER!");
                System.out.println("It took you "+guesses + " tries!");

                correct = true;
            }

            if (str.equals("higher")) {
                min = number + 1;
                 number = (int) (Math.random()*(max - min))+min;
                if (number<= min||number>= max )
                {
                    number = (int) (Math.random()*(max - min))+min;

                }
                guesses++;

                System.out.println("is your number " + number +", " + name +"?");
            }


            if (str.equals("lower")) {
                max = number-1;
                 number = (int) (Math.random()*(max - min))+min;
                 if (number<= min||number>= max )
                 {
                     number = (int) (Math.random()*(max - min))+min;
                 }
                 guesses++;


                System.out.println("is your number" + number +", " + name +"?");


            }

        }


    }


}


