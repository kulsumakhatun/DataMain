package main;
import data.Book;

public class BookImple {
    public static void main(String[] args) {
        Book obj = new Book();
        obj.setAuthor("Robindranath Tagore");
        obj.setiSBN(2000);
        obj.setTitle("Gitanjali");
        obj.setPublishedYear(1912);
        obj.getPublishedYear();
        obj.getAuthor();
        obj.getiSBN();
        obj.getTitle();
        System.out.println("Author Name : " + obj.getAuthor() );
        System.out.println( "Title of the Book: " + obj.getTitle() );
        System.out.println("Publishing year : " + obj.getPublishedYear() );
        System.out.println( "ISBN  : " + obj.getiSBN() );


    }
        }

