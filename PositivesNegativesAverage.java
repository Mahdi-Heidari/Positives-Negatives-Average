package positivesnegativesaverage;

import java.util.Scanner;

public class PositivesNegativesAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer, the input ends if it is 0:\t");
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("No numbers are entered expect 0");           
        } else {
            int sum, negative, positive;
            sum = negative = positive = 0;
            do {
                sum += number;
                if (number > 0) {
                    positive++;
                } else {
                    negative++;
                }
                number = input.nextInt();

            } while (number != 0);

            System.out.printf("The number of positives is %d\n"
                    + "The number of negatives is %d\n"
                    + "The total is %d\n"
                    + "The average is %f\n", positive, negative, sum, (double) sum / (positive + negative));
        }

    }

}
