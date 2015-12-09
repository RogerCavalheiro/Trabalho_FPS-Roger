
package fps;


public class Personagem extends Item{
    
    private String Altura; 
    private Integer PorcentagemVida;
    private Integer ResistenciaDano;

    
    public Personagem(){ 
        this.Altura = null;
        this.PorcentagemVida = 100; 
        this.ResistenciaDano = 0;
        
        
    }

    public String getAltura() {
        return Altura;
    }

    public void setAltura(String Altura) {
        this.Altura = Altura;
    }

    public Integer getPorcentagemVida() {
        return PorcentagemVida;
    }

    public void setPorcentagemVida(Integer PorcentagemVida) {
        this.PorcentagemVida = PorcentagemVida;
    }

    public Integer getResistenciaDano() {
        return ResistenciaDano;
    }

    public void setResistenciaDano(Integer ResistenciaDano) {
        this.ResistenciaDano = ResistenciaDano;
    }

    
    
   

}
