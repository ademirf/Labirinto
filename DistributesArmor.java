
public class DistributesArmor {
	
	public static void InsertArmor() {
		
		Global.counter = 1;
		
		
		do {
			Global.minimum = 2;
			Global.maximum = 31;
			Random.RandomGenerator();
			Global.number = (int) Global.numberRandom;
			
			if (Global.counter < 2) {
				Global.armor = "couro";
			}
			else if (Global.counter > 1 && Global.counter < 3) {
				Global.armor = "metal";
			}
			else if (Global.counter > 2 && Global.counter < 4) {
				Global.armor = "mithrill";
			}
			InsertInRoom();
				
		} while (Global.counter < 4);
	}
	
public static void InsertInRoom() {
		
		switch (Global.number) {
		
			case 2:
				if (Room.room02.armor.equals("null")) {
					Room.room02.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 3:
				if (Room.room03.armor.equals("null")) {
					Room.room03.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 4:
				if (Room.room04.armor.equals("null")) {
					Room.room04.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 5:
				if (Room.room05.armor.equals("null")) {
					Room.room05.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 6:
				if (Room.room06.armor.equals("null")) {
					Room.room06.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 7:
				if (Room.room07.armor.equals("null")) {
					Room.room07.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 8:
				if (Room.room08.armor.equals("null")) {
					Room.room08.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}	
				
			case 9:
				if (Room.room09.armor.equals("null")) {
					Room.room10.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 10:
				if (Room.room10.armor.equals("null")) {
					Room.room10.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 11:
				if (Room.room11.armor.equals("null")) {
					Room.room11.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 12:
				if (Room.room12.armor.equals("null")) {
					Room.room12.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 13:
				if (Room.room13.armor.equals("null")) {
					Room.room13.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 14:
				if (Room.room14.armor.equals("null")) {
					Room.room14.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 15:
				if (Room.room15.armor.equals("null")) {
					Room.room15.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 16:
				if (Room.room16.armor.equals("null")) {
					Room.room16.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 17:
				if (Room.room17.armor.equals("null")) {
					Room.room17.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 18:
				if (Room.room18.armor.equals("null")) {
					Room.room18.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 19:
				if (Room.room19.armor.equals("null")) {
					Room.room19.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 20:
				if (Room.room20.armor.equals("null")) {
					Room.room20.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 21:
				if (Room.room21.armor.equals("null")) {
					Room.room21.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 22:
				if (Room.room22.armor.equals("null")) {
					Room.room22.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 23:
				if (Room.room23.armor.equals("null")) {
					Room.room23.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 24:
				if (Room.room24.armor.equals("null")) {
					Room.room24.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 25:
				if (Room.room25.armor.equals("null")) {
					Room.room25.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 26:
				if (Room.room26.armor.equals("null")) {
					Room.room26.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 27:
				if (Room.room27.armor.equals("null")) {
					Room.room27.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 28:
				if (Room.room28.armor.equals("null")) {
					Room.room28.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 29:
				if (Room.room29.armor.equals("null")) {
					Room.room29.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 30:
				if (Room.room30.armor.equals("null")) {
					Room.room30.armor = Global.armor;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 31:
				if (Room.room31.armor.equals("null")) {
					Room.room31.armor = Global.armor;
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
