package org.gilmarbljr.gabaritei.data;

import java.util.List;

import org.gilmarbljr.gabaritei.business.BusinessException;
import org.gilmarbljr.gabaritei.business.domain.Questao;

/**
*
* @author gbljunior
*/
public interface QuestaoDAO {
	
	Questao get(Integer id) throws BusinessException;

	void persist(Questao questao) throws BusinessException;

	List<Questao> list() throws BusinessException;

	List<Questao> getQuestaoByMateria(String materia) throws BusinessException;

	void delete(Questao questao) throws BusinessException;
}