package Wilson;

import java.util.Scanner;

public class objective2 {
    //looks for the average of min and max. ->Binary guessing
    public static void main(String[] args) {



        boolean correct = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play game 1 or 2");
        int gamenumber=scan.nextInt();

        if(gamenumber ==1 ) {
            int randomnum = (int) (9.0 * Math.random() + 1);

            System.out.println("guess a number");

            int number = 0;


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



        if (gamenumber==2) {
            boolean correct2 = false;
            int min = 1;
            int max = 100;
            int guesses = 0;
            int number = (int) (max * Math.random());
            Scanner scan2 = new Scanner(System.in);
            System.out.println("What is your name?");
            String name = scan2.nextLine();

            System.out.println("is your number " + number + ", " + name + "?");
            String str = "";


            while (correct2 == false) {
                try {
                    str = scan.nextLine();
                } catch (IllegalStateException e) {

                    System.out.println("");
                    scan2.close();
                }

                if (str.equals("correct")) {

                    System.out.println("WE GOT A WINNER!");
                    System.out.println("It took you " + guesses + " tries!");

                    correct2 = true;
                }

                if (str.equals("higher")) {
                    min = number + 1;
                    number = (max+min)/2;
                    if (number <= min || number >= max) {
                        number = (max+min)/2;

                    }

                    guesses++;

                    System.out.println("is your number " + number + ", " + name + "?");
                }


                if (str.equals("lower")) {
                    max = number - 1;
                    number = (max+min)/2;
                    if (number <= min || number >= max) {
                        number = (max+min)/2;
                    }
                    guesses++;


                    System.out.println("is your number" + number + ", " + name + "?");


                }

            }
        }


    }


}

