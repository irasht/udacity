public class EqualNumbers
{
    public static void main(String[] args)
    {
        double original = 2;
        double root = Math.sqrt(original);
        double rootSquared = root * root;
        final double EPSILON = 1E-12;
        if (Math.abs(rootSquared - original) < EPSILON)//"They are the same"
        //if (rootSquared==original)answer rootSquared is 2.0000000000000004
        {
            System.out.println("They are the same");
        }
        else
        {
            System.out.println("rootSquared is "
                    + rootSquared);
        }
    }
}
