package com.sakku.Mausam;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@CrossOrigin(origins = "*")
@RestController
@Cacheable(value = "weather_cache", key = "#city")
public class Controller {

    @Value("${weather.api.key}")
    String key;

    private final RestTemplate bnda;

    public Controller(RestTemplate dusraBnda) {
        this.bnda = dusraBnda;
    }

    @GetMapping("/")
    public Object mausamDedo(@RequestParam(required = false, defaultValue = "Delhi") String city,
            @RequestParam(required = false, defaultValue = "IN") String country) {
        try {
            String qValue = city;
            if (country != null && !country.isEmpty()) {
                qValue += "," + country;
            }
            String finalUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + qValue + "&appid=" + key
                    + "&units=metric";

            Map mausam = bnda.getForObject(finalUrl, Map.class);

            Map coord = (Map) mausam.get("coord");

            Double lat = (Double) coord.get("lat");
            Double lon = (Double) coord.get("lon");

            String pollUrl = "https://api.openweathermap.org/data/2.5/air_pollution" + "?lat=" + lat + "&lon=" + lon + "&appid=" + key;

            Map pradushan = (Map) bnda.getForObject(pollUrl, Map.class);
            Map finalMausam = new HashMap();

            finalMausam.put("mausam", mausam);
            finalMausam.put("pradusham", pradushan);

            return finalMausam;
        } catch (Exception e) {
            e.printStackTrace();
            return "!!! ---User Entered Wrong City/Country name--- !!!";
        }
    }

}
