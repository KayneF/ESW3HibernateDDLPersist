package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico_residente")
public class MedicoResidente extends Medico {

    @Column(name = "instituicao_residente", length = 100)
    @NotNull
    private String instituicao;

    @Column(name = "ano_ingresso", length = 4)
    @NotNull
    private int anoIngresso;

    // ---------------------------------------------------------------

    public String getInstituicao() {
        return instituicao;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public int getAnoIngresso() {
        return anoIngresso;
    }

    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }

    @Override
    public String toString() {
        return "MedicoResidente{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                ", celular=" + celular +
                ", especialidade='" + especialidade + '\'' +
                ", instituicao='" + instituicao + '\'' +
                ", anoIngresso=" + anoIngresso +
                '}';
    }
}
