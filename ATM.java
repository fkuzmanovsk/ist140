/*
 * Very basic ATM functions with no revert functions initiated
* Simply based on assignment instructions
 */
package atm;
import java.util.Scanner;


/**
 * @author Filip Kuzmanovski
 */
public class ATM {
    
    public static void main(String[] args) {
        //initial values
        double accountBalance = 2555.75;
        double accountDeposit;
        double accountWithdrawal;
        int userChoice;
        
        
        // Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        
        // Prompt user to enter transaction type of Balance, Deposit, or Withdrawal
        System.out.println("Welcome to Bank of Belgrade");     
        System.out.println("Your initial account balance is " + accountBalance);
        System.out.println("Enter your choice of transaction: ");
        System.out.println("1. Withdraw Funds");
        System.out.println("2. Deposit Funds");
        System.out.println("3. Account Balance");
       
        userChoice = scnr.nextInt();
       
    
            //Few options to choose 
            switch(userChoice)
            {
                // case for withdrawing amounts
                case 1:
                   System.out.println("Enter amount for withdrawal: ");
                    accountWithdrawal = scnr.nextDouble();
                    if (accountWithdrawal > accountBalance)
                    {
                        System.out.println("Insufficient funds");
                    }
                    else
                    {
                        accountBalance = accountBalance - accountWithdrawal;
                        System.out.println("Your current balance is " + accountBalance);
                    }
                   break;
                    
                // case for depositing amounts 
                case 2:
                    System.out.println("Enter amount that you want to deposit ");
                     accountDeposit = scnr.nextDouble();
                    if (accountDeposit <= 0)
                    {
                        System.out.println("You must deposit an amount greater than 0");
                    }
                    else
                    {
                        accountBalance = accountBalance + accountDeposit;
                        System.out.println("Your current balance is " + accountBalance);
                    }
                    
                   break;
                    
                // case for checking your balance    
                case 3:
                    System.out.println("Your balance is " + accountBalance);
                     
                   break;
                    
                 // default for preventing endless looping   
                default: 
                    System.out.println("Incorrect Choice Human, Goodbye"); 
                   
                   break;    
            }        
        }  
    }
