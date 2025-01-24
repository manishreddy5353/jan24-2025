package fourthtypefunction;

import java.util.Scanner;

public class demo10{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System. in);
		System. out.println("enter country....");
		String country = sc.next();
		String cC= getAmtDetails (country);
		System.out. println("please enter "+cC);
		if(cC. equalsIgnoreCase("Country not Found")) {
			System.out.println("not able to process");
		}
		else {
			int amt = sc.nextInt();
			System.out.println("For this "+country+ " for this amt="+amt+" indian amt="+ m1(country, amt));
		}
	}
			private static String m1(String country, int amt) {
		// TODO Auto-generated method stub
		return null;
	}
			static String getAmtDetails(String country) {
				String res = "";
				if(country. equalsIgnoreCase ("USA")) {
					res = "Dollar";
				}
				else if(country.equalsIgnoreCase("UK")) {
					res = "Pound";
				}
				else if(country.equalsIgnoreCase ("UAE")) {
					res = "Diram";
				}
				else {
				res = "Country not Found";
			}
				return res;
			}
}
