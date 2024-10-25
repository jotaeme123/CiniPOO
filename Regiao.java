public class Regiao {
    // Atributos da Classe Região:
    private String nome;
    private String lider;
    
    // Construtor da classe
    public Regiao(String nome, String lider) {
    this.nome = nome;
    this.lider = lider;
    }
    
    // Getter para Nome
    protected String getNome() {
    return nome;
    }
    
    // Getter para Lider
    protected String getLider() {
    return lider;
    }
    
    protected String verificarLider() {
    if (lider.isEmpty()) {
        return "A região de" + " " + nome + " " + "não possui nenhum líder oficial. Quem sabe você não pode ser o próximo?";
    } else {
        return "A região de" + " " + nome + " " + "é liderada por" + " " + lider + "!" ;
    }    
}
}

///teste
///teste 2
