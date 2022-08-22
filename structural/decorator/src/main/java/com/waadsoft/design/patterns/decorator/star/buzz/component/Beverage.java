package com.waadsoft.design.patterns.decorator.star.buzz.component;

/**
 * Beverage acts as our Component class.
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public abstract double cost();

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return getDescription() + " $" + cost();
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
