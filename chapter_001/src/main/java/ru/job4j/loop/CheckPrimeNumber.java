package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = num > 1;
        for (int index = 2; (index < num) && prime; index++) {
                if (num % index == 0) {
                    prime = false;
                    break;
                }
            }
        return prime;
    }
}
