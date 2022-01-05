package lab02;

/**
* Classe responsável por verificar a saúde geral do aluno
* com base na sua saúde mental e saúde física.
* 
* @author Karen Anne Aciole Alves - 119210934
*/

public class Saude {
	
	/**
	* Armazena o estado da saúde mental
	*/
	private String saudeMental;
	
	/**
	* Armazena o estado da saúde física
	*/
	private String saudeFisica;
	
	
	/**
	* O construtor inicia por padrão com os estados das
	* saúdes como "boa".
	*/
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa"; 
	}
	
	/**
	* Define a saúde mental, podendo ser "boa" e "fraca" 
	* @param valor é uma String que deve ser "boa" ou "fraca"
	*/
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	* Define a saúde física, podendo ser "boa" e "fraca" 
	* @param valor é uma String que deve ser "boa" ou "fraca"
	*/
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	* Faz o retorno do estado geral da saúde do aluno. Se as duas saúdes (física e mental)
	* estiverem boas, a saúde geral é "boa". Se ambas estiverem fracas, a saúde geral é "fraca".
	* Caso uma esteja fraca e outra boa, o status geral é "ok".
	* @return uma String com a saúde geral, onde ela pode ser: "boa", "fraca" ou "ok". 
	*/
	public String getStatusGeral() {
		
		if (this.saudeMental == this.saudeFisica) {
			return this.saudeMental;
		}else {
			return "ok";
		}
		
	}
}
