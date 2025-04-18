import java.util.ArrayList;
public class WeatherData {

private ArrayList<Double> temperatures;

public WeatherData(ArrayList<Double> data) {
    temperatures = data;
}   

public void cleanData(double lower, double upper) {  
    for (int i = temperatures.size() - 1; i >= 0; i--) {
        if (temperatures.get(i) < lower || temperatures.get(i) > upper) temperatures.remove(i);
    }
}

public int longestHeatWave(double threshold) { 
    int count = 0;
    int current = 0;
    for (double t : temperatures) {
        if (t > threshold) {
            current++;
            if (current > count) count = current;
        }
        else current = 0;
    }
    return count;
}

public String toString() {
    return temperatures.toString();
}

}