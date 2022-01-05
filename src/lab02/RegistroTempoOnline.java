package lab02;

/**
* Registro do tempo online (em horas) que um aluno dedicou � uma determinada disciplina. 
* O registro � feito recebendo o nome da disciplina, o tempo que o aluno passou online, o 
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
	* Tempo (m�nimo) em horas que o aluno deve dedicar �quela disciplina. 
	*/
	private int tempoOnlineEsperado;
	
	/**
	* Armazena as horas que o aluno passou online.
	*/
	private int atingiuMeta;
	
	/**
	* Constr�i o registro do tempo online na disciplina
	* @param nomeDisciplina � o nome da disciplina
	* @param tempoOnlineEsperado � o tempo que espera-se que o aluno
	* passe online dedicando � disciplina
	*/
	public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
		this.nomeDisciplina = nomeDisciplina;
		this.tempoOnlineEsperado = tempoOnlineEsperado;
	}

	/**
	* Soma as horas em que o aluno passou online na disciplina. Pode receber
	* os dados mais de uma vez.
	* @param tempo � o tempo em horas gastos na disciplina
	*/
	public void adicionaTempoOnline(int tempo) { 
		atingiuMeta += tempo; 
	}
	
	/**
	* Verifica se o aluno passou tempo suficiente estudando pra aquela disciplina, 
	* com base no tempo (m�nimo) esperado.
	* @return um boolean se o aluno atingiu a meta ou n�o 
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
	* @return a representa��o em String do tempo online de um aluno em uma determinada disciplina
	*/
	@Override
	public String toString() {
		return nomeDisciplina + " " + atingiuMeta + "/" + tempoOnlineEsperado;
	}
}
