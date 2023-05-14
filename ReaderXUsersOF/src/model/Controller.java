package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.text.Position;

public class Controller {

	ArrayList <User> users = new ArrayList<User>();
	ArrayList <	BibliographicProduct> bibliographicProducts = new ArrayList<BibliographicProduct>();
	ArrayList<Bill> bills= new ArrayList<Bill>();


	//private User[] users;

	public Controller() {

		testCases();

	}

	public void testCases() {
		users.add( new Premium("Felthalas","Premium"));
		users.add( new Regular("Brayan","Estandar"));
		users.add( new Regular("Katniss","Estandar"));


		bibliographicProducts.add(new Book("BCA","Hunger Games",  300, "Cool", null, Genre.FICTION, "hungerGames.com.co", 30000));
		bibliographicProducts.add(new Book("ABC", "Harry Potter and the Goblet of Fire", 700, "Awesome", null, Genre.FANTASY, "harryPotter4.com.co", 80000));
		bibliographicProducts.add(new Book("ACD", "The Help", 400, "Great", null, Genre.FICTION, "theHelp.com.co", 50000));

		bibliographicProducts.add(new Magazine("M1D", "National Geographic", 120, "Monthly", null, GenreMagazine.SCIENTIFY, "natgeo.com", 50000));
		bibliographicProducts.add(new Magazine("M2C", "Time", 80, "Weekly", null, GenreMagazine.VARIETY, "time.com", 25000));
		bibliographicProducts.add(new Magazine("M3A", "Vogue", 150, "Monthly", null, GenreMagazine.DESIGN, "vogue.com", 45000));
		bibliographicProducts.add(new Magazine("M45", "Sports Illustrated", 100, "Weekly", null, GenreMagazine.VARIETY, "si.com", 30000));
		bibliographicProducts.add(new Magazine("M56", "Wired", 90, "Monthly", null, GenreMagazine.SCIENTIFY, "wired.com", 35000));


		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","Hunger Games",  300, "Cool", null, Genre.FICTION, "hungerGames.com.co", 30000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BAB","Crime and Punishment",  545, "A novel about guilt and redemption", null, Genre.FICTION, "crimebook.com.co", 38000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BIA","The Picture of Dorian Gray",  254, "A novel about vanity and corruption", null, Genre.FICTION, "doriangraybook.com.co", 26000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Magazine("M12","People en Español", 50, "Weekly", null, GenreMagazine.DESIGN, "peopleenespanol.com.co", 15000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Magazine("M23","Sports Illustrated", 80, "Weekly", null, GenreMagazine.VARIETY, "si.com.co", 18000));

		((Regular)(users.get(1))).getRegularBooks()[0]= new Book("BAA", "The Fault in Our Stars", 250, "", null, Genre.NOVEL, "theFaultInOurStars.com.co", 25000);
		((Regular)(users.get(1))).getRegularBooks()[1]=new Book("BBB","1984",  328, "Great read", null, Genre.FICTION, "1984book.com.co", 25000);
		((Regular)(users.get(1))).getRegularBooks()[2]= new Book("BCC","The Great Gatsby",  200, "A novel about the American Dream", null, Genre.FICTION, "gatsbybook.com.co", 29000);
		((Regular)(users.get(1))).getRegularBooks()[3]=(new Magazine("M56","Forbes", 60, "Monthly", null, GenreMagazine.SCIENTIFY, "forbes.com.co", 22000));


		
	}
	/**
     * This method allows to consult the registered users
     * @return msg String concatenation of registereed users
     */

	public String getUserList() {



		String msg = "";

		for (int i = 0; i < users.size(); i++) {

			if (users.get(i) != null) {
				
				msg += "\n" + (i + 1) + ". " + users.get(i).getId() + " - " + users.get(i).getName();
			}

		}

		return msg;

	}

	/**
     * This method register a new user (premium or regular)
     * 
    
     * @param id             int identifier of the user
     * @param name   		 String name of the user 
     * @param userType       int variable that assign the type of user
     * @return boolean
     */

	public boolean registerUser(String id, String name, int userType) {
		

	
				if(userType ==1){
					users.add(new Regular(id , name)); 
					return true;

				}
				else if(userType ==2){

					users.add(new Premium(id , name));
					return true;

        }
	

		return false;
	}

	/**
     * This method allows to validate that the book id is hexadecimal and exactly 3 chars 
	 * @param id string identifier to validate
     * @return boolean 
     */

	public static boolean validateIDHexadecimal(String id) {
    if (id.length() != 3) {
        return false;
    }
    
    for (int i = 0; i < id.length(); i++) {
        char c = id.charAt(i);
        if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
            return false;
        }
    }
    
    return true;
}

/**
     * This method allows to validate that the book id is alphanumeric and exactly 3 chars 
	 * @param id string identifier to validate
     * @return boolean 
     */

