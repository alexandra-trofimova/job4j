package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int num) {
        boolean prime = false;
        if (num == 2)
            prime = true;
        else {
            for (int index = 2; index < num; index++) {
                if (num % index == 0) {
                    prime = false;
                    break;
                }
                else
                    prime = true;
            }
        }
        return prime;
    }
}
