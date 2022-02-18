package in.sts.stsproject.finalmain;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;

import in.sts.stsproject.services.Opearation;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();	
		Scanner  scanner=new Scanner(System.in);                         //Creating Scanner class for taking input from user
		System.out.println("Enter 1 for Read only one file in drive");
		System.out.println(" Enter 2 for Read all the files in drive");
		System.out.println("Enter the operation you want tro perform");
		String operation=scanner.next();
		Opearation fileoperation=new Opearation();                       //Creating Opeartion object for performing opeartion
		fileoperation.fileOpertion(operation);
		
		scanner.close();
		
		


	}

}
