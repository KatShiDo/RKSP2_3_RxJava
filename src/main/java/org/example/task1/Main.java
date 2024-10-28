package org.example.task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        var temperatureSensor = new TemperatureSensor();
        var co2Sensor = new CO2Sensor();
        var alarm = new Alarm();

        temperatureSensor.subscribe(alarm);
        co2Sensor.subscribe(alarm);

        temperatureSensor.start();
        co2Sensor.start();
        Thread.sleep(10000);
    }
}
