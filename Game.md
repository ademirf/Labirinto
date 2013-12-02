import java.util.Scanner;

public class Game {

	private static Scanner ler;

	public static void main(String[] args) {
		
		ler = new Scanner(System.in);
	
		Opponents o = new Opponents();

		o.DefiningPlayer();
		DistributesArmor.InsertArmor();
		DistributesEnemies.InsertEnimies();
		DistributesKeys.InsertKeys();
		DistributesWeapons.InsertWeapon();
		BlocksDoors.SelectDoor();
		Maze.Map();
		Opponents.DefiningEnemy();
		
		do {
			
			System.out.println("------------------------------------------------------------------------------\n" +
					"| O que deseja fazer?                                                        |\n" +
					"|                                                                            |\n" +
					"|    [1 - MOVER] - [2 - OLHAR] - [3 - PEGAR CHAVE] - [4 - PEGAR ARMA]        |\n" +
					"|                                                                            |\n" +
					"| [5 - PEGAR ARMADURA] - [6 - LUTAR] - [7 - DESARMAR ARMADILHA] - [8 - SAIR] |\n" +
					"------------------------------------------------------------------------------\n" +
					"------------------------------------------------------------------------------\n" +
					"|NOME DO JOGADOR: "+Global.playerName+"    |   POSIÇÃO: "+Global.playerPosition+"   |   VIDAS: "+Global.playerLife+"   |   ENERGIA: "+Global.playerEnergy+"  |\n" +
					"------------------------------------------------------------------------------\n" +
					"|       ARMA: "+Global.playerWeapon+"      |      ARMADURA: "+Global.playerArmor+"      |       CHAVE: "+Global.playerKey+"       |\n" +
					"------------------------------------------------------------------------------\n");
					int optionGame=ler.nextInt();
								
			switch (optionGame) {

		     	case 1:
		     		System.out.println("Deseja mover para: \n" +
		     				"-----------------------------------\n" +
		     				"|              [1 - ACIMA]        |\n" +
		     				"-----------------------------------\n" +
		     				"|           [2 - NORTE]           |\n\n" +
		     				"| [3 - OESTE]         [4 - LESTE] |\n\n" +
		     				"|            [5 - SUL]            |\n" +
		     				"-----------------------------------\n" +
		     				"|       [6 - ABAIXO]              |\n" +
		     				"-----------------------------------\n\n");
		     				int optionMove=ler.nextInt();
		     		
		    		switch (optionMove) {
		    		
			    		case 1:
			    			Move.MoveUp();
			    			break;
			    		
			    		case 2:
			    			Move.MoveNorth();
			    			break;
			    			
			    		case 3:
			    			Move.MoveWest();
			    			break;
			    		
			    		case 4:
			    			Move.MoveEast();
			    			break;
			    			
			    		case 5:
			    			Move.MoveSouth();
			    			break;
			    			
			    		case 6:
			    			Move.MoveDown();
			    			break;	
			    		
			    		default:
			    			System.out.println("ERRO: Opção inválida!");
			    	}
		     		Maze.Map();
		     		break;
		     	case 2:
		     		Look.LookSituation();
		     		break;
		     	case 3:
		     		Item.Getkey();
		     		break;
		     	case 4:
		     		Item.Getweapon();
		     		break;
		     	case 5:
		     		Item.Getarmor();
		     		break;
		     	case 6:
		     		Opponents.DefiningEnemy();
		     		Combat.Battle();
		     		break;
		     	case 7:
		     		Trap.DisarmTrap();
		     		break;
		    	case 8:
		    		Global.isLive = false;
		    		Global.playerLife = 0;
				    break;
		     	default:
		     		System.out.println("ERRO: Opção inválida! Digite novamente.");
			}
			
		} while (Global.isLive == true && Global.isWinner == false);
		
		Opponents.Winner();
	}
}
