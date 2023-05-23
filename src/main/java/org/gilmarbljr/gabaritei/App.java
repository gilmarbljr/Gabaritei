package org.gilmarbljr.gabaritei;

import java.util.List;

import org.gilmarbljr.gabaritei.business.BusinessException;
import org.gilmarbljr.gabaritei.business.domain.Materia;
//import org.gilmarbljr.gabariteidesktop.business.domain.Questao;
import org.gilmarbljr.gabaritei.data.JPAMateriaDAO;
//import org.gilmarbljr.gabariteidesktop.data.JPAQuestaoDAO;

public class App 
{
    public static void main( String[] args )
    {
    	//JPAQuestaoDAO questaoDAO = new JPAQuestaoDAO();
    	JPAMateriaDAO materiaDAO = new JPAMateriaDAO();
        try {
        	
        	/*
        	Materia materia = new Materia();
        	materia.setTipo("Portugues");
        	materiaDAO.save(materia);
        	
        	materia = new Materia();
        	materia.setTipo("Quimica");
        	materiaDAO.save(materia);
        	
        	materia = new Materia();
        	materia.setTipo("Matematica");
        	materiaDAO.save(materia);
        	
        	Questao questao = new Questao();
        	questao.setData("2023");
        	materia = materiaDAO.get(1);
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 1");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(1);
        	questaoDAO.persist(questao);
        	
        	questao = new Questao();
        	questao.setData("2023");
        	materia = materiaDAO.get(2);
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 2");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(2);
        	questaoDAO.persist(questao);
        	
        	questao = new Questao();
        	questao.setData("2023");
        	materia = materiaDAO.get(1);
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 3");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(3);
        	questaoDAO.persist(questao);
        	
        	questao = new Questao();
        	questao.setData("2023");
        	materia = materiaDAO.get(2);
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 4");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(4);
        	questaoDAO.persist(questao);
        	
        	questao = new Questao();
        	questao.setData("2023");
        	materia = materiaDAO.get(3);
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 5");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(5);
        	questaoDAO.persist(questao);
        	*/
        	
        	
        	List<Materia> materias = materiaDAO.list();
        	
        	for (Materia m : materias) {
        		System.out.println(m);
        	}
        	
        	
        	/*
        	Materia materia = new Materia(1,"Portugues");
        	Questao questao = new Questao();
        	questao.setData("2023");
        	questao.setMateria(materia);
        	questao.setEnunciado("enunciado 6");
        	questao.setAltA("alternativa A");
        	questao.setAltB("alternativa B");
        	questao.setAltC("alternativa C");
        	questao.setAltD("alternativa D");
        	questao.setAltE("alternativa E");
        	questao.setResposta(5);
        	questaoDAO.persist(questao);
        	*/
        	
			
		} catch (BusinessException e) {
			e.printStackTrace();
		}
    }
}
