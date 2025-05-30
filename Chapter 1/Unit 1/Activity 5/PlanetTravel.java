/* 
 * Activity 1.1.5
 */
public class PlanetTravel
{
    public static void main(String[] args)
    {
        // the planet's average distance from earth
        int mars = 48678219;
        // speed of light in miles per hour
        int lightSpeed = 670616629;
        lightSpeed /= 10;

        double calc = mars;
        calc /= lightSpeed;
        System.out.println("Travel time to Mars: " + calc + " hours.");
    }
}
