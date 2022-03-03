package com.portfolio.backend.models;

import javax.persistence.*;

@Entity
@Table(name= "habilidades")
public class HabilidadModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String nombre;
  private String url_imagen;

  public HabilidadModel(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getUrl_imagen() {
    return url_imagen;
  }

  public void setUrl_imagen(String url_imagen) {
    this.url_imagen = url_imagen;
  }

  @Override
  public String toString() {
    return "HabilidadModel{" +
      "id=" + id +
      ", nombre='" + nombre + '\'' +
      ", url_imagen='" + url_imagen + '\'' +
      '}';
  }
}
