package klase;

public class Voznja {

	public static void main(String[] args) {
		
		Automobil a1 = new Automobil("Honda", "Jazz", 557854, "Jelena");
		Automobil a2 = new Automobil("Suzuki", "Swift", 455066, "Milica");
		
		
		String modelPrvogAutomobila=a1.getModel();
		System.out.println(modelPrvogAutomobila);
		
		String modelDrugogAutomobila = a2.getModel();
		System.out.println(modelDrugogAutomobila);
		
		
		String markaPrvogAutomobila=a1.getMarka();
		System.out.println(markaPrvogAutomobila);
		
		String markaDrugogAutomobila=a2.getMarka();
		System.out.println(markaDrugogAutomobila);
		
		String vlasnikPrvogAutomobila=a1.getVlasnik();
		System.out.println(vlasnikPrvogAutomobila);
		
		String vlasnikDrugogAutomobila=a2.getVlasnik();
		System.out.println(vlasnikDrugogAutomobila);
		
		int serijskiBrojPrvogAutomobila=a1.getSerijskiBroj();
		System.out.println(serijskiBrojPrvogAutomobila);
		
		int serijskiBrojDrugogAutomobila=a2.getSerijskiBroj();
		System.out.println(serijskiBrojDrugogAutomobila);
		
		a1.setVlasnik(vlasnikPrvogAutomobila);
		System.out.println(a1.getVlasnik());
		
		a2.setVlasnik(vlasnikDrugogAutomobila);
		System.out.println(a2.getVlasnik());
		
		
	}

}
