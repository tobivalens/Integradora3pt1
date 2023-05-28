package model;

import java.util.Calendar;

public class Book extends BibliographicProduct{
    private int numberSoldBooks;
    private String review;
    private double value;
    private Genre genre;
    private int getPagesReadB;
    



    public int getGetPagesReadB() {
        return getPagesReadB;
    }



    public void setGetPagesReadB(int getPagesReadB) {
        this.getPagesReadB = getPagesReadB;
    }



    public Genre getGenre() {
        return genre;
    }



    public void setGenre(Genre genre) {
        this.genre = genre;
    }



    public Book(String id, String name, int pagesNumber, String review, Calendar publicDate, Genre genre, String url, double value){
        super(id, name, pagesNumber, publicDate, url);

        this.numberSoldBooks= numberSoldBooks;
        this.review=review;
        this.value=value;
        this.genre=genre;
        this.getPagesReadB= getPagesReadB;
        
    }



    public int getNumberSoldBooks() {
        return numberSoldBooks;
    }



    public void setNumberSoldBooks(int numberSoldBooks) {
        this.numberSoldBooks = numberSoldBooks;
    }



    public String getReview() {
        return review;
    }



    public void setReview(String review) {
        this.review = review;
    }



    public double getValue() {
        return value;
    }



    public void setValue(double value) {
        this.value = value;
    }

/**
     * This method allows the user to increase the number sold book by sell and get the price to generate the bill
	 * @param option int 	position of the product to buy in the arraylist
     * @return bookValue double  value of the book 
     */

    @Override
    public double buyProduct(int option) {
        
        int soldB=this.getNumberSoldBooks();
        soldB++;
        this.setNumberSoldBooks(soldB);

        double bookValue=this.getValue();
        return bookValue;
    }



@Override
public String readingSimulator() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'readingSimulator'");
}





    
}
