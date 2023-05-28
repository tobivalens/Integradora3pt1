package model;

import java.util.Calendar;

public abstract class BibliographicProduct implements Buyable, Readable , Comparable<BibliographicProduct> {

    private String id;
	private String name;
	private int pagesNumber;
	private Calendar publicDate;
    private String url;
    private int soldBooks;
    private int activeSuscriptions;
    private int valueSuscriptions;
 

    public BibliographicProduct(String id,String name,int pagesNumber, Calendar publicDate, String url){
        this.id = id;
		this.name = name;
		this.pagesNumber = pagesNumber;
        this.soldBooks=soldBooks;
        this.activeSuscriptions=activeSuscriptions;
        this.valueSuscriptions=valueSuscriptions;
		this.publicDate= publicDate;
        this.url= url;

    }

    public int compareTo(BibliographicProduct other) {
        return this.publicDate.compareTo(other.publicDate);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public Calendar getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(Calendar publicDate) {
        this.publicDate = publicDate;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
