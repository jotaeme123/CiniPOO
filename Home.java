import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.event.ActionListener;


public class Home extends InterfaceGrafica {

    @Override
    public JPanel mostrar() {
        JPanel panel = new JPanel();

        JButton buttonCSV = new JButton("CSV");
        buttonCSV.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                changePanel(new FilePanel("CSV", "./database/arquivo.csv").mostrar());    /// método de mudar painel + construtor da classe FilePanel é chamado e preenchido
            }
        });
        
        JButton buttonTXT = new JButton("TXT");
        buttonTXT.addActionListener(new ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent e) {
                changePanel(new FilePanel("TXT", "./database/arquivo.txt").mostrar());    /// método de mudar painel + construtor da classe FilePanel é chamado e preenchido
            }
        });





        panel.add(buttonCSV);
        panel.add(buttonTXT);
        return panel;
    }
}
    

