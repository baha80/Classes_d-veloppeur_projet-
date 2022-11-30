package com.baha.dev.entities;

import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomProd", types = { Dev.class })
public interface DevProjection {
public String getNomProduit();
}
