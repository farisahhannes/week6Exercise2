public class cartoonCat extends Cat implements InterfaceCelebrity, InterfaceCelebrity2{

	public void speak() {
		System.out.println("I can speak human language");
	}


	public  void screenTime(String episode){
	System.out.println(episode);
}

	public  double pay(int hour){

		// return ;
		return hour * 1.5;
	}
	

	public  void screenTime2(String episode){
	System.out.println("Eps " + episode);
}

	public  double pay2(int hour){

		// return ;
		return hour * 1.5 * 2;
	}
	
}