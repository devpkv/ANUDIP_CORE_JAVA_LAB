package question5;

public class CarModel {
	
	enum Cars{
		AUDI(2022),
		GMC(2021),
		HYUNDAI(2022),
		HONDA(2021),
		HERO(2022),
		TATA(2020),
		NISSAN(2020);
		int model;
		Cars(int model)
		{
			this.model = model;
		}
		
	} 
	 
	public static void main(String[] args) {
		 
		for(Cars c : Cars.values())
		{
			System.out.println(c+" { MODEL : "+ c.model+" }");
		}
	}

}
