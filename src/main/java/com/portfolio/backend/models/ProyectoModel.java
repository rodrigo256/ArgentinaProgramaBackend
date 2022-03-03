package com.portfolio.backend.models;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="proyectos")
public class ProyectoModel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;
  private String titulo;
  private String descripcion;
  private String url_git;
  private String url_demo;
  private String url_portada;

  public ProyectoModel(){

  }

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

  public String getUrl_git() {
    return url_git;
  }

  public void setUrl_git(String url_git) {
    this.url_git = url_git;
  }

  public String getUrl_demo() {
    return url_demo;
  }

  public void setUrl_demo(String url_demo) {
    this.url_demo = url_demo;
  }

  public String getUrl_portada() {
    return url_portada;
  }

  public void setUrl_portada(String url_portada) {
    this.url_portada = url_portada;
  }

  @Override
  public String toString() {
    return "ProyectoModel{" +
      "id=" + id +
      ", titulo='" + titulo + '\'' +
      ", descripcion='" + descripcion + '\'' +
      ", url_git='" + url_git + '\'' +
      ", url_demo='" + url_demo + '\'' +
      ", url_portada='" + url_portada + '\'' +
      '}';
  }
}
