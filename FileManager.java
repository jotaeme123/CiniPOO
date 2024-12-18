import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.List;
import java.util.Random; 



public class FileManager {
    /// atributo da classe filemanager
    private String Arquivo;
    private Random random = new Random();
    String[][] lista = {
        {"Demacia", "Jarvan IV", "" + random.nextInt(100000)},
        {"Piltover", "Caitlyn", "" + random.nextInt(100000)},
        {"Zaun", "Ekko", "" + random.nextInt(100000)},
        {"Freljord", "Ashe", "" + random.nextInt(100000)},
        {"Shurima", "Azir", "" + random.nextInt(100000)}
    };

    /// construtor da classe filemanager
    public FileManager(String Arquivo) {
        this.Arquivo = Arquivo;
    }

    /// método criado para ler o arquivo csv ou txt
    public void scannerLerArquivo() {
        File file = new File(Arquivo);  // variável file criada que utiliza o atributo Arquivo
        try {
            Scanner scanner = new Scanner(file);

            // Verifica se há uma linha para ler
            if (scanner.hasNextLine()) {
                String comecoArq = scanner.nextLine();
                System.out.println(comecoArq);  // Exibe o cabeçalho
            }

            while (scanner.hasNextLine()) {  // Enquanto houver mais linhas no arquivo
                String dado = scanner.nextLine();

                // Verifica se a linha não está vazia
                if (!dado.trim().isEmpty()) {
                    Scanner dadoSeparado = new Scanner(dado).useDelimiter(",");

                    // Verifica se há dados suficientes na linha
                    if (dadoSeparado.hasNext()) {
                        System.out.println("Nome da Região : " + dadoSeparado.next());
                    }
                    if (dadoSeparado.hasNext()) {
                        System.out.println("Líder : " + dadoSeparado.next());
                    }
                    if (dadoSeparado.hasNextInt()) {
                        System.out.println("População : " + dadoSeparado.nextInt());
                    } else {
                        System.out.println("deu ruim, torca pra isso nao acontecer de vdd");
                    }

                    dadoSeparado.close();  // Fecha o scanner da linha
                }
            }
            scanner.close();  // Fecha o scanner do arquivo
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /// método criado para ler arquivo txt
    public void BuffereReaderlerArquivos(){
        try {
            FileReader caminhoArquivo = new FileReader(Arquivo);
            BufferedReader br = new BufferedReader(caminhoArquivo);
            String comecoArq = br.readLine(); /// le a primeira linha do arquivo
            System.out.println(comecoArq); /// printa a primeira linha do arquivo
            while (br.ready()) {   /// loop para scanear enquanto ha linhas
               String dado = br.readLine();   
               String[] dadoSeparado = dado.split(","); /// cria uma array e separa pela ,
               List<String> dadoBom = Arrays.asList(dadoSeparado);
               System.out.println("Nome da Região: " + dadoBom.get(0));
               System.out.println("Líder da Região : " + dadoBom.get(1));
               System.out.println("Habitantes da Região : " + dadoBom.get(2));
 
            }
            br.close();

        } catch (Exception e) {
            e.printStackTrace();
        }    
    }

    public void escreveArquivo() {
        File arquivo = new File(Arquivo);
        try {
            FileWriter fileWriter = new FileWriter(arquivo, true);
            for(String [] valor:lista) {
                StringBuilder line = new StringBuilder();
                for(int i = 0; i < valor.length; i++) {
                    line.append(valor[i]);
                    if (i != valor.length  - 1) {
                        line.append(',');
                    }
                }
                line.append("\n");
                fileWriter.append(line.toString());
            }
            fileWriter.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

