package br.com.consultoria.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Empresa {
    @Id
    private int codigo;
    private String nome;
    private String endereco;
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
}