
package banking;

import java.util.Scanner;
public class Bank {
    double balance;
    Bank(double startbal)
    {
        balance=startbal;
    }
    void deposit(double amount)
    {
        balance+=amount;
    }
    void withdraw(double amount)
    {
       if(balance-amount<500)
           System.out.println("Insufficient Balance!!");
       else
           balance-=amount;
    }
    void checkbalance()
    {
        System.out.println("Balance="+balance);
    }
}


public class Banking {

    
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
         double balance,amt,amount,startbal;
        System.out.println("Enter initial amount");
        do{
            
                            startbal=inp.nextDouble();
                            if(startbal<500)
                            {
                                System.out.println("Minimun amount should be 500,Re enter");
                            }
                       }while(startbal<500);
                        
        
        Bank acc =new Bank(startbal);
        
      
        int choice;
        
        do
        {
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
           
            System.out.println("Enter the choice");
            choice=inp.nextInt();
            switch(choice)
            {
                case 1:System.out.println("Enter amount to be deposited:");
                           amt=inp.nextDouble();
                             acc.deposit(amt);
                            break;
                case 2:System.out.println("Enter amount to be withdrawn:");
                         amount=inp.nextDouble();
                        acc.withdraw(amount);
                        break;
                case 3:acc.checkbalance();
                        break;
                case 4:System.exit(0);
            }
        }while(choice!=4);
        
    }
    
}
