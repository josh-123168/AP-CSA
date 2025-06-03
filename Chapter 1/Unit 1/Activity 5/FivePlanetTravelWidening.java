/* 
 * Activity 1.1.5
 */
public class FivePlanetTravelWidening
{
    public static void main(String[] args)
    {
        // theplanets.org average distance from earth to the planets
        int mercury = 56974146;
        int venus = 25724767;
        int mars = 48678219;
        int jupiter = 390674710;
        int saturn = 792248270;

        // speed of light and our speed
        int lightSpeed = 670616629;
        lightSpeed /= 10;

        /* your code here */
        double mercuryCalc = mercury;
        mercuryCalc /= lightSpeed;
        double venusCalc = venus;
        venusCalc /= lightSpeed;
        double marsCalc = mars;
        marsCalc /= lightSpeed;
        double jupiterCalc = jupiter;
        jupiterCalc /= lightSpeed;
        double saturnCalc = saturn;
        saturnCalc /= lightSpeed;

        double total = mercuryCalc + venusCalc + marsCalc + jupiterCalc + saturnCalc;
        int numPlanets = 5;


    int average = (int) (total + 0.5) / numPlanets;

        System.out.println("Travel time to Mercury: " + mercuryCalc + " hours.");
        System.out.println("Travel time to Venus: " + venusCalc + " hours.");
        System.out.println("Travel time to Mars: " + marsCalc + " hours.");
        System.out.println("Travel time to Jupiter: " + jupiterCalc + " hours.");
        System.out.println("Travel time to Saturn: " + saturnCalc + " hours.");

        System.out.println("Average travel time: " + average + " hours.");
  }
}
