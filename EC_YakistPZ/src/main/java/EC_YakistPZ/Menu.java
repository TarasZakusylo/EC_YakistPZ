package EC_YakistPZ;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Menu extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_fon;

	public Menu(String s) {
		super(s);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		JLabel label = new JLabel("Оцінка  коду");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				new OcinkaKodu();
				setVisible(false);
			}
		});
		label.setForeground(Color.CYAN);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label.setBounds(-1, 365, 493, 42);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Тестування  ПЗ");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// new Testuvanna();
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"https://uk.wikipedia.org/wiki/%D0%A2%D0%B5%D1%81%D1%82%D1%83%D0%B2%D0%B0%D0%BD%D0%BD%D1%8F_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BD%D0%BE%D0%B3%D0%BE_%D0%B7%D0%B0%D0%B1%D0%B5%D0%B7%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D0%BD%D1%8F"));
				} catch (Exception e1) {
				}
			}
		});
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.CYAN);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label_1.setBounds(500, 410, 493, 42);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Правила  покращення  коду");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// new PravulaPokrachenna();
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI("http://lib.mdpu.org.ua/e-book/vstup/L9.htm"));
				} catch (Exception e1) {
				}
			}
		});
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.CYAN);
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label_2.setBounds(500, 365, 493, 42);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Етапи  розробки  ПЗ");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// new EtapyRozrobku();
				// setVisible(false);
				Desktop d = Desktop.getDesktop();
				try {
					d.browse(new URI(
							"https://uk.wikipedia.org/wiki/%D0%9F%D1%80%D0%BE%D1%86%D0%B5%D1%81_%D1%80%D0%BE%D0%B7%D1%80%D0%BE%D0%B1%D0%BA%D0%B8_%D0%BF%D1%80%D0%BE%D0%B3%D1%80%D0%B0%D0%BC%D0%BD%D0%BE%D0%B3%D0%BE_%D0%B7%D0%B0%D0%B1%D0%B5%D0%B7%D0%BF%D0%B5%D1%87%D0%B5%D0%BD%D0%BD%D1%8F"));
				} catch (Exception e1) {
				}
			}
		});
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.CYAN);
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label_3.setBounds(-1, 410, 493, 42);
		getContentPane().add(label_3);

		l_fon = new JLabel("");
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Меню.jpg"));
		l_fon.setBounds(-1, 0, 995, 465);
		getContentPane().add(l_fon);

		setVisible(true);
	}
}
