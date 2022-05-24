package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

@Entity
@Table(name = "bebe")
public class Bebe {

    @Id
    @Column(name = "cpf_bebe", length = 11)
    @NotNull
    private int cpf;

    @Column(name = "nome_bebe", length = 100)
    @NotNull
    private String nome;

    @Column(name = "nascimento_bebe")
    @NotNull
    private LocalDate nascimento;

    @Column(name = "peso_bebe", length = 5)
    @NotNull
    private float peso;

    @Column(name = "altura_bebe", length = 5)
    @NotNull
    private float altura;

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

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Bebe{" +
                "cpf=" + cpf +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}
