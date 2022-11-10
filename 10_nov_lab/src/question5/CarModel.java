package question5;

public class CarModel {
	//  ENUM CONSTANT CLASS
	enum Cars{
		AUDI(2022),
		GMC(2021),
		HYUNDAI(2022),
		HONDA(2021),
		HERO(2022),
		TATA(2020),
		NISSAN(2020);
		int model;
		
		// ENUM CONSTRUCTOR
		Cars(int model)
		{
			this.model = model;
		}
		
	} 
	 
	public static void main(String[] args) {
		 // printing all the constant values with model name
		
		for(Cars c : Cars.values())
		{
			System.out.println(c+" { MODEL : "+ c.model+" }");
		}
	}

}
