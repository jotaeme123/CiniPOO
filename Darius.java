
public class Darius extends Campeao {

    public Darius(Classe classe) {
        super(
                "Darius",
                "Mana",
                "Darius é o líder das forças de Noxus e um dos guerreiros mais temidos em Valoran. Ele é conhecido por sua força bruta e determinação inabalável.",
                new String[] {"Dizimar", "Ataque Mutilador", "Guilhotina de Noxus", "Hemorragia"},
                classe
        );
    }

    @Override
public void explicarHabilidades() {
    System.out.println("Habilidades de Darius:");
    for (String habilidade : getHabilidades()) {
        System.out.println("- " + habilidade);
    }
}
}

