package methodOverriding;

class Bank{
	int getrateofInterest() {
		return 0;
	}
}

class SBI extends Bank{
	int getrateofInterest() {
		return 8;
	}
}

class HDFC extends Bank{
	int getrateofInterest() {
		return 9;
	}
}

class ICICI extends Bank{
	int getrateofInterest() {
		return 10;
	}
}

public class MethodOverridingExample {
	public static void main(String[] args) {
		SBI s = new SBI();
		HDFC h = new HDFC();
		ICICI i = new ICICI();
		
		System.out.println("Rate of Interest at SBI : "+s.getrateofInterest());
		System.out.println("Rate of Interest at HDFC : "+h.getrateofInterest());
		System.out.println("Rate of Interest at ICICI : "+i.getrateofInterest());
	}
}
