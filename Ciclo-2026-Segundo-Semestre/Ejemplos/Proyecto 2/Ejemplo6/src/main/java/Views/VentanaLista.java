package Views;

import Estructuras.ListaDoble;
import Estructuras.ListaSimple;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

/**
 *
 * @author Diegomrza
 */
public class VentanaLista<T> extends JFrame {
    private ListaDoble<T> listaD;
    private ListaSimple<T> listaS;
    private PanelListaDoble<T> panelD;
    private PanelListaSimple<T> panelS;

    public VentanaLista(ListaDoble<T> lista) {
        this.listaD = lista;
        this.panelD = new PanelListaDoble<>(lista);
        panelD.setPreferredSize(new Dimension(600, 200));

        setTitle("Lista Doblemente Enlazada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JScrollPane(panelD));
        pack();
        setLocationRelativeTo(null);
    }
    
    public VentanaLista(ListaSimple<T> lista) {
        this.listaS = lista;
        this.panelS = new PanelListaSimple<>(lista);
        panelS.setPreferredSize(new Dimension(600, 200));

        setTitle("Lista Simplemente Enlazada");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new JScrollPane(panelS));
        pack();
        setLocationRelativeTo(null);
    }

    public void actualizar() {
        if (panelD != null) panelD.repaint();
        if (panelS != null) panelS.repaint();
    }
}
