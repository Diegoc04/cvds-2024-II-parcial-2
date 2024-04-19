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
    @Column(name = "Argumento")
    private String argumento;

    public DiegoCastellanos() {
    }

    public DiegoCastellanos(String Numero, String Letra, String Explicacion) {
        this.numero = Numero;
        this.letra = Letra;
        this.argumento = Explicacion;
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

    public String getArgumento() {
        return argumento;
    }

    public void setArgumento(String Letra) {
        this.argumento = argumento;
    }

    @Override
    public String toString() {
        return "DiegoCastellanos [Numero = " + numero + ", Letra = " + letra + "Explicacion = " + argumento + "]";
    }
}
