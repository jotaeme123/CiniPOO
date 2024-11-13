class Lulu extends Campeao {
    public Lulu(Classe classe) {
        super(
           "Lulu",
            "Mana",
            "Lulu é uma yordle que utiliza sua magia para ajudar seus aliados e transformar seus inimigos em criaturas inofensivas.",
            new String[]{"Passiva: Fada Guardiã", "Q: Atirar Magia", "W: Transfigurar", "E: Polimorfia", "R: Crescimento Fabuloso"},
            classe
        );
    }

    @Override
    public void explicarHabilidades() {
        System.out.println("Habilidades de Lulu:");
        for (String habilidade : getHabilidades()) {
            System.out.println("- " + habilidade);
        }
    }
}
    