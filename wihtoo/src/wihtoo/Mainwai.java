package wihtoo;
import java.text.NumberFormat;
import java.util.Scanner;
public class Mainwai{
	public static void main(String[] args) {
		int salary;
		byte persent = 100;
		 
		double persentOfSolidartätszuschlag = 5.50;
		double solidartätszuschlag;
		
		double persentOfKrankenkassenbeitragssatz = 14.60;
		double krankenkassenbeitragssatz;
		
		double persentOfKrankenversicherung = 0.90;
		double krankenversicherung;
		
		double persentOfPflegeversicherung = 2.55;
		double pflegeversicherung;
		
		double persentOfArbeitlosenversicherung = 3.00;
		double arbeitlosenversicherung;
		
		double persentOfRentenversicherung = 18.60;
		double rentenversicherung;
		
		double netto;
		
		System.out.println("Online Netto Rechner");
		System.out.println("Geben Sie Brutto Gehalt ein!");
		Scanner my = new Scanner(System.in);
		salary = my.nextInt();
		solidartätszuschlag = (salary * persentOfSolidartätszuschlag) / persent;
		String soldar = NumberFormat.getCurrencyInstance().format(solidartätszuschlag);
		System.out.println("Solidartätszuschlag ist       : " + soldar);
		krankenkassenbeitragssatz = (salary * persentOfKrankenkassenbeitragssatz) / persent;
		String kranken = NumberFormat.getCurrencyInstance().format(krankenkassenbeitragssatz);
		System.out.println("Krankenkassenbietragssatz ist : " + kranken);
		krankenversicherung = (salary * persentOfKrankenversicherung) / persent;
		String ver = NumberFormat.getCurrencyInstance().format(krankenversicherung);
		System.out.println("Krankenversicherung ist       : " + ver);
		pflegeversicherung = (salary * persentOfPflegeversicherung) / persent;
		String pfle = NumberFormat.getCurrencyInstance().format(pflegeversicherung);
		System.out.println("Pfegeversicherung ist         : " + pfle);
		arbeitlosenversicherung = (salary * persentOfArbeitlosenversicherung) / persent;
		String arbeit = NumberFormat.getCurrencyInstance().format(arbeitlosenversicherung);
		System.out.println("Arbeitlosenversicherung ist   : " + arbeit);
		rentenversicherung = (salary * persentOfRentenversicherung) / persent;
		String rent = NumberFormat.getCurrencyInstance().format(rentenversicherung);
		System.out.println("Rentenversicherung ist        : " + rent);
		netto = (salary - (solidartätszuschlag + krankenkassenbeitragssatz + krankenversicherung + pflegeversicherung + arbeitlosenversicherung + rentenversicherung));
		String net = NumberFormat.getCurrencyInstance().format(netto);
		System.out.println("Netto Gehalt ist              : " + net);
	}
}