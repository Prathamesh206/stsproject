package in.sts.stsproject.finalmain;

import org.apache.log4j.BasicConfigurator;

import in.sts.stsproject.services.FileOperation;

public class Main {

	public static void main(String[] args) {
		BasicConfigurator.configure();
		FileOperation fileOperation=new FileOperation();
		fileOperation.operation();

	}

}
