package com.portfolio.backend.models;

import javax.persistence.*;

@Entity
@Table(name= "formaciones")
public class FormacionModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String descripcion;
  private String titulo;

  public FormacionModel(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString() {
    return "ExperienciaModel{" +
      "id=" + id +
      ", descripcion='" + descripcion + '\'' +
      ", titulo='" + titulo + '\'' +
      '}';
  }
}
