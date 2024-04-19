package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.JuanDavid_GarciaPulido;
import co.edu.eci.cvds.repository.JuanGarciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JuanGarciaService {
    private final JuanGarciaRepository juanGarciaRepository;

    @Autowired
    public JuanGarciaService(JuanGarciaRepository juanGarciaRepository) {
        this.juanGarciaRepository = juanGarciaRepository;
    }

    public JuanDavid_GarciaPulido addJuanGarcia(JuanDavid_GarciaPulido juanGarcia) {
        return juanGarciaRepository.save(juanGarcia);
    }

    public JuanDavid_GarciaPulido getJuanGarcia(String numero) {
        return juanGarciaRepository.findByNumero(numero).get(1);
    }

    public List<JuanDavid_GarciaPulido> getAllJuanDavid_GarciaPulido() {
        return juanGarciaRepository.findAll();
    }

    public JuanDavid_GarciaPulido updateJuanGarcia(JuanDavid_GarciaPulido juanGarcia) {
        if (juanGarciaRepository.findByNumero(juanGarcia.getNumero()).size() == 0) {
            return juanGarciaRepository.save(juanGarcia);
        }

        return null;
    }

    public void deleteJuanGarcia(String Numero) {
        juanGarciaRepository.deleteById(Numero);
    }

}