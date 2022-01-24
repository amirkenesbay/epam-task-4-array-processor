package com.epam.java_basic.array_processor;

import java.util.Arrays;

/**
 * Useful methods for array processing
 */
public class ArrayProcessor {

    public int[] swapMaxNegativeAndMinPositiveElements(int[] input) {
        int maximalNegative = Integer.MIN_VALUE;
        int minimalPositive = Integer.MAX_VALUE;
        int maximalNegativeIndex = 0;
        int minimalPositiveIndex = 0;
        int temp;
        input = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};

        for (int i = 1; i < input.length; i++) {
            if (input[i] < 0 && maximalNegative < input[i]) {
                maximalNegative = input[i];
                maximalNegativeIndex = i;
            }
            if (input[i] > 0 && minimalPositive > input[i]) {
                minimalPositive = input[i];
                minimalPositiveIndex = i;
            }
        }

        temp = input[maximalNegativeIndex];
        input[maximalNegativeIndex] = input[minimalPositiveIndex];
        input[minimalPositiveIndex] = temp;
        return input;
    }

    public int countSumOfElementsOnEvenPositions(int[] input) {
        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i % 2 == 0) {
                sum += input[i];
            }
        }
        return sum;
    }

    public int[] replaceEachNegativeElementsWithZero(int[] input) {
        input = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                input[i] = 0;
            }
        }
        return input;
    }

    public int[] multiplyByThreeEachPositiveElementStandingBeforeNegative(int[] input) {
        input = new int[]{-4, 4, 8, 0, -5, 1, 8, 5, 2, 7, 5, 5, 6, 0, 7, -1, -7, -6, -2, 9};
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i + 1] < 0 && input[i] > input[i + 1] && input[i] > 0) {
                input[i] *= 3;
            }
        }
        return input;
    }

    public float calculateDifferenceBetweenAverageAndMinElement(int[] input) {
        float differenceBetweenAverageAndMinElement = 0;
        int minimalElement = input[0];
        for (int i = 0; i < input.length; i++) {
            differenceBetweenAverageAndMinElement += input[i];
            if (minimalElement > input[i]) {
                minimalElement = input[i];
            }
        }
        differenceBetweenAverageAndMinElement = differenceBetweenAverageAndMinElement / input.length - minimalElement;
        return differenceBetweenAverageAndMinElement;
    }

    public int[] findSameElementsStandingOnOddPositions(int[] input) {
        int[] result = Arrays.copyOf(input, 3);
        boolean repeated = false;
        int position = 0;
        System.out.println("6) Elements which present more than one time and stay on odd index:");
        for (int i = 0; i < input.length-1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] == input[j] && i % 2 != 0) {
                    for (int k = 0; k < i; k++) {
                        if (input[k] == input[i])   {
                            repeated = true;
                            break;
                        }
                    }
                    if (!repeated) {
                        if(input[i]>=0){
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
