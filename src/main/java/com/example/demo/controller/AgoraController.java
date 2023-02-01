package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AgoraBody;
import com.example.demo.service.AgoraService;

@RestController
@CrossOrigin(origins = "*")
public class AgoraController {
	@Autowired 
    private AgoraService service;
	
	@RequestMapping(value = { "/createChannel" }, method = RequestMethod.POST)
	public ResponseEntity<?> SendEnvelope( @RequestBody AgoraBody data ) {
	    return new ResponseEntity<>( service.getRTCToken(data), HttpStatus.OK);

//		return service.getRTCToken(data);
	}
}
