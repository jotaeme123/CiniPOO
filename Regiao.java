public class Regiao {
    // Atributos da Classe Região:
    private String nome;
    private String lider;
    private String historia;
    // Construtor da classe
    public Regiao(String nome, String lider, String historia) {
        this.nome = nome;
        this.lider = lider;
        this.historia = historia;
    }

    protected String contarHistoria(){
        return historia;
    }



    protected String verificarLider() {
        if (lider.isEmpty()) {
            return "  'A região de" + " " + nome + " " + "não possui nenhum líder oficial. Quem sabe você não pode ser o próximo?'";
        } else {
            return "  'A região de" + " " + nome + " " + "é liderada por" + " " + lider + "!'" ;
        }
    }
}
