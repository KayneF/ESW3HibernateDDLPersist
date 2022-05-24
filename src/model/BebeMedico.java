package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "bebe_Medico")
public class BebeMedico {

    @Id
    @ManyToOne
    @JoinColumn(name = "cpf_bebe")
    @NotNull
    private Bebe bebe;

    @Id
    @ManyToOne
    @JoinColumn(name = "crm_medico")
    @NotNull
    private Medico medico;

    // ---------------------------------------------------------------

    public Bebe getBebe() {
        return bebe;
    }

    public void setBebe(Bebe bebe) {
        this.bebe = bebe;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    @Override
    public String toString() {
        return "BebeMedico{" +
                "bebe=" + bebe +
                ", medico=" + medico +
                '}';
    }
}
