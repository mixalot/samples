public class HelloSolarSystem{

	static String[] planets = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto (a dwarf planet)"};
	static String[] moons = {"Moon","Titan","Europa"};
	static String[]	stars = {"Sun"};

	public static void  main(String args[]){

		if (args.length != 1){
			System.out.println("No or wrong parameters passed. One of these is expected: Palnets, Moons or Stars.");
		}
		else{
			if (args[0] != null){
				if (args[0].equals("Planets")){
		                        for (int i=0; i< planets.length; i++){
                		                System.out.println(i+1+" "+ planets[i]);
		                        }
				}
                                if (args[0].equals("Moons")){
                                        for (int i=0; i< moons.length; i++){
                                                System.out.println(i+1+" "+ moons[i]);
                                        }
                                }
                                if (args[0].equals("Stars")){
                                        for (int i=0; i< stars.length; i++){
                                                System.out.println(i+1+" "+ stars[i]);
                                        }
                                }
			}
		}
	}
}
