
package fps;


public class Granada extends Item {
    
    private Integer Dano; 
    private Integer Peso; 
    private Integer AreaExplosao;

    Granada(){
       
       this.Dano = 0; 
       this.Peso = 0;
    }
    
    public Integer getDano() {
        return Dano;
    }

    public void setDano(Integer Dano) {
        this.Dano = Dano;
    }

    public Integer getPeso() {
        return Peso;
    }

    public void setPeso(Integer Peso) {
        this.Peso = Peso;
    }

    public Integer getAreaExplosao() {
        return AreaExplosao;
    }

    public void setAreaExplosao(Integer AreaExplosao) {
        this.AreaExplosao = AreaExplosao;
    }
    
    
}
