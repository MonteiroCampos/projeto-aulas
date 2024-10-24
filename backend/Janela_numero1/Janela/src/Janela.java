import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

public class Janela{
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Meu primeiro programa:)");
        janela.setSize(500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel labelElogio = new JLabel("Elogio: ");
        labelElogio.setBounds( 20, 20, 100, 20);

        JTextField caixaDoElogio = new JTextField();
        caixaDoElogio.setBounds(20, 40, 450, 20);

        JButton botaoenviar = new JButton();
        botaoenviar.setText("Enviar");
        botaoenviar.setBounds(20, 60, 100, 20);
        botaoenviar.addActionListener(event ->{
            String nomeDigitado = caixaDoElogio.getText();
            JOptionPane.showMessageDialog(janela,"Olá, " + nomeDigitado);
        });



        janela.setLayout(null);
        janela.getContentPane().add(labelElogio);
        janela.getContentPane().add(caixaDoElogio);
        janela.getContentPane().add(botaoenviar);
        janela.setVisible(true);
    }
}