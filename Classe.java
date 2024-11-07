public class Classe {
    private String nome;
    private String descricao;

    public Classe(String nomeClasse, String descricao) {
        this.nome = nomeClasse;
        this.descricao = descricao;
    }

    public void mostrarEstilo() {
        System.out.println("Classe: " + getNome());
        System.out.println("Descrição: " + getDescricao());
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    // Subclasse Lutador
    public static class Lutador extends Classe {
        public Lutador() {
            super("Lutador", "Campeão que tem grande resistência e controle de área.");
        }
    }
}
