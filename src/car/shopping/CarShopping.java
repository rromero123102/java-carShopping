/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car.shopping;
import java.util.Scanner;
// Import Scanner Class

public class CarShopping
{
    public static Scanner kb = new Scanner(System.in);
    // Create static Scanner Object call it kb

   public static void main(String[] args)
   {
      int totalCost = 0;
      totalCost += base();
      totalCost += automaticWindows();
      //TODO: call methods that you write for each feature
      totalCost += remoteKeylessEntry();
      totalCost += onStarSystem();
      totalCost += antilockBrakes();
      totalCost += telescopingSteringWheelAdjustablePedals();
      totalCost += sunroof();
      totalCost += gpsNavigation();
      totalCost += rocketPoweredEngine();
      totalCost += doubleJump();
      totalCost += delorianMechanics();
      
      //TODO: print the total cost of the vehicle
       System.out.println("**** CAR TOTAL $" + totalCost + " ****");
   }
   
   public static int base()
   {
      System.out.println("Our inventory:");
      System.out.println("Model 1 - $15,000");
      System.out.println("Model 2 - $24,000");
      System.out.println("Model 3 - $40,000");
      System.out.println("Which base model did the customer choose?" + "(enter full model name ex. Model 1): ");
      String model = kb.nextLine();
      if(model.equalsIgnoreCase("Model 1")){
         return 15000;
      }
      else if (model.equalsIgnoreCase("Model 2")){
         return 24000;
      }
      else if (model.equalsIgnoreCase("Model 3")){
         return 40000;
      }
      else {
        return 0;
      }
      //...
   }
   
   public static int automaticWindows()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Automatic Windows for $500? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 500;
      }
      return 0;
      //...
   }
   
   public static int remoteKeylessEntry()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Remote keyless entry  for $1000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 1000;
      }
      return 0;
      //...
   }
   public static int onStarSystem()
   {
      String windowsYN = kb.nextLine();
      System.out.print("OnStar System for $1000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 1000;
      }
      return 0;
      //...
   }
   public static int antilockBrakes()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Anti-lock Brakes for $500? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 500;
      }
      return 0;
      //...
   }
   public static int telescopingSteringWheelAdjustablePedals()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Telescoping sterring wheel/ adjustable pedals for $1000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 1000;
      }
      return 0;
      //...
   }
   public static int sunroof()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Sunroof for $800? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 800;
      }
      return 0;
      //...
   }
   public static int coldWeathePackage()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Heated seats and windsheild heater for $1500? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 1500;
      }
      return 0;
      //...
   }
   public static int gpsNavigation()
   {
      String windowsYN = kb.nextLine();
      System.out.print("GPS naviation for $750? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 750;
      }
      return 0;
      //...
   }
   public static int rocketPoweredEngine()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Rocket powered engine for $5000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 500;
      }
      return 0;
      //...
   }public static int doubleJump()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Double jump ability for $5000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 500;
      }
      return 0;
      //...
   }public static int delorianMechanics()
   {
      String windowsYN = kb.nextLine();
      System.out.print("Delorain from gta for $51000? (y/n) > ");
      if (windowsYN.equalsIgnoreCase("y")){
          return 500;
      }
      return 0;
      //...
   }
}
