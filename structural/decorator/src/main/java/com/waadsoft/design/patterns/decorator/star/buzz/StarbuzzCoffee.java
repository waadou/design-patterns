package com.waadsoft.design.patterns.decorator.star.buzz;

import com.waadsoft.design.patterns.decorator.star.buzz.decorator.Soy;
import com.waadsoft.design.patterns.decorator.star.buzz.decorator.Whip;
import com.waadsoft.design.patterns.decorator.star.buzz.decorator.Mocha;
import com.waadsoft.design.patterns.decorator.star.buzz.component.Expresso;
import com.waadsoft.design.patterns.decorator.star.buzz.component.Beverage;
import com.waadsoft.design.patterns.decorator.star.buzz.component.DarkRoast;
import com.waadsoft.design.patterns.decorator.star.buzz.component.HouseBlend;

/**
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage beverage = new Expresso();
        System.out.println(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        System.out.println(beverage3);
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
