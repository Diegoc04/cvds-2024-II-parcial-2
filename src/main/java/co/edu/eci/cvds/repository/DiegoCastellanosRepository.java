package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.DiegoCastellanos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiegoCastellanosRepository extends JpaRepository<DiegoCastellanos, String> {
    public List<DiegoCastellanos> findByNumero(String numero);

}
