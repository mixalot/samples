public class HelloSolarSystem{

	static String[] astronomicalBodies = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto (a dwarf planet)","Moon (a satellite)","Sun (a star)"};

	public static void  main(String args[]){
		for (int i=0; i< astronomicalBodies.length; i++){
			System.out.println(i+1+" "+ astronomicalBodies[i]);
		}
	}
}
