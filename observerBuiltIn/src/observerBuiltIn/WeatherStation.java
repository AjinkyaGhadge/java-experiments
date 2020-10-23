package observerBuiltIn;

import observerBuiltIn.CurrentConditionsDisplay;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		MinMaxConditionsDisplay maxDisplay = new MinMaxConditionsDisplay(weatherData);
		weatherData.setMeasurements(80,65,20.4f);
		weatherData.setMeasurements(70,63,12.4f);
		weatherData.setMeasurements(50,60,22.2f);
	}
}
