//Welcome to the Covid-19 Simulator
import java.util.Scanner;
public class Simulator {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //difficulty 0 = easy
    //difficulty 1 = normal
    //difficulty 2 = hard
    //difficulty 3 = expert
    int difficulty = 0;
    String country = "United States";//["China","Iran", "Italy", "France", "Germany", "Spain", "Switzerland", "Turkey", "United Kingdom", "United States"];
    int attitude = 50;
    int attitudeChange = 10;
    int availableICUs = 56000;
    double progressTowardsVaccine = 0;
    int populationTotal = 328460000;
    int populationMinor = 60560000;
    int populationAdult = 213830000;
    int populationSenior = 54070000;
    int infectedTotal = 0;
    int infectedMinors = 0;
    int infectedAdults = 0;
    int infectedSeniors = 0;
    int deadTotal = 0;
    int deadMinors = 0;
    int deadAdults = 0;
    int deadSeniors = 0;
    double minorMortality = 0;
    double adultMortality = 0;
    double seniorMortality = 0;
    if(difficulty == 0){
      attitude = 80;
      minorMortality = 0.04;
      adultMortality = 
    }
    if(difficulty == 1){
      attitude = 70;
      minorMortality = 0.04;
      adultMortality = 
    }
    if(difficulty == 2){
      attitude = 60;
      minorMortality = 0.10;
      adultMortality = 
    }
    else {
      minorMortality = 2.0;
      adultMortality = 
    }
  }
}