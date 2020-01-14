package ru.job4j.condition;

/**
 * Class Класс для создания Глупого бота, который знает всего 3 варианта ответа
 * @author Alexandra Trofimova
 * @since 18.12.2019
 * @version 1
 */
public class DummyBot {
    public static String answer(String question) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
        if ("Привет, Бот.".equals(question)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(question)) {
            rsl = "До скорой встречи.";
        }
        return rsl;
    }
    public static void main(String[] args) {
        String result = answer("Пока.");
        System.out.println(result);
    }
}
