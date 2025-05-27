/* 
 * Activity 1.1.3
 */
public class GalaxyWeight
{
  public static void main(String[] args)
  {
    int weightOnEarth = 130;
    double earthGravity = 9.81;
    double venusGravity = 8.87;
    double marsGravity = 3.711;
    double uranusGravity = 10.67;
    
    double weightOnVenus = weightOnEarth * venusGravity / earthGravity;
    double weightOnMars = weightOnEarth * marsGravity / earthGravity;
    double weightOnUranus = weightOnEarth * uranusGravity / earthGravity;
    
    System.out.print("Your weight on Venus is ");
    System.out.println(weightOnVenus);
    System.out.print("Your weight on Mars is ");
    System.out.println(weightOnMars);
    System.out.print("Your weight on Uranus is ");
    System.out.println(weightOnUranus);
    System.out.print("Average weight: ");
    System.out.println(weightOnVenus * weightOnMars * weightOnUranus / 3);
    
  }
}