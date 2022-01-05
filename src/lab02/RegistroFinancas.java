package lab02;

/**
* A classe registra as finan�as de um aluno.
* As finan�as s�o registradas com base na receita que o aluno recebe,
* quais fontes s�o essas receita e suas despesas. Podemos ver tamb�m 
* qual � valor total das suas receitas e o saldo da receita ap�s as despesas.
* 
* @author Karen Anne Aciole Alves - 119210934
*/

public class RegistroFinancas {
	
	/**
	* Consiste em pegar os valores recebidos e atualiza conforme
	* for recebendo as receitas e despesas. 
	*/
	private int receitaAtual;
	
	/**
	* Soma todas as receitas recebidas pelo aluno. 
	*/
	private int receitaTotal; 
	
	/**
	* Array criado para armazernar as receitas conforme sua fonte.
	* Fonte 1: fam�lia, fonte 2: projetos institucionais com bolsa,
	* fonte 3: aux�lio institucional, fonte 4: doa��es externas.
	*/
	private int[] valoresFontes = new int[4]; 
	
	/**
	* Constr�i o registro de finan�as. Todo o registro inicia
	* com uma receita do tipo 1 (fam�lia). O valor recebido no
	* par�metro � adicionado aos atributos de receitaAtual e 
	* receitaTotal, como tamb�m � posi��o da fonte 1. 
	* @param receitaInicialDoTipo1 � o valor inicial do construtor
	*/	
	
	public RegistroFinancas(int receitaInicialDoTipo1){
		this.receitaAtual = receitaInicialDoTipo1;
		this.receitaTotal = receitaInicialDoTipo1;
		this.valoresFontes[0] += receitaInicialDoTipo1;
	}
	
	/**
	* O m�todo consiste em pegar os valores recebidos da
	* receita e som�-los. A receita � armazenada no Array 
	* e sua posi��o � com base no tipo da fonte. 
	* @param valorCentavos � o valor da receita
	* @param tipoFonte � o n�mero que identifica de qual fonte
	* recebeu a receita
	*/
	
	public void aumentaReceita(int valorCentavos, int tipoFonte) { 
		this.receitaAtual += valorCentavos;	
		this.receitaTotal += valorCentavos;
		this.valoresFontes[tipoFonte-1] += valorCentavos;
	}
	
	/**
	* Pega os valores que o aluno teve como despesa.
	* O valor da despesa � subtra�do da receitaAtual. 
	* @param valorCentavos � o valor da despesa
	*/
	public void pagaDespesa(int valorCentavos) {
		this.receitaAtual -= valorCentavos;
	}
	
	/**
	* Tem como funcionalidade informar quanto foi recebido
	* de cada fonte, sem mostrar os gastos. Seguindo o formato 
	* "Tipo da fonte - valores".
	* @return o hist�rico dos ganhos, seus valores s�o mostrados
	* sepadaramente por fonte
	*/
	public String exibeFontes() {
		String exibe = "";
		for (int i = 0; i < valoresFontes.length; i++) {
			if (i == valoresFontes.length-1) {
				exibe += i+1 + " " + "-" + " " + valoresFontes[i];
			}else {
				exibe += i+1 + " " + "-"+ " " + valoresFontes[i] + "\n";
			}
		}
		return exibe;
	}
	/**
	* Retorna a String com o registro das finan�as. Seguindo
	* o formato "Receita total: SSS, Receita atual: YYY, Despesas totais: ZZZ.
	* @return a representa��o em String do registro das finan�as 
	*/	
	@Override 
	public String toString() {
		return "Receita total: " + this.receitaTotal + "," + " " + "Receita atual: " + this.receitaAtual + "," + " " + "Despesas totais: " + (receitaTotal - receitaAtual);
	}
}
