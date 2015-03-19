package br.edu.ifms.tads.dbf2.web;

import org.hibernate.Session;

import br.edu.ifms.tads.dbf2.model.Pessoa;
import br.edu.ifms.tads.dbf2.util.HibernateUtil;

public class TesteHibernate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pessoa p1 = new Pessoa();
		p1.setId(399);
		p1.setNome("jãofl");
		p1.setRg(50111);
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		session.save(p1);
		session.getTransaction().commit();
	}

}
