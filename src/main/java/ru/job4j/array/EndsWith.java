package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        int postLastIndex = post.length - 1;
        int wordLastIndex = word.length - 1;

        for (int i = 0; i < post.length; i++) {
            int postCurrentIndex = postLastIndex - i;
            int wordCurrentIndex = wordLastIndex - i;

            if (word[wordCurrentIndex] != post[postCurrentIndex]) {
                return false;
            }
        }

        return true;
    }
}
