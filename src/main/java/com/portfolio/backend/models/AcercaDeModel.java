package com.portfolio.backend.models;


import javax.persistence.*;

@Entity
@Table(name="informaciones")
public class AcercaDeModel {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(unique = true,nullable = false)

  private Integer id;
  private String acerca;

  public AcercaDeModel(){

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getAcerca() {
    return acerca;
  }

  public void setAcerca(String acerca) {
    this.acerca = acerca;
  }

  @Override
  public String toString() {
    return "AcercaDeModel{" +
      "id=" + id +
      ", acerca_de='" + acerca + '\'' +
      '}';
  }
}
