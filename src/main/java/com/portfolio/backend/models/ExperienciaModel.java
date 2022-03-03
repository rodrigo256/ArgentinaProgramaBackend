package com.portfolio.backend.models;

import javax.persistence.*;

@Entity
@Table(name="experiencias")
public class ExperienciaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Integer id;

  private String titulo;
  private String descripcion;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "ExperienciaModel{" +
      "id=" + id +
      ", titulo='" + titulo + '\'' +
      ", descripcion='" + descripcion + '\'' +
      '}';
  }
}
