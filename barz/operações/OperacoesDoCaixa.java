package bar;

public interface OperacoesDoCaixa {
	
	public double pagarConta(double valor, double total);
	public double somarConta();
	public void removerProduto(Produto produto);
	public void incluirProduto(Produto produto);
	
	

}
