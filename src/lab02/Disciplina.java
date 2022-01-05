package lab02;

import java.util.Arrays;

/**
* A classe representa o registro de um aluno em uma determinada disciplina. 
* Toda disciplina possui um nome, as horas de estudo nessa disciplina, as notas, 
* a m�dia final e tamb�m se o aluno foi aprovado ou n�o.  
* 
* @author Karen Anne Aciole Alves - 119210934
*/

public class Disciplina {
	
	/**
	* Nome da disciplina no formato String
	*/
	private String nomeDisciplina; 
	
	/**
	* Representa as notas de um aluno em formato de Array de tipo double. 
	* Toda disciplina possui 4 notas, dessa forma o Array tem tamanho 4. 
	* Cada nota � armazenada em uma posi��o do array com base em qual nota foi cadatrada (1, 2, 3 ou 4).
	*/
	private double[] notas = new double[4];
	
	/**
	* Tempo em horas dedicado ao estudo na disciplina no tipo inteiro.
	* As horas s�o acumulativas.
	*/
	private int horas; 
	
	/**
	* Armazena o c�lculo da m�dia das 4 notas no tipo double.
	*/
	private double mediaNota;
	
	/**
	* Constru��o da disciplina que recebe seu nome. 
	*@param nomeDisciplina � o nome da disciplina
	*/
	public Disciplina(String nomeDisciplina){ 
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* Cadastra a quantidade de horas de estudos nessa disciplina.
	* O m�todo � acumulativo, dessa forma, pode ser utilizado quantas vezes quiser.
	* @param horas recebe as horas de estudos gastos na disciplina
	*/	
	public void cadastraHoras(int horas) {
		this.horas += horas; 		
	}
	
	/**
	* Cadastra as notas do aluno no Array. Quanto o aluno tirou � 
	* armazenado na posi��o com base na nota que ele escolheu (1, 2, 3 ou 4). 
	* Caso o aluno cadastre mais de uma vez uma nota na mesma posi��o, a nota
	* � alterada para a nota que ele inseriu por �ltimo. Caso o aluno n�o cadastre
	* uma das notas, o valor dela ser� 0. 
	* @param nota deve receber um valor em inteiro entre 1 e 4
	* @param valorNota � a nota que o aluno tirou na disciplina em double
	*/
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota-1] = valorNota; 
	}
	
	/**
	* Esse m�todo tem como finalidade calcular a m�dia das 4 notas. 
	* Feito um la�o para somar as 4 notas. Ap�s isso, o somat�rio das
	* notas � dividido pelo tamanho do Array que � 4.
	* @return A m�dia das notas. 
	*/	
	private double calculaMedia() {	
		double soma = 0; 
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i]; 
		}
		this.mediaNota = soma / notas.length;
		return this.mediaNota;
	}
	 
	/**
	* Faz a verifica��o com base na m�dia final, afim de
	* verificar se o aluno foi aprovado na disciplina.
	* Se a m�dia final for maior ou igual a 7, aluno � aprovado. 
	* @return um valor booleano se o aluno for aprovado ou n�o. 
	*/	
	public boolean aprovado() {
		if (calculaMedia() >= 7.0) {
			return true;
		}else{
			return false;
		}
	}
	
	/**
	* Retorna a String com o cadastro do aluno na Disciplina. Seguindo
	* o formato "Nome da disciplina - Quantidade de horas de estudo na disciplina 
	* - M�dia final na disciplina - Notas na disciplina".
	* @return a representa��o em String da disciplina
	*/	
	@Override
	public String toString() {
		return nomeDisciplina + " " + horas + " " + this.mediaNota +  " " + Arrays.toString(notas); 
	}	
}



