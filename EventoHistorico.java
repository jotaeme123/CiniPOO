public class EventoHistorico {

    /// Atributos da classe:
    private String lore;
    private String liderEvento;

    /// Construtor da classe:
    public EventoHistorico(String lore, String liderEvento){
        this.lore = lore;
        this.liderEvento = liderEvento;
    }

    protected String contarHistorinha(){
        return lore;
    }
    }
}
