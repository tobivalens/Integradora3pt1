package ui;

import java.util.Scanner;
import model.Controller;

public class Executable {

	private Scanner reader;
	private Controller rXSystem;

	public Executable() {

		reader = new Scanner(System.in);
		rXSystem = new Controller();
	}

	public static void main(String[] args) {

		Executable ejecutable = new Executable();
		ejecutable.menu();

	}

	private void menu() {

		System.out.println("Welcome to ReaderX!");

		boolean flag = false;

		while (!flag) {

			System.out.println("\nMAIN MENU");
			System.out.println("1. Register User");
			System.out.println("2. Register bibliographic product ");
			System.out.println("3. Modify bibliographic product ");
			System.out.println("4. Delete bibliographic product ");
			System.out.println("5. Buy a book or Suscribe to a Magazine ");
			System.out.println("6. Reading simulation ");
			System.out.println("");


			System.out.println("9. salir por ahora  ");
			
			

			int option = reader.nextInt();

			switch (option) {

			case 1:
				registerUser();
				break;
			case 2:
			     registerBibliographicProduct();
				
				break;
			case 3:
				editBibligrapicProduct();
				break;

			case 4:
				deleteBibliographicProduct();
				break;

			case 5:
			buyBibliographicProduct();
				
				break;
			case 6:
			readingSimulation();
				
				break;
			case 7:
				
			break;

			case 8:
				
			break;

			case 9:
				flag = true;
				break;
			default:
				System.out.println("INVALID OPTION");
				break;

			}

		}

	}
	/**
     * This method allows to register a user 
     
     */

	private void registerUser() {

		System.out.println("Type the information to create a new user");

		// Limpieza de buffer
		reader.nextLine();

		System.out.println("Write the id");
		String id = reader.nextLine();

		System.out.println("Type your name");
		String name = reader.nextLine();

		System.out.println("Choose the user type \n 1) Regular \n 2) Premium ");
		int userType = reader.nextInt();

		if(userType==1){
			
			if (rXSystem.registerUser(id, name, userType)) {

				System.out.println("Succesfull register");
	
			}

		}


		 else if (userType==2){

			if (rXSystem.registerUser(id, name, userType)) {

				System.out.println("Succesfull register");
	
			}

			
		}

		else{System.out.println("Failed Register, please try again");}
	}

	/**
     * This method allows to register a bibliographic product 
     
     */

	private void registerBibliographicProduct() {

		System.out.println("Type the information of the new product");

		// Limpieza de buffer
		reader.nextLine();
		System.out.println("Choose the prodcut to register \n 1) BOOK\n 2) MAGAZINE");
		int typeProduct = reader.nextInt();
		reader.nextLine();

		System.out.println("Type the id");
		String id = reader.nextLine();

			if(typeProduct==1){

				if(!Controller.validateIDHexadecimal(id)){
					System.out.println("Type a valid hexadecimal id");

				}

			}

			else if(typeProduct==2){
				if(!Controller.validateIDnumeric(id)){
					System.out.println("Type a valid alpha numerical id");

				}


				
			}
		
		if(Controller.validateIDHexadecimal(id) || Controller.validateIDnumeric(id)){

		
		System.out.println("Type the name");
		String name = reader.nextLine();

		System.out.println("Insert the URL ");
		String url = reader.nextLine();
	

		System.out.println("Type the number of pages");
		int pagesNumber = reader.nextInt();

		System.out.println("Type the day of publish");
		int day = reader.nextInt();

		System.out.println("Type the month of publish");
		int month = reader.nextInt();

		System.out.println("Typethe year of publish");
		int year = reader.nextInt();

		if(typeProduct==1){

		System.out.println("Type the Genre \n1- Fantasy \n2- Fiction \n3- Novel");
		int genre = reader.nextInt();

		System.out.println("Type the value of the book");
		double value = reader.nextDouble();

		reader.nextLine();

		System.out.println("Insert a brief reviw ");
		String review = reader.nextLine();
		double x=0;
		String x2="";


		if(rXSystem.registerBibliographicProduct(id, name, pagesNumber, genre, day, month, year
		, typeProduct, review, url, value,x,x2 )){
			System.out.println("Succesfull register");

		}
		else{System.out.println( "FAIL");}

	}


		
	if(typeProduct==2){
		System.out.println("Type the Genre \n 1- DESIGN \n2-SCIENCE \n3- VARIETY");
		int genreMagazine = reader.nextInt();

		System.out.println("Type the value of the Magazine suscription");
		double suscrptionValue = reader.nextDouble();

		reader.nextLine();

		System.out.println("Insert a periodical emisison  ");
		String periodicEmision = reader.nextLine();

		double x=0;
		String x2="";

		if(rXSystem.registerBibliographicProduct(id, name, pagesNumber, genreMagazine, day, month, year
		, typeProduct, x2, url, x,suscrptionValue,periodicEmision )){
			System.out.println("Succesfull register");

		}
		else{System.out.println( "FAIL");}


	}
  }

}
/**
     * This method allows to modify a bibliographic product 
     
     */

