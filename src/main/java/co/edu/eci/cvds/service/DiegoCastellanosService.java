package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.DiegoCastellanos;
import co.edu.eci.cvds.repository.DiegoCastellanosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DiegoCastellanosService {
    private final DiegoCastellanosRepository diegoCastellanosRepository;

    @Autowired
    public DiegoCastellanosService(DiegoCastellanosRepository diegoCastellanosRepository) {
        this.diegoCastellanosRepository = diegoCastellanosRepository;
    }

    public DiegoCastellanos addDiegoCastellanos(DiegoCastellanos diegoCastellanos) {
        return diegoCastellanosRepository.save(diegoCastellanos);
    }

    public DiegoCastellanos getDiegoCastellanos(String numero) {
        return diegoCastellanosRepository.findByNumero(numero).get(1);
    }

    public List<DiegoCastellanos> getAllDiegoCastellanos() {
        return diegoCastellanosRepository.findAll();
    }

    public DiegoCastellanos updateDiegoCastellanos(DiegoCastellanos diegoCastellanos) {
        if (diegoCastellanosRepository.findByNumero(diegoCastellanos.getNumero()).size() == 0) {
            return diegoCastellanosRepository.save(diegoCastellanos);
        }

        return null;
    }

    public void deleteDiegoCastellanos(String Numero) {
        diegoCastellanosRepository.deleteById(Numero);
    }

}