package observertest;

public class MinMaxConditionsDisplay implements Observer,DisplayElement{
private float temperature;
private float humidity;
private float pressure;
Subject weatherData;

public MinMaxConditionsDisplay(Subject weatherData) {
	
	this.weatherData = weatherData;
	weatherData.registerObserver(this);
	temperature = 0;
	humidity = 0;
}

public void update(float temperature, float humidity, float pressure) {
	if (this.temperature < temperature){
		this.temperature = temperature;
	}
	
	if (this.humidity < humidity) {
		this.humidity = humidity;
	}
	
	if (this.pressure < pressure) {
		this.pressure = pressure;
	}
	display();
}

public void display()
{
	System.out.println("Current max temp is "+temperature);
	System.out.println("Current max humidity is "+humidity);
	System.out.println("Current max pressure is "+pressure);
}

}
