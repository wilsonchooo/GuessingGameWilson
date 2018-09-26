package Wilson;

import java.util.Scanner;

public class objective2 {

    public static void main(String[] args) {
        boolean correct = false;
        int min = 1;
        int max = 100;

        int number = (int) (max * Math.random()+1);
        Scanner scan = new Scanner(System.in);
        System.out.println("is your number" + number);


        while (correct == false) {
            String str = scan.nextLine();

            if (str.equals("correct")) {
                System.out.println("WE GOT A WINNER");
                correct = true;
            }

            if (str.equals("higher")) {
                min = number;
                 number = (int) (Math.random()*(max - min))+min;
                System.out.println(min);

                // number = (int) (Math.random() * (100 - number) + 1) + number;
                System.out.println("is your number" + number);
            }

            if (str.equals("lower")) {
                max = number;
                 number = (int) (Math.random()*(max - min))+min;
                //number = (int) (Math.random() * (number - 100) + 1) + number;
                System.out.println("is your number" + number);


            }

        }


    }


}


/*
        int randomWithRange(int min, int max)
        {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
        }
        */