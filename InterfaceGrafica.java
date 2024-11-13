import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class InterfaceGrafica {
    private static final JFrame frame = new JFrame("RUNETERRAS WOW");

    /// metodo para iniciar o painel
    public static void abrir(JPanel panel){
        frame.add(panel);

        frame.setSize(800, 500);
        frame.setLocationRelativeTo(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /// metodo para trocas de tela
    public void changePanel(JPanel panel){
        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.revalidate();
        frame.repaint();
    }

    /// metodo para mostrar tela
    public abstract JPanel mostrar();
}
