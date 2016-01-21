package casting;

/**
 * Created by Cardoso on 20-Jan-16.
 */
public class CastingTest {
    public static void main(String [] args) {
        double pi = 3.14;
        int wholePartPi = (int) pi;
        float piAsFloat = (float) pi;
        long mile = (long)1609.34;

        System.out.println("The round number of pi is " + wholePartPi);
        System.out.println("The float of pi is " + piAsFloat);
        System.out.println("1 mile is around " + mile + " metres");

    }
}
