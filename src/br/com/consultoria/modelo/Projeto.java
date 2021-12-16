package br.com.consultoria.modelo;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Projeto{
    
    @Id
    private Integer num_projeto;
    private double valor;
    
    @ManyToOne
    private Empresa empresa;
    
    @ManyToMany
    @JoinTable(name="consultor_projeto", joinColumns=@JoinColumn(name="num_projeto"), inverseJoinColumns=@JoinColumn(name="num_consultor"))
    private List<Consultor> consultor;
    
    public Integer getNum_projeto() {
        return num_projeto;
    }

    public void setNum_projeto(Integer num_projeto) {
        this.num_projeto = num_projeto;
    }
   
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }  
}