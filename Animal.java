public abstract class Animal {		//tambah keyword abstract
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	//tukar jadi abstract method
	public abstract void speak();
		// System.out.println("Animal sound");
	
}