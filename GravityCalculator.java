public class GravityCalculator 
{
    public static double calculateFinalPosition(double gravity, double initialVelocity, double fallingTime, double initialPosition) 
    {
        // Formula: y = 0.5 * g * t^2 + v0 * t + y0
        return 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
    }
}
