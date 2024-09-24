//19) Program to find the frequency of each element of an array
import java.util.HashMap;

public class ElementFrequency {
    public static void findFrequency(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies: " + frequencyMap);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 3, 3, 4};
        findFrequency(array);
    }
}

