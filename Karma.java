class Karma extends Campeao {
    public Karma(Classe classe) {
        super(
            "Karma",
            "Mana",
            "Karma é uma sacerdotisa de Ionia que usa sua magia para curar aliados e causar dano aos inimigos.",
            new String[]{"Passiva: Coração de Karma", "Q: Lança do Espírito", "W: Caminho da Harmonia", "E: Escudo de Mantra", "R: Mantra"},
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
