/* 
 * Activity 1.1.5
 */
public class FivePlanetTravelCasting {
  public static void main(String[] args) {
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
    System.out.println("Travel time to Mercury: " + (double) mercury / lightSpeed + " hours.");
    System.out.println("Travel time to Venus: " + (double) venus / lightSpeed + " hours.");
    System.out.println("Travel time to Mars: " + (double) mars / lightSpeed + " hours.");
    System.out.println("Travel time to Jupiter: " + (double) jupiter / lightSpeed + " hours.");
    System.out.println("Travel time to Saturn: " + (double) saturn / lightSpeed + " hours.");
  }
}
