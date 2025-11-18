public class Solution {
    public static int countGreaterThanPrevAvg(int[] arr) {
        int count = 0;
        int sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = sum / (double) i;
            if (arr[i] > avg) {
                count++;
            }
            sum += arr[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5, 10, 8, 20, 7, 30};

        System.out.println(countGreaterThanPrevAvg(nums));
    }
}
