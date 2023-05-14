package model;

import java.util.Calendar;

public abstract class BibliographicProduct implements Buyable, Readable {

    private String id;
	private String name;
	private int pagesNumber;
	private Calendar publicDate;
    private String url;
    private int pagesRead;

    public BibliographicProduct(String id,String name,int pagesNumber, Calendar publicDate, String url){
        this.id = id;
		this.name = name;
		this.pagesNumber = pagesNumber;
        this.pagesRead = pagesRead;
		this.publicDate= publicDate;
        this.url= url;

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

    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
    
}
