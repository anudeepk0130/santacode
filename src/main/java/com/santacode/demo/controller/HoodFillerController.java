package com.santacode.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santacode.demo.constants.APIEndpoints;
import com.santacode.demo.model.HoodFiller;
import com.santacode.demo.service.HoodFillerService;

@RestController
@RequestMapping(APIEndpoints.HOODFILLER)
public class HoodFillerController {

	@Autowired
	HoodFillerService service;

	@PostMapping
	public int[] createHoodfiller(@RequestBody HoodFiller body) {

		return HoodFillerService.hoodfillerMethod(body.getHood_capacity(), body.getPresent_weights().length,
				body.getPresent_weights());
	}

}
