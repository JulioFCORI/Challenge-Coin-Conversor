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

public class CurrencyData {

    private String base_code;
    private Map<String, Double> conversion_rates;

    public String base_code() {
        return base_code;
    }

    public Map<String, Double> conversion_rates(){
            return conversion_rates;
        }
}