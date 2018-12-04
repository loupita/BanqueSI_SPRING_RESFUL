package org.glsid.dao;

import org.glsid.entities.Operation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperationClientRepository extends JpaRepository<Operation, Long> {

}
