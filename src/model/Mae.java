package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "mae")
public class Mae {

    @Id
    @Column(name = "cpf_mae", length = 11)
    @NotNull
    private int cpf;

    @Column(name = "nome_mae", length = 100)
    @NotNull
    private String nome;

    @Column(name = "endereco", length = 100)
    @NotNull
    private String endereco;

    @Column(name = "complemento", length = 20)
    private String complemento;

    @Column(name = "telefone", length = 11)
    @NotNull
    private int telefone;

    @Column(name = "nascimento_mae")
    @NotNull
    private LocalDate nascimento;

    // ---------------------------------------------------------------

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Mae{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone=" + telefone +
                ", nascimento=" + nascimento +
                '}';
    }
}
