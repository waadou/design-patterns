package com.waadsoft.design.patterns.observer.weather.orama.custom.observer;

import com.waadsoft.design.patterns.observer.weather.orama.custom.DisplayElement;
import com.waadsoft.design.patterns.observer.weather.orama.custom.subject.Subject;

/**
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float humidity;
    private float temperature;

    private final Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        register(weatherData);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("\n--- From CurrentConditionsDisplay ---");
        System.out.println("Current conditions");
        System.out.println("Temp: " + temperature + "°");
        System.out.println("Humidity: " + humidity + "%");
    }

    public void deregister() {
        weatherData.removeObserver(this);
    }

    private void register(Subject weatherData) {
        weatherData.registerObserver(this);
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
