package day15.com.ict.edu4;

public class Zerg implements Unit{
	private String name;
	private int energy;
	private boolean fly;
	
	public Zerg() {	}

	public Zerg(String name, int energy, boolean fly) {
		super();
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	
	@Override
	public void decEnergy() {
		energy -= 15;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	
	
	
	
	
	
}
