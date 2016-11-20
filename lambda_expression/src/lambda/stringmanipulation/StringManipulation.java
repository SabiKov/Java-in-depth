package lambda.stringmanipulation;

public class StringManipulation {

	public static void main(String[] args) {
		
		String random = "ffsdfdhfghzjhmbvyxceqwthgh45756vbnnv3rwzfbnuzi675";
		
		//Before Java 8
		for(int i = 0; i < random.length(); i++) {
			
			if(Character.isDigit(random.charAt(i))) {
				//System.out.println(random.charAt(i));
			}
		}
		
		//Java 8
		
		random.chars()
			.filter(Character::isDigit)
			.map(Character::getNumericValue)
			.forEach(System.out::println);
	}
}
