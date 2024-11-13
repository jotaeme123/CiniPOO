import javax.swing.JButton;
import javax.swing.JPanel;

public class FilePanel extends InterfaceGrafica {
    private String tipo;
    private String caminhoArquivo;

    /// construtor da classe filepanel
    public FilePanel(String tipo, String caminhoArquivo){
        this.tipo = tipo;
        this.caminhoArquivo = caminhoArquivo;

    }

    @Override
    public JPanel mostrar(){
        FileManager fm = new FileManager(caminhoArquivo);

        JPanel panel = new JPanel();
        
        JButton scannerLerArquivo = new JButton("Ler " + tipo + " Scanner");
        scannerLerArquivo.addActionListener(e -> fm.scannerLerArquivo());

        JButton BuffereReaderlerArquivos = new JButton("Ler " + tipo + " BufferedReader");
        BuffereReaderlerArquivos.addActionListener(e -> fm.BuffereReaderlerArquivos());
        
        JButton escreveArquivo = new JButton("Escreve " + tipo);
        escreveArquivo.addActionListener(e -> fm.escreveArquivo());

        JButton sair = new JButton("Sair");
        sair.addActionListener(e -> changePanel(new Home().mostrar()));

        panel.add(scannerLerArquivo);
        panel.add(BuffereReaderlerArquivos);
        panel.add(escreveArquivo);
        panel.add(sair);
        return panel;

    }
    
}
