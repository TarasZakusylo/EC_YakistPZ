package EC_YakistPZ;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OcinkaKodu5 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel l_Stat;
	private JLabel l_Zrist;
	private JLabel l_RikNarodgenna;
	private JLabel l_Profesia;
	private JLabel l_Vaga;

	private JLabel l_fon;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;

	int grup_putanna = 0;
	int grup_putanna1 = 0;
	int grup_putanna2 = 0;
	int grup_putanna3 = 0;
	int grup_putanna4 = 0;
	
	int grup_putanna5 = 0;
	int grup_putanna6 = 0;
	int grup_putanna7 = 0;
	int grup_putanna8 = 0;
	int grup_putanna9 = 0;

	int grup_putanna10 = 0;
	int grup_putanna11 = 0;
	int grup_putanna12 = 0;
	int grup_putanna13 = 0;
	int grup_putanna14 = 0;
	
	int grup_putanna15 = 0;
	int grup_putanna16 = 0;
	int grup_putanna17 = 0;
	int grup_putanna18 = 0;
	int grup_putanna19 = 0;
	
	int grup_putanna20 = 0;
	int grup_putanna21 = 0;
	int grup_putanna22 = 0;
	int grup_putanna23 = 0;
	int grup_putanna24 = 0;
	
	int grup_putanna25 = 0;
	int grup_putanna26 = 0;
	int grup_putanna27 = 0;
	int grup_putanna28 = 0;
	int grup_putanna29 = 0;

	public OcinkaKodu5 (int grup_putanna,int grup_putanna1, int grup_putanna2, int grup_putanna3, int grup_putanna4,
			int grup_putanna5, int grup_putanna6, int grup_putanna7, int grup_putanna8, int grup_putanna9,
			int grup_putanna10, int grup_putanna11, int grup_putanna12, int grup_putanna13, int grup_putanna14,
			int grup_putanna15, int grup_putanna16, int grup_putanna17, int grup_putanna18, int grup_putanna19,
			int grup_putanna20, int grup_putanna21, int grup_putanna22, int grup_putanna23, int grup_putanna24) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000, 500);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);

		this.grup_putanna = grup_putanna;
		this.grup_putanna1 = grup_putanna1;
		this.grup_putanna2 = grup_putanna2;
		this.grup_putanna3 = grup_putanna3;
		this.grup_putanna4 = grup_putanna4;
		this.grup_putanna5 = grup_putanna5;
		this.grup_putanna6 = grup_putanna6;
		this.grup_putanna7 = grup_putanna7;
		this.grup_putanna8 = grup_putanna8;
		this.grup_putanna9 = grup_putanna9;
		this.grup_putanna10 = grup_putanna;
		this.grup_putanna11 = grup_putanna1;
		this.grup_putanna12 = grup_putanna2;
		this.grup_putanna13 = grup_putanna3;
		this.grup_putanna14 = grup_putanna4;
		this.grup_putanna15 = grup_putanna5;
		this.grup_putanna16 = grup_putanna6;
		this.grup_putanna17 = grup_putanna7;
		this.grup_putanna18 = grup_putanna8;
		this.grup_putanna19 = grup_putanna9;
		this.grup_putanna20 = grup_putanna;
		this.grup_putanna21 = grup_putanna1;
		this.grup_putanna22 = grup_putanna2;
		this.grup_putanna23 = grup_putanna3;
		this.grup_putanna24 = grup_putanna4;
		
		l_Stat = new JLabel("Ефективність, з якою можна встановити критерії випробувань ?");
		l_Stat.setForeground(Color.BLACK);
		l_Stat.setFont(new Font("Calibri", Font.PLAIN, 20));
		l_Stat.setBounds(152, 188, 555, 36);
		getContentPane().add(l_Stat);

		l_RikNarodgenna = new JLabel("Ефективна зміна без введення дефектів, без зниження якості ?");
		l_RikNarodgenna.setForeground(Color.BLACK);
		l_RikNarodgenna.setFont(new Font("Calibri", Font.PLAIN, 20));
		l_RikNarodgenna.setBounds(152, 130, 555, 36);
		getContentPane().add(l_RikNarodgenna);

		l_Zrist = new JLabel("Адаптовано до різного апаратного забезпечення, ПЗ, ОС ?");
		l_Zrist.setForeground(Color.BLACK);
		l_Zrist.setFont(new Font("Calibri", Font.PLAIN, 20));
		l_Zrist.setBounds(152, 251, 555, 36);
		getContentPane().add(l_Zrist);

		l_Vaga = new JLabel("Ефективність, з якою можна успішно встановити та видалити ?");
		l_Vaga.setForeground(Color.BLACK);
		l_Vaga.setFont(new Font("Calibri", Font.PLAIN, 20));
		l_Vaga.setBounds(152, 317, 555, 36);
		getContentPane().add(l_Vaga);

		l_Profesia = new JLabel("Можливість заміни на інший вказаний програмний продукт ?");
		l_Profesia.setForeground(Color.BLACK);
		l_Profesia.setFont(new Font("Calibri", Font.PLAIN, 20));
		l_Profesia.setBounds(152, 376, 555, 36);
		getContentPane().add(l_Profesia);

		label = new JLabel("");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna25 = 1;
				dali();
				label.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_1.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_2.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_3.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_4.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		label.setBounds(715, 140, 26, 26);
		getContentPane().add(label);

		label_1 = new JLabel("");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna25 = 2;
				dali();
				label.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_1.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_2.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_3.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_4.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_1.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		label_1.setBounds(741, 140, 26, 26);
		getContentPane().add(label_1);

		label_2 = new JLabel("");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna25 = 3;
				dali();
				label.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_1.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_2.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_3.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_4.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_2.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		label_2.setBounds(768, 140, 26, 26);
		getContentPane().add(label_2);

		label_3 = new JLabel("");
		label_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna25 = 4;
				dali();
				label.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_1.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_2.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_3.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_4.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_3.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		label_3.setBounds(795, 140, 26, 26);
		getContentPane().add(label_3);

		label_4 = new JLabel("");
		label_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna25 = 5;
				dali();
				label.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_1.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_2.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_3.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_4.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
			}
		});
		label_4.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		label_4.setBounds(821, 140, 26, 26);
		getContentPane().add(label_4);

		label_5 = new JLabel("");
		label_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna26 = 1;
				dali();
				label_5.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_6.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_7.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_8.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_9.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_5.setBounds(715, 198, 26, 26);
		label_5.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_5);

		label_6 = new JLabel("");
		label_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna26 = 2;
				dali();
				label_5.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_6.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_7.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_8.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_9.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_6.setBounds(741, 198, 26, 26);
		label_6.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_6);

		label_7 = new JLabel("");
		label_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna26 = 3;
				dali();
				label_5.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_6.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_7.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_8.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_9.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_7.setBounds(768, 198, 26, 26);
		label_7.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_7);

		label_8 = new JLabel("");
		label_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna26 = 4;
				dali();
				label_5.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_6.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_7.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_8.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_9.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_8.setBounds(795, 198, 26, 26);
		label_8.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_8);

		label_9 = new JLabel("");
		label_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna26 = 5;
				dali();
				label_5.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_6.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_7.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_8.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_9.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
			}
		});
		label_9.setBounds(821, 198, 26, 26);
		label_9.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_9);

		label_10 = new JLabel("");
		label_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna27 = 1;
				dali();
				label_10.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_11.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_12.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_13.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_14.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_10.setBounds(715, 261, 26, 26);
		label_10.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_10);

		label_11 = new JLabel("");
		label_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna27 = 2;
				dali();
				label_10.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_11.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_12.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_13.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_14.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_11.setBounds(741, 261, 26, 26);
		label_11.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_11);

		label_12 = new JLabel("");
		label_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna27 = 3;
				dali();
				label_10.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_11.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_12.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_13.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_14.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_12.setBounds(768, 261, 26, 26);
		label_12.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_12);

		label_13 = new JLabel("");
		label_13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna27 = 4;
				dali();
				label_10.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_11.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_12.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_13.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_14.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_13.setBounds(795, 261, 26, 26);
		label_13.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_13);

		label_14 = new JLabel("");
		label_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna27 = 5;
				dali();
				label_10.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_11.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_12.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_13.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_14.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
			}
		});
		label_14.setBounds(821, 261, 26, 26);
		label_14.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_14);

		label_15 = new JLabel("");
		label_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna28 = 1;
				dali();
				label_15.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_16.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_17.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_18.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_19.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_15.setBounds(715, 327, 26, 26);
		label_15.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_15);

		label_16 = new JLabel("");
		label_16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna28 = 2;
				dali();
				label_15.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_16.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_17.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_18.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_19.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_16.setBounds(741, 327, 26, 26);
		label_16.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_16);

		label_17 = new JLabel("");
		label_17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna28 = 3;
				dali();
				label_15.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_16.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_17.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_18.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_19.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_17.setBounds(768, 327, 26, 26);
		label_17.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_17);

		label_18 = new JLabel("");
		label_18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna28 = 4;
				dali();
				label_15.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_16.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_17.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_18.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_19.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_18.setBounds(795, 327, 26, 26);
		label_18.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_18);

		label_19 = new JLabel("");
		label_19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna28 = 5;
				dali();
				label_15.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_16.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_17.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_18.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_19.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
			}
		});
		label_19.setBounds(821, 327, 26, 26);
		label_19.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_19);

		label_20 = new JLabel("");
		label_20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna29 = 1;
				dali();
				label_20.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_21.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_22.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_23.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_24.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_20.setBounds(715, 386, 26, 26);
		label_20.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_20);

		label_21 = new JLabel("");
		label_21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna29 = 2;
				dali();
				label_20.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_21.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_22.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_23.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_24.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_21.setBounds(741, 386, 26, 26);
		label_21.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_21);

		label_22 = new JLabel("");
		label_22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna29 = 3;
				dali();
				label_20.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_21.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_22.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_23.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_24.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_22.setBounds(768, 386, 26, 26);
		label_22.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_22);

		label_23 = new JLabel("");
		label_23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna29 = 4;
				dali();
				label_20.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_21.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_22.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_23.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
				label_24.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
			}
		});
		label_23.setBounds(795, 386, 26, 26);
		label_23.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_23);

		label_24 = new JLabel("");
		label_24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				grup_putanna29 = 5;
				dali();
				label_20.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_21.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_22.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_23.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
				label_24.setIcon(new ImageIcon("res/fon/Зірка_1.png"));
			}
		});
		label_24.setBounds(821, 386, 26, 26);
		label_24.setIcon(new ImageIcon("res/fon/Зірка_0.jpg"));
		getContentPane().add(label_24);


		l_fon = new JLabel("");
