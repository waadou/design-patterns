package com.waadsoft.design.patterns.observer.weather.orama.builtin.observer;

import java.util.Observer;
import java.util.Observable;

import com.waadsoft.design.patterns.observer.weather.orama.custom.DisplayElement;
import com.waadsoft.design.patterns.observer.weather.orama.builtin.subject.WeatherData;

/**
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private float pressure;
    private float humidity;
    private float temperature;

    private final Observable observable;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        register(observable);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            this.temperature = weatherData.getTemperature();

            display();
        }
    }

    @Override
    public void display() {
        System.out.println("\n--- From CurrentConditionsDisplay ---");
        System.out.println("Current conditions");
        System.out.println("Temp: " + temperature + "°");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure);
    }

    private void register(Observable observable) {
        observable.addObserver(this);
    }

    private void deregister() {
        observable.deleteObserver(this);
    }
}

/*=============================================================================
 * Copyright 2022 Waad Soft<https://www.waadsoft.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 =============================================================================*/
