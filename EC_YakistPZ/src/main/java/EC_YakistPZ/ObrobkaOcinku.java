package EC_YakistPZ;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class ObrobkaOcinku extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel l_fon;

	String s_tezy = "                        ВАМ НЕОБХІДНО:";
	boolean b_tezu_null = false;

	private JTextPane textPane;

	private JScrollPane scrollPane;

	public ObrobkaOcinku(int grup_putanna, int grup_putanna1, int grup_putanna2, int grup_putanna3, int grup_putanna4,
			int grup_putanna5, int grup_putanna6, int grup_putanna7, int grup_putanna8, int grup_putanna9,
			int grup_putanna10, int grup_putanna11, int grup_putanna12, int grup_putanna13, int grup_putanna14,
			int grup_putanna15, int grup_putanna16, int grup_putanna17, int grup_putanna18, int grup_putanna19,
			int grup_putanna20, int grup_putanna21, int grup_putanna22, int grup_putanna23, int grup_putanna24,
			int grup_putanna25, int grup_putanna26, int grup_putanna27, int grup_putanna28, int grup_putanna29) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		double d_FunkcionalnaPrudatnist = (grup_putanna + grup_putanna1 + grup_putanna2) * 6.67;
		double d_Efektyvnist = (grup_putanna3 + grup_putanna4 + grup_putanna5) * 6.67;
		double d_Zruchnist = (grup_putanna6 + grup_putanna7 + grup_putanna8 + grup_putanna9 + grup_putanna10
				+ grup_putanna11) * 3.33;
		double d_Nadiynist = (grup_putanna12 + grup_putanna13 + grup_putanna14 + grup_putanna15) * 5;
		double d_Sumisnist = (grup_putanna16 + grup_putanna17) * 10;
		double d_Bezpeka = (grup_putanna18 + grup_putanna19 + grup_putanna20 + grup_putanna21 + grup_putanna22) * 4;
		double d_Suprovodjyvannist = (grup_putanna23 + grup_putanna24 + grup_putanna25 + grup_putanna26) * 5;
		double d_Perenesenna = (grup_putanna27 + grup_putanna28 + grup_putanna29) * 6.66;

		d_FunkcionalnaPrudatnist = (int) d_FunkcionalnaPrudatnist;
		d_Efektyvnist = (int) d_Efektyvnist;
		d_Zruchnist = (int) d_Zruchnist;
		d_Nadiynist = (int) d_Nadiynist;
		d_Sumisnist = (int) d_Sumisnist;
		d_Bezpeka = (int) d_Bezpeka;
		d_Suprovodjyvannist = (int) d_Suprovodjyvannist;
		d_Perenesenna = (int) d_Perenesenna;

		if (d_FunkcionalnaPrudatnist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy + "\n\n  - Перевірте наявність дефектів у специфікації, проекті та реалізації системи."
					+ "\n\n  - Перевірте відповідність ТЗ (якщо створюєте проеет самостійно, то продумайте функціонал)."
					+ "\n\n  - Зверніть увагу на безпомилковості системи, особливо коли є виведення кількісних даних.";
		}
		if (d_Efektyvnist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Перевірте масштаб зміни системи (мета: ефективне використання в тих галузях або середовищах, на які не була орієнтована)."
					+ "\n\n  - Перегляньте ступінь виконання блокового і системного тестування програми та перевірки її відповідності вимогам.";
		}
		if (d_Zruchnist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy + "\n\n  - Зробіть систему простішою та легшою, а також зрозумілішою."
					+ "\n\n  - Попрацюйте над оптимізацією системи.";
		}
		if (d_Nadiynist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Переробіть використання системних ресурсів. Ця характеристика враховує такі фактори, як швидкодія програми і необхідний їй обсяг пам'яті."
					+ "\n\n  - Проблеми із здатністю системи виконувати необхідні функції за певних умов, а також із середнім інтервалом між відмовами."
					+ "\n\n  - Реалізуйте здатність системи продовжувати роботу при введенні неприпустимих даних або в напружених умовах.";
		}
		if (d_Sumisnist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Реалізуйте можливість використання системи без її зміни в тих галузях або середовищах, на які вона не була орієнтована безпосередньо."
					+ "\n\n  - Створіть масштабність і легкість використання частин системи в інших системах.";
		}
		if (d_Bezpeka < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Необхідна затність системи запобігати неавторизованому або некоректному доступу до своїх програм та даних.";
		}
		if (d_Suprovodjyvannist < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Реалізуйте легку зміну програмної системи з метою реалізації додаткових можливостей, підвищення швидкодії, виправлення дефектів тощо.";
		}
		if (d_Perenesenna < 75) {
			b_tezu_null = true;
			s_tezy = s_tezy
					+ "\n\n  - Реалізуйте легку зміну системи з метою використання у середовищах, на які вона не була орієнтована безпосередньо.";
		}

		if (b_tezu_null == false) {
			s_tezy = "	У ВАС ПРЕКРАСНА СИСТЕМА";
		}

		JLabel label = new JLabel("Меню");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				new Menu("Якість ПЗ");
				setVisible(false);
			}
		});
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(Color.CYAN);
		label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label.setBounds(719, 423, 275, 42);
		getContentPane().add(label);

		JLabel label_1 = new JLabel("Результати:");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(Color.CYAN);
		label_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label_1.setBounds(446, 1, 547, 42);
		getContentPane().add(label_1);

		JLabel label_2 = new JLabel("Функціональна  придатність: " + d_FunkcionalnaPrudatnist + "%");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(Color.ORANGE);
		label_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_2.setBounds(447, 56, 547, 42);
		getContentPane().add(label_2);

		JLabel label_3 = new JLabel("Ефективність: " + d_Efektyvnist + "%");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(Color.ORANGE);
		label_3.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_3.setBounds(447, 99, 547, 42);
		getContentPane().add(label_3);

		JLabel label_4 = new JLabel("Зручність  використання: " + d_Zruchnist + "%");
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(Color.ORANGE);
		label_4.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_4.setBounds(447, 141, 547, 42);
		getContentPane().add(label_4);

		JLabel label_5 = new JLabel("Надійність: " + d_Nadiynist + "%");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(Color.ORANGE);
		label_5.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_5.setBounds(447, 184, 547, 42);
		getContentPane().add(label_5);

		JLabel label_6 = new JLabel("Сумісність: " + d_Sumisnist + "%");
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(Color.ORANGE);
		label_6.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_6.setBounds(447, 228, 547, 42);
		getContentPane().add(label_6);

		JLabel label_7 = new JLabel("Безпека: " + d_Bezpeka + "%");
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(Color.ORANGE);
		label_7.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_7.setBounds(447, 271, 547, 42);
		getContentPane().add(label_7);

		JLabel label_8 = new JLabel("Супроводжуваність: " + d_Suprovodjyvannist + "%");
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(Color.ORANGE);
		label_8.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_8.setBounds(447, 315, 547, 42);
		getContentPane().add(label_8);

		JLabel label_9 = new JLabel("Можливість перенесення: " + d_Perenesenna + "%");
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(Color.ORANGE);
		label_9.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 32));
		label_9.setBounds(447, 358, 547, 42);
		getContentPane().add(label_9);

		scrollPane = new JScrollPane();
		// scrollPane.setBounds(12, 13, 443, 439);
		getContentPane().add(scrollPane);

		textPane = new JTextPane();
		scrollPane.setViewportView(textPane);
		textPane.setForeground(new Color(0, 128, 0));
		textPane.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		// textPane.setText(s_tezy);

		JLabel label_10 = new JLabel("Тези");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				scrollPane.setBounds(12, 13, 443, 439);
				textPane.setText(s_tezy);
			}
		});
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(Color.CYAN);
		label_10.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 39));
		label_10.setBounds(446, 423, 275, 42);
		getContentPane().add(label_10);

		l_fon = new JLabel("");
		// l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Rezultatu
		// (змешена).jpg"));
		l_fon.setForeground(Color.WHITE);
		l_fon.setIcon(new ImageIcon("res/fon/Rezultatu (зменшена).jpg"));
		l_fon.setBounds(-1, 0, 995, 465);
		getContentPane().add(l_fon);

		setVisible(true);

	}
}
