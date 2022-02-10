package in.sts.stsproject.assignment;



import org.apache.log4j.BasicConfigurator;



public class Main {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		MultipleFilesReader multiplefile=new MultipleFilesReader();
		multiplefile.readingMultipleFiles();
       
		
	}

}
