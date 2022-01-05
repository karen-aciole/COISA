package lab02;

/**
* Registro do tempo online (em horas) que um aluno dedicou à uma determinada disciplina. 
* O registro é feito recebendo o nome da disciplina, o tempo que o aluno passou online, o 
* tempo online que espera-se que o aluno tenha reservado pra disciplina e se a meta de tempo 
* dele foi atingida. 
* 
* @author Karen Anne Aciole Alves - 119210934
*/

public class RegistroTempoOnline {
	/**
	* Nome da disciplina do tempo a ser contabilizado
	*/
	private String nomeDisciplina;
	
	/**
	* Tempo (mínimo) em horas que o aluno deve dedicar àquela disciplina. 
	*/
	private int tempoOnlineEsperado;
	
	/**
	* Armazena as horas que o aluno passou online.
	*/
	private int atingiuMeta;
	
	/**
	* Constrói o registro do tempo online na disciplina
	* @param nomeDisciplina é o nome da disciplina
	* @param tempoOnlineEsperado é o tempo que espera-se que o aluno
	* passe online dedicando à disciplina
	*/
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}

	/**
	* Soma as horas em que o aluno passou online na disciplina. Pode receber
	* os dados mais de uma vez.
	* @param tempo é o tempo em horas gastos na disciplina
	*/
	public void adicionaTempoOnline(int tempo) { 
		atingiuMeta += tempo; 
	}
	
	/**
	* Verifica se o aluno passou tempo suficiente estudando pra aquela disciplina, 
	* com base no tempo (mínimo) esperado.
	* @return um boolean se o aluno atingiu a meta ou não 
	*/
	public boolean atingiuMetaTempoOnline() {
		if (atingiuMeta >= tempoOnlineEsperado) {
			return true;
		}else {
			return false;
		}
	}
	/**
	* Retorna String com o tempo online do aluno. No formato "Nome da disciplina
	* Quantidade de horas dedicadas na disciplina / Quantidade de horas esperadas na disciplina
	* @return a representação em String do tempo online de um aluno em uma determinada disciplina
	*/
	@Override
	public String toString() {
		return nomeDisciplina + " " + atingiuMeta + "/" + tempoOnlineEsperado;
	}
}
