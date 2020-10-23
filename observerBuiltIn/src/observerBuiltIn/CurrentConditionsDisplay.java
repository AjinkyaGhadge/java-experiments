package observerBuiltIn;
import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement{
	private float temperature;
	private float humidity;
	Observable observable;
	
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	public void update(Observable obs, Object args) {
		WeatherData weatherData = (WeatherData)obs;
		this.temperature = weatherData.getTemperature();
		this.humidity = weatherData.getHumidity();
		display();
	}

	public void display() {
		System.out.println("Current Conditions: "+ temperature+ "F degree and "+humidity+"% humidty");
	}
}
