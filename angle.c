#include <stdio.h>
#include <cs50.h>

int main(void)
{
        double h = get_double("Please provide hours");
        double m = get_double("Please provide minutes");

        double hour = h + (m/60);

        double angle = (6*(5*hour - m));

        printf("%f",angle);
}