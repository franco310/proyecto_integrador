
package proyecto_integrador.vistas;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import proyecto_integrador.dao.IUsuario;
import proyecto_integrador.entidades.Usuario;
import proyecto_integrador.impl.UsuarioImpl;

public class FrmNuevoUsuario extends JInternalFrame {
    
    JLabel lblTitulo0;
    JLabel lblidUsuario;
    JLabel lblapellido;
    JLabel lblnombre;
    JLabel lblidentificacion;
    JLabel lblnombre_corto;
    
    
    JTextField txtidusuario;
    JTextField txtapellido;            ;
    JTextField txtnombre;
    JTextField txtidentificacion;
    JTextField txtnombre_corto;
   
    
 
    JButton btnLimpiar;
    JButton btnAceptar;
    JPanel pnlCentral;
    JPanel pnlPie;
    
     public  FrmNuevoUsuario() {
        this.setSize(300, 300);
        this.setLayout(new BorderLayout());
        this.setClosable(true);
        pnlCentral= new JPanel();
        pnlPie= new JPanel();
        pnlCentral.setLayout(new GridLayout(10, 2, 5, 5));
        pnlPie.setLayout(new GridLayout(1,2,5,5));
        
        lblTitulo0 = new JLabel("Datos del Usuario");
        
        lblidUsuario= new JLabel("Codigo Usuario:");
        lblapellido = new JLabel("Apellido:");
        lblnombre= new JLabel("Nombre:");
        lblidentificacion = new JLabel("Identificacion:");
        lblnombre_corto = new JLabel("Nombre_corto");
        

        txtidusuario = new JTextField(2);
        txtapellido = new JTextField(2);
        txtnombre = new JTextField(2);
        txtidentificacion = new JTextField(2);
        txtnombre_corto = new JTextField(2);
        
       

        
        btnLimpiar= new JButton("Limpiar");
        btnAceptar= new JButton("Aceptar");
        
        pnlCentral.add(lblidUsuario);
        pnlCentral.add(txtidusuario);
        pnlCentral.add(lblapellido);
        pnlCentral.add(txtapellido);
        pnlCentral.add(lblnombre);
        pnlCentral.add(txtnombre);
        pnlCentral.add(lblidentificacion);
        pnlCentral.add(txtidentificacion);
        pnlCentral.add(lblnombre_corto);
        pnlCentral.add(txtnombre_corto);
        
        
              
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    btnAceptarActionListener(e);
                } catch (Exception ex) {
                    System.out.println("Error:"+ex.getMessage());
                }
            }
        });
        
        pnlPie.add(btnLimpiar);
        pnlPie.add(btnAceptar);
        
        this.add(lblTitulo0, BorderLayout.NORTH);
        this.add(pnlCentral, BorderLayout.CENTER);
        this.add(pnlPie, BorderLayout.SOUTH);        
    }
    public static void main(String[] args) {
         FrmNuevoUsuario frmMenu= new  FrmNuevoUsuario();
        frmMenu.setVisible(true);
    } 
    
    public void btnAceptarActionListener(ActionEvent e){
        IUsuario usuarioDao = new UsuarioImpl();
        Usuario usuario = new Usuario();
        usuario.setCodigo(Integer.parseInt(txtidusuario.getText()));
        usuario.setApellidos(txtapellido.getText());
        usuario.setNombres(txtnombre.getText());
        usuario.setIdentificacion(txtapellido.getText());
        usuario.setNombre_corto(txtnombre_corto.getText()); 
        
     
        
        try {
            if(usuarioDao.insertar(usuario)>0){
                JOptionPane.showMessageDialog(this,"Guaradado correctamente!!",
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this,"Error desconocido!!",
                "Transacción", JOptionPane.INFORMATION_MESSAGE);
            }           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"Error al guardar!!: " + ex.getMessage(),
                "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    
    
}
