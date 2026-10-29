package Views;

import Estructuras.ListaDoble;
import Nodos.NodoDoble;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Diegomrza
 */
public class PanelListaDoble<T> extends JPanel {
    private ListaDoble<T> lista;

    public PanelListaDoble(ListaDoble<T> lista) {
        this.lista = lista;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        int x = 20, y = 100, alto = 40, espacio = 40, padding = 20;
        FontMetrics fm = g2.getFontMetrics();

        NodoDoble<T> actual = lista.cabeza;
        while (actual != null) {
            String texto = String.valueOf(actual.dato);
            int ancho = Math.max(60, fm.stringWidth(texto) + padding);

            g2.drawRect(x, y, ancho, alto);
            g2.drawString(texto, x + (ancho - fm.stringWidth(texto)) / 2, y + alto/2 + 5);

            if (actual.siguiente != null) {
                int flechaY = y + alto/2;
                int x1 = x + ancho;
                int x2 = x1 + espacio;
                g2.drawLine(x1, flechaY, x2, flechaY);
                g2.drawLine(x2, flechaY, x2 - 8, flechaY - 5);
                g2.drawLine(x2, flechaY, x2 - 8, flechaY + 5);
            }
            x += ancho + espacio;
            actual = actual.siguiente;
        }
    }
}
