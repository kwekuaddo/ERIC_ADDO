package Q2;

public class MonsterAttacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Declare references of the superclass
	//and assign instance of Subclasses
		Monster m1 = new FireMonster("Fire Lion");//upcast
		Monster m2 = new FireMonster("Strike");//upcast
		Monster m3 = new FireMonster("Blizzard");//upcast
	
		//Invoke the actual implementation
		System.out.println(m1.attack());//FireMonster's attack()
		System.out.println(m2.attack()); // WaterMonster's attack()
		System.out.println(m3.attack()); // StoneMonster's attack()
		
		// m1 dies, generate a new instance and re-assign to m1.
		m1 = new StoneMonster("Metamorphic"); // upcast
		System.out.println(m1.attack()); // StoneMonster's attack()
		// We have a problem here!!!
		Monster m4 = new Monster("Green");
		System.out.println(m4.attack()); // garbage!!!	
	}
	

}
