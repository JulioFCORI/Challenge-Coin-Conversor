/*package com.miapi;

public class CurrencyData {

    public record CurrencyData(
        String base_code,
        Map<String, Double> conversion_rates;
    ){

    };
}*/

package com.miapi;

import java.util.Map;

public record CurrencyData(String result,
                               String base_code,
                               Map<String, Double> conversion_rates){}