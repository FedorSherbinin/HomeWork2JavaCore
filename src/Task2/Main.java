package Task2;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {10, 3, 5, 6};
        int[] array2 = {7, 2, 10, 9};
        int[] array3 = {2, 10, 7, 2};

        System.out.println(differenceMaxMin(array1)); // Вывод: 7
        System.out.println(differenceMaxMin(array2)); // Вывод: 8
        System.out.println(differenceMaxMin(array3)); // Вывод: 8
    }

    public static int differenceMaxMin(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }
}
