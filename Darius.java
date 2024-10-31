public class Darius extends Campeao {

    public Darius() {
        super(
                "Darius",
                "Mana",
                "Darius é o líder das forças de Noxus e um dos guerreiros mais temidos em Valoran. Ele é conhecido por sua força bruta e determinação inabalável.",
                new String[] {"Dizimar", "Ataque Mutilador", "Guilhotina de Noxus", "Hemorragia"},
                new Classe.Lutador() // Classe inicial como Lutador
        );
    }

    @Override
    public void explicarHabilidades() {
        System.out.println("Habilidades de Darius:");
        for (String habilidade : habilidades) {
            System.out.println("- " + habilidade);
        }
    }
}

