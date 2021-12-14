package br.com.consultoria.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class Cliente extends Pessoa implements Serializable{
	private Integer num_cliente;
	
	
	private List<Consultor> consultor;
	
	public Integer getNum_client() {
        return num_cliente;
    }

    public void setNum_consultor(Integer num_cliente) {
        this.num_cliente = num_cliente;
    }
}
