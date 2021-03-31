import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SearchingAssistant {

    private static final Logger logger = LoggerFactory.getLogger(SearchingAssistant.class.getName());

    static {
        logger.debug("Start of the binarySearch method");
    }

    public static int binarySearch(int[] array, int number, int left, int right) {
        if (left > right) {
            return -1;
        }

        int middle = left + (right - left) / 2;

        logger.debug("Range [{}, {}], middle index = {}, element value = {}", left, right, middle, array[middle]);

        if (array[middle] > number) {
            return binarySearch(array, number, left, middle - 1);
        } else if (array[middle] < number) {
            return binarySearch(array, number, middle + 1, right);
        }

        logger.debug("required number is found");

        return middle;
    }
}
