public class Item {
    private String nome;
    private String descricao;
    private int preco;
    private int dano;
    private int armadura;
    private int poderMagico;
    private int vida;
    private int velocidadeAtaque;

    // Construtor
    public Item(String nome, String descricao, int preco, int dano, int armadura, int poderMagico, int vida, int velocidadeAtaque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.dano = dano;
        this.armadura = armadura;
        this.poderMagico = poderMagico;
        this.vida = vida;
        this.velocidadeAtaque = velocidadeAtaque;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getDano() {
        return dano;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getPoderMagico() {
        return poderMagico;
    }

    public void setPoderMagico(int poderMagico) {
        this.poderMagico = poderMagico;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidadeAtaque() {
        return velocidadeAtaque;
    }

    public void setVelocidadeAtaque(int velocidadeAtaque) {
        this.velocidadeAtaque = velocidadeAtaque;
    }

    // Método para exibir detalhes do item
    public void exibirDetalhes() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Preço: " + preco);
        System.out.println("Dano: " + dano);
        System.out.println("Armadura: " + armadura);
        System.out.println("Poder Mágico: " + poderMagico);
        System.out.println("Vida: " + vida);
        System.out.println("Velocidade de Ataque: " + velocidadeAtaque);
    }
}
