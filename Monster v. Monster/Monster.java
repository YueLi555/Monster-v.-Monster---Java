class Monster {
   // complete this class
   
   // variable String  name, int health, weapon
   private String name;
   private int health;
   private Weapon weapon;
   
   // overloaded constructor 
   public Monster(String _name , int _age , Weapon _weapon){
            this.name = _name;
            this.health = _age;
            this.weapon = _weapon;
      }
   // getName
   public String getName(){
         return name;
      }
   
   //getHealth
   public int getHealth(){
         return health;
      }
   
   //getWeaponName 
   public String getWeaponName(){
         return weapon.getName();
      };
   
   //attack 
   public int attack(Monster monster){
         int _damage = (int)(Math.random() * weapon.getMaxDamage());
         monster.health -= _damage;
         return _damage;
      }
}