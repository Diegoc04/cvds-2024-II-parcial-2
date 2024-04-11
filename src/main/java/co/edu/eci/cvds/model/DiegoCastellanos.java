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
    private String Numero;
    @Column(name = "Letra")
    private String Letra;
    @Column(name = "Explicacion")
    private String Explicacion;

    public DiegoCastellanos() {
    }

    public DiegoCastellanos(String Numero, String Letra, String Explicacion) {
        this.Numero = Numero;
        this.Letra = Letra;
        this.Explicacion = Explicacion;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getLetra() {
        return Letra;
    }

    public void setLetra(String Letra) {
        this.Letra = Letra;
    }

    @Override
    public String toString() {
        return "DiegoCastellanos [Numero = " + Numero + ", Letra = " + Letra + "Explicacion = " + Explicacion + "]";
    }
}
