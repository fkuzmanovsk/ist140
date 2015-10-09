package sentencebuilder;
import java.util.Scanner;
/*
 * @author Filip Kuzmanovski
 */
public class SentenceBuilder {
    
    public static void main(String[] args) {
        
        // initial variables declared
        String entry = "";
        final String QUITTER = "done";
        double count = 0;
     
    // User input    
    Scanner scnr = new Scanner (System.in);
    System.out.println("Enter your words Human: ");
    System.out.println("Enter done to finish.");

// Do-while loop
StringBuilder fullEntry= new StringBuilder();
do {
    entry = scnr.nextLine();
    count++;   
    System.out.print(entry + " ");
}
while (!entry.equals(QUITTER));
System.out.println(fullEntry.toString());
}
}

