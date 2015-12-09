
package fps;


public class Arma extends Item {
    
    private Integer Dano; 
    private Integer Peso ; 
    private Integer Pente; 
    private Integer Municao; 
    private Integer BalasNoPente;
    private Integer TamanhoPente;
    
    Arma(){
        this.Dano = 0;
        this.Peso = 0;
        this.Pente =0 ;
        this.BalasNoPente = 0; 
        this.Municao = 160;
        this.TamanhoPente = 40;
    }

    public Integer getTamanhoPente() {
        return TamanhoPente;
    }

    public void setTamanhoPente(Integer TamanhoPente) {
        this.TamanhoPente = TamanhoPente;
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

    public Integer getPente() {
        return Pente;
    }

    public void setPente(Integer Pente) {
        this.Pente = Pente;
    }

    public Integer getMunicao() {
        return Municao;
    }

    public void setMunicao(Integer Municao) {
        this.Municao = Municao;
    }

    public Integer getBalasNoPente() {
        return BalasNoPente;
    }

    public void setBalasNoPente(Integer BalasNoPente) {
        this.BalasNoPente = BalasNoPente;
    }
    
    public Boolean Atirar() { 
            
        Boolean Atirar; 
        
        if(Pente == 0 && Municao > 0) {
            Atirar = true;
            Recarregar(); 
            Pente = Pente - 1;
        }
            
        else if(Pente > 0) {
            Pente = Pente - 1 ; 
            Atirar = true; 
        }
        else{
            Atirar = false;
        } 
            
        return Atirar;
            
    } 
    public Boolean Recarregar() { 
        
        Boolean Recarregar; 
        
        if(Pente == 0 && Municao > 0) { 
            Recarregar = true;
            Pente = Pente + TamanhoPente ; 
            Municao = Municao - TamanhoPente;
        }
        else
        {
            Recarregar = false ;
        }
            
        return Recarregar;
    
    }
    
}
    
    
 
