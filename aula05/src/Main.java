import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TelaHome t = new TelaHome();
        t.setContentPane(t.painelPrincipal);
        t.setTitle("swig com respeito" );
        t.setSize(400, 300);
        t.setVisible(true);
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}