package klase1;

public class Igraci {

	public static void main(String[] args) {
		
		Sportista s1 = new Sportista("Nikola Grbic", "odbojka", "OK Zenit", 9);
		Sportista s2 = new Sportista("Vladimir Grbic", "odbojka", "Dinamo", 10);
		Sportista s3 = new Sportista("Ivan Miljkovic", "odbojka", "Olimpijakos", 14);
		
		
		String imePrezimePrvogSportiste=s1.getImePrezime();
		System.out.println(imePrezimePrvogSportiste);
		
		String imePrezimeDrugogSportiste=s2.getImePrezime();
		System.out.println(imePrezimeDrugogSportiste);
		
		String imePrezimeTrecegSportiste=s3.getImePrezime();
		System.out.println(imePrezimeTrecegSportiste);
		
		
		String sportPrvogSportiste=s1.getSport();
		System.out.println(sportPrvogSportiste);
		
		String sportDrugogSportiste=s2.getSport();
		System.out.println(sportDrugogSportiste);
		
		String sportTrecegSportiste=s3.getSport();
		System.out.println(sportTrecegSportiste);
		
		
		String klubPrvogSportiste=s1.getKlub();
		System.out.println(klubPrvogSportiste);
		
		String klubDrugogSportiste=s2.getKlub();
		System.out.println(klubDrugogSportiste);
		
		String klubTrecegSportiste=s3.getImePrezime();
		System.out.println(klubTrecegSportiste);
		
		int brojDresaPrvogSportiste=s1.getBrojDresa();
		System.out.println(brojDresaPrvogSportiste);
		
		int brojDresaDrugogSportiste=s2.getBrojDresa();
		System.out.println(brojDresaDrugogSportiste);
		
		int brojDresaTrecegSportiste=s3.getBrojDresa();
		System.out.println(brojDresaTrecegSportiste);
		
		
		
			
	}
	
}
