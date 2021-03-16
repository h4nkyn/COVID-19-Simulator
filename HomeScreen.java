//Welcome to the Covid-19 Simulator (Home Screen)
public class HomeScreen {
  public static int difficulty = 0;
  public static int difficulty = 0;
  public static String country = "United States";//["China","Iran", "Italy", "France", "Germany", "Spain", "Switzerland", "Turkey", "United Kingdom", "United States"];
  public static int attitude = 50;
  public static int attitudeChange = 10;
  public static int availableICUs = 56000;
  public static double progressTowardsVaccine = 0;
  public static int populationTotal = 328460000;
  public static int populationMinor = 60560000;
  public static int populationAdult = 213830000;
  public static int populationSenior = 54070000;
  public static int infectedTotal = 0;
  public static int infectedMinors = 0;
  public static int infectedAdults = 0;
  public static int infectedSeniors = 0;
  public static int deadTotal = 0;
  public static int deadMinors = 0;
  public static int deadAdults = 0;
  public static int deadSeniors = 0;
  public static double minorMortality = 0;
  public static double adultMortality = 0;
  public static double seniorMortality = 0;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //difficulty 0 = easy
    //difficulty 1 = normal
    //difficulty 2 = hard
    //difficulty 3 = expert
    if(difficulty == 0){
      attitude = 80;
      minorMortality = 0.04;
      adultMortality = 5.0;
      seniorMortality = 15.0;
    }
    if(difficulty == 1){
      attitude = 70;
      minorMortality = 0.04;
      adultMortality = 6.5;
      seniorMortality = 18.0;
    }
    if(difficulty == 2){
      attitude = 60;
      minorMortality = 0.10;
      adultMortality = 10.0;
      seniorMortality = 25.0;
    }
    if(difficulty == 3){
      minorMortality = 2.0;
      adultMortality = 15.0;
      seniorMortality = 32.0;
    }
  }
}