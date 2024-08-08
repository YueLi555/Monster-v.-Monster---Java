class Weapon {
   // complete this class
   
   // variable named name and maxDamaga 
   private String name;
   private int maxDamage;
   // default construtor 
   public Weapon(){
            name = "Pointy Stick";
            maxDamage = 1;
      }
   // overloaded constructor  
   public Weapon(String _weapon_name, int _weapon_maxDamaga){
            name = _weapon_name;
            maxDamage = _weapon_maxDamaga;
      }
      
   // getName()
   public String getName(){
         return name;
      }
   // setName()
   public void setName(String _wea_name){
         this.name = _wea_name;
      }
   //getMaxDamaga()
   public int getMaxDamage(){
         return maxDamage;
      }
   // setMaxDamaga()
   public void setMaxDamage(int _wea_max_damage){
         maxDamage = _wea_max_damage;
      }
      
   //
}