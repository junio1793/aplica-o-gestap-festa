package com.gestaofesta.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.yaml.snakeyaml.events.Event.ID;

import com.gestaofesta.gestaofesta.model.Convidado;

public interface Repository extends JpaRepository<Convidado, ID> {

}
