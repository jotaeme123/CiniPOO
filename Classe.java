import java.util.ArrayList;
import java.util.List;

class Classe {
    private String nome;
    private String descricao;
    private List<Campeao> campeoes; 

    public Classe(String nomeClasse, String descricao) {
        this.nome = nomeClasse;
        this.descricao = descricao;
        this.campeoes = new ArrayList<>(); 
    }

    public void mostrarEstilo() {
        System.out.println("Classe: " + getNome());
        System.out.println("Descrição: " + getDescricao());
    }

    public void adicionarCampeao(Campeao campeao) {
        campeoes.add(campeao); 
    }

    public List<Campeao> getCampeoes() {
        return campeoes; 
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void mostrarCampeoes() {
        if (campeoes.isEmpty()) {
            System.out.println("Não há campeões associados a esta classe.");
        } else {
            System.out.println("Campeões da Classe " + nome + ":");
            for (Campeao campeao : campeoes) {
                System.out.println("- " + campeao.getNome());
            }
        }
    }
    
    

    // Subclasse Lutador
    public static class Lutador extends Classe {
        public Lutador() {
            super("Lutador", "Campeões com boa combinação de dano e resistência, ideais para combater de perto e controlar áreas no campo de batalha.");
        }
    }

    public static class Mago extends Classe {
        public Mago() {
            super("Mago", "Campeões que causam grande dano à distância com habilidades mágicas, mas são geralmente frágeis e focam em controle e dano em área.");
        }
    }
    
    public static class Tank extends Classe {
        public Tank() {
            super("Tank", "Campeões com alta resistência, responsáveis por absorver dano e proteger os aliados, geralmente atuando como \"frontline\" nas lutas.");
        }
    }

    public static class Suporte extends Classe {
        public Suporte() {
            super("Suporte", "Campeões focados em ajudar os aliados, proporcionando cura, escudos, controle de inimigos e buffs, essenciais para manter a equipe viva e forte durante as batalhas.");
        }
    }
}