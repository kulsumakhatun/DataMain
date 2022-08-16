package data;

public class Book {
    private String title;
    private int publishedYear;
    private long iSBN;
    private String author;


    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setiSBN(long iSBN) {
        this.iSBN = iSBN;
    }

    public long getiSBN() {
        return iSBN;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public int getPublishedYear() {
        return publishedYear;
    }
}