package model;
import java.lang.annotation.Retention;
import java.util.ArrayList;
import java.util.Arrays;

public class Regular extends User  {

    private BibliographicProduct[] regularBooks;
    private BibliographicProduct[] regularMagazine;
    private BibliographicProduct[] libraryRegular;
    ArrayList<ReadingSimulation> regularSimulation= new ArrayList<ReadingSimulation>();
    private String regularLibrary[][];

    public String[][] getRegularLibrary() {
        return regularLibrary;
    }

    public void setRegularLibrary(String[][] regularLibrary) {
        this.regularLibrary = regularLibrary;
    }

    public Regular(String id, String name){
          super(id,  name);
          this.regularBooks = new BibliographicProduct[5];
          this.regularMagazine= new BibliographicProduct[2];
          this.libraryRegular= new BibliographicProduct[7];
          regularLibrary= new String[5][5];

    
    }

    public ArrayList<ReadingSimulation> getRegularSimulation() {
        return regularSimulation;
    }


    public void setRegularSimulation(ArrayList<ReadingSimulation> regularSimulation) {
        this.regularSimulation = regularSimulation;
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

    public BibliographicProduct[] getLibraryRegular() {
        return libraryRegular;
    }


    public void setLibraryRegular(BibliographicProduct[] libraryRegular) {
        this.libraryRegular = libraryRegular;
    }

    public  BibliographicProduct[] setFullLibrary(){

    int index = 0;

    for (int i = 0; i < regularBooks.length; i++) {
        if (regularBooks[i] != null) {
            libraryRegular[index] = regularBooks[i];
            index++;
        }
    }

    for (int i = 0; i < regularMagazine.length; i++) {
        if (regularMagazine[i] != null) {
            libraryRegular[index] = regularMagazine[i];
            index++;
        }
    }

    
    

    return libraryRegular;
    }

    public boolean selectProductByIdentifier(String identifier) {
        String str= "";
        for (BibliographicProduct product : libraryRegular) {
            if (product.getId().equals(identifier)) {
                
                this.addReadingSesion(product.getId(), product.getName());
               
               return true;
            }
        }
    
      
        return false;
    }

    public boolean selectProductByCoordinates(int x, int y) {
        if (x >= 0 && x < 5 && y >= 0 && y < 5) {
            String productIdentifier = regularLibrary[x][y];
            if (selectProductByIdentifier(productIdentifier)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    public boolean addReadingSesion(String productID, String productName){
        

        if (regularSimulation.add(new ReadingSimulation(productID, productName))) {
         return true;
        }
 
        return false;
 
     }

    public String showMatrixLibrary() {
    addProductsMatrix();
        
    String out = "";

    for (int i = 0; i < regularLibrary.length; i++) {
        out += String.format("| %2d | ", i); // Imprimir coordenada vertical

        for (int j = 0; j < regularLibrary[i].length; j++) {
            if (regularLibrary[i][j] != null) {
                out += regularLibrary[i][j];
            } else {
                out += " ";
            }

            out += " | ";
        }

        out += "\n";

        if (i < regularLibrary.length - 1) {
            out += "-----------------------------\n"; // Línea separadora horizontal
        }
    }

    // Imprimir coordenadas horizontales
    out += "|   ";
    for (int j = 0; j < regularLibrary[0].length; j++) {
        out += String.format("| %2d ", j);
    }
    out += "|\n";

    return out;
}

   
       public void addProductsMatrix(){
        
        setFullLibrary();
        sortBooksByPublicationDate();
    int index = 0;

    for (int i = 0; i < regularLibrary.length; i++) {
        for (int j = 0; j < regularLibrary[i].length; j++) {
            if (index < libraryRegular.length && libraryRegular[index] != null) {
                regularLibrary[i][j] = libraryRegular[index].getId();
            } else {
                regularLibrary[i][j] = "-";
            }
            index++;
        }
    }
}


    public void sortBooksByPublicationDate() {
        int n = libraryRegular.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                BibliographicProduct product1 = libraryRegular[j];
                BibliographicProduct product2 = libraryRegular[j + 1];
    
                if (product1 != null && product2 != null && product1.getPublicDate() != null && product2.getPublicDate() != null) {
                    if (product1.getPublicDate().compareTo(product2.getPublicDate()) > 0) {
                        // Intercambiar los elementos si están en orden incorrecto
                        libraryRegular[j] = product2;
                        libraryRegular[j + 1] = product1;
                    }
                }
            }
        }
    }


}
