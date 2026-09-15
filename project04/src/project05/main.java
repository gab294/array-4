package project05;
import javax.swing.JOptionPane;
public class main {
    public static void main(String[] args) {
        String Numerosparaexibiremlinha = "";
        String Numerosparaexibiremlinhaporlinha = "";
        int numeros[] = new int[100];int contador = 0;int valorLido = 0;
        valorLido = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero (99 para sair):"));
        while (valorLido != 99) {
            numeros[contador] = valorLido;
            Numerosparaexibiremlinha = Numerosparaexibiremlinha + " " + numeros[contador];
            Numerosparaexibiremlinhaporlinha = Numerosparaexibiremlinhaporlinha + "\n" + numeros[contador];
            contador++;
            valorLido = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero (99 para sair):"));
        }
        JOptionPane.showMessageDialog(null, "os numeros informados foram:" + Numerosparaexibiremlinha);
        JOptionPane.showMessageDialog(null, "os numeros informado linha por linha:" + Numerosparaexibiremlinhaporlinha);
    }
}