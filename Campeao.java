public abstract class Campeao {
    private String nome;
    private String recurso;
    private String historia;
    private String[] habilidades;
    private Classe classe;

    public Campeao(String nome, String recurso, String historia, String[] habilidades, Classe classe) {
        this.nome = nome;
        this.recurso = recurso;
        this.historia = historia;
        this.habilidades = habilidades;
        this.classe = classe;
    }

    public void explicarHabilidades() {
        System.out.println("Cada campeão possui um conjunto de habilidades único!");
    }

    public void mostrarInformacoesCampeao() {
        System.out.println("\nNome: " + getNome());
        System.out.println("Recurso: " + getRecurso());
        System.out.println("História: " + getHistoria());
        classe.mostrarEstilo();
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getRecurso() {
        return recurso;
    }

    public String getHistoria() {
        return historia;
    }

    public String[] getHabilidades() {
        return habilidades;
    }

    // Setter
    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
}
