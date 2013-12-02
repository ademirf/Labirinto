
public class Look {

	public static void LookSituation() {
		System.out.println("______________________________________________________________________________");
		System.out.println("|___________________________DADOS DA "+Global.nameRoomCurrent+"______________________________|");
		ViewUp();
		ViewNorth();
		ViewEast();
		ViewWest();
		ViewSouth();
		ViewDown();
		if (Global.obstacleCurrent.equals("trap")) {
		System.out.println("Esta sala possui armadilha.");
		}
	}

//------------------------------------------------------------------------------------------------------------//	
	
	public static void ViewNorth() {
		
		if (Global.northCurrent.equals("parede")) {
			
			System.out.println("   -----------------------------------");
		}
		else {
			System.out.println("   -----------|   sala: "+Global.sideNcurrent+" |-----------");
			System.out.println("   -----------|Porta "+Global.northCurrent+"|-----------");
		}
	}
	
	
	public static void ViewEast() {
		
		if (Global.eastCurrent.equals("parede")) {
			
			System.out.println("   || Inimigo:  "+Global.obstacleCurrent+"                ||              DADOS DO JOGADOR:     ");
			System.out.println("   || Arma:     "+Global.weaponRoomCurrent+"                ||           Nome:            "+Global.playerName);
			System.out.println("   ||                               ||           Vidas:           "+Global.playerLife);
			System.out.println("   ||                               ||           Energia:         "+Global.playerEnergy);
		}
		else {
			System.out.println("   || Inimigo: "+Global.obstacleCurrent+"                ||              DADOS DO JOGADOR:     ");
			System.out.println("   || Arma: "+Global.weaponRoomCurrent+"                ||           Nome:    "+Global.playerName);
			System.out.println("   ||                          Porta "+Global.eastCurrent+"      Vidas:   "+Global.playerLife);
			System.out.println("   ||                           sala: "+Global.sideEcurrent+"          Energia: "+Global.playerEnergy);
		}
	}
	
	
	public static void ViewWest() {
		
		if (Global.westCurrent.equals("parede")) {
			
			System.out.println("   ||                               ||           Arma em posse:   "+Global.playerWeapon);
			System.out.println("   ||                               ||           Armadura em uso: "+Global.playerArmor); 
			System.out.println("   || Armadura: "+Global.armorRoomCurrent+"                ||           Chave em posse:  "+Global.playerKey);
			System.out.println("   || Chave:    "+Global.keyRoomCurrent+"                ||");
		}
		else {
			System.out.println("Porta "+Global.westCurrent+"                        ||           Arma em posse:   "+Global.playerWeapon);
			System.out.println("  sala: "+Global.sideWcurrent+"                           ||           Armadura em uso: "+Global.playerArmor);
			System.out.println("   || Armadura: "+Global.armorRoomCurrent+"                ||           Chave em posse:  "+Global.playerKey);
			System.out.println("   || Chave: "+Global.keyRoomCurrent+"                   ||");
		}
	}
	
	
	public static void ViewSouth() {
		
		if (Global.southCurrent.equals("parede")) {
			
			System.out.println("   -----------------------------------");
		}
		else {
			System.out.println("   ------------|Porta "+Global.southCurrent+"|------------");
			System.out.println("   ------------|   sala: "+Global.sideScurrent+"  |------------");
		}
	}
	
//------------------------------------------------------------------------------------------------------------//	
	public static void ViewUp() {
		
		if (Global.sideUcurrent == 0) {
			
			System.out.println("         ------------------------------------");
			System.out.println("         |    Não há sala no nível acima.   |");
			System.out.println("         ------------------------------------");
		}
		else {
			System.out.println("         ------------------------------------");
			System.out.println("         |          Sala acima: "+Global.sideUcurrent+"           |");
			System.out.println("         ------------------------------------");
			System.out.println("                     _______________________|");
			System.out.println("                  __|____________________|");
			System.out.println("              ___|___________________|\n");
		}
	}
	
	public static void ViewDown() {
		
		if (Global.sideDcurrent == 0) {
			
			System.out.println("------------------------------------");
			System.out.println("|   Não há sala no nível abaixo.   |");
			System.out.println("------------------------------------");
			System.out.println("|____________________________________________________________________________|\n\n");
		}
		else {
			System.out.println("            ____________________");
			System.out.println("            |___________________|___");
			System.out.println("                |___________________|");
			System.out.println("         ------------------------------------");
			System.out.println("         |          Sala abaixo: "+Global.sideDcurrent+"          |");
			System.out.println("         ------------------------------------");
			System.out.println("|____________________________________________________________________________|\n\n");
		}
	}
	
	public static void Status() {
		
		System.out.println(
			"------------------------------------------------------------------------------\n" +	
			"|NOME DO JOGADOR: "+Global.playerName+" | VIDAS: "+Global.playerLife+" | ENERGIA: "+Global.playerEnergy+" |\n" +
			"------------------------------------------------------------------------------\n" +
			"|ARMA: "+Global.playerWeapon+" | ARMADURA: "+Global.playerArmor+" | CHAVE: "+Global.playerKey+" |\n" +
			"------------------------------------------------------------------------------\n");
	}
}
