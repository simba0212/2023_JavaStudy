package day15.com.ict.edu4;

public class Main {
	public static void main(String[] args) {
		Terran terran = new Terran();
		terran.setName("마린");
		terran.setFly(false);
		terran.setEnergy(40);

		Protoss protoss = new Protoss("질럿", 80, false);
		Zerg zerg = new Zerg("뮤탈", 120, true);

		terran.decEnergy();
		zerg.decEnergy();
		protoss.decEnergy();

		System.out.println(terran.getName() + " 에너지 : " + terran.getEnergy());
		System.out.println(protoss.getName() + " 에너지 : " + protoss.getEnergy());
		System.out.println(zerg.getName() + " 에너지 : " + zerg.getEnergy());

		terran.decEnergy();
		terran.decEnergy();
		System.out.println("=================================================");
		System.out.println(terran.getName() + " 에너지 : " + terran.getEnergy());
		System.out.println(protoss.getName() + " 에너지 : " + protoss.getEnergy());
		System.out.println(zerg.getName() + " 에너지 : " + zerg.getEnergy());
	}

}
