package com.epam.java_basic;

import java.util.Arrays;

/**
 * Application's entry point, use it to demonstrate your code execution
 */
public class Application {

    public static void main(String[] args) {
        int[] input = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        System.out.println(Arrays.toString(findSameElementsStandingOnOddPositions(input)));
    }

    public static int[] findSameElementsStandingOnOddPositions(int[] input) {
        int[] result = Arrays.copyOf(input, 3);
        boolean repeated = false;
        int position = 0;
        System.out.println("6) Elements which present more than one time and stay on odd index:");
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j] && i % 2 != 0) {
                    if (!repeated) {
                        if (input[i] >= 0) {
                            result[position] = input[i];
                            position++;
                        }
                    }
                    break;
                }
            }
        }
        return result;
    }
}
