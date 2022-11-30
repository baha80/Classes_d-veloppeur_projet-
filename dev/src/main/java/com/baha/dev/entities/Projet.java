package com.baha.dev.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Projet {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idPoj;
private String nomPoj;
private String descriptionPoj;
@JsonIgnore
@OneToMany(mappedBy = "projet")
private List<Dev> dev;
}