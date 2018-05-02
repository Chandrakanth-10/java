package money.com.rbi;

public class TestMoney {
	public static void main(String[] args) {
		Money m1 = new Money();
		Money m2 = new Money();
		Money m3 = new Money();
	
		m1.color = "blue";
		m1.price = 50;
		m1.height = 5.2;
		
		
		m2.color = "pink";
		m2.price = 2000;
		m2.height = 9.2;
		
		m3.color = "green";
		m3.price = 100;
		m3.height = 7.2;
		
		System.out.println(m1);
		System.out.println(m1.color + " " + m1.price + " " + m1.height);
		System.out.println(m2);
		System.out.println(m2.color + " " + m2.price + " " + m2.height);
		System.out.println(m3);
		System.out.println(m3.color + " " + m3.price + " " + m3.height);
	}
}
