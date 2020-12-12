package com.kodilla.testing.weather.stub;

import java.util.*;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }

    public double calculateAverage() {
        double average;
        double sum = 0;
        int counter = 0;

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            sum += temperature.getValue();
            counter++;
        }
        average = sum / counter;
        return average;

    }

    public double calculateMediana() {
        double mediana;
        double average;
        ArrayList <Double> resultList = new ArrayList<>();

        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {

            resultList.add(temperature.getValue());
        }
        Collections.sort(resultList);

        if (resultList.size() % 2 == 0) {

            average = resultList.get(resultList.size()/2) + resultList.get((resultList.size()/2)-1);
            mediana = average/2;
        } else {
            mediana = resultList.get(resultList.size()/2);
        }
        return mediana;

        }

}