package lab02;

/**
* A classe registra as finanças de um aluno.
* As finanças são registradas com base na receita que o aluno recebe,
* quais fontes são essas receita e suas despesas. Podemos ver também 
* qual é valor total das suas receitas e o saldo da receita após as despesas.
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
	* Fonte 1: família, fonte 2: projetos institucionais com bolsa,
	* fonte 3: auxílio institucional, fonte 4: doações externas.
	*/
	private int[] valoresFontes = new int[4]; 
	
	/**
	* Constrói o registro de finanças. Todo o registro inicia
	* com uma receita do tipo 1 (família). O valor recebido no
	* parâmetro é adicionado aos atributos de receitaAtual e 
	* receitaTotal, como também à posição da fonte 1. 
	* @param receitaInicialDoTipo1 é o valor inicial do construtor
	*/	
	
	public RegistroFinancas(int receitaInicialDoTipo1){
		this.receitaAtual = receitaInicialDoTipo1;
		this.receitaTotal = receitaInicialDoTipo1;
		this.valoresFontes[0] += receitaInicialDoTipo1;
	}
	
	/**
	* O método consiste em pegar os valores recebidos da
	* receita e somá-los. A receita é armazenada no Array 
	* e sua posição é com base no tipo da fonte. 
	* @param valorCentavos é o valor da receita
	* @param tipoFonte é o número que identifica de qual fonte
	* recebeu a receita
	*/
	
	public void aumentaReceita(int valorCentavos, int tipoFonte) { 
		this.receitaAtual += valorCentavos;	
		this.receitaTotal += valorCentavos;
		this.valoresFontes[tipoFonte-1] += valorCentavos;
	}
	
	/**
	* Pega os valores que o aluno teve como despesa.
	* O valor da despesa é subtraído da receitaAtual. 
	* @param valorCentavos é o valor da despesa
	*/
	public void pagaDespesa(int valorCentavos) {
		this.receitaAtual -= valorCentavos;
	}
	
	/**
	* Tem como funcionalidade informar quanto foi recebido
	* de cada fonte, sem mostrar os gastos. Seguindo o formato 
	* "Tipo da fonte - valores".
	* @return o histórico dos ganhos, seus valores são mostrados
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
	* Retorna a String com o registro das finanças. Seguindo
	* o formato "Receita total: SSS, Receita atual: YYY, Despesas totais: ZZZ.
	* @return a representação em String do registro das finanças 
	*/	
	@Override 
	public String toString() {
		return "Receita total: " + this.receitaTotal + "," + " " + "Receita atual: " + this.receitaAtual + "," + " " + "Despesas totais: " + (receitaTotal - receitaAtual);
	}
}
