package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        for (int i = 0; i < post.length; i++) {
            int postCurrentIndex = post.length - 1 - i;
            int wordCurrentIndex = word.length - 1 - i;
            if (word[wordCurrentIndex] != post[postCurrentIndex]) {
                return false;
            }
        }
        return true;
    }
}
