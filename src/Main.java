import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 5, 8, 34, 143, 56, 98, 14, 26, 11, 33, 95, 3, 41, 54, 90};
        int targetSum = 44;
        HashSet<Integer> numbers = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int numberSecond = targetSum - nums[i];
            if (numbers.contains(numberSecond)) {
                for (int j = 0; j < i; j++) {
                    if (nums[j] == numberSecond) {
                        System.out.println("Индексы: " + j + ", " + i);
                        return;
                    }
                }
            }
            numbers.add(nums[i]);
        }
        System.out.println("Пара не найдена.");
    }
}
