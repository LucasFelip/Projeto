package br.com.consultoria.main;

import javax.persistence.EntityManager;

import br.com.consultoria.modelo.Consultor;
import br.com.consultoria.util.JPAUtil;

public class Main {
	public static void main(String[] args) {
		Consultor c = new Consultor();
		c.setNome("Lucas Felipe");
		c.setSexo("M");
		c.setNum_consultor(123);
		c.setEspecializacao("Analista");
		
		EntityManager manager = new JPAUtil().getEntityManager();
		manager.getTransaction().begin();
	
		manager.persist(c);
	
		manager.close();
        
		/*
		        
        do {
        	System.out.println(" --- Consultoria --- \n 1 - Inserir Consulta \n 2 - Buscar \n 3 - Atulizar \n 4 - Excluir \n 0 - Sair \n Digite o número da opção: ");
        }while(i != 0);
		
		 */
	}
}
