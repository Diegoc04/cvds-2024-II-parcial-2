package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIEGO_CASTELLANOS")
public class DiegoCastellanos {
    @Id
    @Column(name = "Numero")
    private String numero;
    @Column(name = "Letra")
    private String letra;
    @Column(name = "Explicacion")
    private String explicacion;

    public DiegoCastellanos() {
    }

    public DiegoCastellanos(String Numero, String Letra, String Explicacion) {
        this.numero = Numero;
        this.letra = Letra;
        this.explicacion = Explicacion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String Letra) {
        this.letra = Letra;
    }

    @Override
    public String toString() {
        return "DiegoCastellanos [Numero = " + numero + ", Letra = " + letra + "Explicacion = " + explicacion + "]";
    }
}
