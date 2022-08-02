package ru.job4j.array;

public class RollBackArray {
    public static int[] rollback(int[] array) {
        int[] result = new int[array.length];

        for (int index = 0; index < result.length; index++) {
            int lastIndex = result.length - 1;
            int currentIndex = lastIndex - index;
            result[index] = array[currentIndex];
        }

        return result;
    }
}
