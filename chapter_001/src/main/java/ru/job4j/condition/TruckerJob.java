package ru.job4j.condition;

/**
 * Class Класс для иллюстрации работы операторов ветвления (на примере проверки, может ли Стив водить грузовик)
 * @author Alexandra Trofimova
 * @since 17.12.2019
 * @version 1
 */
public class TruckerJob {
    public static void main(String[] args) {
        Driver steve = new Driver();
        System.out.println("Steve wants the trucker job.");
        if (!steve.hasLicense()) {
            System.out.println("Steve need to get a license!");
            steve.passExamOn('A');
        }
        if (steve.canDrive('C')) {
            System.out.println("Steve works on truckers!");
        } else if (steve.canDrive('B')) {
            System.out.println("Steve works in taxi.");
        } else {
            System.out.println("Steve does not have a job, but ride on motorbike!");
        }
    }
}
