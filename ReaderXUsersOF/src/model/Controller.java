package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

import javax.print.attribute.standard.PresentationDirection;
import javax.swing.text.Position;

import javafx.scene.control.ProgressIndicator;

public class Controller {

	ArrayList <User> users = new ArrayList<User>();
	ArrayList <	BibliographicProduct> bibliographicProducts = new ArrayList<BibliographicProduct>();
	ArrayList<Bill> bills= new ArrayList<Bill>();
	private ArrayList<String[][]> userLibrary;



	//private User[] users;

	public Controller() {
		userLibrary = new ArrayList<String[][]>();

		

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


		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","Hunger Games",  300, "Cool", new GregorianCalendar(2000,04,1), Genre.FICTION, "hungerGames.com.co", 30000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BAB","Crime and Punishment",  545, "A novel about guilt and redemption", new GregorianCalendar(2010,04,1), Genre.FICTION, "crimebook.com.co", 38000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BIA","The Picture of Dorian Gray",  254, "A novel about vanity and corruption", new GregorianCalendar(2020,04,1), Genre.FICTION, "doriangraybook.com.co", 26000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Magazine("M12","People en Español", 50, "Weekly", new GregorianCalendar(1800,04,1), GenreMagazine.DESIGN, "peopleenespanol.com.co", 15000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Magazine("M23","Sports Illustrated", 80, "Weekly", new GregorianCalendar(2002,04,1), GenreMagazine.VARIETY, "si.com.co", 18000));
		((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","Hunger Games", 300, "Cool", new GregorianCalendar(2000,04,1), Genre.FICTION, "hungerGames.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEI","Harry Potter", 400, "Awesome", new GregorianCalendar(2001,07,31), Genre.FANTASY, "harryPotter.com.co", 35000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BAE","To Kill a Mockingbird", 250, "Classic", new GregorianCalendar(1960,06,11), Genre.FICTION, "mockingbird.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEA","1984", 350, "Dystopian", new GregorianCalendar(1949,06,8), Genre.FANTASY, "1984novel.com.co", 32000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BCE","The Catcher in the Rye", 200, "Controversial", new GregorianCalendar(1951,06,16), Genre.FICTION, "catcherRye.com.co", 25000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("CEE","Pride and Prejudice", 320, "Romantic", new GregorianCalendar(1813,01,28), Genre.FANTASY, "pridePrejudice.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("CCC","The Great Gatsby", 280, "Jazz Age", new GregorianCalendar(1925,04,10), Genre.FICTION, "greatGatsby.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BCE","The Lord of the Rings", 500, "Epic Fantasy", new GregorianCalendar(1954,07,29), Genre.FANTASY, "lotr.com.co", 40000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("CBE","To Kill a Mockingbird", 250, "Classic", new GregorianCalendar(1960,06,11), Genre.FICTION, "mockingbird.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BCD","Dune", 450, "Science Fiction", new GregorianCalendar(1965,06,01), Genre.FANTASY, "dune.com.co", 38000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BCE","The Chronicles of Narnia", 380, "Fantasy", new GregorianCalendar(1950,10,16), Genre.FANTASY, "narnia.com.co", 32000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEC","Moby-Dick", 420, "Adventure", new GregorianCalendar(1851,10,18), Genre.FICTION, "mobyDick.com.co", 35000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BBB","The Hobbit", 320, "Fantasy", new GregorianCalendar(1937,9,21), Genre.FANTASY, "hobbit.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BED","The Alchemist", 200, "Philosophical", new GregorianCalendar(1988,06,01), Genre.FICTION, "alchemist.com.co", 25000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("DEE","Brave New World", 350, "Dystopian", new GregorianCalendar(1932,06,01), Genre.FANTASY, "braveNewWorld.com.co", 32000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BDE","The Picture of Dorian Gray", 280, "Gothic", new GregorianCalendar(1890,06,01), Genre.FICTION, "dorianGray.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BIE","The Odyssey", 400, "Epic Poetry", new GregorianCalendar(-800,01,01), Genre.FANTASY, "odyssey.com.co", 35000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEB","The Count of Monte Cristo", 500, "Revenge", new GregorianCalendar(1844,8,28), Genre.FANTASY, "monteCristo.com.co", 40000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEF","Jane Eyre", 320, "Gothic Romance", new GregorianCalendar(1847,10,16), Genre.FANTASY, "janeEyre.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BFE","Frankenstein", 280, "Gothic", new GregorianCalendar(1818,01,01), Genre.FICTION, "frankenstein.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("FEE","The Little Prince", 200, "Children's Literature", new GregorianCalendar(1943,04,06), Genre.FANTASY, "littlePrince.com.co", 25000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("FEF","The Kite Runner", 350, "Historical Fiction", new GregorianCalendar(2003,05,29), Genre.FICTION, "kiteRunner.com.co", 32000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","Animal Farm", 220, "Satire", new GregorianCalendar(1945,8,17), Genre.FICTION, "animalFarm.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Adventures of Tom Sawyer", 280, "Adventure", new GregorianCalendar(1876,12,10), Genre.FICTION, "tomSawyer.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Divine Comedy", 400, "Epic Poetry", new GregorianCalendar(1320,01,01), Genre.FICTION, "divineComedy.com.co", 35000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Fault in Our Stars", 250, "Young Adult", new GregorianCalendar(2012,01,10), Genre.FICTION, "faultInOurStars.com.co", 28000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","Wuthering Heights", 320, "Gothic Romance", new GregorianCalendar(1847,12,01), Genre.FICTION, "wutheringHeights.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Lord of the Flies", 280, "Psychological", new GregorianCalendar(1954,9,17), Genre.FICTION, "lotf.com.co", 30000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Book Thief", 350, "Historical Fiction", new GregorianCalendar(2005,01,01), Genre.FICTION, "bookThief.com.co", 32000));
((Premium)(users.get(0))).getPremiumLibrary().add(new Book("BEE","The Secret Garden", 220, "Children's Literature", new GregorianCalendar(1911,11,01), Genre.FICTION, "secretGarden.com.co", 28000));

		((Regular)(users.get(1))).getRegularBooks()[0]= new Book("BAA", "The Fault in Our Stars", 250, "", new GregorianCalendar(2022,04,1), Genre.NOVEL, "theFaultInOurStars.com.co", 25000);
		((Regular)(users.get(1))).getRegularBooks()[1]=new Book("BBB","1984",  328, "Great read", new GregorianCalendar(1998,04,2), Genre.FICTION, "1984book.com.co", 25000);
		((Regular)(users.get(1))).getRegularBooks()[2]= new Book("BCC","The Great Gatsby",  200, "A novel about the American Dream", new GregorianCalendar(2015,02,20), Genre.FICTION, "gatsbybook.com.co", 29000);
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
						return var;
						
	
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
				return var;
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
						return var;

						
	
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
				return var;
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

	public String showPremiumLibrary(int userPosition){
		String out="";

		String name= users.get(userPosition).getName();

		
		out += name +"  library ";

		User userNT= users.get(userPosition);
		
		out+= "\n"+ "\n"+((Premium)(userNT)).showPremiumLibrary();


		return out;
	}

	public String runMatrixPremium(String action, int userP){
		if(users.get(userP)instanceof Premium){
		
		if(action.length()==1){
			
			if(action.equals("1")){
				((Premium)(users.get(userP))).nextPage();

			}
			else if(action.equals("2")){
				((Premium)(users.get(userP))).previousPage();
			}

		}

		 if(action.length()==3){
			boolean x=((Premium)(users.get(userP))).selectProductByIdentifier(action);
			if(x){
					return "c";
			}

		}

		else{
			if(action.contains(",")){
				String[] partes = action.split(",");
				int x =  Integer.parseInt(partes[0]); 
				int y =  Integer.parseInt(partes[1]); 
				boolean f=((Premium)(users.get(userP))).selectProductByCoordinates(x, y);
				if(f){
					return "c";
			}
			}
			
		}

		}

		return "";
		
	}
	public String runRegularMatrix(String action, int userP){
		if(users.get(userP)instanceof Regular){
			if(action.length()==3){
				boolean x=((Regular)(users.get(userP))).selectProductByIdentifier(action);
				if(x){
						return "c";
				}
	
			}
	
			
				if(action.contains(",")){
					String[] partes = action.split(",");
					int x =  Integer.parseInt(partes[0]); 
					int y =  Integer.parseInt(partes[1]); 
					boolean f=((Regular)(users.get(userP))).selectProductByCoordinates(x, y);
					if(f){
						return "c";
				}
				}
				
			
		
		}
		return "";
	}



	public String showRegularLibrary(int userPosition){
		String out = "";
		String name= users.get(userPosition).getName();

		
		out += name +"  library ";

		User userNT= users.get(userPosition);
		
		out+= "\n"+ "\n"+((Regular)(userNT)).showMatrixLibrary();

		return out;

	}



	public String libraryTRY(int userPosition){
		String msg="";

		 User users1=users.get(userPosition);

		 if(users1 instanceof Premium){
			msg+=((Premium)(users1)).getUserLibrary();
		 }

		 if(users1 instanceof Regular){
			msg+=((Regular)(users1)).showMatrixLibrary();
		 }


		return msg;

	}

	public void createBookSim(int userOP, int productOP){

		User users1=users.get(userOP);
		
		int totalPages= (bibliographicProducts).get(productOP).getPagesNumber();


		if (users1 instanceof Premium){
			String Name1= ((Premium)(users1)).getPremiumLibrary().get(productOP).getName();
			String ID= ((Premium)(users1)).getPremiumLibrary().get(productOP).getId();
		
			((Premium)(users1)).addReadingSesion(ID, Name1);
		}
		else{ 
			if(((Regular)(users1)).setFullLibrary()[productOP]!= null){
			String Name2= ((Regular)(users1)).setFullLibrary()[productOP].getName();
			String ID2= ((Regular)(users1)).setFullLibrary()[productOP].getId();
			((Regular)(users1)).addReadingSesion(ID2, Name2);
			
		}
		}

		


	}

	public String trySimulation(int userOP, int productOP, int action){
		String msg= "";
		
		
		User users1=users.get(userOP);

		if(users1 instanceof Premium){
			String name1= ((Premium)(users1)).getPremiumLibrary().get(productOP).getName();
			
			
		for(int i=0; i< ((Premium)(users1)).getReadingSimulation().size(); i++){

			String nameP=((Premium)(users1)).getReadingSimulation().get(i).getProductName();
			if(name1.equals(nameP)){

			 ReadingSimulation RP= ((Premium)(users1)).getReadingSimulation().get(i);
			 System.out.println("entro 3");

			 msg+= "Reading sesion in progrees";
			 msg+="\nReading:  "+ name1;

			int acPage= RP.getActualPage();

			msg+="\nReading page: "+ mthd2(action, RP)+ " of "+((Premium)(users1)).getPremiumLibrary().get(productOP).getPagesNumber();

			
			return msg;
				

			}
			
			
		}
		
		}

		return "pailas";

	}


	public int mthd2(int action, ReadingSimulation RP){
		boolean flag= true;
		int acPage= RP.getActualPage();
		int redPage= RP.getPagesRead();
			switch (action) {
                case 2:
                    // Leer página anterior
                   
						acPage--;
                        RP.setActualPage(acPage);
						redPage++;
						RP.setPagesRead(redPage);

					
                    
                    break;
                case 1:
                    // Leer página siguiente

					acPage++;
                    RP.setActualPage(acPage);
					
					redPage++;
					RP.setPagesRead(redPage);
                    break;
                case 3:
                    // Volver a la Biblioteca
                    flag = false;
                    break;
                default:
                    System.out.println("ERROR");
                    break;
            }

			return RP.getActualPage();
	}
// STAND BY
	public String evaluateAnnounce(int pagesRead){
		String msg="";
		int announceCounter = 0;
        boolean showAnnounce = true;
		Random random = new Random();

        String[] announces = {
            "¡Suscríbete al Combo Plus y llévate Disney+ y Star+ a un precio increíble!",
            "Ahora tus mascotas tienen una app favorita: Laika. Los mejores productos para tu peludito.",
            "¡Estamos de aniversario! Visita tu Éxito más cercano y sorpréndete con las mejores ofertas"
        };

		int aleatory = random.nextInt(announces.length);
        String finalAnnounce = announces[aleatory];

		
		if ((pagesRead % 5 == 0 && announceCounter > 0 && announceCounter % 2 == 0) ||
        (pagesRead % 20 == 0 && announceCounter == 1)) {
        msg = finalAnnounce;
        announceCounter++;
    } else if (showAnnounce || (pagesRead % 20 == 0 && pagesRead > 0)) {
        msg = finalAnnounce;
        showAnnounce = false;
        announceCounter++;
    }

    return msg;
	}

	public String readingSimRegular(int userOP, int productOP, int action){

		String msg= "";
		
		User users1=users.get(userOP);
		int announceCounter = 0;
        boolean showAnnounce = true;
		Random random = new Random();

		String[] announces = {
            "¡Suscríbete al Combo Plus y llévate Disney+ y Star+ a un precio increíble!",
            "Ahora tus mascotas tienen una app favorita: Laika. Los mejores productos para tu peludito.",
            "¡Estamos de aniversario! Visita tu Éxito más cercano y sorpréndete con las mejores ofertas"
        };


		if(users1 instanceof Regular){
			
		for(int i=0; i< ((Regular)(users1)).regularSimulation.size(); i++){

			String name2= ((Regular)(users1)).setFullLibrary()[productOP].getName();
			String nameP=((Regular)(users1)).getRegularSimulation().get(i).getProductName();
			if(name2.equals(nameP)){

			 ReadingSimulation RP= ((Regular)(users1)).getRegularSimulation().get(i);
			 int pagesReadRP=  ((Regular)(users1)).getRegularSimulation().get(i).getPagesRead();

			 if ((pagesReadRP == 1 || pagesReadRP % 20 == 0) ) {
				int aleatory = random.nextInt(announces.length);
				String finalAnnounce = announces[aleatory];
				msg += finalAnnounce;
				announceCounter++;
				showAnnounce= false;
			}

			 msg+= "Reading sesion in progrees";
			 msg+="\nReading:  "+ name2;
    		 msg+="\nReading page: "+ mthd2(action, RP)+ " of "+((Regular)(users1)).setFullLibrary()[productOP].getPagesNumber();

			 if ((pagesReadRP % 20 == 0 && showAnnounce) ) {
				int aleatory = random.nextInt(announces.length);
				String finalAnnounce = announces[aleatory];
				msg += finalAnnounce;
				announceCounter++;
			}
					

			}
			
			
		}
		
		}

		return msg;
		
	}

	public boolean getTypeUser(int userOP){

		if(users.get(userOP)instanceof Premium){
			return true;

		}

		return false;
	}

	public int getProductSimulationP(String id, int userOP){
		int i=0;
		
		for(int x=0; x<((Premium)(users.get(userOP))).getReadingSimulation().size(); x++){
			String instance=((Premium)(users.get(userOP))).getReadingSimulation().get(x).getProductID();
			if(id.equals(instance)){
				i=x;
				return i;
			}

		}

		return i;

	}

	public int getProductSimulationR(String id, int userOP){
		int i=0;
		
		for(int x=0; x<((Regular)(users.get(userOP))).getRegularSimulation().size(); x++){
			String instance=((Regular)(users.get(userOP))).getRegularSimulation().get(x).getProductID();
			for(int y=0; y< ((Regular)(users.get(userOP))).setFullLibrary().length; y++){
				String idp=((Regular)(users.get(userOP))).setFullLibrary()[y].getId();
				if(instance.equals(idp)){
					i=x;
					return i;
				}

			}
			

		}

		return i;

	}

	public String reporNumberPagesReadByBibliographicP() {
		String msg = "";
		int bookPagesRead = 0;
		int magazinePagesRead = 0;
	
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i) instanceof Premium) {
				if (((Premium) users.get(i)).readingSimulation != null && ((Premium) users.get(i)).getPremiumLibrary() != null) {
					for (int j = 0; j < ((Premium) users.get(i)).readingSimulation.size(); j++) {
						for (int k = 0; k < ((Premium) users.get(i)).getPremiumLibrary().size(); k++) {
							if (((Premium) users.get(i)).readingSimulation.get(j) != null && ((Premium) users.get(i)).getPremiumLibrary().get(k) != null) {
								String readingSimID = ((Premium) users.get(i)).readingSimulation.get(j).getProductID();
								String libraryID = ((Premium) users.get(i)).getPremiumLibrary().get(k).getId();
	
								// Comprobar si los IDs son iguales
								if (readingSimID != null && libraryID != null && readingSimID.equals(libraryID)) {
									if (((Premium) users.get(i)).getPremiumLibrary().get(k) instanceof Book) {
										bookPagesRead += ((Premium) users.get(i)).readingSimulation.get(j).getPagesRead();
									} else {
										magazinePagesRead += ((Premium) users.get(i)).readingSimulation.get(j).getPagesRead();
									}
								}
							}
						}
					}
				}
			} else if (users.get(i) instanceof Regular) {
				if (((Regular) users.get(i)).regularSimulation != null && ((Regular) users.get(i)).setFullLibrary() != null) {
					for (int j = 0; j < ((Regular) users.get(i)).regularSimulation.size(); j++) {
						for (int k = 0; k < ((Regular) users.get(i)).setFullLibrary().length; k++) {
							if (((Regular) users.get(i)).regularSimulation.get(j) != null && ((Regular) users.get(i)).setFullLibrary()[k] != null) {
								String readingSimID = ((Regular) users.get(i)).regularSimulation.get(j).getProductID();
								String libraryID = ((Regular) users.get(i)).setFullLibrary()[k].getId();
	
								// Comprobar si los IDs son iguales
								if (readingSimID != null && libraryID != null && readingSimID.equals(libraryID)) {
									if (((Regular) users.get(i)).setFullLibrary()[k] instanceof Book) {
										bookPagesRead += ((Regular) users.get(i)).regularSimulation.get(j).getPagesRead();
									} else {
										magazinePagesRead += ((Regular) users.get(i)).regularSimulation.get(j).getPagesRead();
									}
								}
							}
						}
					}
				}
			}
		}
	
		msg += "The amount of read pages of books is  " + bookPagesRead;
		msg += "\nThe amount of read pages of magazines is  " + magazinePagesRead;
	
		return msg;
	}
	
	
	public String soldProductsByGender(){
		String msg="";

		int fantasyNum = 0;
		int fictionNum = 0;
		int novelNum = 0;

		int varietyNum=0;
		int designNum=0;
		int sciencieNum=0;


		for (int i = 0; i < users.size(); i++) {
			User user = users.get(i);
	
			if (user instanceof Premium) {
				
				if (((Premium) user).getReadingSimulation() != null && ((Premium) user).getPremiumLibrary() != null) {
					for (ReadingSimulation simulation : ((Premium) user).getReadingSimulation()) {
						String readingSimID = simulation.getProductID();
	
						for (BibliographicProduct product : ((Premium) user).getPremiumLibrary()) {
							String libraryID = product.getId();
	
							if (readingSimID != null && libraryID != null && readingSimID.equals(libraryID)) {
								if (product instanceof Book) {
									Genre genre = ((Book) product).getGenre();
									if (genre.equals(Genre.FANTASY)) {
										fantasyNum++;
									} else if (genre.equals(Genre.FICTION)) {
										fictionNum++;
									} else if (genre.equals(Genre.NOVEL)) {
										novelNum++;
									}
								} else if (product instanceof Magazine) {
									GenreMagazine genre = ((Magazine) product).getGenreM();
									if (genre != null) {
										if (genre.equals(GenreMagazine.SCIENTIFY)) {
											sciencieNum++;
										} else if (genre.equals(GenreMagazine.DESIGN)) {
											designNum++;
										} else if (genre.equals(GenreMagazine.VARIETY)) {
											varietyNum++;
										}
									}
								}
								
							}
						}
					}
				}
			}
			else{

				if (((Regular) user).getRegularSimulation() != null && ((Regular) user).setFullLibrary() != null) {
					for (ReadingSimulation simulation : ((Regular) user).getRegularSimulation()) {
						String readingSimID = simulation.getProductID();
						
						BibliographicProduct[] library = ((Regular) user).setFullLibrary();
						if (library != null) {
							for (int k = 0; k < library.length; k++) {
								BibliographicProduct product = library[k];
								if (product != null) {
									String libraryID = product.getId();
				
									if (readingSimID != null && libraryID != null && readingSimID.equals(libraryID)) {
										if (product instanceof Book) {
											Genre genre = ((Book) product).getGenre();
											if (genre.equals(Genre.FANTASY)) {
												fantasyNum++;
											} else if (genre.equals(Genre.FICTION)) {
												fictionNum++;
											} else if (genre.equals(Genre.NOVEL)) {
												novelNum++;
											}
										}
										if (product instanceof Magazine) {
											GenreMagazine genre = ((Magazine) product).getGenreM();
											if (genre != null) {
												if (genre.equals(GenreMagazine.SCIENTIFY)) {
													sciencieNum++;
												} else if (genre.equals(GenreMagazine.DESIGN)) {
													designNum++;
												} else if (genre.equals(GenreMagazine.VARIETY)) {
													varietyNum++;
												}
											}
										} 
									}
								}
							}
						}
					}
				}
				
			}


			}
			msg += "Genre of the most read books:\n";
		if (fantasyNum > fictionNum && fantasyNum > novelNum ) {
			msg += "Genre: FANTASY | Pages Read: " + fantasyNum + "\n";
		}
		if (fictionNum > fantasyNum && fictionNum > novelNum) {
			msg += "Genre: FICTION | Pages Read: " + fictionNum + "\n";
		}
		if (novelNum > fictionNum && novelNum > fantasyNum) {
			msg += "Genre: NOVEL | Pages Read: " + novelNum + "\n";
		}

		msg += "Genre of the most read Magazines:\n";
		if (varietyNum > designNum && varietyNum > sciencieNum ) {
			msg += "Genre: Variety | Pages Read: " + varietyNum + "\n";
		}
		if (designNum > varietyNum && designNum > sciencieNum) {
			msg += "Genre: Design | Pages Read: " + designNum + "\n";
		}
		if (sciencieNum > varietyNum && sciencieNum > designNum) {
			msg += "Genre: Science | Pages Read: " + sciencieNum + "\n";
		}
	
		return msg;
		}
	
		 
		
	}


		
		

