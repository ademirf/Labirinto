
public class Combat {
 
	public static void PlayerBlow() {
		Global.minimum = Global.playerAttackmin;
		Global.maximum = Global.playerAttackmax;
		Random.RandomGenerator();
		Global.blow = (int) Global.numberRandom;
	}
    
	public static void PlayerDefense() {
		Global.minimum = Global.playerResistancemin;
		Global.maximum = Global.playerResistancemax;
		Random.RandomGenerator();
		Global.defense = (int) Global.numberRandom;
	}
	
	public static void EnemyBlow() {
		Global.minimum = Global.enemyAttackmin;
		Global.maximum = Global.enemyAttackmax;
		Random.RandomGenerator();
		Global.blow = (int) Global.numberRandom;
	}
    
	public static void EnemyDefense() {
		Global.minimum = Global.enemyResistancemin;
		Global.maximum = Global.enemyResistancemax;
		Random.RandomGenerator();
		Global.defense = (int) Global.numberRandom;
	}
	
	
	public static void Battle() {
		
		if (Global.obstacleCurrent != "null") {
			PlayerBlow();
			EnemyDefense();
			System.out.println("\nSeu ataque: "+Global.blow+". Defesa do "+Global.enemyName+": "+Global.defense+".");
			if (Global.blow > Global.defense) {
				Global.obstacleCurrent = "";
				System.out.println("\nInimigo eliminado!");
				Global.eliminations++;
				UpdateEliminations();
			}
			else {
				System.out.println("\nInimigo Defendeu");
				EnemyBlow();
				PlayerDefense();
				AttackEnemy();
			}
		}
		else {
			System.out.println("\nNão há inimigo nesta sala.");
		}
	}
	
	
	public static void AttackEnemy() {
		
		if (Global.blow > Global.defense) {
			
			Global.damage = Global.blow - Global.defense;
			
			Global.playerEnergy = Global.playerEnergy - Global.damage;
			
			if (Global.playerEnergy < 1) {
				
				System.out.println("\nAtaque do "+Global.enemyName+": "+Global.blow+". " +
						"Sua defesa: "+Global.defense+". Dano causado pelo inimigo: "+Global.damage+".");
				
				Global.playerLife = Global.playerLife - 1;
				
				if (Global.playerLife < 1) {
					Global.isLive = false;
					System.out.println("\nGAME OVER!");
				}
				else {
					System.out.println("\nVocê perdeu uma vida.");
					Global.playerEnergy = 10;
				}
			}
			else {
				System.out.println("\nAtaque do "+Global.enemyName+": "+Global.blow+". " +
						"Sua defesa: "+Global.defense+". Dano causado pelo inimigo: "+Global.damage+".");
			}
		}
		else {
			System.out.println("\nO ataque do inimigo foi defendido!");
		}
	}
	
	
	public static void UpdateEliminations() {
		
		switch (Global.playerPosition) {
		
		case 1:
			Room.room01.obstacle = "null";
			break;
		
		case 2:
			Room.room02.obstacle = "null";
			break;
			
		case 3:
			Room.room03.obstacle = "null";
			break;
		
		case 4:
			Room.room04.obstacle = "null";
			break;
			
		case 5:
			Room.room05.obstacle = "null";
			break;
			
		case 6:
			Room.room06.obstacle = "null";
			break;
			
		case 7:
			Room.room07.obstacle = "null";
			break;
			
		case 8:
			Room.room08.obstacle = "null";
			break;
			
		case 9:
			Room.room09.obstacle = "null";
			break;
		
		case 10:
			Room.room10.obstacle = "null";
			break;
			
		case 11:
			Room.room11.obstacle = "null";
			break;
			
		case 12:
			Room.room12.obstacle = "null";
			break;
			
		case 13:
			Room.room13.obstacle = "null";
			break;
			
		case 14:
			Room.room14.obstacle = "null";
			break;
			
		case 15:
			Room.room15.obstacle = "null";
			break;
			
		case 16:
			Room.room16.obstacle = "null";
			break;
			
		case 17:
			Room.room17.obstacle = "null";
			break;
			
		case 18:
			Room.room18.obstacle = "null";
			break;
			
		case 19:
			Room.room19.obstacle = "null";
			break;
			
		case 20:
			Room.room20.obstacle = "null";
			break;
			
		case 21:
			Room.room21.obstacle = "null";
			break;
			
		case 22:
			Room.room22.obstacle = "null";
			break;
			
		case 23:
			Room.room23.obstacle = "null";
			break;
			
		case 24:
			Room.room24.obstacle = "null";
			break;
			
		case 25:
			Room.room25.obstacle = "null";
			break;
			
		case 26:
			Room.room26.obstacle = "null";
			break;
			
		case 27:
			Room.room27.obstacle = "null";
			break;
			
		case 28:
			Room.room28.obstacle = "null";
			break;
			
		case 29:
			Room.room29.obstacle = "null";
			break;
			
		case 30:
			Room.room30.obstacle = "null";
			break;
			
		case 31:
			Room.room31.obstacle = "null";
			break;

		default:
		}
	}
}
