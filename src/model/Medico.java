package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "medico")
public class Medico {

    @Id
    @Column(name = "crm_medico", length = 10)
    @NotNull
    String crm;

    @Column(name = "nome_medico", length = 100)
    @NotNull
    String nome;

    @Column(name = "celular_medico", length = 11)
    @NotNull
    int celular;

    @Column(name = "especialidade_medico", length = 20)
    @NotNull
    String especialidade;

    // ---------------------------------------------------------------

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "crm=" + crm +
                ", nome='" + nome + '\'' +
                ", celular=" + celular +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }
}
