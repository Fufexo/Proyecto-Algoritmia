package guis;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FmPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnArchivos;
	private JMenu mnMantenimiento;
	private JMenu mnVentas;
	private JMenuItem mntmSalir;
	private JMenuItem mntmConsultarmonitor;
	private JMenuItem mntmModificarmonitor;
	private JMenuItem mntmListadodemonitores;
	private JMenuItem mntmVender;
	private JMenuItem mntmGenerarreportes;
	private JMenu mnConfiguracion;
	private JMenuItem mntmDescuentos;
	private JMenuItem mntmConfigurarobsequios;
	private JMenuItem mntmConfigurarcantidadoptima;
	private JMenuItem mntmConfigurarcuotadiaria;
	private JMenu mnAyuda;
	private JMenuItem mntmAcercadelatienda;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FmPrincipal frame = new FmPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FmPrincipal() {
		setTitle("Sistema de Gestión Empresarial");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		mntmSalir = new JMenuItem("Salir");
		mnArchivos.add(mntmSalir);
		
		mnMantenimiento = new JMenu("Mantenimiento");
		menuBar.add(mnMantenimiento);
		
		mntmConsultarmonitor = new JMenuItem("Consultar Monitor");
		mnMantenimiento.add(mntmConsultarmonitor);
		
		mntmModificarmonitor = new JMenuItem("Modificar Monitor");
		mnMantenimiento.add(mntmModificarmonitor);
		
		mntmListadodemonitores = new JMenuItem("Listado de Monitores");
		mnMantenimiento.add(mntmListadodemonitores);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mntmVender = new JMenuItem("Vender");
		mnVentas.add(mntmVender);
		
		mntmGenerarreportes = new JMenuItem("Generar Reportes");
		mnVentas.add(mntmGenerarreportes);
		
		mnConfiguracion = new JMenu("Configuración");
		menuBar.add(mnConfiguracion);
		
		mntmDescuentos = new JMenuItem("Configurar Descuentos");
		mnConfiguracion.add(mntmDescuentos);
		
		mntmConfigurarobsequios = new JMenuItem("Configurar Obsequios");
		mnConfiguracion.add(mntmConfigurarobsequios);
		
		mntmConfigurarcantidadoptima = new JMenuItem("Configurar Cantidad Óptima");
		mnConfiguracion.add(mntmConfigurarcantidadoptima);
		
		mntmConfigurarcuotadiaria = new JMenuItem("Configurar cuota diaria");
		mnConfiguracion.add(mntmConfigurarcuotadiaria);
		
		mnAyuda = new JMenu("Ayuda");
		menuBar.add(mnAyuda);
		
		mntmAcercadelatienda = new JMenuItem("Acerca de la Tienda");
		mnAyuda.add(mntmAcercadelatienda);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 424, Short.MAX_VALUE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGap(0, 251, Short.MAX_VALUE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
