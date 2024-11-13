class Sion extends Campeao {
    public Sion(Classe classe) {
        super(
            "Sion",
            "Mana",
            "Sion é um grande guerreiro Noxiano, ressuscitado para lutar pela sua pátria com força imensa.",
            new String[]{"Passiva: Ressurreição Indomável", "Q: Destruição Devastadora", "W: Ruptura da Força", "E: Atropelamento", "R: Grito de Guerra"},
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
    