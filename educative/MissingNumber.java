package educative;
/**
 * Problem Statement: Given an array, nums, containing nn distinct numbers in the range [0,n][0,n], return the 
 * only number in the range that is missing from the array.
 * Constraints:
    n=nums.length
    1≤n≤10^3
    0≤ nums[i] ≤n
    There are no duplicates in the array.
 */
public class MissingNumber {

    public static int findMissingNumber(int[] nums) {
        
        int value = 0;
        int lenNums = nums.length;
        int idx = 0;

        // Don't do with for loop because idx is increased conditionally.
        while (idx < lenNums) {
            value = nums[idx];
            if (idx != value & value < lenNums){
                var tmp = nums[idx];
                nums[idx] = nums[value];
                nums[value] = tmp;
            } else {
                idx++;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]){
                return i;
            }
        }
        
        return 0;
    }
    public static void main(String[] args) {
        int[] result01 = {0,1,2,4};
        if (3 == findMissingNumber(result01)){
            System.out.println("Passed 01: [0,1,2,4]");
        } else {
            System.out.println("Failed 01: [0,1,2,4]");
        }

        int[] result02 = {3,0,1,4};
        if (2 == findMissingNumber(result02)){
            System.out.println("Passed 02: [3,0,1,4]");
        } else {
            System.out.println("Failed 02: [3,0,1,4]");
        }

        int[] result03 = {1,4,5,6,8,2,0,7};
        if (3 == findMissingNumber(result03)){
            System.out.println("Passed 03: {1,4,5,6,8,2,0,7}");
        } else {
            System.out.println("Failed 03: {1,4,5,6,8,2,0,7}");
        }

        int[] result04 = {1,0,2,3,4,5,6,8,9,7,11};
        if (10 == findMissingNumber(result04)){
            System.out.println("Passed 04: {1,0,2,3,4,5,6,8,9,7,11}");
        } else {
            System.out.println("Failed 04: {1,0,2,3,4,5,6,8,9,7,11}");
        }

        int[] result05 = {1};
        if (0 == findMissingNumber(result05)){
            System.out.println("Passed 05: {1}");
        } else {
            System.out.println("Failed 05: {1}");
        }
        
    }
}
