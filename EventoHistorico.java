public class EventoHistorico {

    /// Atributos da classe:
    private String lore;

    /// Construtor da classe:
    public EventoHistorico(String lore){
        this.lore = lore;
    }


    /// Getter para retornar a lore de cada evento histórico:
    protected String getLore(){
        return lore;
    }

    /// Setter para definir a lore
    protected void setLore(String lore){
        this.lore = lore;
    }
    }

