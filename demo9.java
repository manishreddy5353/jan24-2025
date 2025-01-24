package fourthtypefunction;

public class demo9 {
	static float anyCountryToIndianRupees(String country,int amt) {
		float res=0.0f;
		if(country.equalsIgnoreCase("USA")) {
			res=amt * 78.67f;
		}
		else if(country.equalsIgnoreCase("UK")) {
			res=amt *120.56f;
		}
		else if (country.equalsIgnoreCase("UAE")) {
			res=amt * 20.56f;
		}
		return res;
	}
	static int getAmt() {
		return 100;
	}
	public static void main(String[]args) {
		int usDollar=100,ukpounds=200,uaeDiram=50;
		float rupees =anyCountryToIndianRupees("USA",getAmt());
		System.out.println("indian ruppes---.USA    "+rupees);
		rupees = anyCountryToIndianRupees("UK", ukpounds);
		System.out.println("indian ruppes--- for UK "+rupees);
		rupees = anyCountryToIndianRupees ("UAE",uaeDiram);
		System.out.println("indian ruppes---.for UAE "+rupees);
		
	}
	}
				
	
