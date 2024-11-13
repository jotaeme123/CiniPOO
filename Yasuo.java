public class Yasuo extends Campeao {

    public Yasuo(Classe classe) {
        super(
                "Yasuo",
                "Fluxo",
                "Yasuo é um espadachim ágil de Ionia, conhecido por sua habilidade de controlar o vento.",
                new String[] {"Tempestade de Aço", "Muralha de Vento", "Espada Ágil", "Último Suspiro"},
                classe
            
        );
    }

    @Override
public void explicarHabilidades() {
    System.out.println("Habilidades de Yasuo:");
    for (String habilidade : getHabilidades()) {
        System.out.println("- " + habilidade);
    }
}
}

