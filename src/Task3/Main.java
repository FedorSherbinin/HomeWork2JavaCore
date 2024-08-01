package Task3;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 0, 0, 3, 4};
        int[] array2 = {2, 1, 3, 0, 0};
        int[] array3 = {0, 1, 0, 3, 4};
        int[] array4 = {1, 2, 3, 4, 5};

        System.out.println(hasTwoConsecutiveZeros(array1)); // Вывод: true
        System.out.println(hasTwoConsecutiveZeros(array2)); // Вывод: true
        System.out.println(hasTwoConsecutiveZeros(array3)); // Вывод: false
        System.out.println(hasTwoConsecutiveZeros(array4)); // Вывод: false
    }

    public static boolean hasTwoConsecutiveZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
