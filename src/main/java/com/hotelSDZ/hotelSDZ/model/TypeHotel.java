package com.hotelSDZ.hotelSDZ.model;

import java.util.Objects;

public class TypeHotel {


  private int nutype;
  private String nomtype;


  public int getNutype() {
    return nutype;
  }

  public void setNutype(int nutype) {
    this.nutype = nutype;
  }

  public TypeHotel(int id, String nomtype) {
    this.nutype = id;
    this.nomtype = nomtype;
  }

  public String getNomtype() {
    return nomtype;
  }

  public void setNomtype(String nomtype) {
    this.nomtype = nomtype;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TypeHotel typeHotel = (TypeHotel) o;
    return nutype == typeHotel.nutype &&
        Objects.equals(nomtype, typeHotel.nomtype);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nutype, nomtype);
  }

  @Override
  public String toString() {
    return "TypeHotel{" +
        "nutype=" + nutype +
        ", nomtype='" + nomtype + '\'' +
        '}';
  }
}
