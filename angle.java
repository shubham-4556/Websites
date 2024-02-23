public class angle
{
    public static void main(String[] args)
    {
        int h = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[0]);

        double hour = h + (m/60);

        double angle = Math.abs(6*((5*hour) - m));

        System.out.println(angle);
    }
}