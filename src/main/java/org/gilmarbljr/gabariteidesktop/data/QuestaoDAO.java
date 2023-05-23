package org.gilmarbljr.gabariteidesktop.data;

import java.util.List;

import org.gilmarbljr.gabariteidesktop.business.BusinessException;
import org.gilmarbljr.gabariteidesktop.business.domain.Questao;

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