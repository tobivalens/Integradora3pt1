package model;

import java.util.ArrayList;

public class Premium extends User{

    ArrayList<BibliographicProduct> premiumLibrary= new ArrayList<BibliographicProduct>();
    

  

    public Premium (String id, String name) {
        super( id,  name);

    }




    public ArrayList<BibliographicProduct> getPremiumLibrary() {
        return premiumLibrary;
    }




    public void setPremiumLibrary(ArrayList<BibliographicProduct> premiumLibrary) {
        this.premiumLibrary = premiumLibrary;
    }

    public String getUserLibrary() {
		String msg = "";

		for (int i = 0; i < premiumLibrary.size(); i++) {
		
				msg += "\n" + (i + 1) + ". " + premiumLibrary.get(i).getName() ;
		}

		return msg;

	}

  
    
}
