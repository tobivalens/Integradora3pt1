package model;
import java.util.ArrayList;
import java.util.Calendar;



public class Premium extends User{
    private Calendar publishingDate;

    ArrayList<BibliographicProduct> premiumLibrary= new ArrayList<BibliographicProduct>();
    ArrayList<ReadingSimulation> readingSimulation= new ArrayList<ReadingSimulation>();
    private ArrayList<String[][]> matrixPages = new ArrayList<>();
    private int matrixPage = 0;

    public int getMatrixPage() {
        return matrixPage;
    }




    public void setMatrixPage(int matrixPage) {
        this.matrixPage = matrixPage;
    }

    private String [][] libraryMatrix;

    
     public Premium (String id, String name) {
        super( id,  name);
        libraryMatrix = new String[5][5];

    }


  

    public String[][] getLibraryMatrix() {
        return libraryMatrix;
    }




    public void setLibraryMatrix(String[][] libraryMatrix) {
        this.libraryMatrix = libraryMatrix;
    }


    public ArrayList<ReadingSimulation> getReadingSimulation() {
        return readingSimulation;
    }


    public void setReadingSimulation(ArrayList<ReadingSimulation> readingSimulation) {
        this.readingSimulation = readingSimulation;
    }


    public ArrayList<BibliographicProduct> getPremiumLibrary() {
        sortLibraryByPublishingDate();
        return premiumLibrary;
    }

    public void setPremiumLibrary(ArrayList<BibliographicProduct> premiumLibrary) {
        this.premiumLibrary = premiumLibrary;
    }

    public String getUserLibrary() {
		String msg = "";

		for (int i = 0; i < premiumLibrary.size(); i++) {
		
				msg += "\n" + (i + 1) + ". " + premiumLibrary.get(i).getId() ;
		}

		return msg;

	}
    public boolean addReadingSesion(String productID, String productName){
        

       if (readingSimulation.add(new ReadingSimulation(productID, productName))) {
        return true;
       }

       return false;

    }
   
        public void sortLibraryByPublishingDate() {
        
        int n = premiumLibrary.size();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            BibliographicProduct product1 = premiumLibrary.get(j);
            BibliographicProduct product2 = premiumLibrary.get(j + 1);

            if (product1 != null && product2 != null && product1.getPublicDate() != null && product2.getPublicDate() != null) {
                if (product1.getPublicDate().compareTo(product2.getPublicDate()) > 0) {
                    
                    premiumLibrary.set(j, product2);
                    premiumLibrary.set(j + 1, product1);
                }
            }
        }
    }
        }
    public String showPremiumLibrary() {
        createLibraryPages();
        String xd="";
        if (matrixPages.isEmpty()) {
            System.out.println("Premium library is empty.");
            return "";
        }
    
        String[][] currentLibraryMatrix = matrixPages.get(matrixPage);
        xd+=("Page " + (matrixPage + 1) + ":\n");
    
        for (int i = 0; i < currentLibraryMatrix.length; i++) {
            xd += String.format("| %2d | ", i); // Imprimir coordenada vertical
            for (int j = 0; j < currentLibraryMatrix[i].length; j++) {
               xd+=(currentLibraryMatrix[i][j] + " ");
               xd+="";
               xd += " | ";
            }
            xd += "\n";

            if (i < currentLibraryMatrix.length - 1) {
                xd += "-----------------------------\n"; // Línea separadora horizontal
            }
            
        }

        xd += "|   ";
    for (int j = 0; j < currentLibraryMatrix[0].length; j++) {
        xd += String.format("| %2d ", j);
    }
    xd += "|\n";

    

        return xd;
    }
 // metodo provisional
    public void addProductsMatrix(){
        sortLibraryByPublishingDate();
        int index=0;
       
        for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
                if (index < premiumLibrary.size() && premiumLibrary.get(index) != null) {
                    libraryMatrix[i][j] = premiumLibrary.get(index).getId();
                } else {
                    libraryMatrix[i][j] = "-";
                }
                index++;
			}
		}
    }

    public void createLibraryPages() {
        sortLibraryByPublishingDate();
        matrixPages.clear();
        int totalProducts = premiumLibrary.size();
        int totalPages = totalProducts / 25;
        if (totalProducts % 25 != 0) {
            totalPages++;
        }

        for (int p = 0; p < totalPages; p++) {
           
            String[][] libraryMatrix = new String[5][5];
            int initIndex = p * 25;
            int endIndex = initIndex + 25;
            if (endIndex > totalProducts) {
                endIndex = totalProducts;
            }

            int index = 0;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (initIndex + index < endIndex) {
                        libraryMatrix[i][j] = premiumLibrary.get(initIndex + index).getId();
                    } else {
                        libraryMatrix[i][j] = "-";
                        
                       
                    }
                    
                    index++;
                }
               
            }

            matrixPages.add(libraryMatrix);
        }
    }
    

    public void nextPage() {
        if (matrixPage < matrixPages.size() - 1) {
            matrixPage++;
        }
    }

    public void previousPage() {
        if (matrixPage > 0) {
            matrixPage--;
        }
    }

    public boolean selectProductByCoordinates(int x, int y) {
        if (x >= 0 && x < 5 && y >= 0 && y < 5) {
            String[][] libraryMatrix = matrixPages.get(matrixPage);
            String productIdentifier = libraryMatrix[x][y];
            if (selectProductByIdentifier(productIdentifier)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public boolean selectProductByIdentifier(String identifier) {
        String str= "";
        for (BibliographicProduct product : premiumLibrary) {
            if (product.getId().equals(identifier)) {
                
               
               return true;
            }
        }
    
      
        return false;
    }

    



}
