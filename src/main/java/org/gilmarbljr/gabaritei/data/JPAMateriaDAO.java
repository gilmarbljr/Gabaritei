package org.gilmarbljr.gabaritei.data;

import java.util.List;

import org.gilmarbljr.gabaritei.business.BusinessException;
import org.gilmarbljr.gabaritei.business.domain.Materia;
import org.hibernate.Session;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class JPAMateriaDAO implements MateriaDAO {
	
	public Materia get(Integer id) throws BusinessException {
		Materia materia = null;
		Session session = JPAUtils.getSession();
		session.beginTransaction();
		materia = session.get(Materia.class, id);
		session.close();
		return materia;
	}

	public void save(Materia materia) throws BusinessException {
		Session session = JPAUtils.getSession();
		session.beginTransaction();
		session.persist(materia);
		session.getTransaction().commit();
		session.close();
	}
	
	public void update(Materia materia, String tipo) throws BusinessException {
		Session session = JPAUtils.getSession();
		session.beginTransaction();
		materia = session.get(Materia.class, materia.getId());
		materia.setTipo(tipo);
		session.persist(materia);
		session.getTransaction().commit();
		session.close();
	}
	

	public List<Materia> list() throws BusinessException {
		EntityManager entityManager = JPAUtils.getEntityManager();
		CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Materia> criteriaQuery = criteriaBuilder.createQuery(Materia.class);
		criteriaQuery.from(Materia.class);
		TypedQuery<Materia> query = entityManager.createQuery(criteriaQuery);
		return query.getResultList();
	}

	public void delete(Materia materia) throws BusinessException {
		Session session = JPAUtils.getSession();
		session.beginTransaction();
		session.remove(materia);
		session.getTransaction().commit();
		session.close();
	}

}
