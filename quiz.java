import java.util.Scanner;

public class quiz {
    
    public static void main(String[] args) {
		String pre = "Capital of ";// prefix like: whats. and then in the question array put the main part.
		String[] quest = {"Ireland","the Uk","Spain","Italy","Vanatu","Saudi Arabia"};// put question in this array
		String[] ans = {"dublin","london","madrid","rome","port vila","riyadh"};// put answer in this array
		int k = 0;
		int score = 0;
		while(k>-1) {
			System.out.println(pre +quest[k]+"? ");
			Scanner scan = new Scanner(System.in);
			String poo = scan.nextLine();
			poo.toLowerCase();
			if(poo.equals(ans[k])) {
				System.out.println("Well done! (dies of cringe)");
				score++;
			}else {
				System.out.println("Ur stoopid.");
			}
			if(k<quest.length) {
			k++;
			}
			if(k == quest.length) {
				System.out.println("well done, you got: "+ score +"/"+k);
			}
		}

	}

}


