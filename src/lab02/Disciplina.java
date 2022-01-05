package lab02;

import java.util.Arrays;

/**
* A classe representa o registro de um aluno em uma determinada disciplina. 
* Toda disciplina possui um nome, as horas de estudo nessa disciplina, as notas, 
* a média final e também se o aluno foi aprovado ou não.  
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
	* Cada nota é armazenada em uma posição do array com base em qual nota foi cadatrada (1, 2, 3 ou 4).
	*/
	private double[] notas = new double[4];
	
	/**
	* Tempo em horas dedicado ao estudo na disciplina no tipo inteiro.
	* As horas são acumulativas.
	*/
	private int horas; 
	
	/**
	* Armazena o cálculo da média das 4 notas no tipo double.
	*/
	private double mediaNota;
	
	/**
	* Construção da disciplina que recebe seu nome. 
	*@param nomeDisciplina é o nome da disciplina
	*/
	public Disciplina(String nomeDisciplina){ 
		this.nomeDisciplina = nomeDisciplina;
	}
	
	/**
	* Cadastra a quantidade de horas de estudos nessa disciplina.
	* O método é acumulativo, dessa forma, pode ser utilizado quantas vezes quiser.
	* @param horas recebe as horas de estudos gastos na disciplina
	*/	
	public void cadastraHoras(int horas) {
		this.horas += horas; 		
	}
	
	/**
	* Cadastra as notas do aluno no Array. Quanto o aluno tirou é 
	* armazenado na posição com base na nota que ele escolheu (1, 2, 3 ou 4). 
	* Caso o aluno cadastre mais de uma vez uma nota na mesma posição, a nota
	* é alterada para a nota que ele inseriu por último. Caso o aluno não cadastre
	* uma das notas, o valor dela será 0. 
	* @param nota deve receber um valor em inteiro entre 1 e 4
	* @param valorNota é a nota que o aluno tirou na disciplina em double
	*/
	public void cadastraNota(int nota, double valorNota) {
		this.notas[nota-1] = valorNota; 
	}
	
	/**
	* Esse método tem como finalidade calcular a média das 4 notas. 
	* Feito um laço para somar as 4 notas. Após isso, o somatório das
	* notas é dividido pelo tamanho do Array que é 4.
	* @return A média das notas. 
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
	* Faz a verificação com base na média final, afim de
	* verificar se o aluno foi aprovado na disciplina.
	* Se a média final for maior ou igual a 7, aluno é aprovado. 
	* @return um valor booleano se o aluno for aprovado ou não. 
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
	* - Média final na disciplina - Notas na disciplina".
	* @return a representação em String da disciplina
	*/	
	@Override
	public String toString() {
		return nomeDisciplina + " " + horas + " " + this.mediaNota +  " " + Arrays.toString(notas); 
	}	
}



