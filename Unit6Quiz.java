/*
 * Various methods for class purpose
 * IST140 class code for Unit 6 Quiz
 */
package unit6quiz;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
/**
 *@author Filip Kuzmanovski
 */
public class Unit6Quiz {

    public static void main(String[] args) {
        // Calling Methods
        searchPlaylist(playListBuilder());
        checkVitals(getVitalSigns());
    }
    
    // playListBuilder Method
    public static  ArrayList<String> playListBuilder() {
        ArrayList<String> playList = new ArrayList<>();
        // Scanner Initialized
        Scanner scnr = new Scanner(System.in);
        // While Loop
        while(true) {
            System.out.println("Enter Songs, when finished enter done");
            String song = scnr.nextLine();
            if(song.equals("done"))
                break;
            playList.add(song);
        }
        return playList;
    }
       
    
    // searchPlaylist Method
    public static int searchPlaylist(ArrayList<String> playList) {
        // Scanner Initialized
        Scanner scnr = new Scanner(System.in);
        // User Prompt
        System.out.println("Enter a search term human: ");
        String searchTerm = scnr.nextLine();
        // Iterator required for going through vitalsaylist
        Iterator<String> i = playList.iterator();
        int count = 0;
        while (i.hasNext()) {
            if(i.next().contains(searchTerm))
                count++;
        }
        return count;
    }
    //getVitalSigns Method
    public static int[] getVitalSigns()
    {
        // Scanner Initialized
        Scanner scnr = new Scanner(System.in);
        // Array of 3 ints called vitals
        int vitals[] = new int[3];
        // User Prompts
        System.out.print("Enter your heart rate: ");
        vitals[0] = Integer.parseInt(scnr.nextLine());
        System.out.print("Enter your systolic blood pressure: ");
        vitals[1] = Integer.parseInt(scnr.nextLine());
        System.out.print("Enter  respirations : ");
        vitals[2] = Integer.parseInt(scnr.nextLine());
        return vitals;
    }
    // checkVitals Method with no return value
    public static void checkVitals(int vitals[])
    {
        // Heart Rate
        System.out.print("Heart Rate: ");
        if(vitals[0] >= 60 && vitals[0] <= 100)
        {
            System.out.println("Normal");
        }
        else if(vitals[0] < 60)
        {
            System.out.println("Bradycardia");
        }
        else if(vitals[0] > 100)
        {
            System.out.println("Tachycardia");
        }
        
        // Blood Pressure
        System.out.print("Systolic Blood Pressure: ");
         if(vitals[1] >= 90 && vitals[1] <= 120)
        {
            System.out.println("Normal");
        }
        else if(vitals[1] < 90)
        {
            System.out.println("Hypotension");
        }
        else if(vitals[1] > 120)
        {
            System.out.println("Hypertension");
        }
         // Respirations
         System.out.print("Respirations: ");
         if(vitals[2] >= 12 && vitals[2] <= 20)
        {
            System.out.println("Normal");
        }
        else if(vitals[2] < 12)
        {
            System.out.println("Bradypnea");
        }
        else if(vitals[2] > 20)
        {
            System.out.println("Tachypnea");
        }
    }
    }

