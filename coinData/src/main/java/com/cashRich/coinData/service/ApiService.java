package com.cashRich.coinData.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cashRich.coinData.Repository.ApiRepository;
import com.cashRich.coinData.entity.ApiData;

@Service
public class ApiService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApiRepository apiRepository;

    public String callExternalApi(String userId) {
        String apiUrl = "https://pro-api.coinmarketcap.com/v1/cryptocurrency/quotes/latest?symbol=BTC,ETHLTC"; 
        ResponseEntity<String> response = restTemplate.getForEntity(apiUrl, String.class);

        ApiData apiData = new ApiData(userId, response.getBody(),LocalDateTime.now());
        apiRepository.save(apiData);

        return response.getBody();
    }
}
