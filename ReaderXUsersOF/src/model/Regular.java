package model;

public class Regular extends User {

    private BibliographicProduct[] regularBooks;
    private BibliographicProduct[] regularMagazine;


    public Regular(String id, String name){
          super(id,  name);
          this.regularBooks = new BibliographicProduct[5];
          this.regularMagazine= new BibliographicProduct[2];

    
    }


    public BibliographicProduct[] getRegularBooks() {
        return regularBooks;
    }


    public void setRegularBooks(BibliographicProduct[] regularBooks) {
        this.regularBooks = regularBooks;
    }


    public BibliographicProduct[] getRegularMagazine() {
        return regularMagazine;
    }


    public void setRegularMagazine(BibliographicProduct[] regularMagazine) {
        this.regularMagazine = regularMagazine;


    }

    public String getUserRegularLibrary() {
		String msg = "";

		for (int i = 0; i < regularBooks.length; i++) {
            if(regularBooks[i]!=null){
                msg += "\n" + (i + 1) + ". " + regularBooks[i].getName() ;

            }
				
		}

        for (int i = 0; i < regularMagazine.length; i++) {
            if(regularMagazine[i]!=null){
                msg += "\n" + (i + 1) + ". " + regularMagazine[i].getName() ;

            }
				
		}

		return msg;

	}
  
}
