
package fps;


public class Item {
    
    private Double Gold; 
    private Double Cash;
    private String Descricao;

    public Item(){ 
    this.Cash = 0.0;
    this.Descricao = null;
    this.Gold = 0.0;
    
    }
    

    
    
    public Double getGold() {
        return Gold;
    }

    public void setGold(Double Gold) {
        this.Gold = Gold;
    }

    public Double getCash() {
        return Cash;
    }

    public void setCash(Double Cash) {
        this.Cash = Cash;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
    
    
}
            

