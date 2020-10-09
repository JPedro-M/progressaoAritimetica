package progressãoaritimetica;
import javax.swing.JOptionPane;
/**
 *
 * @author troll
 */
public class ProgressaoAritimetica {

    public static void main(String[] args) {
        double r, an, a1, n, anI;
        Object[] itens = {"an(termoGeral)", "a1(primeiroTermo)", "n(posicaoDoTermo)", "r(razao)"};
        
        Object selectValue = JOptionPane.showInputDialog(null, "Escolha um:", "Progressão Aritimética", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        if (selectValue == "an(termoGeral)") {
            a1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro termo(a1)?"));
            n = Double.parseDouble(JOptionPane.showInputDialog("Qual a posição do termo(n)?"));
            r = Double.parseDouble(JOptionPane.showInputDialog("Qual a razão(r)?"));
            an = a1+(n-1)*r;
            JOptionPane.showMessageDialog(null, "O valor do termo geral é:"+an);
        }else if (selectValue == "a1(primeiroTermo)") {
            an = Double.parseDouble(JOptionPane.showInputDialog("Qual o termo geral(an)?"));
            n = Double.parseDouble(JOptionPane.showInputDialog("Qual a posição do termo(n)?"));
            r = Double.parseDouble(JOptionPane.showInputDialog("Qual a razão(r)?"));
            a1 = an-(n-1)*(r);
            JOptionPane.showMessageDialog(null, "O valor do primeiro termo é:"+a1);
        }else if (selectValue == "n(posicaoDoTermo)") {
            a1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro termo(a1)?"));
            an = Double.parseDouble(JOptionPane.showInputDialog("Qual o termo geral(an)?"));
            r = Double.parseDouble(JOptionPane.showInputDialog("Qual a razão(r)?"));
            n = (an-a1+(1*r))/r;
            JOptionPane.showMessageDialog(null, "A posição do termo é:"+n);
        }else {
            an = Double.parseDouble(JOptionPane.showInputDialog("Qual o termo geral(an)?"));
            anI = Double.parseDouble(JOptionPane.showInputDialog("Qual o termo anterior ao geral(an-1)?"));
            r = an-anI;
            JOptionPane.showMessageDialog(null, "A razão do termo é:"+r);
        } 
    }
}