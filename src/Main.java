
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nombre = 6539;
		
		NombresRemarquables.enumererChiffres(nombre);
		
		//exemple de nombre simili-carre 25,76,376,625
		int nbrSimiCarre = 25;
		System.out.println("\nResultat si simili-carré : " + NombresRemarquables.estSimiliCarre(nbrSimiCarre));  
		
		int extraPremier = 59399;
		System.out.println("\nResultat si extra-premier : " + NombresRemarquables.estExtraPremier(extraPremier));  
	}

}
