package com.apportfoliofuentes.mgb.Security.Repository;

import com.apportfoliofuentes.mgb.Security.Entity.Rol;
import com.apportfoliofuentes.mgb.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
