package com.cashRich.coinData.service;

import java.net.http.HttpHeaders;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.cashRich.coinData.Repository.UserRepository;
import com.cashRich.coinData.entity.User;

@org.springframework.stereotype.Service
public class UserService {
	@Autowired
	private UserRepository userRepository;

	public User createUser(User user) {
		return userRepository.save(user);
	}

	public User updateUser(Long id, User userDetails) {
		User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
		// Update user details
		return userRepository.save(user);
	}
	

//	    public void makeApiCall(Long userId) {
//	        RestTemplate restTemplate = new RestTemplate();
//	        HttpHeaders headers = new HttpHeaders("X-CMC_PRO_API_KEY :27ab17d1-215f-49e5-9ca4-afd48810c149");
//	        // Add any necessary headers
//	        
//	        HttpEntity<String> entity = new HttpEntity<>(headers);
//	        ResponseEntity<String> response = restTemplate.exchange("YOUR_API_ENDPOINT_URL", HttpMethod.GET, entity, String.class);
//	        
//	        ApiCall apiCall = new ApiCall();
//	        apiCall.setUserId(userId);
//	        apiCall.setTimestamp(LocalDateTime.now());
//	        apiCall.setRequest("YOUR_REQUEST_DATA"); // Add your request data
//	        apiCall.setResponse(response.getBody());
//	        
	
//	        apiCallRepository.save(apiCall);

//	    }
}
