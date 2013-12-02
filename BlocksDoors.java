
public class BlocksDoors {
	
	public static void SelectDoor() {
		
		Global.counter = 1;
		
		do {
			Global.minimum = 6;
			Global.maximum = 31;
			Random.RandomGenerator();
			Global.number = (int) Global.numberRandom;
			
			if (Global.counter < 10) {
				Global.door = "amarela";
			}
			else if (Global.counter > 9 && Global.counter < 19) {
				Global.door = "azul";
			}
			else if (Global.counter > 18 && Global.counter < 29) {
				Global.door = "verde";
			}
			else if (Global.counter > 28 && Global.counter < 39) {
				Global.door = "vermelho";
			}
			SelectRoom();
				
		} while (Global.counter < 39);
		
	}
	
	
	public static void SelectRoom() {
		
		switch (Global.number) {
		
			case 2:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room02.north.equals("marrom")) {
							Room.room02.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room02.south.equals("marrom")) {
							Room.room02.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room02.east.equals("marrom")) {
							Room.room02.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room02.west.equals("marrom")) {
							Room.room02.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
			
			case 3:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room03.north.equals("marrom")) {
							Room.room03.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room03.south.equals("marrom")) {
							Room.room03.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room03.east.equals("marrom")) {
							Room.room03.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room03.west.equals("marrom")) {
							Room.room03.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 4:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room04.north.equals("marrom")) {
							Room.room04.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room04.south.equals("marrom")) {
							Room.room04.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room04.east.equals("marrom")) {
							Room.room04.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room04.west.equals("marrom")) {
							Room.room04.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 5:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room05.north.equals("marrom")) {
							Room.room05.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room05.south.equals("marrom")) {
							Room.room05.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room05.east.equals("marrom")) {
							Room.room05.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room05.west.equals("marrom")) {
							Room.room05.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 6:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room06.north.equals("marrom")) {
							Room.room06.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room06.south.equals("marrom")) {
							Room.room06.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room06.east.equals("marrom")) {
							Room.room06.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room06.west.equals("marrom")) {
							Room.room06.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 7:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room07.north.equals("marrom")) {
							Room.room07.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room07.south.equals("marrom")) {
							Room.room07.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room07.east.equals("marrom")) {
							Room.room07.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room07.west.equals("marrom")) {
							Room.room07.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 8:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room08.north.equals("marrom")) {
							Room.room08.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room08.south.equals("marrom")) {
							Room.room08.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room08.east.equals("marrom")) {
							Room.room08.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room08.west.equals("marrom")) {
							Room.room08.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 9:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room09.north.equals("marrom")) {
							Room.room09.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room09.south.equals("marrom")) {
							Room.room09.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room09.east.equals("marrom")) {
							Room.room09.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room09.west.equals("marrom")) {
							Room.room09.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 10:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room10.north.equals("marrom")) {
							Room.room10.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room10.south.equals("marrom")) {
							Room.room10.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room10.east.equals("marrom")) {
							Room.room10.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room10.west.equals("marrom")) {
							Room.room10.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 11:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room11.north.equals("marrom")) {
							Room.room11.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room11.south.equals("marrom")) {
							Room.room11.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room11.east.equals("marrom")) {
							Room.room11.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room11.west.equals("marrom")) {
							Room.room11.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 12:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room12.north.equals("marrom")) {
							Room.room12.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room12.south.equals("marrom")) {
							Room.room12.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room12.east.equals("marrom")) {
							Room.room12.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room12.west.equals("marrom")) {
							Room.room12.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 13:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room13.north.equals("marrom")) {
							Room.room13.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room13.south.equals("marrom")) {
							Room.room13.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room13.east.equals("marrom")) {
							Room.room13.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room13.west.equals("marrom")) {
							Room.room13.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 14:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room14.north.equals("marrom")) {
							Room.room14.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room14.south.equals("marrom")) {
							Room.room14.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room14.east.equals("marrom")) {
							Room.room14.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room14.west.equals("marrom")) {
							Room.room14.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 15:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room15.north.equals("marrom")) {
							Room.room15.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room15.south.equals("marrom")) {
							Room.room15.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room15.east.equals("marrom")) {
							Room.room15.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room15.west.equals("marrom")) {
							Room.room15.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 16:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room16.north.equals("marrom")) {
							Room.room16.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room16.south.equals("marrom")) {
							Room.room16.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room16.east.equals("marrom")) {
							Room.room16.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room16.west.equals("marrom")) {
							Room.room16.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 17:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room17.north.equals("marrom")) {
							Room.room17.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room17.south.equals("marrom")) {
							Room.room17.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room17.east.equals("marrom")) {
							Room.room17.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room17.west.equals("marrom")) {
							Room.room17.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 18:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room18.north.equals("marrom")) {
							Room.room18.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room18.south.equals("marrom")) {
							Room.room18.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room18.east.equals("marrom")) {
							Room.room18.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room18.west.equals("marrom")) {
							Room.room18.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
			
			case 19:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room19.north.equals("marrom")) {
							Room.room19.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room19.south.equals("marrom")) {
							Room.room19.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room19.east.equals("marrom")) {
							Room.room19.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room19.west.equals("marrom")) {
							Room.room19.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 20:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room20.north.equals("marrom")) {
							Room.room20.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room20.south.equals("marrom")) {
							Room.room20.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room20.east.equals("marrom")) {
							Room.room20.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room20.west.equals("marrom")) {
							Room.room20.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 21:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room21.north.equals("marrom")) {
							Room.room21.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room21.south.equals("marrom")) {
							Room.room21.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room21.east.equals("marrom")) {
							Room.room21.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room21.west.equals("marrom")) {
							Room.room21.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 22:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room22.north.equals("marrom")) {
							Room.room22.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room22.south.equals("marrom")) {
							Room.room22.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room22.east.equals("marrom")) {
							Room.room22.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room22.west.equals("marrom")) {
							Room.room22.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 23:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room23.north.equals("marrom")) {
							Room.room23.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room23.south.equals("marrom")) {
							Room.room23.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room23.east.equals("marrom")) {
							Room.room23.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room23.west.equals("marrom")) {
							Room.room23.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 24:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room24.north.equals("marrom")) {
							Room.room24.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room24.south.equals("marrom")) {
							Room.room24.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room24.east.equals("marrom")) {
							Room.room24.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room24.west.equals("marrom")) {
							Room.room24.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 25:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room25.north.equals("marrom")) {
							Room.room25.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room25.south.equals("marrom")) {
							Room.room25.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room25.east.equals("marrom")) {
							Room.room25.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room25.west.equals("marrom")) {
							Room.room25.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 26:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room26.north.equals("marrom")) {
							Room.room26.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room26.south.equals("marrom")) {
							Room.room26.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room26.east.equals("marrom")) {
							Room.room26.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room26.west.equals("marrom")) {
							Room.room26.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 27:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room27.north.equals("marrom")) {
							Room.room27.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room27.south.equals("marrom")) {
							Room.room27.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room27.east.equals("marrom")) {
							Room.room27.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room27.west.equals("marrom")) {
							Room.room27.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 28:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room28.north.equals("marrom")) {
							Room.room28.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room28.south.equals("marrom")) {
							Room.room28.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room28.east.equals("marrom")) {
							Room.room28.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room28.west.equals("marrom")) {
							Room.room28.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 29:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room29.north.equals("marrom")) {
							Room.room29.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room29.south.equals("marrom")) {
							Room.room29.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room29.east.equals("marrom")) {
							Room.room29.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room29.west.equals("marrom")) {
							Room.room29.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;	
			
			case 30:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room30.north.equals("marrom")) {
							Room.room30.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room30.south.equals("marrom")) {
							Room.room30.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room30.east.equals("marrom")) {
							Room.room30.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room30.west.equals("marrom")) {
							Room.room30.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;
				
			case 31:
				Global.minimum = 1;
				Global.maximum = 4;
				Random.RandomGenerator();
				Global.number = (int) Global.numberRandom;
				
				switch (Global.number) {
				
					case 1:
						if (Room.room31.north.equals("marrom")) {
							Room.room31.north = Global.door;
							Global.counter++;
						}
						break;
					
					case 2:
						if (Room.room31.south.equals("marrom")) {
							Room.room31.south = Global.door;
							Global.counter++;
						}
						break;
						
					case 3:
						if (Room.room31.east.equals("marrom")) {
							Room.room31.east = Global.door;
							Global.counter++;
						}
						break;
						
					case 4:
						if (Room.room31.west.equals("marrom")) {
							Room.room31.west = Global.door;
							Global.counter++;
						}
						break;	
					
					default:
				}
				break;	
				
			default:
		}
	}
}
