package org.gilmarbljr.gabaritei.business.domain;

import java.util.ArrayList;
import java.util.List;

import org.gilmarbljr.gabaritei.business.BusinessException;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "questao")
public class Questao {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@ManyToOne
	private Materia materia;
	@Column(nullable = false)
	private String data;
	@Column(nullable = false)
	private String enunciado;
	@Column(nullable = false)
	private String altA;
	@Column(nullable = false)
	private String altB;
	@Column(nullable = false)
	private String altC;
	@Column(nullable = false)
	private String altD;
	@Column(nullable = false)
	private String altE;
	@Column(nullable = false)
	private Integer resposta;
	
	public Questao() {
	}
	
	public Questao(Materia materia, String data, String enunciado, String altA, String altB, String altC, String altD, String altE,
			Integer resposta) throws BusinessException{
		setId(id);
		setMateria(materia);
		setData(data);
		setEnunciado(enunciado);
		setAltA(altA);
		setAltB(altB);
		setAltC(altC);
		setAltD(altD);
		setAltE(altE);
		setResposta(resposta);
	}
	
	public Integer getId() {
        return id;
    }

    private void setId(Integer id) {
        this.id = id;
    }
    
    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) throws BusinessException {
        if (materia == null) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.materia = materia;
    }
    
    public String getData() {
		return data;
	}

	public void setData(String data) throws BusinessException {
		if (data.isEmpty()) {
			throw new BusinessException("exception.invalid.questao.data");
		}
		this.data = data;
	}

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) throws BusinessException {
        if (enunciado.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.enunciado = enunciado;
    }

    public int getResposta() {
        return resposta;
    }

    public void setResposta(Integer resposta) throws BusinessException {
        if (resposta < 1 || resposta > 5) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.resposta = resposta;
    }

    public String getAltA() {
        return altA;
    }

    public void setAltA(String altA) throws BusinessException {
        if (altA.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.altA = altA;
    }

    public String getAltB() {
        return altB;
    }

    public void setAltB(String altB) throws BusinessException {
        if (altB.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.altB = altB;
    }

    public String getAltC() {
        return altC;
    }

    public void setAltC(String altC) throws BusinessException {
        if (altC.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.altC = altC;
    }

    public String getAltD() {
        return altD;
    }

    public void setAltD(String altD) throws BusinessException {
        if (altD.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.altD = altD;
    }

    public String getAltE() {
        return altE;
    }

    public void setAltE(String altE) throws BusinessException {
        if (altE.isEmpty()) {
            throw new BusinessException("exception.invalid.questao.data");
        }
        this.altE = altE;
    }

    public Boolean isCorrectAlternativa(Integer resposta) {
        return this.resposta == resposta;
    }

    public String getAlternativaCorreta() {
        List<String> alternativas = new ArrayList<String>();
        alternativas.add(altA);
        alternativas.add(altB);
        alternativas.add(altC);
        alternativas.add(altD);
        alternativas.add(altE);

        return alternativas.get(resposta - 1);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append(getId() + " - ");
        sb.append(getData());
        return sb.toString();
    }
}