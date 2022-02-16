package in.sts.stsproject.finalmain;

import java.io.FileNotFoundException;

import org.apache.log4j.BasicConfigurator;

import in.sts.stsproject.services.FileOperation;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		BasicConfigurator.configure();
		FileOperation fileOperation=new FileOperation();
		fileOperation.operation();

	}

}
