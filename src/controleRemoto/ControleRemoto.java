package controleRemoto;

public class ControleRemoto implements Controlador {
	public int volume; 
	public boolean ligado;
	public boolean tocando;
	
	//metodos especias
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
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
	
	//metodos implementados

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado() == true) {
			System.out.println("------- MENU --------");
			System.out.println("Está ligado " + this.getLigado());
			System.out.println("Está tocando " + this.getTocando());
			System.out.print("Volume: " + this.getVolume());
			for (int i = 0; i <= this.getVolume(); i +=10) {
				System.out.print("|");
			}
		}else {
			System.out.println("controle desligado! ");
			}
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		System.out.println("Fechando o menu ");
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()+5);
			
		}
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			this.setVolume(this.getVolume()-5);
		}
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
		
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if (this.getLigado() && !(this.getTocando())) {
			this.setTocando(true);
		}
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.getLigado() && this.getLigado() )
			this.setTocando(false);
		
	}
 	

}
