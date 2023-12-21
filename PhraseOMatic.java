public class PhraseOMatic {
   public static void main (String[] args) {

// 1 - crie três conjuntos de palavras onde será feita a seleção. Adicione o que quiser!

      String[] wordListOne = {"24/7" , "várias camadas", "30.000 pés", "B-to-B", "Todos ganham", "front-end", "baseado na Web", "difundido", "inteligente", "seis sigma", "caminho critico", "dinamico"};
 
      String[] wordListTwo = {"habilitado", "adesivo", "valor agregado", "oritentado", "Central", "distribuido", "agrupado", "Solidificado", "independente da maquina","posicionado", "em rede", "dedicado", "alavancado", "alinhado", "destinado", "compartilhado", "cooperativo", "acelerado"};

      String[] wordListThree = {"processo", "ponto maximo", "solucao", "arquitetura", "habilitacao no nucleo", "estrategia", "mindshare", "portal", "espaco", "visao", "paradigma", "missao"};

// 2 - descubra quantas palavras existem em cada lista.

      int oneLength = wordListOne.length;
      int twoLength = wordListTwo.length;
      int threeLength = wordListThree.length;

// 3 - gere tres números aleatórios.

      int rand1 = (int) (Math.random() * oneLength);	 
      int rand2 = (int) (Math.random() * twoLength);
      int rand3 = (int) (Math.random() * threeLength);

// 4 - agora construa uma frase

      String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];	 

// 5 - exiba a frase.

      System.out.println("Precisammos de " + phrase);
    		
   }	
}