
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

}
