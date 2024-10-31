public class Yasuo extends Campeao {

    public Yasuo() {
        super(
                "Yasuo",
                "Fluxo",
                "Yasuo é um espadachim ágil de Ionia, conhecido por sua habilidade de controlar o vento.",
                new String[] {"Tempestade de Aço", "Muralha de Vento", "Espada Ágil", "Último Suspiro"},
                new Classe.Lutador() 
            
        );
    }

    @Override
    public void explicarHabilidades() {
        System.out.println("Habilidades de Yasuo:");
        for (String habilidade : habilidades) {
            System.out.println("- " + habilidade);
        }
    }
}

