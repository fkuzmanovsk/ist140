package powtable;

/*
 * @author Filip Kuzmanovski
 */
public class PowTable {

    public static void main(String[] args) {

        // Nested For loop for creating a table 
        System.out.println("\t" + "2" + "\t" + "3" + "\t" + "4");
        
        for (int i =1;i<=9;i++){
            System.out.print(i);
            
            for (int j=2;j<=4;j++) {
            System.out.print("\t" + Math.pow(i, j));
        }
            System.out.println(); 
    }
} 
}
