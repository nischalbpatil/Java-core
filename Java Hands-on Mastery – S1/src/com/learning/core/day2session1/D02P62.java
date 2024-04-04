package com.learning.core.day2session1;

import java.util.InputMismatchException;
import java.util.Scanner;

class CricketRating {
  String playerName;
  float critic1Rating;
  float critic2Rating;
  float critic3Rating;
  float avgRating;
  String coins;

  public CricketRating(String playerName, float critic1Rating, float critic2Rating) {
    this.playerName = playerName;
    this.critic1Rating = critic1Rating;
    this.critic2Rating = critic2Rating;
    calculateAverageRating(critic1Rating, critic2Rating);
    calculateCoins();
  }

  public CricketRating(String playerName, float critic1Rating, float critic2Rating, float critic3Rating) {
    this.playerName = playerName;
    this.critic1Rating = critic1Rating;
    this.critic2Rating = critic2Rating;
    this.critic3Rating = critic3Rating;
    calculateAverageRating(critic1Rating, critic2Rating, critic3Rating);
    calculateCoins();
  }

  public void calculateAverageRating(float critic1Rating, float critic2Rating) {
    avgRating = (critic1Rating + critic2Rating) / 2;
  }

  public void calculateAverageRating(float critic1Rating, float critic2Rating, float critic3Rating) {
    avgRating = (critic1Rating + critic2Rating + critic3Rating) / 3;
  }

  public void calculateCoins() {
    if (avgRating >= 7) {
      coins = "Gold";
    } else if (avgRating >= 5 && avgRating < 7) {
      coins = "Silver";
    } else if (avgRating >= 2 && avgRating < 5) {
      coins = "Copper";
    } else {
      throw new NotEligibleException("Average rating is less than 2. Player is not eligible for any coins.");
    }
  }

  public void display() {
    System.out.println("Player Name: " + playerName);
    System.out.println("Average Rating: " + avgRating);
    System.out.println("Coins Awarded: " + coins);
  }
}

class NotEligibleException extends RuntimeException {
  public NotEligibleException(String message) {
    super(message);
  }
}

public class D02P62 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter player name: ");
    String playerName = scanner.nextLine();

    try {
      System.out.print("Enter rating by critic 1: ");
      float critic1Rating = scanner.nextFloat();

      System.out.print("Enter rating by critic 2: ");
      float critic2Rating = scanner.nextFloat();

      scanner.nextLine(); 

      System.out.print("Enter rating by critic 3 (optional, press enter to skip): ");
      String critic3Input = scanner.nextLine();

      if (!critic3Input.isEmpty()) {
        float critic3Rating = Float.parseFloat(critic3Input);
        CricketRating rating = new CricketRating(playerName, critic1Rating, critic2Rating, critic3Rating);
        rating.display();
      } else {
        CricketRating rating = new CricketRating(playerName, critic1Rating, critic2Rating);
        rating.display();
      }
    } catch (InputMismatchException e) {
      System.out.println("Error: Please enter valid ratings (numbers).");
    } catch (NumberFormatException e) {
      System.out.println("Error: Please enter a valid rating for critic 3.");
    } catch (NotEligibleException e) {
      System.out.println(e.getMessage());
    } finally {
      scanner.close();
    }
  }
}
