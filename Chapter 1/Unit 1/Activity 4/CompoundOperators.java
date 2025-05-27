/*
 * Activity 1.1.4
 */
public class CompoundOperators
{
  public static void main(String[] args)
  {
    int numPeople = 3;  
    double totalYears = 0;

    double myYears = 11.9;  // I will soon be halfway through my junior year.
    double broYears = 9.9;
    double fernYears = 11.9;
    int momYears = 17;
    int gradYear = 13;


    totalYears += myYears;
    totalYears += broYears;
    totalYears += fernYears;
    totalYears += momYears;
    numPeople ++;
    
    System.out.println("I have "+ myYears + " years in school and " + (gradYear - myYears) + " years left to gradutate.");
    System.out.println("Bro has "+ broYears + " years in school.");
    System.out.println("Fern has "+ fernYears + " years in school.");
    System.out.println("Mom has "+ momYears + " years in school.");

    System.out.print("Total people: " + numPeople);
    System.out.println(", total years: " + totalYears);

    System.out.println("Average years: " + totalYears / numPeople);
    System.out.println("Total days: " + totalYears * 180);
    System.out.println("Average Days: " + totalYears * 180 / numPeople);
  }
}