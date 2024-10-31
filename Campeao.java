public abstract class Campeao {
    protected String nome;
    protected String recurso;
    protected String historia;
    protected String[] habilidades;
    protected Classe classe;

    public Campeao(String nome, String recurso, String historia, String[] habilidades, Classe classe) {
        this.nome = nome;
        this.recurso = recurso;
        this.historia = historia;
        this.habilidades = habilidades;
        this.classe = classe;
    }

    // Método abstrato que cada campeão deve implementar
    public abstract void explicarHabilidades();

    public void mostrarInformacoesCampeao() {
        System.out.println("\nNome: " + nome);
        System.out.println("Recurso: " + recurso);
        System.out.println("História: " + historia);
        classe.mostrarEstilo();
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
