package View;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class View extends JFrame{

	//ETIQUETAS
	private JLabel clave, sexo,tipocotizante,condicion, pensiones,ingreso, direccion, municipio, celular, estado, fecha, correo,departamento,telefono, eps, tipo_documento, documento, nombre, zona, salario;
	
	//CAMPOS DE TEXTO
	private JTextField txt_clave, txt_tipocotizante,txt_ingreso, txt_direccion, txt_pensiones, txt_departamento, txt_celular, txt_municipio, txt_fecha, txt_correo, txt_documento,  txt_nombre,  txt_salario,txt_telefono;
	
	//COMBO BOX
	private JComboBox<String> cbx_tipo_documento, cbx_condicion,cbx_tipo_eps, cbx_sexo, cbx_estado,cbx_zona;
	
	//BOTONES
	private JButton bt_guardar, bt_limpiar, bt_buscar;
	
	public View() {
		//TITULO
		setTitle("Gobierno");
		
		//TAMAÑO
		setSize(1200, 700);
		
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.gray); 
		elementos();

		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void elementos() {
		
		//ETIQUETA NUMERO DOCUMENTO
		documento = new JLabel("Numero Documento:");
		documento.setBounds(50, 50, 140, 20);
		add(documento);
		
		//ETIQUETA TIPO DOCUMENTO
		tipo_documento = new JLabel("Tipo Documento:");
		tipo_documento.setBounds(50, 100, 140, 20);
		add(tipo_documento);
		
		//ETIQUETA FECHA NACIMIENTO
		fecha = new JLabel("Fecha de nacimiento:");
		fecha.setBounds(50, 150, 140, 20);
		add(fecha);
		
		//ETIQUETA NOMBRESS
		nombre = new JLabel("Nombre(s):");
		nombre.setBounds(50, 200, 140, 20);
		add(nombre);
		
		//ETIQUETA APELLIDAS
		salario = new JLabel("Apellido(s):");
		salario.setBounds(50, 250, 140, 20);
		add(salario);
		
		//ETIQUETA SEXO
		sexo = new JLabel("Sexo:");
		sexo.setBounds(50, 300, 140, 20);
		add(sexo);
		
		//ETIQUETA ESTADO CIVIL
		estado = new JLabel("Estado Civil:");
		estado.setBounds(50, 350, 140, 20);
		add(estado);
		
		//ETIQUETA DEPARTAMETNO
		departamento = new JLabel("Departamento:");
		departamento.setBounds(50, 400, 140, 20);
		add(departamento);
		
		//ETIQUETA MINUCIPIO
		municipio = new JLabel("Municipio:");
		municipio.setBounds(50, 450, 140, 20);
		add(municipio);
		
		//ETIQUETA ZONA
		zona = new JLabel("Zona:");
		zona.setBounds(50, 500, 140, 20);
		add(zona);
		
		//ETIQUETA TELEFONO FIJO
		telefono = new JLabel("Telefono Fijo:");
		telefono.setBounds(600, 50, 140, 20);
		add(telefono);
		
		//ETIQUETA CELULAR
		celular = new JLabel("Telefono Celular:");
		celular.setBounds(600, 100, 140, 20);
		add(celular);
		
		//ETIQUETA DIRECCION
		direccion = new JLabel("Direccion:");
		direccion.setBounds(600, 150, 140, 20);
		add(direccion);
		
		//ETIQUETA CORREO
		correo = new JLabel("Correo:");
		correo.setBounds(600, 200, 140, 20);
		add(correo);
		
		//ETIQUETA PESNIONES
		pensiones = new JLabel("Fondo de Pensiones:");
		pensiones.setBounds(600, 250, 140, 20);
		add(pensiones);
		
		//ETIQUETA IBC
		ingreso = new JLabel("IBC:");
		ingreso.setBounds(600, 300, 140, 20);
		add(ingreso);
		
		//ETIQUETA CONDICION
		condicion = new JLabel("Condicion:");
		condicion.setBounds(600, 350, 140, 20);
		add(condicion);
		
		//ETIQUETA TIPO COTIZANTE
		tipocotizante = new JLabel("Tipo de Cotizante:");
		tipocotizante.setBounds(600, 400, 140, 20);
		add(tipocotizante);
		
		//ETIQUETA EPS
		eps = new JLabel("EPS:");
		eps.setBounds(600, 450, 140, 20);
		add(eps);
		
		//CAMPO DE TEXTO DOCUMENTO
		txt_documento = new JTextField();
		txt_documento.setBounds(200, 50, 170, 20);
		add(txt_documento);
		
		//COMBO BOX TIPO DOC
		cbx_tipo_documento =  new JComboBox<String>();
		cbx_tipo_documento.setBounds(200, 100, 170, 20);
		cbx_tipo_documento.addItem("--Seleccione--");
		cbx_tipo_documento.addItem("NI");
		cbx_tipo_documento.addItem("CC");
		cbx_tipo_documento.addItem("CE");
		cbx_tipo_documento.setActionCommand("TIPODOC");
		add(cbx_tipo_documento);
		
		//CAMPO DE TEXTO FECHA
		txt_fecha = new JTextField();
		txt_fecha.setBounds(200, 150, 170, 20);
		add(txt_fecha);
		
		//CAMPO DE TEXTO NOMBRE
		txt_nombre = new JTextField();
		txt_nombre.setBounds(200, 200, 170, 20);
		add(txt_nombre);
		
		//CAMPO DE TEXTO APELLIDO
		txt_salario = new JTextField();
		txt_salario.setBounds(200, 250, 170, 20);
		add(txt_salario);
		
		//COMBO BOX SEXO
		cbx_sexo =  new JComboBox<String>();
		cbx_sexo.setBounds(200, 300, 170, 20);
		cbx_sexo.addItem("--Seleccione--");
		cbx_sexo.addItem("FEMENINO");
		cbx_sexo.addItem("MASCULINO");
		cbx_sexo.setActionCommand("TIPOSEXO");
		add(cbx_sexo);
		
		//COMBO BOX ESTADO CIVIL
		cbx_estado =  new JComboBox<String>();
		cbx_estado.setBounds(200, 350, 170, 20);
		cbx_estado.addItem("--Seleccione--");
		cbx_estado.addItem("SOLTERO/A");
		cbx_estado.addItem("CASADO/A");
		cbx_estado.addItem("VIUDO/A");
		cbx_estado.addItem("SEPARADO/A");
		cbx_estado.addItem("UNION LIBRE");
		cbx_estado.setActionCommand("TIPOESTADO");
		add(cbx_estado);
		
		//CAMPO DE TEXTO  DPTO
		txt_departamento = new JTextField();
		txt_departamento.setBounds(200, 400, 170, 20);
		add(txt_departamento);
		
		//CAMPO DE TEXTO MUNICIPIO
		txt_municipio = new JTextField();
		txt_municipio.setBounds(200, 450, 170, 20);
		add(txt_municipio);
		
		//COMBO BOX ZONA
		cbx_zona =  new JComboBox<String>();
		cbx_zona.setBounds(200, 500, 170, 20);
		cbx_zona.addItem("--Seleccione--");
		cbx_zona.addItem("RURAL");
		cbx_zona.addItem("URBANA");
		cbx_zona.setActionCommand("TIPOZONA");
		add(cbx_zona);
		
		//CAMPO DE TEXTO  TELEFONO FIJO
		txt_telefono = new JTextField();
		txt_telefono.setBounds(750, 50, 170, 20);
		add(txt_telefono);
		
		//CAMPO DE TEXTO CELULAR
		txt_celular = new JTextField();
		txt_celular.setBounds(750, 100, 170, 20);
		add(txt_celular);
		
		//CAMPO DE TEXTO DIRECCION
		txt_direccion = new JTextField();
		txt_direccion.setBounds(750, 150, 170, 20);
		add(txt_direccion);
		
		//CAMPO DE TEXTO CORREO
		txt_correo = new JTextField();
		txt_correo.setBounds(750, 200, 170, 20);
		add(txt_correo);
		
		//CAMPO DE TEXTO PENSIONES
		txt_pensiones = new JTextField();
		txt_pensiones.setBounds(750, 250, 170, 20);
		add(txt_pensiones);
		
		//CAMPO DE TEXTO INGRESO (IBC)
		txt_ingreso = new JTextField();
		txt_ingreso.setBounds(750, 300, 170, 20);
		add(txt_ingreso);
		
		//COMBO BOX CONDICION
		cbx_condicion =  new JComboBox<String>();
		cbx_condicion.setBounds(750, 350, 170, 20);
		cbx_condicion.addItem("--Seleccione--");
		cbx_condicion.addItem("EMPLEADO");
		cbx_condicion.addItem("INDEPENDIENTE");
		cbx_condicion.addItem("PENSIONADO");
		cbx_condicion.setActionCommand("TIPCONDICION");
		add(cbx_condicion);
		
		//CAMPO DE TEXTO TIPO COTIZANTE
		txt_tipocotizante = new JTextField();
		txt_tipocotizante.setBounds(750, 400, 170, 20);
		add(txt_tipocotizante);
		
		//CAMPO DE TEXTO COMBO BOX
		cbx_tipo_eps =  new JComboBox<String>();
		cbx_tipo_eps.setBounds(750, 450, 170, 20);
		cbx_tipo_eps.addItem("--Seleccione--");
		cbx_tipo_eps.addItem("SURA");
		cbx_tipo_eps.addItem("CAFAM");
		cbx_tipo_eps.addItem("SALUD TOTAL");
		cbx_tipo_eps.addItem("SURA");
		cbx_tipo_eps.addItem("COOMEVA");
		cbx_tipo_eps.setActionCommand("TIPOEPS");
		add(cbx_tipo_eps); 
		
		//BOTON GUARDAR
		bt_guardar = new JButton("Guardar");
		bt_guardar.setActionCommand("GUARDAR");
		bt_guardar.setBounds(480, 600, 100, 30);
		bt_guardar.setVisible(true);
		add(bt_guardar);
		
		//BOTON LIMPIAR
		bt_limpiar = new JButton("Limpiar");
		bt_limpiar.setActionCommand("LIMPIAR");
		bt_limpiar.setBounds(600, 600, 100, 30);
		bt_limpiar.setVisible(true);
		add(bt_limpiar);
		
		//BOTON BUSCAR
		bt_buscar = new JButton("Buscar");
		bt_buscar.setActionCommand("BUSCAR");
		bt_buscar.setBounds(370, 50, 100, 30);
		bt_buscar.setVisible(true);
		add(bt_buscar);
		
	}

	//GETTERS Y SETTERS
	
	public JLabel getClave() {
		return clave;
	}

	public void setClave(JLabel clave) {
		this.clave = clave;
	}

	public JLabel getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(JLabel tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public JLabel getDocumento() {
		return documento;
	}

	public void setDocumento(JLabel documento) {
		this.documento = documento;
	}

	public JLabel getNombre() {
		return nombre;
	}

	public void setNombre(JLabel nombre) {
		this.nombre = nombre;
	}

	public JLabel getSalario() {
		return salario;
	}

	public void setSalario(JLabel salario) {
		this.salario = salario;
	}

	public JTextField getTxt_clave() {
		return txt_clave;
	}

	public void setTxt_clave(JTextField txt_clave) {
		this.txt_clave = txt_clave;
	}

	public JTextField getTxt_documento() {
		return txt_documento;
	}

	public void setTxt_documento(JTextField txt_documento) {
		this.txt_documento = txt_documento;
	}

	public JTextField getTxt_nombre() {
		return txt_nombre;
	}

	public void setTxt_nombre(JTextField txt_nombre) {
		this.txt_nombre = txt_nombre;
	}

	public JTextField getTxt_salario() {
		return txt_salario;
	}

	public void setTxt_salario(JTextField txt_salario) {
		this.txt_salario = txt_salario;
	}

	public JComboBox<String> getCbx_tipo_documento() {
		return cbx_tipo_documento;
	}

	public void setCbx_tipo_documento(JComboBox<String> cbx_tipo_documento) {
		this.cbx_tipo_documento = cbx_tipo_documento;
	}

	public JButton getBt_guardar() {
		return bt_guardar;
	}

	public void setBt_guardar(JButton bt_guardar) {
		this.bt_guardar = bt_guardar;
	}

	public JButton getBt_limpiar() {
		return bt_limpiar;
	}

	public void setBt_limpiar(JButton bt_limpiar) {
		this.bt_limpiar = bt_limpiar;
	}

	public JButton getBt_buscar() {
		return bt_buscar;
	}

	public void setBt_buscar(JButton bt_buscar) {
		this.bt_buscar = bt_buscar;
	}

	public JLabel getCorreo() {
		return correo;
	}

	public void setCorreo(JLabel correo) {
		this.correo = correo;
	}

	public JTextField getTxt_correo() {
		return txt_correo;
	}

	public void setTxt_correo(JTextField txt_correo) {
		this.txt_correo = txt_correo;
	}

	public JComboBox<String> getCbx_tipo_eps() {
		return cbx_tipo_eps;
	}

	public void setCbx_tipo_eps(JComboBox<String> cbx_tipo_eps) {
		this.cbx_tipo_eps = cbx_tipo_eps;
	}

	public JLabel getEps() {
		return eps;
	}

	public void setEps(JLabel eps) {
		this.eps = eps;
	}


	public JLabel getSexo() {
		return sexo;
	}

	public void setSexo(JLabel sexo) {
		this.sexo = sexo;
	}

	public JLabel getTipocotizante() {
		return tipocotizante;
	}

	public void setTipocotizante(JLabel tipocotizante) {
		this.tipocotizante = tipocotizante;
	}

	public JLabel getCondicion() {
		return condicion;
	}

	public void setCondicion(JLabel condicion) {
		this.condicion = condicion;
	}

	public JLabel getPensiones() {
		return pensiones;
	}

	public void setPensiones(JLabel pensiones) {
		this.pensiones = pensiones;
	}

	public JLabel getIngreso() {
		return ingreso;
	}

	public void setIngreso(JLabel ingreso) {
		this.ingreso = ingreso;
	}

	public JLabel getDireccion() {
		return direccion;
	}

	public void setDireccion(JLabel direccion) {
		this.direccion = direccion;
	}

	public JLabel getMunicipio() {
		return municipio;
	}

	public void setMunicipio(JLabel municipio) {
		this.municipio = municipio;
	}

	public JLabel getCelular() {
		return celular;
	}

	public void setCelular(JLabel celular) {
		this.celular = celular;
	}

	public JLabel getEstado() {
		return estado;
	}

	public void setEstado(JLabel estado) {
		this.estado = estado;
	}

	public JLabel getFecha() {
		return fecha;
	}

	public void setFecha(JLabel fecha) {
		this.fecha = fecha;
	}

	public JLabel getDepartamento() {
		return departamento;
	}

	public void setDepartamento(JLabel departamento) {
		this.departamento = departamento;
	}

	public JLabel getTelefono() {
		return telefono;
	}

	public void setTelefono(JLabel telefono) {
		this.telefono = telefono;
	}

	public JLabel getZona() {
		return zona;
	}

	public void setZona(JLabel zona) {
		this.zona = zona;
	}

	public JTextField getTxt_tipocotizante() {
		return txt_tipocotizante;
	}

	public void setTxt_tipocotizante(JTextField txt_tipocotizante) {
		this.txt_tipocotizante = txt_tipocotizante;
	}

	public JTextField getTxt_ingreso() {
		return txt_ingreso;
	}

	public void setTxt_ingreso(JTextField txt_ingreso) {
		this.txt_ingreso = txt_ingreso;
	}

	public JTextField getTxt_direccion() {
		return txt_direccion;
	}

	public void setTxt_direccion(JTextField txt_direccion) {
		this.txt_direccion = txt_direccion;
	}

	public JTextField getTxt_pensiones() {
		return txt_pensiones;
	}

	public void setTxt_pensiones(JTextField txt_pensiones) {
		this.txt_pensiones = txt_pensiones;
	}

	public JTextField getTxt_departamento() {
		return txt_departamento;
	}

	public void setTxt_departamento(JTextField txt_departamento) {
		this.txt_departamento = txt_departamento;
	}

	public JTextField getTxt_celular() {
		return txt_celular;
	}

	public void setTxt_celular(JTextField txt_celular) {
		this.txt_celular = txt_celular;
	}

	public JTextField getTxt_municipio() {
		return txt_municipio;
	}

	public void setTxt_municipio(JTextField txt_municipio) {
		this.txt_municipio = txt_municipio;
	}

	public JTextField getTxt_fecha() {
		return txt_fecha;
	}

	public void setTxt_fecha(JTextField txt_fecha) {
		this.txt_fecha = txt_fecha;
	}

	public JTextField getTxt_telefono() {
		return txt_telefono;
	}

	public void setTxt_telefono(JTextField txt_telefono) {
		this.txt_telefono = txt_telefono;
	}

	public JComboBox<String> getCbx_condicion() {
		return cbx_condicion;
	}

	public void setCbx_condicion(JComboBox<String> cbx_condicion) {
		this.cbx_condicion = cbx_condicion;
	}

	public JComboBox<String> getCbx_sexo() {
		return cbx_sexo;
	}

	public void setCbx_sexo(JComboBox<String> cbx_sexo) {
		this.cbx_sexo = cbx_sexo;
	}

	public JComboBox<String> getCbx_estado() {
		return cbx_estado;
	}

	public void setCbx_estado(JComboBox<String> cbx_estado) {
		this.cbx_estado = cbx_estado;
	}

	public JComboBox<String> getCbx_zona() {
		return cbx_zona;
	}

	public void setCbx_zona(JComboBox<String> cbx_zona) {
		this.cbx_zona = cbx_zona;
	}
	
	
	
}
