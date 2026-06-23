package FinancialForecasting;

public class ForecastCalculator {
    public static double recursiveForecast(double currentValue, double growthRate, int periods) {
        if (periods == 0) {
            return currentValue;
        }

        double nextValue = currentValue * (1 + growthRate);
        return recursiveForecast(nextValue, growthRate, periods - 1);
    }
}