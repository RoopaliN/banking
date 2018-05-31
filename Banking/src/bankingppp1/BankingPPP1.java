
package bankingppp1;

import java.util.*;


class bank
{
    
             Scanner s=new Scanner(System.in);
            
            int ch,i;
             double bal[];
            double accno[];
            String address[];
            String name[];
            double richest;
            int n=1,j=2;
             
            void create()
            {
                
                 name=new String[10000];
                 bal=new double[10000];
                 accno=new double[10000];
                 address=new String[10000];
                 
                 
                for(i=n;i<j;i++)
                {
                   System.out.println("Enter your name: ");
                    name[i]=s.next() +" " + "" +s.next(); 
                   
                    System.out.println("Enter your address: ");
                    address[i] = s.next();
                    
                    
                    System.out.println("Your account number is: "+i);
                    System.out.println("Your account has been created" );  
                    n=j;
                    
                } 
                j++;
               
            }
            
            
             
            void exac()
            {
                for(;;)
                {
            
                    
                    
                    System.out.println("1.Deposit 2.Withdraw 3.Transfer 4.Balance 5.exit");
                    System.out.println("Enter your choice");
                    ch=s.nextInt();
                    
                    
                    switch(ch)
        {
            case 1:System.out.println("Enter account number:");
                    int k = s.nextInt();
                    i=k;
                    Scanner s=new Scanner(System.in);
                    System.out.println("Enter the amount to be deposited");
                    double damt;
                    damt = s.nextDouble();
                     bal[i] += damt;
                     break;
                     
                     
            case 2: Scanner z=new Scanner(System.in);
                    System.out.println("Enter account number:");
                    k = z.nextInt();
                   i=k;
                    
                    Scanner r=new Scanner(System.in);
                    System.out.println("Enter the amount to be withdrawn");
                    double wamt;
                    wamt = r.nextDouble();
                
                    if(bal[i]<wamt)
                
                    System.out.println("Balance not sufficient");
                
                    else
                    
                    bal[i] -= wamt;
                    break;
                    
            case 3: Scanner t=new Scanner(System.in);
                    System.out.println("Enter your account number:");
                    k = t.nextInt();
                    i=k;
                    System.out.println("Enter the amount to be tranferred:");
                    double transfer=t.nextInt();
                    
                    System.out.println("Enter the account number in which the money has to be tranferred:");
                    int m=t.nextInt();
                    
                    bal[m]=bal[m]+(transfer);
                    bal[k]=bal[k]-(transfer);
                    
                    
                    break;
                
                    
                    
           
            case 4:Scanner w=new Scanner(System.in);
                   System.out.println("Enter account number:");
                    k = w.nextInt();
                   i=k;
              
                  System.out.println("Current balance is: " +bal[i]);
                  
            case 5:return;
              
                    }
                }
                   
        
}
            
             void totalbal()
         {
             
            
            double totalbal=0;
                    for(i=0;i<3;i++)
                    {
                    totalbal=totalbal+bal[i];
                    }
                    
                    System.out.println("Total money in the bank is:"+totalbal);
         }
            
             void richest()
             {
                 for(int i=2;i<n;i++)
                 {
                     richest=bal[1];
                     if(bal[i]>richest)
                     richest=bal[i];
                 }
                 System.out.println("The balance of richest person in the bank is:"+richest);   
                 System.out.println("The richest person in the bank is:"+name[i]);   
             }
           
            
           
}

public class BankingPPP1 
{

    
    public static void main(String[] args) 
    {
        int c;
        double bal[];
        double accno[];
        String address[];
        String name[];
        
        name=new String[10000];
        bal=new double[10000];
        accno=new double[10000];
        address=new String[10000];
        
        bank z=new bank();
        Scanner s=new Scanner(System.in);
        
        int i;
        for(;;)
         {
        
         
         System.out.println("1.Create new account 2.Open existing account 3.Total money in the bank 4.Richest person in the bank 5.exit");
         System.out.println("Enter your choice: ");
         c=s.nextInt();
        
        switch(c)
        {
            case 1: z. create();  
                     break;
                     
            case 2:z.exac(); 
                    break;
                    
            case 3:z.totalbal();                
                    break;
                    
            case 4: z.richest();
                        
                     break; 
            case 5:return;
        
    }
         }
    }
}
    

