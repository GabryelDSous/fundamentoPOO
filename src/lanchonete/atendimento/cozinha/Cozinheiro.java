package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

public class Cozinheiro {
	// Pode ser default
	public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCAO");
	}
	// Pode ser default
	public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANDO SUCO NO BALCAO");
	}
	// Pode ser default
	public void adicionarComboNoBalcao() {
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
	}
	private void prepararVitamina() {
		System.out.println("PREPARANDO SUCO");
	}
	private void prepararCombo() {
		prepararLanche();
		prepararVitamina();
	}
	public void selecionarIngredientesLanche() {
		System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
	}
	private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
	}
	private void lavarIngredientes() {
		System.out.println("LAVANDO INGREDIENTES");
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR");
	}
	public void fritarIngredientesLanches() {
		System.out.println("FRITANDO A CARNE E OVO PARA HAMBURGER");
	}
	void pedirParaTrocarGas(Atendente meuAmigo) {
		meuAmigo.trocarGas();
	}
	void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	public void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();
	}
}
