public class Main {
    /// método para imprimir informações sobre a região e evento histórico
    public static void imprimirInformacoesRegiao(Regiao regiao, EventoHistorico evento) {
        System.out.println(" -- " + regiao.getNome() + ": --");
        System.out.println(" HISTÓRIA DA REGIÃO:");
        System.out.println(regiao.getHistoria());
        System.out.println(" ");
        System.out.println(" LÍDER DA REGIÃO:");
        System.out.println(regiao.verificarLider());
        System.out.println(" ");
        System.out.println(" PRINCIPAL EVENTO HISTÓRICO DA REGIÃO:");
        System.out.println(evento.getLore());
        System.out.println(" ");
    }
   public static void main(String[] args) {

        /// abrir interface grafica
        InterfaceGrafica.abrir(new Home().mostrar());


         /// Região 1: Noxus
        Regiao noxus = new Regiao("", "Darius", "");
        EventoHistorico eventoNoxus = new EventoHistorico("");
            noxus.setNome("Noxus");
            noxus.setHistoria("'Noxus é um império ambicioso e militarista, conhecido por sua busca incessante por poder e controle. Sob a liderança de generais como Darius,\n Noxus lança campanhas de conquista, subjugando diversas regiões, incluindo Ionia. Essa expansão brutal gera não apenas resistência nas terras\n invadidas, mas também conflitos internos entre facções no próprio império. A luta pela supremacia e a brutalidade das guerras moldam a política\n e a sociedade de Noxus, onde a força é a principal moeda de poder.'");
            eventoNoxus.setLore("'Expansão Territorial: Noxus buscava expandir seu império e, sob generais como Darius, lançou campanhas de conquista. Essa busca por poder\n resultou na subjugação de várias regiões, incluindo Ionia. Contudo, a brutalidade das guerras gerou divisões internas,\n desafiando a unidade do império.'");
            imprimirInformacoesRegiao(noxus, eventoNoxus);

        /// Região 2: Bandópolis
        Regiao bandopolis = new Regiao("", "", "");
        EventoHistorico eventoBandopolis = new EventoHistorico("");
            bandopolis.setNome("Bandópolis");
            bandopolis.setHistoria("Bandle City é uma terra mágica habitada por yordles curiosos e brincalhões. Esses seres adoram explorar o mundo ao seu redor e, durante a\n Grande Viagem, saem em aventuras para outros lugares. Personagens como Teemo, Lulu e Rumble levam sua alegria e travessuras, interagindo\n com culturas e criando novas amizades. Suas aventuras trazem tanto diversão quanto desafios, e ajudam a expandir a percepção sobre os yordles,\n mostrando que, embora sejam travessos, também são corajosos e leais.'");
            eventoBandopolis.setLore("A Grande Viagem: Bandle City é habitada por yordles curiosos que, durante a Grande Viagem, exploraram outros mundos. Teemo, Lulu e Rumble\n trouxeram sua magia e travessuras, criando novas amizades e enfrentando desafios. Essas aventuras ampliaram a cultura yordle e fortaleceram seu\n espírito brincalhão.'");
            imprimirInformacoesRegiao(bandopolis, eventoBandopolis);

        /// Região 3: Ionia
        Regiao ionia = new Regiao("Ionia", "Shen", "");
        EventoHistorico eventoIonia = new EventoHistorico("");
            ionia.setNome("Ionia");
            ionia.setHistoria("'A região de Ionia é um refúgio de tranquilidade e espiritualidade, onde a harmonia entre a natureza e as tradições é fundamental. No entanto, essa paz é \n brutalmente interrompida pela invasão do império de Noxus. Os guerreiros ionianos, liderados por figuras como Shen e Kennen, \n lutam para proteger suas terras sagradas e preservar suas tradições. A guerra traz destruição, mas também fortalece o espírito de \n resistência do povo, moldando uma nova identidade em meio ao conflito.'");    
            eventoIonia.setLore("'Guerra das Runas: Ionia era um lugar de paz até ser invadida por Noxus. Durante a guerra, os guerreiros ionianos, liderados por Shen e Kennen,\n lutaram para defender suas terras e preservar suas tradições. Apesar da destruição, a resistência do povo ioniano emergiu mais forte,\n moldando sua identidade.'");
            imprimirInformacoesRegiao(ionia, eventoIonia);

        Classe.Lutador classeLutador = new Classe.Lutador();
        Classe.Mago classeMago = new Classe.Mago();
        Classe.Tank classeTank = new Classe.Tank();
        Classe.Suporte classeSuporte = new Classe.Suporte();
    
        /// cria os campeões
        Campeao yasuo = new Yasuo(classeLutador);
        Campeao darius = new Darius(classeLutador);
        Campeao karma = new Karma(classeMago);
        Campeao sion = new Sion(classeTank);
        Campeao lulu = new Lulu(classeSuporte);
            
        yasuo.mostrarInformacoesCampeao();
        yasuo.explicarHabilidades();
    
        darius.mostrarInformacoesCampeao();
        darius.explicarHabilidades();
    
        karma.mostrarInformacoesCampeao();
        karma.explicarHabilidades();
    
        sion.mostrarInformacoesCampeao();
        sion.explicarHabilidades();
    
        lulu.mostrarInformacoesCampeao();
        lulu.explicarHabilidades();
    
        /// exibe os campeões associados a cada classe
        System.out.println("\n" + "--------------------------");
        classeLutador.mostrarCampeoes();
        System.out.println("--------------------------");
        classeMago.mostrarCampeoes();
        System.out.println("--------------------------");
        classeTank.mostrarCampeoes();
        System.out.println("--------------------------");
        classeSuporte.mostrarCampeoes();    
        System.out.println("\n" + "--------------------------");
        
        Item item1 = new Item("Espada do Rei Destruído", "Dano físico e roubo de vida", 3200, 40, 0, 0, 0, 20);
        item1.exibirDetalhes();
        System.out.println("\n" + "--------------------------");
        Item item2 = new Item("Capuz da Morte de Rabadon", "Aumenta muito o poder mágico", 3600, 0, 0, 120, 0, 0);
        item2.exibirDetalhes();

       /// instanciando a classe filemanager na main e usando o construtor
        FileManager fmcsv = new FileManager("./database/arquivo.csv");
        FileManager fmtxt = new FileManager("./database/arquivo.txt");

        System.out.println("\n" + "--------------------------");
        System.out.println("===========================");
        System.out.println("PROCURANDO ALGO ESCONDIDO....");
        System.out.println("VOCÊ ACHOU UM LIVRO SOBRE RUNETERRA:");
        System.out.println("LENDO 1 CAPITULO... (LENDO ARQUIVOS CSV:)");
        fmcsv.scannerLerArquivo();   
        System.out.println("===========================");
        System.out.println("LENDO 2 CAPITULO... (LENDO ARQUIVOS TXT:)");
        fmtxt.BuffereReaderlerArquivos();
        fmcsv.escreveArquivo();
    }
}
