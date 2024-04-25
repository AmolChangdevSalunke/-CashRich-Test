package com.cashRich.coinData.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cashRich.coinData.service.ApiService;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired(required = true)
    private ApiService apiService;

    @PostMapping("/call-external-api")
    public ResponseEntity<String> callExternalApi(@RequestParam String userId) {
        
        String response = apiService.callExternalApi(userId);

        return ResponseEntity.ok(response);
    }
}
