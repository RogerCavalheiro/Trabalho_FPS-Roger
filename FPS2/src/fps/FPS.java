package fps;

import javax.swing.JOptionPane;


public class FPS {

    
    public static void main(String[] args) {
        
        Item item = new Item();
    
        Personagem personagem = new Personagem(); 
        
        Arma arma = new Arma();
        
        Jogador jogador = new Jogador();
        
        JOptionPane.showMessageDialog(null, jogador.Resumo());
        Arma a2 = new Arma();
        a2.setDescricao("AK-47");
        a2.setCash(100.0);
        a2.setDano(45);
        a2.setMunicao(100);
        
        jogador.setArma(a2);
        
      ;
    }

    
}
