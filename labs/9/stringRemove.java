package nineLabdushaj;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class stringRemove {
	public static void main(String[] args) throws Exception {
		
		if (args.length != 2) {
			System.out.print("Usage: java");
			System.exit(1);
		}
		File outfile = new File("temp.txt");
		PrintWriter pw = new PrintWriter(outfile);
		File infile = new File(args[1]);
		Scanner input = new Scanner(infile);
		while (input.hasNext()){
			String line = input.nextLine();
			pw.println(line.replace(args[0], ""));
		}
		input.close();
		pw.close();
		
		File newSource = new File("temp.txt");
		File overriteFile = new File(args[1]);
		
		Scanner newinput = new Scanner(newSource);
		PrintWriter newoutput = new PrintWriter(overriteFile);
			
		while(newinput.hasNext()) {
			String s1 = newinput.nextLine();
			newoutput.println(s1);
			
		}
		newinput.close();
		newoutput.close();
		
		if(overriteFile.exists()) {
			overriteFile.delete();
		}

		}
		

}
