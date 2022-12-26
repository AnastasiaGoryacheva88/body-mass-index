public class BmiService {
    public double calculate(double weight, double height) {
        double calculatedHeight = Math.pow(height, 2);
        double result;
        result = weight / calculatedHeight;
        return result;
    }
}

