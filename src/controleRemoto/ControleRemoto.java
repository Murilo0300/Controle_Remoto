package controleRemoto;

public class ControleRemoto {
	public int volume; 
	public boolean ligado;
	public boolean tocando;
	
	//metodos especias
	public void controleRemoto() {
		volume = 50;
		ligado = false;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean getLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public boolean getTocando() {
		return tocando;
	}

	public void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	

}
