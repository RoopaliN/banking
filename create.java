/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
class create {

    int addAcc(int accno, int existingaccno) {
         int balance=10000;
         if(accno==existingaccno){
             return 0;
        }
         return accno;
    }

    int deposit(int amount,int accno,int ano,int balance)    {
     
        if(accno==ano)
        {
        balance+=amount;
        return balance;
        }
        else 
            return 0;
    }

      int withdraw(int amount,int acc,int ano,int balance)    {        
        if(acc==ano)
        {
        if(balance>amount)
        {
            balance-=amount;
        return balance;
        }
        else 
        return 0;
        }
        else 
            return 0;
    }

    int totbal(int balance)    {
        return balance;
    }

    int richest(int balance,int rich,int i) {
        
        if(balance>rich)
        {
            rich=balance;
            return balance;
        }
        else
            return 0;      
    }

    int transfer(int accno, int balance,int amount, int acctotransfer) {
       accno=balance-amount;
       acctotransfer=balance+amount;
       return accno;
    }    
 }
