import javax.swing.*;

public class Main{
    public static void main(String[] args){
        JFrame janela = new JFrame();
        janela.setTitle("Cadastro de Funcionários");
        janela.setSize(500, 700);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel nome = new JLabel("Nome: ");
        nome.setBounds(20, 20, 50, 20);
        JTextField caixaDoNome = new JTextField();
        caixaDoNome.setBounds(200, 20, 200, 20);

        JLabel endereco = new JLabel("Endereço: ");
        endereco.setBounds(20, 40, 100, 20);
        JTextField caixaDoEndereco = new JTextField();
        caixaDoEndereco.setBounds(200, 40, 200, 20);

        JLabel bairro = new JLabel("Bairro: ");
        bairro.setBounds(20, 60, 100, 20);
        JTextField caixaDoBairro = new JTextField();
        caixaDoBairro.setBounds(200, 60, 200, 20);

        JLabel cidade = new JLabel("Cidade: ");
        cidade.setBounds(20, 80, 100, 20);
        JTextField caixaDaCidade = new JTextField();
        caixaDaCidade.setBounds(200, 80, 200, 20);

        JLabel estado = new JLabel("Cidade: ");
        estado.setBounds(20, 100, 100, 20);
        JTextField caixaDoEstado = new JTextField();
        caixaDoEstado.setBounds(200, 100, 200, 20);

        JLabel cep = new JLabel("CEP: ");
        cep.setBounds(20, 120, 100, 20);
        JTextField caixaDoCep = new JTextField();
        caixaDoCep.setBounds(200, 120, 200, 20);

        JLabel telefone = new JLabel("Telefone: ");
        telefone.setBounds(20, 140, 100, 20);
        JTextField caixaDoTelefone = new JTextField();
        caixaDoTelefone.setBounds(200, 140, 200, 20);

        JLabel email = new JLabel("E-Mail: ");
        email.setBounds(20, 160, 100, 20);
        JTextField caixaDoEmail = new JTextField();
        caixaDoEmail.setBounds(200, 160, 200, 20);

        JLabel cargo = new JLabel("Cargo: ");
        cargo.setBounds(20, 180, 100, 20);
        JTextField caixaDoCargo = new JTextField();
        caixaDoCargo.setBounds(200, 180, 200, 20);

        JLabel dtcontratacao = new JLabel("Data da Contratação: ");
        dtcontratacao.setBounds(20, 200, 200, 20);
        JTextField caixaDaContratacao = new JTextField();
        caixaDaContratacao.setBounds(200, 200, 200, 20);

        JLabel remuneracao = new JLabel("Remuneração: ");
        remuneracao.setBounds(20, 220, 100, 20);
        JTextField caixaDaRemuneracao = new JTextField();
        caixaDaRemuneracao.setBounds(200, 220, 200, 20);

        JButton botaoconsultar = new JButton();
        botaoconsultar.setText("Consultar");
        botaoconsultar.setBounds(20, 340, 100, 20);
        botaoconsultar.addActionListener(event ->{
            caixaDoNome.setText("carlos");
            caixaDoEndereco.setText("rua Argemíro de Barros");
            caixaDoBairro.setText("Bairro das Amoreiras");
            caixaDaCidade.setText("São Roque");
            caixaDoEstado.setText("São Paulo");
            caixaDoCep.setText("1111111111");
            caixaDoTelefone.setText("(11) 99053-6774");
            caixaDoEmail.setText("CarlosCarlinhosMaia@gmail.com");
            caixaDoCargo.setText("Gerente");
            caixaDaContratacao.setText("13/03/2008");
            caixaDaRemuneracao.setText("11/05/2022");
        });

        JButton botaoincluir = new JButton();
        botaoincluir.setText("Incluir");
        botaoincluir.setBounds(20, 370, 100, 20);
        botaoincluir.addActionListener(event ->{
            String funcionario= caixaDoNome.getText();
            JOptionPane.showMessageDialog(janela, "Funcionário " + funcionario + " inserido com sucesso!");

        });

        JButton botaoalterar = new JButton();
        botaoalterar.setText("Alterar");
        botaoalterar.setBounds(20, 400, 100, 20);
        botaoalterar.addActionListener(event ->{
            JOptionPane.showMessageDialog(janela, "Alterado com sucesso!");

        });

        JButton botaoexcluir = new JButton();
        botaoexcluir.setText("Excluir");
        botaoexcluir.setBounds(20, 430, 100, 20);
        botaoexcluir.addActionListener(event ->{
            JOptionPane.showMessageDialog(janela, "Excluido com sucesso!");

        });

        JButton botaosair = new JButton();
        botaosair.setText("Sair");
        botaosair.setBounds(20, 490, 100, 20);
        botaosair.addActionListener(event ->{
            janela.dispose();

        });

        JButton botaolimpar = new JButton();
        botaolimpar.setText("Limpar");
        botaolimpar.setBounds(20, 460, 100, 20);
        botaolimpar.addActionListener(event ->{
            caixaDoNome.setText("");
            caixaDoEndereco.setText("");
            caixaDoBairro.setText("");
            caixaDaCidade.setText("");
            caixaDoEstado.setText("");
            caixaDoCep.setText("");
            caixaDoTelefone.setText("");
            caixaDoEmail.setText("");
            caixaDoCargo.setText("");
            caixaDaContratacao.setText("");
            caixaDaRemuneracao.setText("");
        });


        janela.setLayout(null);
        janela.getContentPane().add(nome);
        janela.getContentPane().add(caixaDoNome);
        janela.getContentPane().add(endereco);
        janela.getContentPane().add(caixaDoEndereco);
        janela.getContentPane().add(bairro);
        janela.getContentPane().add(caixaDoBairro);
        janela.getContentPane().add(cidade);
        janela.getContentPane().add(caixaDaCidade);
        janela.getContentPane().add(estado);
        janela.getContentPane().add(caixaDoEstado);
        janela.getContentPane().add(cep);
        janela.getContentPane().add(caixaDoCep);
        janela.getContentPane().add(telefone);
        janela.getContentPane().add(caixaDoTelefone);
        janela.getContentPane().add(email);
        janela.getContentPane().add(caixaDoEmail);
        janela.getContentPane().add(cargo);
        janela.getContentPane().add(caixaDoCargo);
        janela.getContentPane().add(dtcontratacao);
        janela.getContentPane().add(caixaDaContratacao);
        janela.getContentPane().add(remuneracao);
        janela.getContentPane().add(caixaDaRemuneracao);
        janela.getContentPane().add(botaoconsultar);
        janela.getContentPane().add(botaolimpar);
        janela.getContentPane().add(botaoincluir);
        janela.getContentPane().add(botaoalterar);
        janela.getContentPane().add(botaoexcluir);
        janela.getContentPane().add(botaosair);



        janela.setVisible(true);
    }
}