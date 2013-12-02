
public class DistributesEnemies {
	
	public static void InsertEnimies() {
		
		Global.counter = 1;
		
		do {
			Global.minimum = 2;
			Global.maximum = 31;
			Random.RandomGenerator();
			Global.number = (int) Global.numberRandom;
			
			if (Global.counter < 16) {
				Global.enemy = "enemy1";
			}
			else if (Global.counter > 15 && Global.counter < 24) {
				Global.enemy = "enemy2";
			}
			else if (Global.counter > 23 && Global.counter < 28) {
				Global.enemy = "enemy3";
			}
			InsertInRoom();
				
		} while (Global.counter < 28);
	}
	
	
	public static void InsertInRoom() {
		
		switch (Global.number) {
		
			case 2:
				if (Room.room02.obstacle.equals("null")) {
					Room.room02.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 3:
				if (Room.room03.obstacle.equals("null")) {
					Room.room03.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 4:
				if (Room.room04.obstacle.equals("null")) {
					Room.room04.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 5:
				if (Room.room05.obstacle.equals("null")) {
					Room.room05.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 6:
				if (Room.room06.obstacle.equals("null")) {
					Room.room06.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 7:
				if (Room.room07.obstacle.equals("null")) {
					Room.room07.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 8:
				if (Room.room08.obstacle.equals("null")) {
					Room.room08.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}	
				
			case 9:
				if (Room.room09.obstacle.equals("null")) {
					Room.room09.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 10:
				if (Room.room10.obstacle.equals("null")) {
					Room.room10.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 11:
				if (Room.room11.obstacle.equals("null")) {
					Room.room11.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 12:
				if (Room.room12.obstacle.equals("null")) {
					Room.room12.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 13:
				if (Room.room13.obstacle.equals("null")) {
					Room.room13.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 14:
				if (Room.room14.obstacle.equals("null")) {
					Room.room14.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 15:
				if (Room.room15.obstacle.equals("null")) {
					Room.room15.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 16:
				if (Room.room16.obstacle.equals("null")) {
					Room.room16.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 17:
				if (Room.room17.obstacle.equals("null")) {
					Room.room17.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 18:
				if (Room.room18.obstacle.equals("null")) {
					Room.room18.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 19:
				if (Room.room19.obstacle.equals("null")) {
					Room.room19.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 20:
				if (Room.room20.obstacle.equals("null")) {
					Room.room20.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 21:
				if (Room.room21.obstacle.equals("null")) {
					Room.room21.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 22:
				if (Room.room22.obstacle.equals("null")) {
					Room.room22.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 23:
				if (Room.room23.obstacle.equals("null")) {
					Room.room23.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 24:
				if (Room.room24.obstacle.equals("null")) {
					Room.room24.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 25:
				if (Room.room25.obstacle.equals("null")) {
					Room.room25.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 26:
				if (Room.room26.obstacle.equals("null")) {
					Room.room26.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 27:
				if (Room.room27.obstacle.equals("null")) {
					Room.room27.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 28:
				if (Room.room28.obstacle.equals("null")) {
					Room.room28.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 29:
				if (Room.room29.obstacle.equals("null")) {
					Room.room29.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 30:
				if (Room.room30.obstacle.equals("null")) {
					Room.room30.obstacle = Global.enemy;
					Global.counter++;
					break;
				}
				else {
					break;
				}
				
			case 31:
				if (Room.room31.obstacle.equals("null")) {
					Room.room31.obstacle = Global.enemy;
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
