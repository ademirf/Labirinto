
public enum Personage {
     
	 Human("Humano", 1, 10, 1, 10, "null", "null", "null", "null"),
     Gobblin("Gobblin", 2, 12, 1, 11, "null", "null", "null", "null"),
     Orc("Orc", 5, 15, 4, 14, "null", "null", "null", "null"),
     Troll("Troll", 8, 18, 7, 17, "null", "null", "null", "null");

	 private final String type;
     private int minimumAttack;
     private int maximumAttack;
     private int minimumResistance;
     private int maximumResistance;
     private String weapon;
     private String armor;
     public String key;
     public String position;

     public String Type() {
       return this.type;
     }

     public int MinimumAttack() {
       return this.minimumAttack;
     }
     
     public int MaximumAttack() {
         return this.maximumAttack;
     }
     
     public int MinimumResistance() {
         return this.minimumResistance;
     }
       
     public int MaximumResistance() {
         return this.maximumResistance;
     }
     
     public String Weapon() {
         return this.weapon;
     }
     
     public String Armor() {
         return this.armor;
     }
     
     public String Key() {
         return this.key;
     }
     
     public String Position() {
         return this.position;
     }
     
     private Personage(String type, int minimumAttack, int maximumAttack, int minimumResistance,
    	int maximumResistance, String weapon, String armor, String key, String position) {
    	 this.type = type;
    	 this.minimumAttack = minimumAttack;
    	 this.maximumAttack = maximumAttack;
    	 this.minimumResistance = minimumResistance;
    	 this.maximumResistance = maximumResistance;
    	 this.weapon = weapon;
    	 this.armor = armor;
    	 this.key = key;
    	 this.position = position;
     }

}
