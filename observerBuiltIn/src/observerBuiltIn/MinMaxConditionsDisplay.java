package observerBuiltIn;
import java.util.Observable;
import java.util.Observer;

public class MinMaxConditionsDisplay implements Observer,DisplayElement{
private float temperature;
private float humidity;
private float pressure;
Observable weatherData;

public MinMaxConditionsDisplay(Observable weatherData) {
	this.weatherData = weatherData;
	weatherData.addObserver(this);
	temperature = 0;
	humidity = 0;
	pressure = 0;
}

public void update(Observable obs, Object arg) {
	WeatherData weatherData = (WeatherData)obs;
	this.temperature = weatherData.getTemperature();
	this.humidity = weatherData.getHumidity();
	this.pressure = weatherData.getPressure();
	display();
}

public void display()
{
	System.out.println("Current max temp is "+temperature);
	System.out.println("Current max humidity is "+humidity);
	System.out.println("Current max pressure is "+pressure);
}

}
