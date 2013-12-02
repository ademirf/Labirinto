
public class DistributesKeys {
	
	public static void InsertKeys() {
		
		Global.counter = 1;
		
		do {
			Global.minimum = 1;
			Global.maximum = 26;
			Random.RandomGenerator();
			Global.number = (int) Global.numberRandom;
			
			if (Global.counter < 7) {
				Global.key = "amarela";;
			}
			else if (Global.counter > 6 && Global.counter < 13) {
				Global.key = "azul";
			}
			else if (Global.counter > 12 && Global.counter < 19) {
				Global.key = "verde";
			}
			else if (Global.counter > 18 && Global.counter < 25) {
				Global.key = "vermelho";
			}
			InsertInRoom();
				
		} while (Global.counter < 25);
	}	

	public static void InsertInRoom() {
		
		switch (Global.number) {
		
			case 2:
				if (Room.room02.key.equals("null")) {
					Room.room02.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 3:
				if (Room.room03.key.equals("null")) {
					Room.room03.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 4:
				if (Room.room04.key.equals("null")) {
					Room.room04.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 5:
				if (Room.room05.key.equals("null")) {
					Room.room05.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 6:
				if (Room.room06.key.equals("null")) {
					Room.room06.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 7:
				if (Room.room07.key.equals("null")) {
					Room.room07.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 8:
				if (Room.room08.key.equals("null")) {
					Room.room08.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}	
				
			case 9:
				if (Room.room09.key.equals("null")) {
					Room.room09.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 10:
				if (Room.room10.key.equals("null")) {
					Room.room10.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 11:
				if (Room.room11.key.equals("null")) {
					Room.room11.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 12:
				if (Room.room12.key.equals("null")) {
					Room.room12.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 13:
				if (Room.room13.key.equals("null")) {
					Room.room13.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 14:
				if (Room.room14.key.equals("null")) {
					Room.room14.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 15:
				if (Room.room15.key.equals("null")) {
					Room.room15.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 16:
				if (Room.room16.key.equals("null")) {
					Room.room16.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 17:
				if (Room.room17.key.equals("null")) {
					Room.room17.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 18:
				if (Room.room18.key.equals("null")) {
					Room.room18.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 19:
				if (Room.room19.key.equals("null")) {
					Room.room19.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 20:
				if (Room.room20.key.equals("null")) {
					Room.room20.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 21:
				if (Room.room21.key.equals("null")) {
					Room.room21.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 22:
				if (Room.room22.key.equals("null")) {
					Room.room22.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 23:
				if (Room.room23.key.equals("null")) {
					Room.room23.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 24:
				if (Room.room24.key.equals("null")) {
					Room.room24.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 25:
				if (Room.room25.key.equals("null")) {
					Room.room25.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 26:
				if (Room.room26.key.equals("null")) {
					Room.room26.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 27:
				if (Room.room27.key.equals("null")) {
					Room.room27.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 28:
				if (Room.room28.key.equals("null")) {
					Room.room28.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 29:
				if (Room.room29.key.equals("null")) {
					Room.room29.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 30:
				if (Room.room30.key.equals("null")) {
					Room.room30.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 31:
				if (Room.room31.key.equals("null")) {
					Room.room31.key = Global.key;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			default:
				break;
		}
	}	
}