//		l_fon.setIcon(new ImageIcon("C:\\Users\\ZakkZakk\\Desktop\\Oputuvanna.PNG"));
		l_fon.setVerticalAlignment(SwingConstants.BOTTOM);
		l_fon.setHorizontalAlignment(SwingConstants.CENTER);
		l_fon.setForeground(Color.WHITE);
		 l_fon.setIcon(new ImageIcon("res/fon/Oputuvanna.PNG"));
		l_fon.setBounds(-1, 0, 995, 465);
		getContentPane().add(l_fon);

		setVisible(true);
	}

	void dali() {
//		System.out.println(
//				grup_putanna25 + " " + grup_putanna26 + " " + grup_putanna27 + " " + grup_putanna28 + " " + grup_putanna29);
		if (grup_putanna25 != 0 && grup_putanna26 != 0 && grup_putanna27 != 0 && grup_putanna28 != 0 && grup_putanna29 != 0) {
			new ObrobkaOcinku(grup_putanna, grup_putanna1, grup_putanna2, grup_putanna3, grup_putanna4,
					grup_putanna5, grup_putanna6, grup_putanna7, grup_putanna8, grup_putanna9,
					grup_putanna10, grup_putanna11, grup_putanna12, grup_putanna13, grup_putanna14,
					grup_putanna15, grup_putanna16, grup_putanna17, grup_putanna18, grup_putanna19,
					grup_putanna20, grup_putanna21, grup_putanna22, grup_putanna23, grup_putanna24,
					grup_putanna25, grup_putanna26, grup_putanna27, grup_putanna28, grup_putanna29);
			setVisible(false);
		}
	}

}
