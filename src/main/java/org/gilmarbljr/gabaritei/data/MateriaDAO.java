package org.gilmarbljr.gabaritei.data;

import java.util.List;

import org.gilmarbljr.gabaritei.business.BusinessException;
import org.gilmarbljr.gabaritei.business.domain.Materia;

public interface MateriaDAO {

	Materia get(Integer id) throws BusinessException;

	void save(Materia materia) throws BusinessException;
	
	void update(Materia materia, String tipo) throws BusinessException;

	List<Materia> list() throws BusinessException;

	void delete(Materia materia) throws BusinessException;
}
