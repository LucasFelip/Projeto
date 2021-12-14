package br.com.consultoria.main;

import javax.persistence.EntityManager;

import br.com.consultoria.modelo.Consultor;
import br.com.consultoria.modelo.Empresa;
import br.com.consultoria.modelo.Pessoa;
import br.com.consultoria.modelo.Projeto;
import br.com.consultoria.util.JPAUtil;

public class Main {
	public static void main(String[] args) {
		Empresa e = new Empresa();
        Projeto p = new Projeto();
        Pessoa pe = new Pessoa();
		Consultor c = new Consultor();
		
		//consultor
		c.setNome("Lucas Felipe");
		c.setSexo("M");
		c.setNum_consultor(1);
		
		//empresa
		e.setCodigo(1);
		e.setEndereco("Rua 16, Quadra 10, Casa 58");
		e.setNome("Jucema");
		
		//Dados do projeto
        p.setValor(10000.00);
        p.setNum_projeto(1);

        pe.setNome("Jorge");
        
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
		
		manager.persist(c);
		manager.persist(pe);
		manager.persist(p);
		manager.persist(e);
		
		manager.close();
	}
}
