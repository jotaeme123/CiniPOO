public class Main {
    public static void main(String[] args) {
        // Região 1: Noxus
        Regiao noxus = new Regiao("Noxus", "Darius","  'Noxus é um império ambicioso e militarista, conhecido por sua busca incessante por poder e controle. Sob a liderança de generais como Darius,\n Noxus lança campanhas de conquista, subjugando diversas regiões, incluindo Ionia. Essa expansão brutal gera não apenas resistência nas terras\n invadidas, mas também conflitos internos entre facções no próprio império. A luta pela supremacia e a brutalidade das guerras moldam a política\n e a sociedade de Noxus, onde a força é a principal moeda de poder.'");
        EventoHistorico eventoNoxus = new EventoHistorico("  'Expansão Territorial: Noxus buscava expandir seu império e, sob generais como Darius, lançou campanhas de conquista. Essa busca por poder\n resultou na subjugação de várias regiões, incluindo Ionia. Contudo, a brutalidade das guerras gerou divisões internas,\n desafiando a unidade do império.'","");

        System.out.println(" -- NOXUS: --");
        System.out.println(" HISTÓRIA DA REGIÃO:");
        System.out.println(noxus.contarHistoria());
        System.out.println(" ");
        System.out.println(" LIDER DA REGIÃO:");
        System.out.println(noxus.verificarLider());
        System.out.println(" ");
        System.out.println(" PRINCIPAL EVENTO HISTÓRICO DA REGIÃO:");
        System.out.println(eventoNoxus.contarHistorinha());
        System.out.println(" ");

        // Região 2: Bandópolis
        Regiao bandopolis = new Regiao("Bandópolis", "", "  'Bandle City é uma terra mágica habitada por yordles curiosos e brincalhões. Esses seres adoram explorar o mundo ao seu redor e, durante a\n Grande Viagem, saem em aventuras para outros lugares. Personagens como Teemo, Lulu e Rumble levam sua alegria e travessuras, interagindo\n com culturas e criando novas amizades. Suas aventuras trazem tanto diversão quanto desafios, e ajudam a expandir a percepção sobre os yordles,\n mostrando que, embora sejam travessos, também são corajosos e leais.'");
        EventoHistorico eventoBandopolis = new EventoHistorico("  'A Grande Viagem: Bandle City é habitada por yordles curiosos que, durante a Grande Viagem, exploraram outros mundos. Teemo, Lulu e Rumble\n trouxeram sua magia e travessuras, criando novas amizades e enfrentando desafios. Essas aventuras ampliaram a cultura yordle e fortaleceram seu\n espírito brincalhão.'", "Viktor");

        System.out.println(" -- BANDÓPOLIS: --");
        System.out.println(" HISTÓRIA DA REGIÃO:");
        System.out.println(bandopolis.contarHistoria());
        System.out.println(" ");
        System.out.println(" LIDER DA REGIÃO:");
        System.out.println(bandopolis.verificarLider());
        System.out.println(" ");
        System.out.println(" PRINCIPAL EVENTO HISTÓRICO DA REGIÃO:");
        System.out.println(eventoBandopolis.contarHistorinha());
        System.out.println(" ");

        // Região 3: Ionia
        Regiao ionia = new Regiao("Ionia","Shen","  'A região de Ionia é um refúgio de tranquilidade e espiritualidade, onde a harmonia entre a natureza e as tradições é fundamental. No entanto, essa paz é \n brutalmente interrompida pela invasão do império de Noxus. Os guerreiros ionianos, liderados por figuras como Shen e Kennen, \n lutam para proteger suas terras sagradas e preservar suas tradições. A guerra traz destruição, mas também fortalece o espírito de \n resistência do povo, moldando uma nova identidade em meio ao conflito.'");
        EventoHistorico eventoIonia = new EventoHistorico("  'Guerra das Runas: Ionia era um lugar de paz até ser invadida por Noxus. Durante a guerra, os guerreiros ionianos, liderados por Shen e Kennen,\n lutaram para defender suas terras e preservar suas tradições. Apesar da destruição, a resistência do povo ioniano emergiu mais forte,\n moldando sua identidade.'", "Shen");

        System.out.println(" -- IONIA: --");
        System.out.println(" HISTÓRIA DA REGIÃO:");
        System.out.println(" ");
        System.out.println(ionia.contarHistoria());
        System.out.println(" ");
        System.out.println(" LIDER DA REGIÃO:");
        System.out.println(ionia.verificarLider());
        System.out.println(" ");
        System.out.println(" PRINCIPAL EVENTO HISTÓRICO DA REGIÃO:");
        System.out.println(eventoIonia.contarHistorinha());
    }
}
