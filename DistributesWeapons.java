
public class DistributesWeapons {
	
	public static void InsertWeapon() {
		
		Global.counter = 1;
		
		do {
			Global.minimum = 2;
			Global.maximum = 31;
			Random.RandomGenerator();
			Global.number = (int) Global.numberRandom;
			
			if (Global.counter < 9) {
				Global.weapon = "faca";
			}
			else if (Global.counter > 8 && Global.counter < 13) {
				Global.weapon = "adaga";
			}
			else if (Global.counter > 12 && Global.counter < 14) {
				Global.weapon = "espada";
			}
			InsertInRoom();
				
		} while (Global.counter < 14);
	}
	
	public static void InsertInRoom() {
		
		switch (Global.number) {
		
			case 2:
				if (Room.room02.weapon.equals("null")) {
					Room.room02.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 3:
				if (Room.room03.weapon.equals("null")) {
					Room.room03.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 4:
				if (Room.room04.weapon.equals("null")) {
					Room.room04.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 5:
				if (Room.room05.weapon.equals("null")) {
					Room.room05.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 6:
				if (Room.room06.weapon.equals("null")) {
					Room.room06.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 7:
				if (Room.room07.weapon.equals("null")) {
					Room.room07.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 8:
				if (Room.room08.weapon.equals("null")) {
					Room.room08.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}	
				
			case 9:
				if (Room.room09.weapon.equals("null")) {
					Room.room09.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 10:
				if (Room.room10.weapon.equals("null")) {
					Room.room10.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 11:
				if (Room.room11.weapon.equals("null")) {
					Room.room11.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 12:
				if (Room.room12.weapon.equals("null")) {
					Room.room12.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 13:
				if (Room.room13.weapon.equals("null")) {
					Room.room13.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 14:
				if (Room.room14.weapon.equals("null")) {
					Room.room14.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 15:
				if (Room.room15.weapon.equals("null")) {
					Room.room15.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 16:
				if (Room.room16.weapon.equals("null")) {
					Room.room16.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 17:
				if (Room.room17.weapon.equals("null")) {
					Room.room17.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 18:
				if (Room.room18.weapon.equals("null")) {
					Room.room18.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 19:
				if (Room.room19.weapon.equals("null")) {
					Room.room19.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 20:
				if (Room.room20.weapon.equals("null")) {
					Room.room20.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 21:
				if (Room.room21.weapon.equals("null")) {
					Room.room21.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 22:
				if (Room.room22.weapon.equals("null")) {
					Room.room22.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 23:
				if (Room.room23.weapon.equals("null")) {
					Room.room23.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 24:
				if (Room.room24.weapon.equals("null")) {
					Room.room24.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 25:
				if (Room.room25.weapon.equals("null")) {
					Room.room25.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 26:
				if (Room.room26.weapon.equals("null")) {
					Room.room26.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 27:
				if (Room.room27.weapon.equals("null")) {
					Room.room27.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 28:
				if (Room.room28.weapon.equals("null")) {
					Room.room28.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 29:
				if (Room.room29.weapon.equals("null")) {
					Room.room29.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 30:
				if (Room.room30.weapon.equals("null")) {
					Room.room30.weapon = Global.weapon;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 31:
				if (Room.room31.weapon.equals("null")) {
					Room.room31.weapon = Global.weapon;
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
