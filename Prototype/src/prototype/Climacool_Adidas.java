package prototype;

public class Climacool_Adidas extends AdidasPrototype{
	protected Climacool_Adidas (Climacool_Adidas tenis) {
		this.tamanho = 41;
		this.valorVenda = tenis.getValorVenda();
	}
	
	public Climacool_Adidas() {
		
	}
	public String tenisInfo() {
		System.out.println("TÊNIS CLIMACOOL tamanho " + this.tamanho + " no valor de " + getValorVenda()+ " Reais.");
		return null;
	}
	public AdidasPrototype clone() {
		return new Climacool_Adidas(this);
	}
}
