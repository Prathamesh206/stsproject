package in.sts.stsproject.finalmain;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.log4j.BasicConfigurator;

import in.sts.stsproject.input.FileInput;
import in.sts.stsproject.services.Opearation;



public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();	
		
		Opearation fileoperation=new Opearation();                       //Creating Opeartion object for performing opeartion
		fileoperation.fileOpertion(FileInput.getInput());
		
	
		
		


	}

}
