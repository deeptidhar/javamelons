public class Main {

	public static void main(String[] args) {
		System.out.println("Instantiate objects here!");
		MelonType musk = new MelonType(
			"musk",
			"MuskMelon",
			1998,
			"green",
			true,
			true
		);
	MelonType cas = new MelonType(
		"cas", 
		"Casaba", 
		2003, 
		"orange",
		false, 
		false
	);
	MelonType cren = new MelonType(
		"cren",
		"Crenshaw", 
		1998, 
		"green", 
		false, 
		false
	);
	MelonType yw = new MelonType(
	"yw",
	"Yellow Watermelon", 
	2013, 
	"yellow", 
	false, 
	true
	);
	MelonType[] types = {musk, cas, cren, yw};

	Melon melon1 = new Melon(yw, 8, 7, 2, "Sheila");
	Melon melon2 = new Melon(yw,3, 4, 2,"Sheila");
	Melon melon3 = new Melon(cas, 10, 6, 35,"Sheila");
	Melon melon4 = new Melon(cren,8,9,35,"Micheal");
	Melon melon5 = new Melon(cren,8,2,35,"Micheal");
	Melon melon6 = new Melon(musk,6,7,4,"Micheal");
	Melon melon7 = new Melon(yw,7,10,3,"Sheila");

	Melon[] melons = {melon1,melon2,melon3,melon4,melon5,melon6,melon7};
	getSellabilityReport(melons);
	}	


	public static void getSellabilityReport(Melon[] melons){
		for (int i=0; i<melons.length; i++){
			Melon currentMelon = melons[i];
			if (currentMelon.isSellable()){
				System.out.println("Can be sold");
			}else{
				System.out.println("Can't be sold");
			}
			System.out.println("Harvested by"+currentMelon.harvester+"from field"+currentMelon.field);
		}
	}
}