	public void editBibligrapicProduct(){
		String query = rXSystem.getBibliographicPList();

		if (query.equals("")) {

			System.out.println("None register");
		} else {

			System.out.println("\nList of bibliographic products ");

			System.out.println(query);


		System.out.println("\n Choose the bibliographic product to modify");

			int productPosition = reader.nextInt();

			System.out.println("\nType what you want to modify \n 1)Name \n Url \n 3) Periodic Emision \n4) Suscription value ");
			System.out.println("\n5) Book review \n 6)Book Price");
			int change = reader.nextInt();

			reader.nextLine();


			
				System.out.println("\nType the new information  ");
				String newInfo= reader.nextLine();

				if (rXSystem.editBibligrapicProduct(productPosition - 1,  newInfo, change )) {

					System.out.println("\n Succesfull Modification");
	
				} else {
	
					System.out.println("\n Failed modification");
				}
				

	}
}
/**
     * This method allows to delete a bibliograhic product 
     
     */

private void deleteBibliographicProduct() {

	String query = rXSystem.getBibliographicPList();

	if (query.equals("")) {

		System.out.println("None Registers");
	} else {

		System.out.println("\nThis is the list of products reggistered");

		System.out.println(query);

		System.out.println("\nChoose the product to delete");

		int option = reader.nextInt();

		if (rXSystem.deleteBibliographicProduct(option - 1)) {

			System.out.println("\nSuccesfull operation");

		} else {

			System.out.println("\nFailed Operation");
		}

	}

}

/**
     * This method allows to buy a bibliographic product 
     
     */

public void buyBibliographicProduct(){

	System.out.println("\nThis is the list of products reggistered");

	System.out.println(rXSystem.getBibliographicPList());

	System.out.println("\nChoose the product to buy");

		int option = reader.nextInt();

		System.out.println("Type the day ");
		int day = reader.nextInt();

		System.out.println("Type the month ");
		int month = reader.nextInt();

		System.out.println("Type the year ");
		int year = reader.nextInt();

		System.out.println("User reggistered ");
		System.out.println(rXSystem.getUserList());

		System.out.println("select the user ");
		int userOP = reader.nextInt();

		if(rXSystem.buyBibliographicProduct(option-1, day, month, year, userOP-1)){
			System.out.println("Succesfull purchase");
			System.out.println(rXSystem.generateBill(option-1, day, month, year));

		}
		else{System.out.println("Sorry, failed purchase");}


	


}

	public void readingSimulation(){

		System.out.println("This is the list of users reggistered ");
		System.out.println(rXSystem.getUserList());

		System.out.println("Wich user wants to read?  ");
		int userOP = reader.nextInt();

		System.out.println("This is your library, which product would you like to read? ");
		System.out.println(rXSystem.showUserLibrary(userOP-1));
		int productPosition = reader.nextInt();
		boolean flag=true;

	do{
		
		System.out.println("Select your option ");
		System.out.println("Enter 1 to move next page.");
        System.out.println("Enter 2 to go back.");    
	 	System.out.println("Enter 3 to end up the lecture.");  
		 int option = reader.nextInt();

		System.out.println(rXSystem.simulation(productPosition, option)); 
		if(option==3){
			flag=false;
			break;
		}

		
	}while(flag);


	}

		


	}

