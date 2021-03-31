import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class Runner {

    private static final Logger logger = LoggerFactory.getLogger(Runner.class.getName());

    public static void main(String[] args) {

        logger.debug("Start of the program");
        Random random = new Random();

        int[] sortedArray = new int[100];

        sortedArray[0] = random.nextInt(20);
        System.out.printf("\n%d ", sortedArray[0]);

        for (int i = 1; i < 100; ++i) {
            sortedArray[i] = random.nextInt(20) + sortedArray[i - 1];
            System.out.printf("%d ", sortedArray[i]);
            if (i % 9 == 0) {
                System.out.println();
            }
        }
        System.out.println();

        logger.debug("Array created");

        System.out.print("Enter number: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        in.close();

        logger.debug("required number set");

        int required_index = SearchingAssistant.binarySearch(sortedArray, number, 0, sortedArray.length - 1);

        if (required_index >= 0) {
            System.out.printf("Required index = %d\n", required_index);
        } else {
            System.out.println("Number was not found");
        }

        logger.debug("End of the binarySearch method");
        logger.debug("End of the program\n\n\n\n");
    }
}
