package controller;

import java.awt.Font;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import model.Contato;

public class BuscarRegistros {
	
	private static JPanel contentPane;

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "From model.Contato";
		
		Query query = manager.createQuery(sql);
	        
		List<Contato> Lista = query.getResultList();
		
		for (Contato c : Lista) {
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Nome: " + c.getEmail() + "\n");
		}
		
		manager.close();
	}
	
	public static void listarRegistros() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		String sql = "From model.Contato";
		
		Query query = manager.createQuery(sql);
	        
		List<Contato> Lista = query.getResultList();
		
		for (Contato c : Lista) {
			
			System.out.println("ID: " + c.getId());
			System.out.println("Nome: " + c.getNome());
			System.out.println("Email: " + c.getEmail());
			System.out.println("Endere�o: " + c.getEndereco());
			System.out.println("\n");
			
		}
		
		manager.close();
	}
	
}
