
package proyecto_integrador.vistas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import org.jvnet.substance.SubstanceLookAndFeel;

public class FrmMenuPrincipal extends JFrame {
     JMenuBar mnbPrincipal;
    JMenu mnInicio;
    JMenuItem mniLogin;
    JMenuItem mniSalir;
    
    JMenu mnUsuario;
    JMenuItem mniNuevoUsuario;
    JMenuItem mniModificaUsuario;
    JMenuItem mniEliminaUsuario;
    JMenuItem mniBuscaUsuario;
    JMenuItem mniListaUsuario;
    
    

    JDesktopPane dkpEscritorio;
    

    public FrmMenuPrincipal() {
        dkpEscritorio= new JDesktopPane();
        dkpEscritorio.setBackground(new Color(250, 250, 250));        
        mnbPrincipal = new JMenuBar();
        mnInicio = new JMenu("Inicio");
        mniLogin = new JMenuItem("Iniciar Sesión");
        mniSalir = new JMenuItem("Salir");
        mniSalir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniSalirActionPerformed(e);
            }
        });
        
        
        mnUsuario = new JMenu("Usuario");
        mniNuevoUsuario = new JMenuItem("Nuevo");
        mniNuevoUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mniNuevoUsuarioActionPerformed(e);
            }
        });
        mniModificaUsuario = new JMenuItem("Modifica");
        mniEliminaUsuario = new JMenuItem("Elimina");
        mniBuscaUsuario = new JMenuItem("Busca");
        mnUsuario.add(mniNuevoUsuario);

        
       
              
       
        mnbPrincipal.add(mnInicio);
        mnbPrincipal.add(mnUsuario);
       
        mnInicio.add(mniLogin);
        mnInicio.add(mniSalir);
        
        this.setLayout(new BorderLayout());
        this.add(mnbPrincipal, BorderLayout.NORTH);
        this.add(dkpEscritorio, BorderLayout.CENTER);
        this.setExtendedState(MAXIMIZED_BOTH); //Para maximizar
        this.setBounds(450,450,650,650);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //Para terminar el programa
        JFrame.setDefaultLookAndFeelDecorated(true); //que nos permite dejar a Substance la decoracion ( por asi decirlo) 
        SubstanceLookAndFeel.setSkin("org.jvnet.substance.skin.FindingNemoSkin"); // Setencia que aplica el skin Creme de Substance
    }    
    
    
    public void mniNuevoUsuarioActionPerformed(ActionEvent e){
        FrmNuevoUsuario frm = new FrmNuevoUsuario();
        dkpEscritorio.add(frm);
        frm.setVisible(true);
    }
    
    public void mniSalirActionPerformed(ActionEvent e){
        System.exit(0);
    }
    
    public static void main(String[] args) {
        FrmMenuPrincipal frm = new FrmMenuPrincipal();
        frm.setVisible(true);
    }
    
}
