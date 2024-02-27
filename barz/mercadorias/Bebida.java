package bar;

public class Bebida extends Produto{
	private String marca;
	private float volume;
	private boolean alcoolica;
	
	public Bebida(String nome,double preco,int codigo, String marca,float volume,boolean alcoolica) {
		super(nome, preco, codigo);
		this.volume = volume;
		this.alcoolica= alcoolica;
		this.marca = marca;	
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public float getVolume() {
		return volume;
	}
	public void setVolume(float volume) {
		this.volume = volume;
	}
	public boolean getAlcoolica() {
		return alcoolica;
	}
	public void setAlcoolica(boolean alcoolica) {
		this.alcoolica = alcoolica;
		
	
	}
	
}
