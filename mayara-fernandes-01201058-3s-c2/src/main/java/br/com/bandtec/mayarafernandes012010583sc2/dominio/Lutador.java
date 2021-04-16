package br.com.bandtec.mayarafernandes012010583sc2.dominio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Lutador {


    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    @Size(min = 3, max = 12)
    private String nome;
    private Double forcaGolpe;
    private Double vida = 100.0;
    private Integer concentracoesRealizadas = 0;
    private Boolean vivo = false;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getForcaGolpe() {
        return forcaGolpe;
    }

    public void setForcaGolpe(Double forcaGolpe) {
        this.forcaGolpe = forcaGolpe;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Integer getConcentracoesRealizadas() {
        return concentracoesRealizadas;
    }

    public void setConcentracoesRealizadas(Integer concentracoesRealizadas) {
        this.concentracoesRealizadas = concentracoesRealizadas;
    }

    public Boolean getVivo() {
        if(vida > 0) {
            vivo = true;
        }
        return vivo;
    }

    public void setVivo(Boolean vivo) {
        this.vivo = vivo;
    }
}
