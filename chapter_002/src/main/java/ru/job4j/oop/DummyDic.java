package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String answer = "Неизвестное слово " + eng;
        return answer;
    }
    public static void main(String[] args) {
        DummyDic vasya = new DummyDic();
        String say = vasya.engToRus("Hello, world!");
        System.out.println(say);
    }
}
