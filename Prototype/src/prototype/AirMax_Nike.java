package prototype;

public class AirMax_Nike extends NikePrototype{
	protected AirMax_Nike (AirMax_Nike tenis) {
		this.tamanho = 45;
		this.valorVenda = tenis.getValorVenda();
	}
	
	public AirMax_Nike() {
		
	}
	public String tenisInfo() {
		System.out.println("TÊNIS AIR MAX tamanho " + this.tamanho + " no valor de " + getValorVenda()+ " Reais.");
		return null;
	}
	public NikePrototype clone() {
		return new AirMax_Nike(this);
	}

}
