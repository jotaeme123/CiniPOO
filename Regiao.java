public class Regiao {
    private String nome;
    private String lider;
    private String historia;
    
    /// Construtor da classe
    public Regiao(String nome, String lider, String historia) {
        this.nome = nome;
        this.lider = lider;
        this.historia = historia;
    }

    protected String getNome(){
     return nome;
    }

    protected void setNome(String nome){
        this.nome = nome;
    }

    protected String getHistoria(){
        return historia;
    }

    protected void setHistoria(String historia){
        this.historia = historia;
    }
    
    /// Método para verificar se uma região possui ou não um líder - Caso não possua, imprime uma coisa - Caso possua, imprime outra.
    protected String verificarLider() {
        if (lider.isEmpty()) {
            return "  'A região de" + " " + nome + " " + "não possui nenhum líder oficial. Quem sabe você não pode ser o próximo?'";
        } else {
            return "  'A região de" + " " + nome + " " + "atualmente é liderada por" + " " + lider + "!'" ;
        }
    }
}
