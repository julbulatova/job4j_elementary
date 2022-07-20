package ru.job4j.condition;

public class Game {
    public static void menu(String name) {
        if ("super mario".equals(name)) {
            System.out.println("Start - super mario");
        }
        if ("thanks".equals(name)) {
            System.out.println("Start - thanks");
        }
        if ("tetris".equals(name)) {
            System.out.println("Start - tetris");
        }
    }

    public static void main(String[] args) {
        Game.menu("thanks");
    }
}
