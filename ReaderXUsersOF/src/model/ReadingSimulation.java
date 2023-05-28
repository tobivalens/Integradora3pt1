package model;

public class ReadingSimulation{
    private int pagesRead=1;
    private int actualPage;
    private String productName;
    private String productID;

    public String getProductID() {
        return productID;
    }


    public void setProductID(String productID) {
        this.productID = productID;
    }


    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

   

    public int getActualPage() {
        return actualPage;
    }


    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }


    public ReadingSimulation(String productID, String productName){
        this.productName= productName;
        this.productID=productID;
        this.actualPage=actualPage;
        this.pagesRead= pagesRead;

    }


    public int getPagesRead() {
        return pagesRead;
    }

    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    } 

    
}
