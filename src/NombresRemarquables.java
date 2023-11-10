
public class NombresRemarquables {
	
	public static void enumererChiffres(int n) 
	{
		
		if(n<0) { // si n est negatif
			n= -n; // prendre la valeur absolue du nombre pour le traitement
			System.out.print("- "); // afficher le signe - au debut
		}else if(0 == n ) { 
			System.out.println(n); // aucun traitement si n = 0
			return; 
		}
		
		while(n > 0) {
			int chiffre = n % 10; // recupérer le chiffre des unités
			if (n >= 10) {
		        System.out.print(chiffre + ","); // Ajouter une virgule si ce n'est pas le dernier chiffre
		    } else {
		        System.out.print(chiffre); // Ne pas ajouter de virgule pour le dernier chiffre
		    }
			n = n/10; // Décaler le chiifres à droite
		}
		
	}
	
	public static boolean estSimiliCarre(int n) {
		// si n < 0 on prend sa valeur absolue
		int nombreAbsolu = (n < 0) ? -n : n; 
		int carreNombre = n * n;
		int nombreAcomparer = nombreAbsolu; // si c'est different lors de l'enumeration on arrete
		
		//boucle pour comparer des chiffres de droite à gauche 
		while (nombreAcomparer > 0) {
			if(nombreAcomparer % 10 != carreNombre % 10) { // si la condition est vraie alors pas de simili-carré
				return false;
			}
			nombreAcomparer = nombreAcomparer / 10;
			carreNombre = carreNombre / 10;
		}
		
		return true;
	}
	
	public static boolean estPremier(int n) {
		//Les nombres <= à 1 ne sont pas premiers
		if(n <= 1) {
			return false;
		}
		
		//la condition i * i <=n => la boucle continue tant que le carré de i est <= à n;
		for(int i=2; i * i <= n; i++) {
			if(n % i == 0) {
				return false; // si n est divisible par i => n n'est pas premier
			}
		}
		
		return true; // n % i == 0 => n est premier 
	}
	
	public static boolean estExtraPremier(int n) {
		
		int nombreSansDernierChiffreDeN = n;
		 
		while(n > 0) {  
			 
			
			if(!estPremier(nombreSansDernierChiffreDeN)) {
				return false; // si le nombre sans le derier chiffre n'est pas premier => n != extre-premier
			}
			
		 	n /= 10; // enlever le dernier chiffre 	
		 	nombreSansDernierChiffreDeN = n; 
		 	 
		}
		
		return true;
	}

}
