
public class GenderDecision {
	String GenderDecisionNew( int no) {
		if ( no==1 ) {
			return "Boy";
		}
		else if ( no ==2 )
		{
			return "Girl";
		} else 
		{
			return "Nill";
		}
		
		}
	public static void main(String[] args) {
		GenderDecision n = new GenderDecision ();
		System.out.println( n.GenderDecisionNew(10));
	}
	

}
