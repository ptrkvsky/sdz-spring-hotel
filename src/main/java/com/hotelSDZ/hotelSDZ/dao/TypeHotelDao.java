package com.hotelSDZ.hotelSDZ.dao;

import com.hotelSDZ.hotelSDZ.model.TypeHotel;
import java.util.List;

public interface TypeHotelDao {
  public List<TypeHotel> findAll();
  public TypeHotel findById(int id);
  public TypeHotel typeHotelSave(TypeHotel p_typeHotel);
}
