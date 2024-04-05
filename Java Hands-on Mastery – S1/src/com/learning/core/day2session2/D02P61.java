package com.learning.core.day2session2;

import java.util.Scanner;

class BankAccount {
  int accNo;
  String custName;
  String accType;
  float balance;

  public BankAccount(int accNo, String custName, String accType, float balance) {
    this.accNo = accNo;
    this.custName = custName;
    this.accType = accType;
    this.balance = balance;

    if (accType.equals("Saving") && balance < 1000) {
      throw new LowBalanceException("LowBalance");
    } else if (accType.equals("Current") && balance < 5000) {
      throw new LowBalanceException("LowBalance");
    } else if (balance < 0) {
      throw new NegativeAmountException("NegativeAmount");
    }
  }

  public void deposit(float amt) throws NegativeAmountException {
    if (amt < 0) {
      throw new NegativeAmountException("Deposit amount cannot be negative.");
    }
    balance += amt;
  }

  public float getBalance() throws LowBalanceException {
    if (accType.equals("Saving") && balance < 1000) {
      throw new LowBalanceException("Saving accounts require a minimum balance of 1000.");
    } else if (accType.equals("Current") && balance < 5000) {
      throw new LowBalanceException("Current accounts require a minimum balance of 5000.");
    }
    return balance;
  }
}

class NegativeAmountException extends RuntimeException {
  public NegativeAmountException(String message) {
    super(message);
  }
}

class LowBalanceException extends RuntimeException {
  public LowBalanceException(String message) {
    super(message);
  }
}

public class D02P61 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] accountDetails = scanner.nextLine().split(" ");

    try {
      int accNo = Integer.parseInt(accountDetails[0]);
      String custName = accountDetails[1];
      String accType = accountDetails[2];
      float balance = Float.parseFloat(accountDetails[3]);

      BankAccount account = new BankAccount(accNo, custName, accType, balance);
      while (true) {
    
        
      }
    } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Invalid input format.");
    } catch (NegativeAmountException e) {
      System.out.println(e.getMessage());
    } catch (LowBalanceException e) {
      System.out.println( e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
