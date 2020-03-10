package ru.job4j.inheritance;

/**
 * Class Класс для создания отчета в формате JSON
 * @author Alexandra Trofimova
 * @since 10.03.2020
 * @version 1
 */

public class JSONReport extends TextReport {

    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "name : " + name + "," + System.lineSeparator() +
                "body : " + body + System.lineSeparator() +
                "}." ;
    }
}
