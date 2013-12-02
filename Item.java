public class Item {
	
	public static void AlterPowerAttack() {
	
		if (Global.playerWeapon.equals("faca")) {
			
			Global.playerAttackmin = 4;
			Global.playerAttackmax = 14;
			System.out.println("\nSeu poder de ataque máximo aumentou!");
		}
		else if (Global.playerWeapon.equals("adaga")) {
			
			Global.playerAttackmin = 7;
			Global.playerAttackmax = 17;
			System.out.println("\nSeu poder de ataque máximo aumentou!");
		}
		else if (Global.playerWeapon.equals("espada")) {
			
			Global.playerAttackmin = 10;
			Global.playerAttackmax = 20;
			System.out.println("\nSeu poder de ataque máximo aumentou!");
		}
	}
	
	public static void AlterPowerDefense() {
		
		if (Global.playerArmor.equals("couro")) {
			
			Global.playerResistancemin = 4;
			Global.playerResistancemax = 14;
			System.out.println("\nSeu poder de defesa máximo aumentou!");
		}
		else if (Global.playerArmor.equals("metal")) {
			
			Global.playerResistancemin = 7;
			Global.playerResistancemax = 17;
			System.out.println("\nSeu poder de defesa máximo aumentou!");
		}
		else if (Global.playerArmor.equals("mithrill")) {
			
			Global.playerResistancemin = 10;
			Global.playerResistancemax = 20;
			System.out.println("\nSeu poder de defesa máximo aumentou!");
		}
	}
	
	
	public static void Getkey() {
		
		if (Global.keyRoomCurrent == "null") {
			System.out.println("\nNão há chave nesta sala.");
		}
		else if (Global.keyRoomCurrent == Global.playerKey) {
			System.out.println("\nVocê já possui esta chave.");
		}
		else {
			Global.playerKey = Global.keyRoomCurrent;
			System.out.println("\nVocê pegou uma chave "+Global.keyRoomCurrent+".");
			Global.keyRoomCurrent = "null";
		}
	}
	
	
	public static void Getweapon() {
		
		if (Global.weaponRoomCurrent == "null") {
			
			System.out.println("\nNão há arma nesta sala.");
		}
		else if (Global.playerName.equals("Humano")) {
			
			if (Global.weaponRoomCurrent == Global.playerWeapon) {
				System.out.println("\nVocê já possui esta arma.");
			}
			else {
				Global.playerWeapon = Global.weaponRoomCurrent;
				System.out.println("\nVocê pegou uma "+Global.weaponRoomCurrent+".");
				Global.weaponRoomCurrent = "null";
				AlterPowerAttack();
			}
		}
		else {
			System.out.println("\nEsta arma é somente para o humano.");
		}
	}
	
	
	public static void Getarmor() {
		
		if (Global.armorRoomCurrent == "null") {
			System.out.println("\nNão há armadura nesta sala.");
		}
		else if (Global.playerName.equals("Humano")) {
			
			if (Global.armorRoomCurrent == Global.playerArmor) {
				System.out.println("\nVocê já possui esta armadura.");
			}
			else {
				Global.playerArmor = Global.armorRoomCurrent;
				System.out.println("\nVocê pegou uma armadura de "+Global.armorRoomCurrent+".");
				Global.armorRoomCurrent = "null";
				AlterPowerDefense();
			}
		}	
		else {
			System.out.println("\nEsta armadura é somente para o humano.");
		}
	}
}
