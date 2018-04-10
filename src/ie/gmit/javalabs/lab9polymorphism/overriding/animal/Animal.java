package ie.gmit.javalabs.lab9polymorphism.overriding.animal;

public class Animal {

	private boolean moving;

	public void setMoving(boolean moving) {
		this.moving = moving;
	}
	
	public boolean getMoving() {
		return moving;
	}
	
	public void speak() {
		System.out.println("Animal is making a sound");
	}

}