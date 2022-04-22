package prototype;

public class Tenis {

	public static void main(String[] args) {
		AirMax_Nike airMax_Nike = new AirMax_Nike();
		NikePrototype airMaxNovo = airMax_Nike.clone();
		airMaxNovo.setValorVenda(489);
		airMaxNovo.tenisInfo();
		
		Climacool_Adidas climacool_Adidas = new Climacool_Adidas();
		AdidasPrototype climaCoolNovo = climacool_Adidas.clone();
		climaCoolNovo.setValorVenda(350.90);
		climaCoolNovo.tenisInfo();
		
		SmashV3_Puma smashV3_Puma = new SmashV3_Puma();
		PumaPrototype smachV3Novo = smashV3_Puma.clone();
		smachV3Novo.setValorVenda(587.89);
		smachV3Novo.tenisInfo();
	}
}
