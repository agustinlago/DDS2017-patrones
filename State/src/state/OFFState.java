package state;

public class OFFState implements State {

	@Override
	public void handle() {
		System.out.println("En STAND BY, entonces s�lo responde a la acci�n 'encender'");
	}

}