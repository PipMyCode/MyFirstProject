package com.marcus.agg;

public class AggTestDrive {
    public static void main(String[] args) {

        Book book1 = new Book("The Diary of a Yoruba Demon", 500);
        Book book2 = new Book("The Diary of a Yoruba Demon II", 400);
        Book book3 = new Book("The Diary of a Yoruba Demon III", 300);

        Book[] books = {book1, book2, book3};

        Library library = new Library("OTA Public Library", 1987, books);

        library.displayInfo();
    }
}