public static boolean validateIDnumeric(String id) {
    if (id.length() != 3) {
        return false;
    }
    
    for (int i = 0; i < id.length(); i++) {
        char c = id.charAt(i);
        if (!Character.isLetterOrDigit(c)) {
            return false;
        }
    }
    
    return true;
}

	/**
     * This method register a new bibliographic product, can be Book or Magazine
     * 
    
     * @param id             int identifier of the product
     * @param name   		 String name of the product 
     * @param pagesNumber    int amount of pages of a product
	 * @param genre int genre of the book
	 * @param day int day of publication
	 * @param month int day of publication
	 * @param year int day of publication
	 * @param productType int indicates the type of product to register
	 * @param review String review of the book
	 * @param url String link of the caratule of the product
	 * @param value double  value of the book
	 * @param suscription double  value of the suscription of a magazine
	 * @param periodicEmision String indicates the emision of the magazine
     * @return boolean
     */


	public boolean registerBibliographicProduct(String id,String name,int pagesNumber, int genre, int day, int month,
	 int year, int productType, String review, String url, double value, double suscriptionValue, String periodicEmision) {
		Calendar incomeDate = new GregorianCalendar(year,month,day); 
		Genre genreBook= Genre.FANTASY;
		GenreMagazine genreMagazine= GenreMagazine.DESIGN;
		
	

				if(productType ==1){//BOOK
					switch(genre){
						case 1:
						genreBook= Genre.FANTASY;
						break;
			
						case 2: 
						genreBook= Genre.FICTION;
						break;
			
						case 3:
						genreBook= Genre.NOVEL;
						break;
					}
					bibliographicProducts.add(new Book(id , name, pagesNumber, review, incomeDate, genreBook, url, value));
					return true;

				}
				else if(productType ==2){

					switch(genre){
						case 1:
						genreMagazine= GenreMagazine.DESIGN;
						break;
			
						case 2: 
						genreMagazine= GenreMagazine.SCIENTIFY;
						break;
			
						case 3:
						genreMagazine= GenreMagazine.VARIETY;
						break;
					}

					bibliographicProducts.add(new Magazine(id , name, pagesNumber, periodicEmision, incomeDate, genreMagazine, url, suscriptionValue));
					return true;

					

				}


        
	

		return false;
	}

	/**
     * This method allows to eliminate a product 
	 * @param userPosition int 	position of the product in the arraylist
     * @return boolean 
     */

	
	public boolean deleteBibliographicProduct(int userPosition) {

		bibliographicProducts.remove(userPosition);
		return true;
		
	}

	/**
     * This method allows to edit the information of a product 
	 * @param userPosition int 	position of the product in the arraylist
	 * @param newInfo string 	new information that replaces the old one
	 * @param change int 	the item that the user wants to modify
     * @return boolean 
     */

	
	public boolean editBibligrapicProduct(int userPosition, String newInfo, int change) {
		boolean myvar =false;
		switch(change){
			case 1:
			bibliographicProducts.get(userPosition).setName(newInfo);
			myvar=true;
			break;

			case 2:
			bibliographicProducts.get(userPosition).setUrl(newInfo);
			myvar=true;
			break;

			case 3: 
			if(bibliographicProducts.get(userPosition) instanceof Magazine){
				
				((Magazine)bibliographicProducts.get(userPosition)).setPeriodicEmision(newInfo);
				myvar=true;
			

			}
			break;

			case 4: 
			if(bibliographicProducts.get(userPosition) instanceof Magazine){
				double catx = Double.parseDouble(newInfo);
				
				
				((Magazine)bibliographicProducts.get(userPosition)).setSuscriptionValue(catx);
				myvar=true;
			

			}
			break;

			case 5:
			if(bibliographicProducts.get(userPosition) instanceof Book){
				((Book)bibliographicProducts.get(userPosition)).setReview(newInfo);
				myvar=true;
			
			}

			break;

			case 6:
			if(bibliographicProducts.get(userPosition) instanceof Book){
				double catx = Double.parseDouble(newInfo);
				((Book)bibliographicProducts.get(userPosition)).setValue(catx);;
				myvar=true;
			
			}

			break;
		}



		return myvar;
	}
	
	/**
     * This method allows to consult the registered bibliographic products
     * @return msg String concatenation of registereed products
     */

	public String getBibliographicPList() {

		String msg = "";

		for (int i = 0; i < bibliographicProducts.size(); i++) {

			if (bibliographicProducts.get(i) != null) {
				if(bibliographicProducts.get(i) instanceof Book){
					msg += "\n" + (i + 1) + ". " + bibliographicProducts.get(i).getId() + " - " + bibliographicProducts.get(i).getName()+ "(Book)";


				}
				else{
					msg += "\n" + (i + 1) + ". " + bibliographicProducts.get(i).getId() + " - " + bibliographicProducts.get(i).getName()+ "(Magazine)";


				}
			}

		}

		return msg;

	}

	/**
     * This method allows the user to buy a product
	 * @param option int 	position of the product to buy in the arraylist
	 * @param day int 		day of buy
	 * @param month int 	day of buy
	 * @param year int 		day of buy
	 * @param userOP int 	the user that is going to buy the book
     * @return boolean 
     */



	public boolean buyBibliographicProduct(int option, int day,int month,int year, int userOP){
		boolean var=false;
		BibliographicProduct product = bibliographicProducts.get(option);
		Calendar operationDate = new GregorianCalendar(year,month,day); 
		User userX= users.get(userOP);


		
		if(bibliographicProducts.get(option) instanceof Book ){

			if(userX instanceof Regular){
				String rev=((Book)(product)).getReview();
				double val=((Book)(product)).getValue();
				Genre gen=((Book)(product)).getGenre();

				Book bookR = new Book(product.getId(), product.getName(),product.getPagesNumber(),rev,product.getPublicDate(),gen, product.getUrl(),val);
						
				for(int i=0; i<((Regular)(userX)).getRegularBooks().length; i++ ){
					if(((Regular)(userX)).getRegularBooks()[i]==null){
						
						((Regular)(userX)).getRegularBooks()[i]=bookR;
						var=true;
						
	
					}
				}
	
			}

			if(userX instanceof Premium){

				String rev=((Book)(product)).getReview();
				double val=((Book)(product)).getValue();
				Genre gen=((Book)(product)).getGenre();
				String id= ((Book)(product)).getId();
				String name= ((Book)(product)).getName();
				int pagN= ((Book)(product)).getPagesNumber();
				String url= ((Book)(product)).getUrl();
				

				((Premium)(userX)).getPremiumLibrary().add(new Book(id, name, pagN, rev, operationDate, gen, url, val));
				var=true;
			}

				
		}

		if(bibliographicProducts.get(option) instanceof Magazine ){

			if(userX instanceof Regular){
				String perE=((Magazine)(product)).getPeriodicEmision();
				double val=((Magazine)(product)).getSuscriptionValue();
				GenreMagazine gen=((Magazine)(product)).getGenreM();

				

				Magazine magazineR = new Magazine(product.getId(), product.getName(),product.getPagesNumber(),perE,product.getPublicDate(),gen, product.getUrl(),val);
						
				for(int i=0; i<((Regular)(userX)).getRegularMagazine().length; i++ ){
					if(((Regular)(userX)).getRegularMagazine()[i]==null){
						
						((Regular)(userX)).getRegularMagazine()[i]=magazineR;
						var=true;
						
	
					}
				}
	
			}

			if(userX instanceof Premium){

				String rev=((Magazine)(product)).getPeriodicEmision();
				double val=((Magazine)(product)).getSuscriptionValue();
				GenreMagazine gen=((Magazine)(product)).getGenreM();
				String id= ((Magazine)(product)).getId();
				String name= ((Magazine)(product)).getName();
				int pagN= ((Magazine)(product)).getPagesNumber();
				String url= ((Magazine)(product)).getUrl();
				

				((Premium)(userX)).getPremiumLibrary().add(new Magazine(id, name, pagN, rev, operationDate, gen, url, val));
				var=true;
			}

				
		}



		
		return var;
	
	}

	/**
     * This method allows the system to generate the bill when a user buys a product
	 * @param option int 	position of the product to buy in the arraylist
	 * @param day int 		day of buy
	 * @param month int 	day of buy
	 * @param year int 		day of buy
     * @return boolean 
     */


	public String generateBill(int option, int day,int month,int year){
		String msg="";
		Calendar operationDate = new GregorianCalendar(year,month,day); 
		BibliographicProduct product = bibliographicProducts.get(option);

		if(bibliographicProducts.get(option) instanceof Book ){
			double billValue = product.buyProduct(option);
			bills.add(new Bill(operationDate, billValue));
			msg+= "\nBILL"+"\n Book identifier"+product.getId()+"\n Book name: "+ product.getName()+"\n Total value: "+ billValue;

		}

		if(bibliographicProducts.get(option) instanceof Magazine ){
			double billValue = product.buyProduct(option);
			bills.add(new Bill(operationDate, billValue));
			msg= "BILL"+"\n Magazine identifier"+product.getId()+"\n Magazine name: "+ 
			product.getName()+"\n Suscription value: "+ billValue;

			
		}



		return msg;
	}

	public String showUserLibrary(int userPosition){
		String msg="";

		 User users1=users.get(userPosition);

		 if(users1 instanceof Premium){
			msg+=((Premium)(users1)).getUserLibrary();
		 }

		 if(users1 instanceof Regular){
			msg+=((Regular)(users1)).getUserRegularLibrary();
		 }


		return msg;

	}
//ESTE NO ES EL METODO OFICIAL QUE S VA A USAR PERO ES PROVISIONAL PARA LA PRIMERA ENTREGA
// 

	public String simulation(int productPosition, int option){
		String msg="";
		int startPages = 1;
		int totalPages= bibliographicProducts.get(productPosition).getPagesNumber();

		do{

            msg+="Reading session in progress: " + "\n";
            msg+="\nReading: " + bibliographicProducts.get(productPosition).getName();
            
            msg+="\nActual page " + startPages + " of" + bibliographicProducts.get(productPosition).getPagesNumber();
            

            if(option==1){

                startPages++;
            }
            else if(option==2){

                startPages--;
            }
            

        }while(option!=3&& startPages != totalPages);
		return msg;

	}
	

		
		
}
