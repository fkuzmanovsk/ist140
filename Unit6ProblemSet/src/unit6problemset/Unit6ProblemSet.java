package unit6problemset;
import java.util.Scanner;

/*
 @author Filip Kuzmanovski
 */
public class Unit6ProblemSet {
    public static void main(String args[]) {
        bannerPrinter();
        String[] productEntry = productBuilder();
        boolean productRef = getOrder(productEntry);
        if (productRef) {
        double priceGen = getPrice();
        double taxGen = getTax(priceGen);
        double totalAmt = getTotal(priceGen, taxGen);
        System.out.println("Total Sale Price: $"+ String.format("%.2f", totalAmt));
        } else {
            System.out.println("Product not found.");
            }
         }
    
        // banner message
	public static void bannerPrinter() {
            System.out.println("******************************************");
            System.out.println("****** Welcome to my eCommerce app! ******");
            System.out.println("******************************************");
            System.out.println(); //instructions requested blank line after banner
    }

        // array of 5 predefined strings, not from user entry
	public static String[] productBuilder() {
            String[] products = new String[5];
            products[0] = "PS4";
            products[1] = "XBOX One";
            products[2] = "iPhone 6";
            products[3] = "Macbook";
            products[4] = "Surface Pro";
		
            return products;
	}


        //getOrder method
	public static boolean getOrder(String[] products) {
            String productEntry = "";
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter a product name Human: ");
            productEntry = scnr.nextLine();
		for (int i = 0; i < products.length; i++) {
                    if (productEntry.equals(products[i])) {
                    scnr.close();
		return true;
		}
		}
		scnr.close();
		return false;
	}

	//get Price method
	public static double getPrice() {
            double priceGen = Math.random() * 100.0 + 1.0;
            return priceGen;
	}

	// getTax Method
	public static double getTax(double priceGen) {
            return (priceGen * 0.10);
	}

	// getTotal Method
	public static double getTotal(double priceGen, double taxGen) {
            double totalAmt = priceGen + taxGen;
            return totalAmt;
	}

	//printTotal Method
	public static void printTotal(double totalAmt) {
            System.out.println("Your sale total is: $" + totalAmt);
	}
}
