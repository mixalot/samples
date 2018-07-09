public class HelloSolarSystem{

	static String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto (a dwarf planet)"};

	public static void  main(String args[]){
		for (int i=0; i<planets.length; i++){
			System.out.println(i+1+" "+planets[i]);
		}
	}
}
