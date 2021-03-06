package ru.job4j.inheritance;

/**
 * Class Класс для создания отчета в формате JSON
 * @author Alexandra Trofimova
 * @since 14.03.2020
 * @version 1
 */

public class JSONReport extends TextReport {

    @Override
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "name : " + name + "," + System.lineSeparator() +
                "body : " + body + System.lineSeparator() +
                "}." ;
    }
}
