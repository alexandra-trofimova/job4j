package ru.job4j.inheritance;

/**
 * Class Класс для вывода отчета
 * @author Alexandra Trofimova
 * @since 10.03.2020
 * @version 1
 */

public class ReportUsage {
    public static void main(String[] args) {

        JSONReport report = new JSONReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
