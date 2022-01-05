package lab02;

/**
* Classe respons�vel por verificar a sa�de geral do aluno
* com base na sua sa�de mental e sa�de f�sica.
* 
* @author Karen Anne Aciole Alves - 119210934
*/

public class Saude {
	
	/**
	* Armazena o estado da sa�de mental
	*/
	private String saudeMental;
	
	/**
	* Armazena o estado da sa�de f�sica
	*/
	private String saudeFisica;
	
	
	/**
	* O construtor inicia por padr�o com os estados das
	* sa�des como "boa".
	*/
	public Saude() {
		this.saudeMental = "boa";
		this.saudeFisica = "boa"; 
	}
	
	/**
	* Define a sa�de mental, podendo ser "boa" e "fraca" 
	* @param valor � uma String que deve ser "boa" ou "fraca"
	*/
	public void defineSaudeMental(String valor) {
		this.saudeMental = valor;
	}
	
	/**
	* Define a sa�de f�sica, podendo ser "boa" e "fraca" 
	* @param valor � uma String que deve ser "boa" ou "fraca"
	*/
	public void defineSaudeFisica(String valor) {
		this.saudeFisica = valor;
	}
	
	/**
	* Faz o retorno do estado geral da sa�de do aluno. Se as duas sa�des (f�sica e mental)
	* estiverem boas, a sa�de geral � "boa". Se ambas estiverem fracas, a sa�de geral � "fraca".
	* Caso uma esteja fraca e outra boa, o status geral � "ok".
	* @return uma String com a sa�de geral, onde ela pode ser: "boa", "fraca" ou "ok". 
	*/
	public String getStatusGeral() {
		
		if (this.saudeMental == this.saudeFisica) {
			return this.saudeMental;
		}else {
			return "ok";
		}
		
	}
}
