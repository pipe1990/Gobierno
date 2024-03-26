package Controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import View.VentanaEmergente;
import View.View;

public class Controller implements ActionListener{	

	//CONEXCIÓN A LA BASE DE DATOS DE POSGRESQL
	//URL DE LA DIRECCION DEL PROYECTO EN POSGRESQL
	public static final String URL = "jdbc:postgresql://localhost/Proyecto";
	//CREDENCIALES
	public static final String USERNAME = "postgres";
	public static final String PASSWORD = "papito";
	
	//DECLARACION PARA LA BASE DE DATOS
	PreparedStatement ps;
	//RESULTADO DE LA BASE DE DATOS
	ResultSet rs;
	
	//VENTANA PRINCIPAL
	private View view;
	//VENTANA EMERGENTE
	private VentanaEmergente ve;
	
	//CONSTRUCTOR
	public Controller() {
		view = new View();
		ve = new VentanaEmergente();
		initComponentes();
	}
	
	//INICIALIZANDO COMPNENTES
	private void initComponentes() {
		
		//VENTANA PRINCIPAL
		//BOTON GUARDAR PERSONA
		view.getBt_guardar().addActionListener(this);
		//LIMPIAR LAS CAJAS
		view.getBt_limpiar().addActionListener(this);
		//BUSCAR PERSONA
		view.getBt_buscar().addActionListener(this);
		
		//VENTANA EMERGENTE
		//BOTON LISTO
		ve.getListo().addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		
		
		//GUARDAR PERSONA EN LA BASE DE DATOS
		if((e.getActionCommand().equals("GUARDAR"))) {
	 		Connection con = null;
			
			try {
				con = getConnection();
				ps = con.prepareStatement("INSERT INTO persona_gobierno (numero_documento, tipo_documento, fecha_nacimiento, nombres, apellidos, sexo, estado_civil, departamento, municipio, zona, tel_fijo, tel_celular, direccion, correo, fondo_pensiones, ibc, condicion, tipo_cotizante, eps) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
				//ps.setInt(1, Integer.parseInt(view.getTxt_clave().getText()));
				ps.setInt(1, Integer.parseInt(view.getTxt_documento().getText()));
				ps.setString(2, view.getCbx_tipo_documento().getSelectedItem().toString());
				ps.setString(3, view.getTxt_fecha().getText());
				ps.setString(4, view.getTxt_nombre().getText());
				ps.setString(5, view.getTxt_salario().getText());
				ps.setString(6, view.getCbx_sexo().getSelectedItem().toString());
				ps.setString(7, view.getCbx_estado().getSelectedItem().toString());
				ps.setString(8, view.getTxt_departamento().getText());
				ps.setString(9, view.getTxt_municipio().getText());
				ps.setString(10, view.getCbx_zona().getSelectedItem().toString());
				ps.setString(11, view.getTxt_telefono().getText());
				ps.setString(12, view.getTxt_celular().getText());
				ps.setString(13, view.getTxt_direccion().getText());
				ps.setString(14, view.getTxt_correo().getText());
				ps.setString(15, view.getTxt_pensiones().getText());
				ps.setString(16, view.getTxt_ingreso().getText());
				ps.setString(17, view.getCbx_condicion().getSelectedItem().toString());
				ps.setString(18, view.getTxt_tipocotizante().getText());
				ps.setString(19, view.getCbx_tipo_eps().getSelectedItem().toString());
				
							
				int res = ps.executeUpdate();
		
				if(res > 0) {
					JOptionPane.showMessageDialog(null, "Persona Guardada");
					limpiarCajas();
				}else {
					JOptionPane.showMessageDialog(null, "Error al guardar persona");
					limpiarCajas();
				}
				
				con.close();
				
			}catch(Exception d) {
			
			JOptionPane.showMessageDialog(null, "No se puede guardar, ya hay una persona con ese Id");
			}
			
		}
		
		
		//BUSCAR UNA PERSONA 
		if((e.getActionCommand().equals("BUSCAR"))) {
			Connection con = null;
			
			try {
				con = getConnection();
				 ps =  con.prepareStatement("SELECT * FROM persona_gobierno WHERE numero_documento = ?");
				 ps.setInt(1, Integer.parseInt(view.getTxt_documento().getText()));
				 
				 rs = ps.executeQuery();
				 
				 if(rs.next()) {
					 
					 	view.getTxt_documento().setText(rs.getString("numero_documento"));
						view.getCbx_tipo_documento().setSelectedItem(rs.getString("tipo_documento"));
						view.getTxt_fecha().setText(rs.getString("fecha_nacimiento"));
						view.getTxt_nombre().setText(rs.getString("nombres"));
						view.getTxt_salario().setText(rs.getString("apellidos"));
						view.getCbx_sexo().setSelectedItem(rs.getString("sexo"));
						view.getCbx_estado().setSelectedItem(rs.getString("estado_civil"));
						view.getTxt_departamento().setText(rs.getString("departamento"));
						view.getTxt_municipio().setText(rs.getString("municipio"));
						view.getCbx_zona().setSelectedItem(rs.getString("zona"));
						view.getTxt_telefono().setText(rs.getString("tel_fijo"));
						view.getTxt_celular().setText(rs.getString("tel_celular"));
						view.getTxt_direccion().setText(rs.getString("direccion"));
						view.getTxt_correo().setText(rs.getString("correo"));
						view.getTxt_pensiones().setText(rs.getString("fondo_pensiones"));
						view.getTxt_ingreso().setText(rs.getString("ibc"));
						view.getCbx_condicion().setSelectedItem(rs.getString("condicion"));
						view.getTxt_tipocotizante().setText(rs.getString("tipo_cotizante"));
						view.getCbx_tipo_eps().setSelectedItem(rs.getString("eps"));
				 }else {
					 JOptionPane.showMessageDialog(null, "No existe una una persona con ese id");
					 limpiarCajas();
				 }
				 
			}catch(Exception d) {
				System.err.println(d);
			}
		}
		
		if((e.getActionCommand().equals("LISTO"))) {
			Connection con = null;
			
			try {
				con = getConnection();
				ps = con.prepareStatement("DELETE FROM empleado WHERE id=?");

				ps.setInt(1, Integer.parseInt(view.getTxt_clave().getText()));
									
				int res = ps.executeUpdate();
				
				if(res > 0) {
					JOptionPane.showMessageDialog(null, "Persona Eliminada");
					limpiarCajas();
				}else {
					JOptionPane.showMessageDialog(null, "Error al eliminar persona");
					limpiarCajas();
				}
				
				con.close();
				
			 }catch(Exception d) {
				System.err.println(d);
			}
		
		}
		
		//LIMPIAR CAJAS
		if((e.getActionCommand().equals("LIMPIAR"))) {
			 limpiarCajas();
		}
		
	}
	
	//METODO DE LIMPIAR
	private void limpiarCajas() {		
		view.getTxt_documento().setText(null);  
		view.getCbx_tipo_documento().setSelectedIndex(0);
		view.getTxt_fecha().setText(null);
		view.getTxt_nombre().setText(null);
		view.getTxt_salario().setText(null);
		view.getCbx_sexo().setSelectedIndex(0);
		view.getCbx_estado().setSelectedIndex(0);
		view.getTxt_departamento().setText(null);
		view.getTxt_municipio().setText(null);
		view.getCbx_zona().setSelectedIndex(0);
		view.getTxt_telefono().setText(null);
		view.getTxt_celular().setText(null);
		view.getTxt_direccion().setText(null);
		view.getTxt_correo().setText(null);
		view.getTxt_pensiones().setText(null);
		view.getTxt_ingreso().setText(null);
		view.getCbx_condicion().setSelectedIndex(0);
		view.getTxt_tipocotizante().setText(null);
		view.getCbx_tipo_eps().setSelectedIndex(0);
		
	}
	
	//CONEXION A BASE DE DATOS
	public static Connection getConnection() {
		Connection con = null;
		
		try {
			Class.forName("org.postgresql.Driver");
			con = (Connection) DriverManager.getConnection(URL, USERNAME, PASSWORD);
			//JOptionPane.showMessageDialog(null, "Conexion exitosa");
			
		} catch(Exception e) {
			System.out.println(e);
		}
		return con;	
	}
	
}
