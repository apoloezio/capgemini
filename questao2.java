public class Questao2 {
	
	public static void main(String[] args) {
		int[] vect = {1, 5, 3, 4, 2};
		
		System.out.printl(calculaPares(vect, 2));
	}
	
	public static int calculaPares(int[] vect, int diferenca) {
		int contaPares = 0;
		
		for(int i =0; i < vect.length; i++) {
			for(int j =0; j < vect.length; j++) {
				if(vect[i] - diferenca == vect[j]) {
					contaPares++;
				}
			}
		}
		
		return contaPares;
	}

}
module questao2 {
}