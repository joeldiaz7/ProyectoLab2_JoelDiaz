
package Principal;

import javax.swing.ImageIcon;
import javax.swing.JButton;

class Rey extends Pieza {

    public Rey(int jugador) {
        super(jugador);
    }
        
    @Override
    public void setMascaraPieza(int jugador) {
        if(jugador == 1)
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/reyBlanco.png"));
        else
            mascaraPieza = new ImageIcon(getClass().getResource("/Imagenes/reyNegro.png"));
    }
    
    @Override
    public ImageIcon getMascaraPieza() {
        return mascaraPieza;
    }
        
    @Override
    public boolean ValidarMovimiento(JButton posActual,JButton posDestino,String[][]tablero,int jugador) {
        int posAAf = super.convertirCoordenadas(posActual, "fila");
        int posAAc = super.convertirCoordenadas(posActual, "columna");
        int posDDf = super.convertirCoordenadas(posDestino, "fila");
        int posDDc = super.convertirCoordenadas(posDestino, "columna");
        return (posAAf == posDDf-1 && posAAc == posDDc-1)||
                (posAAf == posDDf-1 && posAAc == posDDc)||
                (posAAf == posDDf-1 && posAAc == posDDc+1)||
                (posAAf == posDDf && posAAc == posDDc-1)||
                (posAAf == posDDf && posAAc == posDDc+1)||
                (posAAf == posDDf+1 && posAAc == posDDc-1)||
                (posAAf == posDDf+1 && posAAc == posDDc)||
                (posAAf == posDDf+1 && posAAc == posDDc+1);
    }
    
    
}