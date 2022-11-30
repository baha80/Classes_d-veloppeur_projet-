package com.baha.dev.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Dev {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idDev;
private String nomDev;
private Double salaireDev;
private Date date;
@ManyToOne
private Projet projet;
public Dev() {
super();
}
public Dev(String nomDev, Double salaireDev, Date date) {
super();
this.nomDev = nomDev;
this.salaireDev = salaireDev;
this.date = date;
}
public Long getIdDev() {
return idDev;
}
public void setIdDev(Long idDev) {
this.idDev = idDev;
}
public String getNomDev() {
return nomDev;
}
public void setNomDev(String nomDev) {
this.nomDev = nomDev;
}
public Double getsalaireDev() {
return salaireDev;
}
public void setsalaireDev(Double salaireDev) {
this.salaireDev = salaireDev;
}
public Date getDate() {
return date;
}
public void setDateCreation(Date date) {
this.date = date;
}
@Override
public String toString() {
	return "Dev [idDev=" + idDev + ", nomDev=" + nomDev + ", salaireDev=" + salaireDev + ", date=" + date + ", projet="
			+ projet + "]";
}
public Projet getProjet() {
	return projet;
}
public void setProjet(Projet projet) {
	this.projet = projet;
}
}