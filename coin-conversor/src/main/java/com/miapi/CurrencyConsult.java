package com.miapi;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.Gson;

public class CurrencyConsult {
    private String apiKey = "9650a7d5d34532968bf19b94";

    public CurrencyData lookupRate(String coinBase) {

        String direction = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + coinBase;
        // Create Client and Request
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direction))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Gson
            return new Gson().fromJson(response.body(), CurrencyData.class);
        } catch (Exception e) {
            throw new RuntimeException("I couldn´t find that coin: "+ e.getMessage());
        }
    }
}