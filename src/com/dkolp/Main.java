package com.dkolp;

public class Main {

    public static void main(String[] args) {
        Task task = new Task();
        for (int i = 0; i < 25; i++) {
            System.out.println(task.getProductText(Task.EN, Task.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(task.getProductText(Task.EN, Task.GLASSES, i));
        }

        for (int i = 0; i < 25; i++) {
            System.out.println(task.getProductText(Task.RU, Task.APPLE, i));
        }for (int i = 0; i < 25; i++) {
            System.out.println(task.getProductText(Task.RU, Task.GLASSES, i));
        }
    }
}
