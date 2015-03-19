package br.edu.ifms.tads.dbf2.dao;

import org.hibernate.Session;

import br.edu.ifms.tads.dbf2.model.Pessoa;
import br.edu.ifms.tads.dbf2.util.HibernateUtil;

public class PessoaDAO {

	public void salvar(Pessoa pessoa){
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		
		session.beginTransaction();
		session.save(pessoa);
		session.getTransaction().commit();
	}
	
}
