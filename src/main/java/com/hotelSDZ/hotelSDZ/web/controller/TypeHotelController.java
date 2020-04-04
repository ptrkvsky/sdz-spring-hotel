package com.hotelSDZ.hotelSDZ.web.controller;

import com.hotelSDZ.hotelSDZ.dao.TypeHotelDaoImpl;
import com.hotelSDZ.hotelSDZ.model.TypeHotel;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeHotelController {

  @Autowired
  private TypeHotelDaoImpl typeHotelDaoImpl;

  @GetMapping(value = "/type-hotel/{id}")
  public TypeHotel detailTypeHotel(@PathVariable int id) {
//    TypeHotelDaoImpl thImpl = new TypeHotelDaoImpl();
//    TypeHotel findedTypeHotel = thImpl.findById(id);
//
//    return findedTypeHotel;

      return typeHotelDaoImpl.findById(id);
  }

  @GetMapping(value = "/type-hotels")
  public List<TypeHotel> findAll() {
    TypeHotelDaoImpl thImpl = new TypeHotelDaoImpl();
    List<TypeHotel> typeHotelList = thImpl.findAll();

    return typeHotelList;
  }
}
