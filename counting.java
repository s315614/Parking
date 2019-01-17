public class counting{
	static int[] parking = {0,0,1,1,0,0,1,1,0,1,1,1,0,0,1,1,0,0,1,1}; // 0 er ledige plass og 1 er ledige sykkeler
	static int ledigPlass = 0;
	static int ledigSykkel = 0;
	public static void main(String[] args) {
		for (int i = 0; i<parking.length; i++) {
			if (parking[i] == 0) {
				ledigPlass ++;
			} else if (parking[i] == 1) {
				ledigSykkel ++;
			}

		}
		System.out.println("Ledige plass er: " + ledigPlass + " og ledige Sykkeler er: " + ledigSykkel);
	}
}