package FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Financial Forecasting ===\n");

        double initialValue = 10000.0;
        double growthRate = 0.08;
        int periods = 5;

        double forecast = ForecastCalculator.recursiveForecast(initialValue, growthRate, periods);

        System.out.println("Initial value: " + initialValue);
        System.out.println("Growth rate: " + (growthRate * 100) + "%");
        System.out.println("Periods: " + periods);
        System.out.println("Forecasted future value: " + forecast);
    }
}