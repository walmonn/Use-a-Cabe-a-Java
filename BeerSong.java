public class BeerSong {
   public static void main (String[] args) {
     int beerNum = 99;
     String word = "garrafa";
     	
     while (beerNum > 0) {
	
	if (beerNum == 1) {
	   word = "garrafa";
        }	

	

	if (beerNum > 0) {
	   System.out.println(beerNum + " " + word + " de cerveja na parede");
	   System.out.println("Derrube uma.");
	   beerNum = beerNum - 1;
	   System.out.println("Sobrou " + beerNum + " " + word + " de cerveja");		   
           System.out.println("Passe para proxima.");		
        } else {
           System.out.println("Acabaram as garrafas de cerveja na parede");
        }
     }
  }
}