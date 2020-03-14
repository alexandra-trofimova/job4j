package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book ndp = new Book("Notre Dame de Paris", 368);
        Book pinokkio = new Book("Pinokkio", 34);
        Book alisa = new Book("Alisa", 118);
        Book cleancode = new Book("Clean code", 3);

        Book[] books = new Book[4];

        books[0] = ndp;
        books[1] = pinokkio;
        books[2] = alisa;
        books[3] = cleancode;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPages());
        }

        System.out.println("Swap books 0 and 3");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            System.out.println(b.getName() + " - " + b.getPages());
        }

        System.out.println("Shown only Clean Code");
        for (int index = 0; index < books.length; index++) {
            Book b = books[index];
            String tmp = b.getName();
            String needed = "Clean code";
            if (tmp.equals(needed)) {
                System.out.println(b.getName() + " - " + b.getPages());
            }
        }
    }
}
