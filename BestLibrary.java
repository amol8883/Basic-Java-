package com.onlinelib;

class Library{
    String[] books;
    int no_Of_books;
    Library(){
        this.books = new String[100];
        this.no_Of_books=0;
    }
    void addBook(String book){
        this.books[no_Of_books]= book;
        no_Of_books++;
        System.out.println(book+" has been added");
    }

    void showAvailable(){
        System.out.println("Available books are ");
        for (String total : books){
            if (total==null){
                break;
            }
            System.out.println("* "+total);
        }
    }
}

public class BestLibrary {

    public static void main(String[] args) {

        Library centralLibrary = new Library();
        centralLibrary.addBook("c");
        centralLibrary.addBook("c++");
        centralLibrary.addBook("java");
        centralLibrary.showAvailable();
    }
}
