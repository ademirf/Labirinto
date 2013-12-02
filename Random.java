
public class Random {
	
	public static void RandomGenerator() {

		Global.range = Global.maximum - Global.minimum;
		
		Global.numberRandom = Math.random();
		
		Global.numberRandom = Math.round(Global.minimum + Global.numberRandom * Global.range);
		
	}

}
