package semester2.Pertemuan15;

import java.util.Stack;

public class StackDemo19 {
    public static void main(String[] args) {
        Book19 book1 = new Book19("1234", "Dasar Pemograman");
        Book19 book2 = new Book19("7145", "Hafalan Shalat Delis");
        Book19 book3 = new Book19("3562", "Muhammad AL-Fatih");

        Stack<Book19> books = new Stack<>();
        books.push(book1);
        books.push(book2);
        books.push(book3);

        Book19 temp = books.peek();

        if (temp != null) {
            System.out.println(temp.toString());
        }
        Book19 temp2 = books.pop();

        if (temp != null) {
            System.out.println(temp2.toString());
        }

        System.out.println(books);

        int posisi = books.search(book1);
        System.out.println("Posisi book1 dari atas stack: " + posisi);
    }
}
