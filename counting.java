public class counting{
	static String[] statsjon = {"parking", "parking2"};
	static int[] parking = {0,0,1,1,0,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1}; // 0 er ledige plass og 1 er ledige sykkeler
	static int statsjoner = 0;
	static int ledigPlass = 0;
	static int ledigSykkel = 0;
	static String output;
	public static void main(String[] args) {
		for (int j = 0; j< statsjon.length; j++ ) {
			if (statsjon[j] == "parking") {
				for (int i = 0; i<parking.length; i++) {
					if (parking[i] == 0) {
						ledigPlass ++;
					} else if (parking[i] == 1) {
						ledigSykkel ++;
					}
					output = statsjon[j] + " har " + ledigPlass + " ledige plass og " + ledigSykkel+ " ledige sykkler.";

				}
			}
			
			statsjoner++;
		}
		
		System.out.println("Vi har "+statsjoner+"statsjoner og " + output);
	}
}