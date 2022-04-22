package prototype;

public abstract class PumaPrototype {
	protected double valorVenda;
	protected int tamanho;
	public double getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	public abstract String tenisInfo();
	public abstract PumaPrototype clone();
}

