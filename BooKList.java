import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BooKList
{

	static String result;
	public String BookDetails()
	{
		
		System.out.println("              Welcome to Online Book Store        ");
		System.out.println("     ");
		
		ArrayList<String> Book = new ArrayList<>();
		Book.add("History");
		Book.add("Comics");
		Book.add("Science");
		Book.add("Crime");
		Book.add("Business");
		
		System.out.println("Category List : ");
		System.out.println("     ");
	      for (int i = 0; i < Book.size();i++) 
	      { 		      
	          System.out.println(Book.get(i)); 		
	      } 
		
		
		Scanner sc = new Scanner (System.in);
		String Str ;
		System.out.println("     ");
		System.out.println(" Enter category : ");	
		Str = sc.nextLine();
		System.out.println("     ");
		

		ArrayList<String> HistoryBook = new ArrayList<>();
		HistoryBook.add("Discovery of India");
		HistoryBook.add("The Argumentive Indian");
		HistoryBook.add("History of Modern India");
		HistoryBook.add("The Histories of Herodotus");
		HistoryBook.add("The Communist Manifesto");
		
		ArrayList<String> ComicsBook = new ArrayList<>();
		ComicsBook.add("Marvel Comics");
		ComicsBook.add("New Avengers");
		ComicsBook.add("Action Comics");
		ComicsBook.add("The Yellow Kid in McFadden's Flats");
		ComicsBook.add("Dragon Hoops");
		
		ArrayList<String> ScienceBook = new ArrayList<>();
		ScienceBook.add("The Origin of Species");
		ScienceBook.add("The Revolution in Modern Science");
		ScienceBook.add("Science and the Modern World");
		ScienceBook.add("Thermodynamics");
		ScienceBook.add("Emerging Viruses");
		
		ArrayList<String> CrimeBook = new ArrayList<>();
		CrimeBook.add("The Silent Patient");
		CrimeBook.add("Crime and Punishment");
		CrimeBook.add("The Girl on the Train");
		CrimeBook.add("Predator");
		CrimeBook.add("If We Were Villains");
		
		ArrayList<String> BusinessBook = new ArrayList<>();
		BusinessBook.add("ReWork");
		BusinessBook.add("Wings of Fire");
		BusinessBook.add("Win All Your Battles");
		BusinessBook.add("Principles");
		BusinessBook.add("Business Studies ");
		
	
	
		switch(Str) {
		
		
		  case "History":
			  
			  System.out.println(" Book List : ");
			  System.out.println("     ");
		      for (int i = 0; i < HistoryBook.size();i++) 
		      { 		      
		          System.out.println(HistoryBook.get(i)); 		
		      } 
		      System.out.println("     ");
		  	  System.out.println(" Enter book name to check Details :");
			  
			  String opt =sc.nextLine();
			  System.out.println("     ");
			  switch(opt) 
			  {
			  case "Discovery of India":	
				  String a = "Available";
				  result = a;
				  System.out.println(a);
				  System.out.println("price Rs :" + 855);
				  System.out.println(" Author Name :" + "Rajesh Talwar");
				  break;
			  case "The Argumentive Indian":
				  String b= "Available";
				  result = b;
				  System.out.println(b);
				  System.out.println("price Rs :" + 910);
				  System.out.println(" Author Name :" + "Mithilesh Tiwari");
				  break;
			  case "History of Modern India":
				  String c= "Not Available";
				  result = c;
				  System.out.println(c);
				  System.out.println("price Rs :" + 888);
				  System.out.println(" Author Name :" + "Anirudh Suri");
				  break;
			  case "The Histories of Herodotus":
				  String d= "Available";
				  result = d;
				  System.out.println(d);
				  System.out.println("price Rs :" + 777);
				  System.out.println(" Author Name :" + "Uma Das Gupta");
				  break;
			  case "The Communist Manifesto":
				  String e= "Not Available";
				  result = e;
				  System.out.println(e);
				  System.out.println("price Rs :" + 880);
				  System.out.println(" Author Name :" + "Amit Shah");
				  break;
	
			  default:
				  System.out.println(" Book Not Found....Try Later");
			  }
			
			  break;
		    
		  case "Comics":
			  
			  System.out.println(" Book List : ");
			  System.out.println("     ");
		      for (int i = 0; i < ComicsBook.size();i++) 
		      { 		      
		          System.out.println(ComicsBook.get(i)); 		
		      } 
		     
		      System.out.println("     ");
		  	  System.out.println(" Enter book name to check Details:");
		  	  System.out.println("     ");
              String opt1 =sc.nextLine();
        	  System.out.println("     ");
              
			  switch(opt1) 
			  {
			  case "Marvel Comics":		
				  String a = "Available";
				  result = a;
				  System.out.println(a);
				  System.out.println("price Rs :" + 880);
				  System.out.println(" Author Name :" + "Rajesh Talwar");
				  break;
			  case "New Avengers":		
				  String b= "Available";
				  result = b;
				  System.out.println(b);
				  System.out.println("price Rs :" + 699);
				  System.out.println(" Author Name :" + "Mithilesh Tiwari");
				  break;
			  case "Action Comics":		
				  String c= "Not Available";
				  result = c;
				  System.out.println(c);
				  System.out.println("price Rs :" + 580);
				  System.out.println(" Author Name :" + "Anirudh Suri");
				  break;
			  case "The Yellow Kid in McFadden's Flats":
				  String d= "Available";
				  result = d;
				  System.out.println("Available");
				  System.out.println("price Rs :" + 690);
				  System.out.println(" Author Name :" + "Uma Das Gupta");
				  break;
			  case "Dragon Hoops":		
				  String e= "Not Available";
				  result = e;
				  System.out.println("Not Available");
				  System.out.println("price Rs :" + 780);
				  System.out.println(" Author Name :" + "Amit Shah");
				  break;
				  
			  default:
				  System.out.println(" Book Not Found....Try Later");
			  }
			 
			  break;
		    
		  case "Science":
			  
			  System.out.println(" Book List : ");
			  System.out.println("     ");
		      for (int i = 0; i < ScienceBook.size();i++) 
		      { 		      
		          System.out.println(ScienceBook.get(i)); 		
		      } 
		      
		      System.out.println("     ");
		  	  System.out.println(" Enter book name to check Details:");
		  	  System.out.println("     ");
			  String opt2 =sc.nextLine();
			  System.out.println("     ");
			  
			  switch(opt2) 
			  {
			  case "The Revolution in Modern Science":		
				  String a = "Available";
				  result = a;
				  System.out.println(a);
				  System.out.println("price Rs :" + 880);
				  System.out.println(" Author Name :" + "Rajesh Talwar");
				  break;
			  case "Science and the Modern World":		
				  String b= "Available";
				  result = b;
				  System.out.println(b);
				  System.out.println("price Rs :" + 874);
				  System.out.println(" Author Name :" + "Mithilesh Tiwari");
				  break;
			  case "Thermodynamics":		
				  String c= "Not Available";
				  result = c;
				  System.out.println(c);
				  System.out.println("price Rs :" + 499);
				  System.out.println(" Author Name :" + "Anirudh Suri");
				  break;
			  case "Emerging Viruses":		
				  String d= "Available";
				  result = d;
				  System.out.println(d);
				  System.out.println("price Rs :" + 566);
				  System.out.println(" Author Name :" + "Uma Das Gupta");
				  break;	
			  case "The Origin of Species":		
				  String e= "Not Available";
				  result = e;
				  System.out.println("Not Available");
				  System.out.println("price Rs :" + 496);
				  System.out.println(" Author Name :" + "Amit Shah");
				  break;	
				  
			  default:
				  System.out.println(" Book Not Found....Try Later");
			  }
			
			  break;
			  
		  case "Crime":

			  System.out.println(" Book List : ");
			  System.out.println("     ");
		      for (int i = 0; i < CrimeBook.size();i++) 
		      { 		      
		          System.out.println(CrimeBook.get(i)); 		
		      } 
		      
		      System.out.println("     ");
		  	  System.out.println(" Enter book name to check Details:");
		  	  System.out.println("     ");
			  String opt3 =sc.nextLine();
			  System.out.println("     ");
			  
			  switch(opt3) 
			  {
			  case "The Silent Patient":		
				  String a = "Available";
				  result = a;
				  System.out.println(a);
				  System.out.println("price Rs :" + 630);
				  System.out.println(" Author Name :" + "Rajesh Talwar");
				  break;
			  case "Crime and Punishment":		
				  String b= "Available";
				  result = b;
				  System.out.println(b);
				  System.out.println("price Rs :" + 880);
				  System.out.println(" Author Name :" + "Mithilesh Tiwari");
				  break;
			  case "The Girl on the Train":		
				  String c= "Not Available";
				  result = c;
				  System.out.println(c);
				  System.out.println("price Rs :" + 1215);
				  System.out.println(" Author Name :" + "Anirudh Suri");
				  break;
			  case "Predator":		
				  String d= "Available";
				  result = d;
				  System.out.println(d);
				  System.out.println("price Rs :" + 735);
				  System.out.println(" Author Name :" + "Uma Das Gupta");
				  break;	
			  case "If We Were Villains":		
				  String e= "Not Available";
				  result = e;
				  System.out.println("Not Available");
				  System.out.println("price Rs :" + 640);
				  System.out.println(" Author Name :" + "Amit Shah");
				  break;	
				  
			  default:
				  System.out.println(" Book Not Found....Try Later");
			  }
			
			  break;
			  
		  case "Business":

			  System.out.println(" Book List : ");
			  System.out.println("     ");
		      for (int i = 0; i < BusinessBook.size();i++) 
		      { 		      
		          System.out.println(BusinessBook.get(i)); 		
		      } 
		      
		      System.out.println("     ");
		  	  System.out.println(" Enter book name to check Details:");
		  	  System.out.println("     ");
			  String opt4 =sc.nextLine();
			  System.out.println("     ");
			  
			  switch(opt4) 
			  {
			  case "ReWork":		
				  String a = "Available";
				  result = a;
				  System.out.println(a);
				  System.out.println("price Rs :" + 340);
				  System.out.println(" Author Name :" + "Rajesh Talwar");
				  break;
			  case "Wings of Fire":		
				  String b= "Available";
				  result = b;
				  System.out.println(b);
				  System.out.println("price Rs :" + 880);
				  System.out.println(" Author Name :" + "Mithilesh Tiwari");
				  break;
			  case "Win All Your Battles":		
				  String c= "Not Available";
				  result = c;
				  System.out.println(c);
				  System.out.println("price Rs :" + 900);
				  System.out.println(" Author Name :" + "Anirudh Suri");
				  break;
			  case "Principles":		
				  String d= "Available";
				  result = d;
				  System.out.println(d);
				  System.out.println("price Rs :" + 800);
				  System.out.println(" Author Name :" + "Uma Das Gupta");
				  break;	
			  case "Business Studies":		
				  String e= "Not Available";
				  result = e;
				  System.out.println("Not Available");
				  System.out.println("price Rs :" + 580);
				  System.out.println(" Author Name :" + "Amit Shah");
				  break;	
				 
			  default:
				  System.out.println(" Book Not Found....Try Later");
			  }
			
			  break;
		    
		  default:
			  System.out.println("Book Not Found....Try Later");

	}
		
		return result;
	}
	
	public static void main(String[] args) 
	{
	BooKList obj = new BooKList();
	obj.BookDetails();
	
	try 
	{
		if (result=="Available")
		{
			System.out.println("     ");
			System.out.println("Address for Delivery :");
			Scanner scc = new Scanner(System.in);
			String Address = scc.nextLine();
			System.out.println("Your have Order Successfully and  Delivered within 5-7 days ");
			
		} 
		else 
		{
			System.out.println("     ");
			System.out.println(" Oops! Book not availble in stock ....Try Again Later ");
			
		}
		System.out.println("     ");
		System.out.println("Do you want to continue  ?");
		System.out.println("     ");
		Scanner sc = new Scanner(System.in);
		String yesno = sc.next();
		
		if (yesno.equals("yes"))
		{
			obj.BookDetails();
		} else
		{
            System.out.println("Thank you !...");
		}
   } 
	catch (Exception e)
	{
		e.printStackTrace();
	}
	}

}

