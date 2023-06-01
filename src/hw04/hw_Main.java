package hw04;

public class hw_Main {
	public static void main(String[] args) {
		hw_Tv hw_Tv = new hw_Tv();
		hw_Speaker hw_Speaker = new hw_Speaker();
		hw_Ear ear = new hw_Ear();
		
		System.out.println(ear.getVol());
		ear.volDown();
		ear.volDown();
		System.out.println(ear.getVol());
		ear.volDown();
		ear.volDown();
		ear.volDown();
		System.out.println(ear.getVol());
		ear.volDown();
		ear.volDown();
		ear.volDown();
		System.out.println(ear.getVol());
		
		
	}
}
