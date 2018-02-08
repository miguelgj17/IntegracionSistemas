import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

public class InterfazCompras extends JFrame {

	private JPanel contentPane;
	private final JScrollPane spListaPedidos = new JScrollPane();
	private final JList lstPedidos = new JList();
	private final JLabel lblIdPedido = new JLabel("Id Pedido:");
	private final JLabel lblMarcaDelCoche = new JLabel("Marca del coche:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazCompras frame = new InterfazCompras();
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
	public InterfazCompras() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 486);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			spListaPedidos.setBorder(new TitledBorder(null, "Pedidos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			spListaPedidos.setBounds(25, 32, 195, 398);
			contentPane.add(spListaPedidos);
		}
		{
			spListaPedidos.setViewportView(lstPedidos);
		}
		{
			lblIdPedido.setBounds(269, 85, 49, 14);
			contentPane.add(lblIdPedido);
		}
		{
			lblMarcaDelCoche.setBounds(269, 122, 81, 14);
			contentPane.add(lblMarcaDelCoche);
		}
	}
}
