package main.tomedb.java.main.model;

public class BookModel {

    private String title;
    private String authorLastName;
    private String authorFirstName;
    private int pageCount;
    private boolean readStatus;
    private double rating;
    private int yearOfRelease;

    public String getTitle() {
        return this.title;
    }

    public String getAuthorLastName() {
        return this.authorLastName;
    }

    public String getAuthorFirstName() {
        return this.authorFirstName;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public boolean getReadStatus() {
        return this.readStatus;
    }

    public double getRating() {
        return this.rating;
    }

    public int getYearOfRelease() {
        return this.yearOfRelease;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public void setAuthorFirstName(String authorFirstName) {
        this.authorFirstName = authorFirstName;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setReadStatus(boolean readStatus) {
        this.readStatus = readStatus;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }
    
}
