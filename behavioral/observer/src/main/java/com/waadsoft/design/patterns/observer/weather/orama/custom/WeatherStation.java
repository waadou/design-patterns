package com.waadsoft.design.patterns.observer.weather.orama.custom;

import com.waadsoft.design.patterns.observer.weather.orama.custom.observer.*;
import com.waadsoft.design.patterns.observer.weather.orama.custom.subject.WeatherData;

/**
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        Observer forecastDisplay = new ForecastDisplay(weatherData);
        Observer statisticsDisplay = new StatisticsDisplay(weatherData);
        Observer currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        System.out.println("************************************************************");
        System.out.println("***                FIRST MEASUREMENT                     ***");
        System.out.println("************************************************************");
        
        weatherData.setMeasurements(80, 65, 30.4f);
        
        System.out.println("************************************************************");
        System.out.println("***               SECOND MEASUREMENT                     ***");
        System.out.println("************************************************************");
        weatherData.setMeasurements(82, 70, 29.2f);
        
        System.out.println("************************************************************");
        System.out.println("***                THIRD MEASUREMENT                     ***");
        System.out.println("************************************************************");
        weatherData.setMeasurements(78, 80, 29.2f);
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
