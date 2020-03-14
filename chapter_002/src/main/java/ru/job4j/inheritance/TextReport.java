package ru.job4j.inheritance;

/**
 * Class Класс для создания отчета в текстовом формате
 * @author Alexandra Trofimova
 * @since 14.03.2020
 * @version 1
 */
public class TextReport {
    public String generate(String name, String body) {

        return name + System.lineSeparator() + body;
    }
}
