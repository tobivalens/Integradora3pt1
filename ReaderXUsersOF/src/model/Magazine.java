package model;

import java.util.Calendar;

public class Magazine extends BibliographicProduct {
    private String periodicEmision;
    private double suscriptionValue;
    private int activeSuscription;
    private GenreMagazine genreM;
    private int pagesReadM;

    public int getPagesReadM() {
        return pagesReadM;
    }

    public void setPagesReadM(int pagesReadM) {
        this.pagesReadM = pagesReadM;
    }

    public GenreMagazine getGenreM() {
        return genreM;
    }

    public void setGenreM(GenreMagazine genreM) {
        this.genreM = genreM;
    }

    public Magazine(String id, String name, int pagesNumber, String periodicEmision, Calendar publicDate, GenreMagazine genre, String url, double suscriptionValue){
        super(id,name,pagesNumber,publicDate,url);
        this.pagesReadM=pagesReadM;
        this.periodicEmision= periodicEmision;
        this.suscriptionValue=suscriptionValue;
        this.activeSuscription=activeSuscription;
        
    }

    public String getPeriodicEmision() {
        return periodicEmision;
    }

    public void setPeriodicEmision(String periodicEmision) {
        this.periodicEmision = periodicEmision;
    }

    public double getSuscriptionValue() {
        return suscriptionValue;
    }

    public void setSuscriptionValue(double suscriptionValue) {
        this.suscriptionValue = suscriptionValue;
    }

    public int getActiveSuscription() {
        return activeSuscription;
    }

    public void setActiveSuscription(int activeSuscription) {
        this.activeSuscription = activeSuscription;
    }

    /**
     * This method allows the user to increase the number of active suscriptions and get the price to generate the bill
	 * @param idMagazine int 	position of the product to buy in the arraylist
     * @return susValue double  value of the suscription to the magazine 
     */

    @Override
    public double buyProduct(int idMagazine) {

        int actSus=this.getActiveSuscription();
        actSus++;
        this.setActiveSuscription(actSus);

        double susValue=this.getSuscriptionValue();
        return susValue;
    }

    @Override
    public String readingSimulator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'readingSimulator'");
    }


    
}
