package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.JuanDavid_GarciaPulido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JuanGarciaRepository extends JpaRepository<JuanDavid_GarciaPulido, String> {
    public List<JuanDavid_GarciaPulido> findByNumero(String numero);

}
