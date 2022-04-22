package prototype;

public class SmashV3_Puma extends PumaPrototype{
	protected SmashV3_Puma (SmashV3_Puma tenis) {
		this.tamanho = 40;
		this.valorVenda = tenis.getValorVenda();
	}
	
	public SmashV3_Puma() {
		
	}
	public String tenisInfo() {
		System.out.println("TÊNIS SmachV3 tamanho " + this.tamanho + " no valor de " + getValorVenda()+ " Reais.");
		return null;
	}
	public PumaPrototype clone() {
		return new SmashV3_Puma(this);
	}
}
