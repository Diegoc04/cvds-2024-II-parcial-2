package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "JUAN_GARCIA")
public class JuanDavid_GarciaPulido {
    @Id

    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "LETRA")
    private String propiedad;
    @Column(name = "RESPUESTA")
    private String valor;



    public JuanDavid_GarciaPulido() {
    }

    public JuanDavid_GarciaPulido(String numero,String propiedad, String valor) {
        this.numero = numero;
        this.propiedad = propiedad;
        this.valor = valor;

    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }




    @Override
    public String toString() {
        return "Configuration [propiedad = " + propiedad + ", valor = " + valor + "]";
    }
}