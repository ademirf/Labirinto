import java.util.Scanner;

public class Trap {
	
	private static Scanner ler;
	
	public static void ActiveTrap() {
		
		Global.minimum = 0;
		Global.maximum = 1;

		Random.RandomGenerator();
		Global.right = (int) Global.numberRandom;
		
		if (Global.right == 1) {
			Global.left = 0;
			Global.center = 0;
		}
		else {
			Random.RandomGenerator();
			Global.left = (int) Global.numberRandom;
			if (Global.left == 1) {
				Global.center = 0;
			}
			else {
				Global.center = 1;
			}
		}
	}
	
	
	public static void DisarmTrap() {
		
		ActiveTrap();
		
		ler = new Scanner(System.in);
		
		if (Global.obstacleCurrent.equals("trap")) {
		
			System.out.println("" +
					"Para chegar na porta você deverá\n" +
					"escolher um lado para passar,\n" +
					"sendo os lados DIREITO, ESQUERDO\n" +
					"ou CENTRO.\n" +
					"Uma das opções possui um piso falso\n" +
					"sobre um abismo que em caso de queda\n" +
					"você morrerá.\n\n" +
					"QUAL LADO VOCÊ QUER PASSAR?\n\n" +
	  			   	"Direito:...........: digite 1\n" +
	  			   	"Esquerdo:..........: digite 2\n" +
	  			   	"Centro:............: digite 3\n");
	  		Global.optionPlayer=ler.nextInt();
			
			switch (Global.optionPlayer) {
			
				case 1:
					if (Global.right == 1) {
						Global.isLive = false;
						System.out.println("\nVocê caiu no buraco.");
					}
					else {
						System.out.println("\nVocê passou pela armadilha. Agora já pode sair da sala.\n");
						Room.room50.obstacle = "null";
						Global.playerPosition = 99;
						Maze.Map();
					}
					break;
				
				case 2:
					if (Global.left == 1) {
						Global.isLive = false;
						System.out.println("\nVocê caiu no buraco.");
					}
					else {
						System.out.println("\nVocê passou pela armadilha. Agora já pode sair da sala.");
						Global.obstacleCurrent = "";
					}
					break;
					
				case 3:
					if (Global.center == 1) {
						Global.isLive = false;
						System.out.println("\nVocê caiu no buraco.");
					}
					else {
						System.out.println("\nVocê passou pela armadilha. Agora já pode sair da sala.");
						Global.obstacleCurrent = "";
					}
					break;
				
				default:
					System.out.println("\nOpção inválida!");
			}
		}
		else {
			System.out.println("\nNão há armadilha nesta sala.");
		}
	}
}
