public class testAnimal {

	 public static void main(String[] args) {

	 	// InterfaceCelebrity ic = InterfaceCelebrity() //not possible

		// Animal a1 = new Animal();
		// a1.speak();

		Haiwan h = new Haiwan();
		h.setName("New Species");
		System.out.println(h.getName());

		Cat c = new Cat();
		c.bunyi();
		c.speak();
		c.setName("Tom");
		System.out.println(c.getName());

		Mouse m = new Mouse();
		m.speak();
		m.setName("Jerry");
		System.out.println(m.getName());

		cartoonCat garfield = new cartoonCat();
		garfield.speak();	
		// garfield.bunyi();	//output meow meow
		garfield.setName("Garfield");
		System.out.println(garfield.getName());

		garfield.screenTime("Garfield Home Alone");
		System.out.println("Pay is " + garfield.pay(10));

		garfield.screenTime2("Garfield Home Alone The Sequel");
		System.out.println("Pay is " + garfield.pay2(10));


	}

}