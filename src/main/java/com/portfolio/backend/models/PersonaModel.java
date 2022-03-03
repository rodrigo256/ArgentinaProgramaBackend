package com.portfolio.backend.models;

import javax.persistence.*;

@Entity
@Table(name="personas")
public class PersonaModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true, nullable = false)
  private Integer id;

  private String nombre;
  private String apellido;
  private String correo;
  private String pais;
  private String titulo;
  private String url_foto;
  private String experiencia_laboral;

  public PersonaModel() {

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

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getCorreo() {
    return correo;
  }

  public void setCorreo(String correo) {
    this.correo = correo;
  }

  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getUrl_foto() {
    return url_foto;
  }

  public void setUrl_foto(String url_foto) {
    this.url_foto = url_foto;
  }

  public String getExperiencia_laboral() {
    return experiencia_laboral;
  }

  public void setExperiencia_laboral(String experiencia_laboral) {
    this.experiencia_laboral = experiencia_laboral;
  }

  @Override
  public String toString() {
    return "PersonaModel{" +
      "id=" + id +
      ", nombre='" + nombre + '\'' +
      ", apellido='" + apellido + '\'' +
      ", correo='" + correo + '\'' +
      ", pais='" + pais + '\'' +
      ", titulo='" + titulo + '\'' +
      ", url_foto='" + url_foto + '\'' +
      ", experiencia_laboral='" + experiencia_laboral + '\'' +
      '}';
  }
}
