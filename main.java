
import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int power = 1, saves = 0, o =0;
		int save[] = new int[6];
		
		
		do{

			int x = 0;
			if (saves == 1) {

				System.out.println("Voulez vous utilisez une sauvegarde ?");
				System.out.println("0 : Non");
				System.out.println("1 : Oui");
				
				o = sc.nextInt();

				if (o == 1) {
					for (int i = 0; i < save.length; i++) {
					System.out.println( i+1 + " : " + save[i]);
					}

					int u = 0;
					System.out.println("Quelle valeur voulez vous utilisez comme la première ?");
					u = sc.nextInt() - 1;
					x = save[u];

				}
				
			}
			
			if (o == 0){

				System.out.println("Première valeur : ");
				x = sc.nextInt();
			}
			
			int op = 0;
			
			while (op < 1 || op > 8){
			
				System.out.println("Opération : ");
				System.out.println("1 : +");
				System.out.println("2 : -");
				System.out.println("3 : *");
				System.out.println("4 : /");
				System.out.println("5 : % (x % de y)");
				System.out.println("6 : augmentation en %");
				System.out.println("7 : réduction en %");
				System.out.println("8 : ^ (exposant)");
				 
				op = sc.nextInt();
				
				if (op < 1 || op > 8){
					System.out.println("Veuillez rentrer un choix valide");
				}
			}//Opération à faire
			

			System.out.println("Deuxième valeur : ");
			int y = sc.nextInt();
			
			while (y == 0 && op == 4){
				System.out.println("Vous ne pouvez pas divisez par zéro");
				System.out.println("Deuxième valeur : ");
				y = sc.nextInt();
			}//Pour ne pas diviser par 0
			
			int end = 0;
			
			
			switch (op){
			
			case 1:
				end = x + y;
				break;
				
			case 2:
				end = x - y;
				break;
				
			case 3:
				end = x * y;
				break;
				
			case 4:
				end = x / y;
				break;
				
			case 5:
				
				end = x * 100 / y ;
				
				break;

			case 6:

				end = x + x * y / 100;
				break;

			case 7:

				end = x - x * y / 100;
				break;
				
			case 8:
				
				int ex = 2;
				end = x;
				
				while (ex <= y){
					
					end = x * x ;
					x = end ;
					ex += 1;
							
					break;
					
				}
				
			
			}
			
			
			System.out.println("Le résultat est :");
			System.out.println(end);


			int sauve = 0;
			System.out.println("Voulez vous sauvegarder cette valeur ?");
			System.out.println("0 : Non");
			System.out.println("1 : Oui");
			
			sauve = sc.nextInt();

			if ( sauve == 1) {//Processus de sauvegarde

				for (int i = 0; i < save.length; i++) {
					System.out.println( i+1 + " : " + save[i]);
				}

				int y1 = 0;

				while (y1 < 1 || y1 > 5){

					System.out.println("Dans quelle case voulez vous sauvegarder ?");
					y1 = sc.nextInt() -1;

					if (y1 < 0 || y1 > 5){
						System.out.println("Veuillez rentrer une case valide");
					}
				}//choix de la case

				save[y1] = x;
				saves = 1;
			}


			System.out.println("Voulez vous faire un autre calcul ?");
			System.out.println("0 : Non");
			System.out.println("1 : Oui");
			
			power = sc.nextInt();

		}while(power == 1);
	
	}
}
