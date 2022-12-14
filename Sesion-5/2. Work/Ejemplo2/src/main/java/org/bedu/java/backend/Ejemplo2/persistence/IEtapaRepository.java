package org.bedu.java.backend.Ejemplo2.persistence;

import org.bedu.java.backend.Ejemplo2.model.Etapa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEtapaRepository extends JpaRepository<Etapa, Long> {
}
