
package exemploarraylist01;

import java.util.ArrayList;

/**
 *
 * @author Gustavo
 */
public class Exemplo02 {
    
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Jennifer");
        nomes.add("Ponei");
        nomes.add("Eu aqui");
        //nomes.add("Homem da Cadeira Ambulante"); 
        
        int quantidadeDeItensNoArrayList = nomes.size();
        System.out.println(quantidadeDeItensNoArrayList);
        
        String nomes0 = nomes.get(0), nomes1 = nomes.get(1);
        String maiorNome = "" , menorNome = "";
        
        
        //if(nome0.length() > nome1.length()){
        
        if(nomes.get(0).length() > maiorNome.length()){
            maiorNome = nomes.get(0);
        }
        
        if(nomes.get(1).length() > maiorNome.length()){
            maiorNome = nomes.get(1);
        }
            System.out.println("Maior nome " + maiorNome);
         
        
        for(int i = 65;  i <= 90; i++){
            for (int j = 65; j <=  90; j++){
                menorNome += (char) i + "" + (char) j + "\n";
          }
                            
        }
        
        System.out.println(menorNome);
        if(nomes.get(0).length() < menorNome.length()){
            menorNome = nomes.get(0);
        }
        if(nomes.get(1).length() < menorNome.length()){
            menorNome = nomes.get(1);
        }
        System.out.println("Maior nome: " + maiorNome);
        System.out.println("Menor nome: " + menorNome);
        
        
        
        
    }
    
}
