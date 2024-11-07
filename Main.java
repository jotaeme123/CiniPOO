public class Main {
    // Método para imprimir informações sobre a região e evento histórico
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
        
        // Região 1: Noxus
        Regiao noxus = new Regiao("", "Darius", "");
        EventoHistorico eventoNoxus = new EventoHistorico("");
            noxus.setNome("Noxus");
            noxus.setHistoria("'Noxus é um império ambicioso e militarista, conhecido por sua busca incessante por poder e controle. Sob a liderança de generais como Darius,\n Noxus lança campanhas de conquista, subjugando diversas regiões, incluindo Ionia. Essa expansão brutal gera não apenas resistência nas terras\n invadidas, mas também conflitos internos entre facções no próprio império. A luta pela supremacia e a brutalidade das guerras moldam a política\n e a sociedade de Noxus, onde a força é a principal moeda de poder.'");
            eventoNoxus.setLore("'Expansão Territorial: Noxus buscava expandir seu império e, sob generais como Darius, lançou campanhas de conquista. Essa busca por poder\n resultou na subjugação de várias regiões, incluindo Ionia. Contudo, a brutalidade das guerras gerou divisões internas,\n desafiando a unidade do império.'");
            imprimirInformacoesRegiao(noxus, eventoNoxus);

        // Região 2: Bandópolis
        Regiao bandopolis = new Regiao("", "", "");
        EventoHistorico eventoBandopolis = new EventoHistorico("");
            bandopolis.setNome("Bandópolis");
            bandopolis.setHistoria("Bandle City é uma terra mágica habitada por yordles curiosos e brincalhões. Esses seres adoram explorar o mundo ao seu redor e, durante a\n Grande Viagem, saem em aventuras para outros lugares. Personagens como Teemo, Lulu e Rumble levam sua alegria e travessuras, interagindo\n com culturas e criando novas amizades. Suas aventuras trazem tanto diversão quanto desafios, e ajudam a expandir a percepção sobre os yordles,\n mostrando que, embora sejam travessos, também são corajosos e leais.'");
            eventoBandopolis.setLore("A Grande Viagem: Bandle City é habitada por yordles curiosos que, durante a Grande Viagem, exploraram outros mundos. Teemo, Lulu e Rumble\n trouxeram sua magia e travessuras, criando novas amizades e enfrentando desafios. Essas aventuras ampliaram a cultura yordle e fortaleceram seu\n espírito brincalhão.'");
            imprimirInformacoesRegiao(bandopolis, eventoBandopolis);

        // Região 3: Ionia
        Regiao ionia = new Regiao("Ionia", "Shen", "");
        EventoHistorico eventoIonia = new EventoHistorico("");
            ionia.setNome("Ionia");
            ionia.setHistoria("'A região de Ionia é um refúgio de tranquilidade e espiritualidade, onde a harmonia entre a natureza e as tradições é fundamental. No entanto, essa paz é \n brutalmente interrompida pela invasão do império de Noxus. Os guerreiros ionianos, liderados por figuras como Shen e Kennen, \n lutam para proteger suas terras sagradas e preservar suas tradições. A guerra traz destruição, mas também fortalece o espírito de \n resistência do povo, moldando uma nova identidade em meio ao conflito.'");    
            eventoIonia.setLore("'Guerra das Runas: Ionia era um lugar de paz até ser invadida por Noxus. Durante a guerra, os guerreiros ionianos, liderados por Shen e Kennen,\n lutaram para defender suas terras e preservar suas tradições. Apesar da destruição, a resistência do povo ioniano emergiu mais forte,\n moldando sua identidade.'");
            imprimirInformacoesRegiao(ionia, eventoIonia);

        
        Campeao yasuo = new Yasuo();
        yasuo.mostrarInformacoesCampeao();
        yasuo.explicarHabilidades();

        Campeao darius = new Darius();
        darius.mostrarInformacoesCampeao(); // Mostra informações de Darius
        darius.explicarHabilidades(); // Explica as habilidades de Darius

        /// instanciando a classe filemanager na main e usando o construtor
        FileManager fmcsv = new FileManager("./database/arquivo.csv");
        FileManager fmtxt = new FileManager("./database/arquivo.txt");

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
