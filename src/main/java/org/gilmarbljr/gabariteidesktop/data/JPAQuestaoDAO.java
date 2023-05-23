package org.gilmarbljr.gabariteidesktop.data;

import java.util.List;

import org.gilmarbljr.gabariteidesktop.business.BusinessException;
import org.gilmarbljr.gabariteidesktop.business.domain.Questao;
import org.hibernate.Session;

public class JPAQuestaoDAO implements QuestaoDAO{
	
	public Questao get(Integer id) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public void persist(Questao questao) throws BusinessException {
		Session session = JPAUtils.getSession();
		session.beginTransaction();
		session.persist(questao);
		session.getTransaction().commit();
		session.close();
	}

	public List<Questao> list() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Questao> getQuestaoByMateria(String materia) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Questao questao) throws BusinessException {
		// TODO Auto-generated method stub
		
	}

	public List<String> getMaterias() throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
