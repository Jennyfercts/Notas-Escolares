import javax.swing.JOptionPane;
public class Notas {
    static void main(String[] args) {
        double[] notas = new double[4];
        double[] pesos = {0.2, 0.2, 0.3, 0.3};
        for (int i = 0; i < notas.length; i++) {
            String entrada = JOptionPane.showInputDialog("Insira a nota " + (i + 1));
            double nota = Double.parseDouble(entrada);
            if (nota > 10 || nota < 0){
                JOptionPane.showMessageDialog(null, "Nota inválida! Digite um valor entre 0 e 10.");
                i--;
                continue;
            }
            notas[i] = nota;
        }
        double somanotaxpeso = 0;
        double somapesos = 0;
        for (int i = 0; i < notas.length; i++){
            somanotaxpeso += notas[i]*pesos[i];
            somapesos += pesos[i];
        }
        double media = somanotaxpeso / somapesos;
        String entrada2 = JOptionPane.showInputDialog("Insira a frequência do aluno:");
        double frequencia = new Double(entrada2);
        if (frequencia < 75 || media < 5.0){
            JOptionPane.showMessageDialog(null, "Aluno reprovado!");
            System.exit(0);
        }
        if (media >= 5.0 && media <= 6.9){
            JOptionPane.showMessageDialog(null, "O aluno deve realizar o Exame Final.");
            String entrada3 = JOptionPane.showInputDialog(null, "Insira a nota do Exame Final:");
            double examefinal = new Double(entrada3);
            double mediafinal = (media + examefinal)/2;
            if (mediafinal >= 6.0){
                JOptionPane.showMessageDialog(null, "Aluno aprovado!");
            }
            if (mediafinal < 6.0){
                JOptionPane.showMessageDialog(null, "Aluno reprovado!");
            }
        }
        if (media >= 7.0 && frequencia >= 75){
            JOptionPane.showMessageDialog(null, "Aluno aprovado!");
        }
    }
}