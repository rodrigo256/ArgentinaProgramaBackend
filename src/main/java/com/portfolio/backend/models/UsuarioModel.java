package com.portfolio.backend.models;

import javax.persistence.*;

@Entity
@Table(name="usuarios")
public class UsuarioModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Integer id;
  private String usuario;
  private String contraseña;

  public UsuarioModel(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getContraseña() {
    return contraseña;
  }

  public void setContraseña(String contraseña) {
    this.contraseña = contraseña;
  }

  @Override
  public String toString() {
    return "Usuario{" +
      "id=" + id +
      ", usuario='" + usuario + '\'' +
      ", contraseña='" + contraseña + '\'' +
      '}';
  }
}
