package com.esliceu.dwes.controller;

import com.esliceu.dwes.model.Echo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Echo hello() {
		return  new Echo("Hola");
	}

	@RequestMapping(value = "/echo", method = RequestMethod.POST)
	public Echo echo(@RequestBody Echo request) {
		return  request;
	}

}
