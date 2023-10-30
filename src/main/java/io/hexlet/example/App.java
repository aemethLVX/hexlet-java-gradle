package io.hexlet.example;
import org.apache.commons.lang3.RandomUtils;


public class App {
    public static void main(String[] args) {
        var randomNumber = RandomUtils.nextInt(1, 1000);
        System.out.println("Hello, world! " + randomNumber);
    }
}