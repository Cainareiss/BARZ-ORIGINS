package bar;

import java.util.ArrayList;
import java.util.List;

public class Compra implements OperacoesDoCaixa{
	private List<Produto> listaProdutos;
	private double total;
	private Cliente cliente;
	
	public Compra(Cliente cliente) {
		this.cliente = cliente;
		this.listaProdutos = new ArrayList<Produto>();
	}
	
	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}
	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	@Override
	public void removerProduto(Produto produto) {
		// TODO Auto-generated method stub
		for(Produto p : this.listaProdutos) {
			if(p.getCodigo()==produto.getCodigo()) {
				this.listaProdutos.remove(p);
			}
		}
	}

	@Override
	public void incluirProduto(Produto produto) {
		this.listaProdutos.add(produto);
		
	}

	@Override
	public double pagarConta(double valor, double total) {
		double troco = valor - total;
		return troco;
	}

	@Override
	public double somarConta() {
		double total = 0.0;
		for(int i =0; i<this.listaProdutos.size(); i++) {
			Produto produto = listaProdutos.get(i);
			total = total + produto.getPreco();
		}
		return total;
	}

	
	
 	
}
