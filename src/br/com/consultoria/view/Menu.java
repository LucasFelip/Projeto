package br.com.consultoria.view;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

@SuppressWarnings("serial")
public class Menu extends javax.swing.JFrame{
	
	JMenuBar barra = new JMenuBar();
	JMenu menu1 = new JMenu("Opções");
	JMenu menu2 = new JMenu("Sair");
	JMenuItem item1 = new JMenuItem("Cadastrar");
	JMenuItem item2 = new JMenuItem("Retornar");
	JMenuItem item3 = new JMenuItem("Exit");
	
	public void menu() {
		setJMenuBar(barra);
        barra.add(menu1);
        barra.add(menu2);
        menu1.add(item1);
        menu1.add(item2);
        menu2.add(item3);
        
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ActionCadastrar(evt);
            }
        });
        
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	ActionRetornar(evt);
            }
        });
        
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	System.exit(0);
            }
        });
        
		setTitle("Menu");
		setSize(600,400);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
	}
	
	private void ActionCadastrar(java.awt.event.ActionEvent evt) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarConsultoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
		
		java.awt.EventQueue.invokeLater(new Runnable() {
	         public void run() {
	             new CadastrarConsultoria().setVisible(true);
	         }
	     });
	}

	public void ActionRetornar(java.awt.event.ActionEvent evt) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RetornaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RetornaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RetornaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RetornaDados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RetornaDados().setVisible(true);
            }
        });
		
	}
}
