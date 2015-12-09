package fps;

public class Jogador {
    private String nome;
    private String senha;
    private Arma arma;
    private Personagem personagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public Double getGold() {
        return gold;
    }

    public void setGold(Double gold) {
        this.gold = gold;
    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
    private Double gold;
    private Double cash;
    private Granada granada;

    public Granada getGranada() {
        return granada;
    }

    public void setGranada(Granada granada) {
        this.granada = granada;
    }
    
    public Jogador(){
        this.nome = "mssiedler";
        this.arma = new Arma();
        this.arma.setDescricao("JK-98 Paraguai");
        this.arma.setDano(5);
        this.arma.setMunicao(80);
        this.arma.setPente(20);
        this.cash = 0.0; 
        this.gold = 2000.0;
        this.granada =  new Granada();
        this.granada.setDescricao("k-300");
        this.personagem = new Personagem();
        this.personagem.setDescricao("Noob");
        this.personagem.setResistenciaDano(0);
        this.personagem.setPorcentagemVida(100);
        this.personagem.setAltura("1.90");
        
     
        
                
                
                
    }
    public String Resumo(){
        String retorno = null;
        retorno = this.nome + "\n" + this.arma + "\n" + this.cash + "\n" + this.gold + "\n" + this.personagem;
        return retorno;
    }
    
}
