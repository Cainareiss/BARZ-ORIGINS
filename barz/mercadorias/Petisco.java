package bar;

public class Petisco extends Produto{
	private int porcao;
	private String tipo;
	private boolean lactose; 
	
	public Petisco(String nome,double preco,int codigo, int porcao,String tipo,boolean lactose) {
		super(nome, preco, codigo);
		this.porcao = porcao;
		this.tipo= tipo;
		this.lactose = lactose;	
	}
	public int getPorcao() {
		return porcao;
	}
	public void setPorcao(int porcao) {
		this.porcao = porcao;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isLactose() {
		return lactose;
	}
	public void setLactose(boolean lactose) {
		this.lactose = lactose;
	}
}
