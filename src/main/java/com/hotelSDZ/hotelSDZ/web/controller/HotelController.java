package com.hotelSDZ.hotelSDZ.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotelController {

  @RequestMapping(value = "/hotels", method = RequestMethod.GET)
  public String getHotels() {
    return "coucou";
  }

  @GetMapping(value="/hotels/{id}")
  public String getDetail(@PathVariable int id ){
    return "hotel "+id;

  }

}