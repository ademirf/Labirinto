import java.util.Scanner;

public class Move {
	
	Scanner ler = new Scanner(System.in);

	public static void MoveNorth() {
		
		if (Global.sideNcurrent == 50 || Global.sideNcurrent == 100) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideNcurrent;
		}
		else if (Global.sideNcurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideNcurrent == Global.previousPosition && Global.sideNcurrent != 0) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideNcurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro passar pela armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
			System.out.println("ATENÇÃO: Você deve primeiro passar pelo inimigo!");
		}
		else if (Global.northCurrent.equals("marrom") || (Global.northCurrent.equals(Global.playerKey))) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideNcurrent;
		}	
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.northCurrent+" para abrir esta porta!");
		}	
	}
	
	public static void MoveSouth() {
		
		if (Global.sideScurrent == 50 || Global.sideScurrent == 100) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideScurrent;
		}
		else if (Global.sideScurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideScurrent == Global.previousPosition && Global.sideScurrent != 0) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideScurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro passar pela armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
		}
		else if (Global.southCurrent.equals("marrom") || (Global.southCurrent.equals(Global.playerKey))) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideScurrent;
			System.out.println("Você passou para a "+Global.nameRoomCurrent);
		}
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.southCurrent+" para abrir esta porta!");
		}	
	}
	

	public static void MoveEast() {
		
		if (Global.sideEcurrent == 50 || Global.sideEcurrent == 100) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideEcurrent;
		}
		else if (Global.sideEcurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideEcurrent == Global.previousPosition && Global.sideEcurrent != 0) { //moveu
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideEcurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro passar pela armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
			System.out.println("ATENÇÃO: Você deve primeiro passar pelo inimigo!");
		}
		else if (Global.eastCurrent.equals("marrom") || (Global.eastCurrent.equals(Global.playerKey))) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideEcurrent;
		}
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.eastCurrent+" para abrir esta porta!");
		}	
	}
	

	public static void MoveWest() {
		
		if (Global.sideWcurrent == 50 || Global.sideWcurrent == 100) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideWcurrent;
		}
		if (Global.sideWcurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideWcurrent == Global.previousPosition && Global.sideWcurrent != 0) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideWcurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro desarmar a armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
			System.out.println("ATENÇÃO: Você deve primeiro vencer o inimigo!");
		}
		else if (Global.westCurrent.equals("marrom") || (Global.westCurrent.equals(Global.playerKey)) ) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideWcurrent;
		}
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.westCurrent+" para abrir esta porta!");
		}	
	}
	
	
	public static void MoveUp() {
			
		if (Global.sideUcurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideUcurrent == Global.previousPosition && Global.sideUcurrent != 0) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideUcurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Você deve primeiro desarmar a armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro vencer o inimigo!");
		}
		else if (Global.upCurrent.equals("marrom") || (Global.upCurrent.equals(Global.playerKey)) ) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideUcurrent;
		}
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.upCurrent+" para abrir esta porta!");
		}	
	}

	
	public static void MoveDown() {
		
		if (Global.sideDcurrent == 0) {
			System.out.println("Esta lado não tem porta.");
		}
		else if (Global.sideDcurrent == Global.previousPosition && Global.sideDcurrent != 0) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideDcurrent;
		}
		else if (Global.obstacleCurrent.equals("trap")) {
			System.out.println("ATENÇÃO: Para sair desta sala, você deve primeiro desarmar a armadilha!");
		}
		else if (Global.obstacleCurrent.equals("enemy1")
				|| Global.obstacleCurrent.equals("enemy2")
				|| Global.obstacleCurrent.equals("enemy3")) {
			System.out.println("ATENÇÃO: Você deve primeiro vencer o inimigo!");
		}
		else if (Global.downCurrent.equals("marrom") || (Global.downCurrent.equals(Global.playerKey)) ) {
			Global.previousPosition = Global.playerPosition;
			Global.playerPosition = Global.sideDcurrent;
	
		}
		else {
			System.out.println("ATENÇÃO: Você precisa da chave "+Global.downCurrent+" para abrir esta porta!");
		}		
	}	
}
