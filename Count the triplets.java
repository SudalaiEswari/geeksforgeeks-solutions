import java.util.Arrays;

class Solution {
    int countTriplet(int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int count = 0;

        for (int i = n - 1; i >= 0; i--) { // arr[i] = c
            int left = 0;
            int right = i - 1;

            while (left < right) {
                int sum = arr[left] + arr[right];

                if (sum == arr[i]) {
                    count++;
                    left++;
                    right--;
                } 
                else if (sum < arr[i]) {
                    left++;
                } 
                else {
                    right--;
                }
            }
        }
        return count;
    }
}
