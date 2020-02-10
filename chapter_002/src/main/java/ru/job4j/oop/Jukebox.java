package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
            System.out.println("Пешеходы по лужам,");
            System.out.println("А вода по асфальту рекой.");
            System.out.println("И неясно прохожим");
            System.out.println("В этот день непогожий");
            System.out.println("Почему я веселый такой.");
            System.out.println("");
        }
        else if (position == 2) {
            System.out.println("Спят усталые игрушки,");
            System.out.println("Книжки спят.");
            System.out.println("Одеяла и подушки");
            System.out.println("Ждут ребят.");
            System.out.println("Даже сказка спать ложится,");
            System.out.println("Чтобы нам с тобой присниться.");
            System.out.println("Глазки закрывай,");
            System.out.println("Баю-бай.");
            System.out.println("");
        }
         else   {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox verter = new Jukebox();
        verter.music (1);
        verter.music (2);
        verter.music (15);
    }
}
