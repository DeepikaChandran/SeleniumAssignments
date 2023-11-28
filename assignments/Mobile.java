package week2.assignments;

public class Mobile {
	
	
	public void makeCall() {
		
		String mobileModel = "Moto G 10";
		float mobileWeight = 0.7f;	
		System.out.println("My mobile Model is :" + mobileModel);
		System.out.println("My mobile Weight is :" + mobileWeight);
	}

	
	public void sendMsg() {
		
		boolean isFullCharged = true;
		int mobileCost = 11500;
		System.out.println("My phone is fully charged? :" + isFullCharged);
		System.out.println("My mobile cost is :" + mobileCost);
		
		
	}
	
	public static void main(String[] args) {
		
		Mobile details = new Mobile();
		System.out.println("Below are my mobile details");
		details.makeCall();
		details.sendMsg();
		

	}

}
