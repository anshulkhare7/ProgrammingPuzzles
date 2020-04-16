# Array Based Problems.

## Leetcode problems
1. DI String Match. Leet code problem [942](https://leetcode.com/problems/di-string-match/)
2. Squares of a Sorted Array. Leet code problem [977](https://leetcode.com/problems/squares-of-a-sorted-array/)
3. Rotate Array. Leet code problem [189](https://leetcode.com/problems/rotate-array/) 


## Subarray problems

1. Given an array of positive numbers and a positive number ‘k’, find the **maximum sum of any contiguous subarray of size ‘k’.**

## Proposed Solution

This can be solved using sliding window approach. To calculate the sum of a contiguous subarray we can utilize the sum of the previous subarray. For this, consider each subarray as a Sliding Window of size ‘k’. To calculate the sum of the next subarray, we need to slide the window ahead by one element. So to slide the window forward and calculate the sum of the new position of the sliding window, we need to do two things:

    - Subtract the element going out of the sliding window i.e., subtract the first element of the window.
    - Add the new element getting included in the sliding window i.e., the element coming right after the end of the window.


2. Given an array of positive numbers and a positive number ‘S’, find the length of the smallest contiguous subarray whose sum is greater 
than or equal to ‘S’. Return 0, if no such subarray exists.

## Proposed Solution

This can also be solved using sliding window approach. However, the size of the window will not be fixed here. Here are the steps —

    - First, we will add-up elements from the beginning of the array until their sum becomes greater than or equal to ‘S’.
    - These elements will constitute our sliding window. Remember the length of this window as the smallest window so far.
    - Keep adding one element in the sliding window (i.e. slide the window ahead), in a stepwise fashion.
    - In each step, try to shrink the window from the beginning. Keep shrinking until the window’s sum is smaller than ‘S’ again. Shrinking will also happen in multiple steps; in each step we will do two things:
        1. Check if the current window length is the smallest so far, and if so, remember its length.
        2. Subtract the first element of the window from the running sum to shrink the sliding window.
