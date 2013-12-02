import java.util.Scanner;

public class Opponents {
	
	Scanner ler = new Scanner(System.in);

	public void DefiningPlayer() {

		Global.previousPosition = 0;
		Global.playerPosition = 1;
		
		do{
			System.out.println("------------------------------------------------------------------------------\n" +
			"| Digite um número para escolher seu jogador:                                |\n" +
			"|                                                                            |\n" +
			"|          [1 - Humano] - [2 - Gobblin] - [3 - Orc] - [4 - Troll]            |\n"+
			"|                                                                            |\n" +
			"------------------------------------------------------------------------------\n");
			Global.optionPlayer=ler.nextInt();
		
			switch (Global.optionPlayer) {
			
				case 1:
					Global.isLive = true;
					Global.playerName = Personage.Human.Type();
					Global.playerLife = 3;
					Global.playerEnergy = 10;
					Global.playerAttackmin = Personage.Human.MinimumAttack();
					Global.playerAttackmax = Personage.Human.MaximumAttack();
					Global.playerResistancemin = Personage.Human.MinimumResistance();
					Global.playerResistancemax = Personage.Human.MaximumResistance();
					Global.playerWeapon = Personage.Human.Weapon();
					Global.playerArmor = Personage.Human.Armor();
					Global.playerKey = Personage.Human.Key();
					Global.enemy1 = Personage.Gobblin.Type();
					Global.enemy2 = Personage.Orc.Type();
					Global.enemy3 = Personage.Troll.Type();
					Global.enemyLife = 1;
					System.out.println("Jogador escolhido: "+Global.playerName+". Boa sorte!\n");
					break;
				
				case 2:
					Global.isLive = true;
					Global.playerName =Personage.Gobblin.Type();
					Global.playerLife = 3;
					Global.playerEnergy = 10;
					Global.playerAttackmin = Personage.Gobblin.MinimumAttack();
					Global.playerAttackmax = Personage.Gobblin.MaximumAttack();
					Global.playerResistancemin = Personage.Gobblin.MinimumResistance();
					Global.playerResistancemax = Personage.Gobblin.MaximumResistance();
					Global.playerWeapon = Personage.Gobblin.Weapon();
					Global.playerArmor = Personage.Gobblin.Armor();
					Global.playerKey = Personage.Gobblin.Key();
					Global.enemy1 = Personage.Human.Type();
					Global.enemy2 = Personage.Orc.Type();
					Global.enemy3 = Personage.Troll.Type();
					Global.enemyLife = 1;
					System.out.println("Jogador escolhido: "+Global.playerName+". Boa sorte!\n");
					break;
					
				case 3:
					Global.isLive = true;
					Global.playerName = Personage.Orc.Type();
					Global.playerLife = 3;
					Global.playerEnergy = 10;
					Global.playerAttackmin = Personage.Orc.MinimumAttack();
					Global.playerAttackmax = Personage.Orc.MaximumAttack();
					Global.playerResistancemin = Personage.Orc.MinimumResistance();
					Global.playerResistancemax = Personage.Orc.MaximumResistance();
					Global.playerWeapon = Personage.Orc.Weapon();
					Global.playerArmor = Personage.Orc.Armor();
					Global.playerKey = Personage.Orc.Key();
					Global.enemy1 = Personage.Human.Type();
					Global.enemy2 = Personage.Gobblin.Type();
					Global.enemy3 = Personage.Troll.Type();
					Global.enemyLife = 1;
					System.out.println("Jogador escolhido: "+Global.playerName+". Boa sorte!\n");
					break;
				
				case 4:
					Global.isLive = true;
					Global.playerName = Personage.Troll.Type();
					Global.playerLife = 3;
					Global.playerEnergy = 10;
					Global.playerAttackmin = Personage.Troll.MinimumAttack();
					Global.playerAttackmax = Personage.Troll.MaximumAttack();
					Global.playerResistancemin = Personage.Troll.MinimumResistance();
					Global.playerResistancemax = Personage.Troll.MaximumResistance();
					Global.playerWeapon = Personage.Troll.Weapon();
					Global.playerArmor = Personage.Troll.Armor();
					Global.playerKey = Personage.Troll.Key();
					Global.enemy1 = Personage.Human.Type();
					Global.enemy2 = Personage.Gobblin.Type();
					Global.enemyLife = 1;
					System.out.println("Jogador escolhido: "+Global.playerName+". Boa sorte!\n");
					break;
				
				default:
					System.out.println("Opção inválida. Digite novamente!");
			}
		}while (Global.playerName == null);
	}
	
	
	public static void LoadEnemy1() {
		
		switch (Global.enemy1) {
		
			case "Human":
				Global.enemyName = Personage.Human.Type();
				Global.enemyAttackmin = Personage.Human.MinimumAttack();
				Global.enemyAttackmax = Personage.Human.MaximumAttack();
				Global.enemyResistancemin = Personage.Human.MinimumResistance();
				Global.enemyResistancemax = Personage.Human.MaximumResistance();
				break;
			
			case "Gobblin":
				Global.enemyName = Personage.Gobblin.Type();
				Global.enemyAttackmin = Personage.Gobblin.MinimumAttack();
				Global.enemyAttackmax = Personage.Gobblin.MaximumAttack();
				Global.enemyResistancemin = Personage.Gobblin.MinimumResistance();
				Global.enemyResistancemax = Personage.Gobblin.MaximumResistance();
				break;

			default:
				System.out.println("Load 1: Inimigo inválido.");
		}	
	}
	
	
	public static void LoadEnemy2() {
		
		switch (Global.enemy2) {
			
			case "Gobblin":
				Global.enemyName = Personage.Gobblin.Type();
				Global.enemyAttackmin = Personage.Gobblin.MinimumAttack();
				Global.enemyAttackmax = Personage.Gobblin.MaximumAttack();
				Global.enemyResistancemin = Personage.Gobblin.MinimumResistance();
				Global.enemyResistancemax = Personage.Gobblin.MaximumResistance();
				break;
				
			case "Orc":
				Global.enemyName = Personage.Orc.Type();
				Global.enemyAttackmin = Personage.Orc.MinimumAttack();
				Global.enemyAttackmax = Personage.Orc.MaximumAttack();
				Global.enemyResistancemin = Personage.Orc.MinimumResistance();
				Global.enemyResistancemax = Personage.Orc.MaximumResistance();
				break;	
			
			default:
				System.out.println("Load 2: Inimigo inválido.");
		}	
	}
	
	
	public static void LoadEnemy3() {
		
		switch (Global.enemy3) {
				
			case "Orc":
				Global.enemyName = Personage.Orc.Type();
				Global.enemyAttackmin = Personage.Orc.MinimumAttack();
				Global.enemyAttackmax = Personage.Orc.MaximumAttack();
				Global.enemyResistancemin = Personage.Orc.MinimumResistance();
				Global.enemyResistancemax = Personage.Orc.MaximumResistance();
				break;
			
			case "Troll":
				Global.enemyName = Personage.Troll.Type();
				Global.enemyAttackmin = Personage.Troll.MinimumAttack();
				Global.enemyAttackmax = Personage.Troll.MaximumAttack();
				Global.enemyResistancemin = Personage.Troll.MinimumResistance();
				Global.enemyResistancemax = Personage.Troll.MaximumResistance();
				
				break;	
			
			default:
				System.out.println("Load 3: Inimigo inválido.");
		}		
	}
	
	
	public static void DefiningEnemy() {
		
		if (Global.obstacleCurrent.equals("enemy1")) {
			LoadEnemy1();
		}
		else if (Global.obstacleCurrent.equals("enemy2")) {
			LoadEnemy2();
		}
		else if (Global.obstacleCurrent.equals("enemy3")) {
			LoadEnemy3();;
		}
	}
	
	public static void Winner() {
		
		if (Global.isWinner == true) {
			System.out.println("\nCongratulations!");
			System.out.println("Congratulations!");
			System.out.println("Congratulations!");
			System.out.println("\nInimigos eliminados: "+Global.eliminations);
		}
		else {
			System.out.println("\nGAME OVER!");
		}
	}
}
