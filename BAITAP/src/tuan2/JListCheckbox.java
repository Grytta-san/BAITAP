package tuan2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Label;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JListCheckbox extends JFrame {
	private JButton btnDong,btnToDenChan,btnToDenLe,btnToDenNto,btnBoToDen,btnXoaToDen,btnTongGT;
	public JListCheckbox() {
		super("Thao tac tren JList");
		JPanel jpN = new JPanel();
		Label lbTitle;
		jpN.add(lbTitle = new Label("Thao tac tren JList - Checkbox"));
		//JPanel jp = new JPanel();
		add(jpN, BorderLayout.NORTH);
		JPanel jpE = new JPanel();
		JPanel jpW = new JPanel();
		add(jpE,BorderLayout.EAST);
		add(jpW,BorderLayout.WEST);
		Label lbChon,lbNhap;
        jpW.setBorder(BorderFactory.createTitledBorder("Chon tac vu"));

		JPanel jpBtn = new JPanel();
		jpBtn.setLayout(new BoxLayout(jpBtn, BoxLayout.Y_AXIS));
		jpBtn.add(btnToDenChan = new JButton("To den so chan"));
		jpBtn.add(btnToDenLe = new JButton("To den so le"));
		jpBtn.add(btnToDenNto = new JButton("To den so nguyen to"));
		jpBtn.add(btnBoToDen = new JButton("Bo to den"));
		jpBtn.add(btnXoaToDen = new JButton("Xoa cac gia tri da to den"));
		jpBtn.add(btnTongGT = new JButton("Tong gia tri trong JList"));
		jpW.add(jpBtn);
		
        jpE.setBorder(BorderFactory.createTitledBorder("Nhap thong tin:"));
		JPanel jpS = new JPanel();
		jpS.add(btnDong = new JButton("Dong chuong trinh"));

		add(jpS,BorderLayout.SOUTH);
		setPreferredSize(new Dimension(500, 300));
		pack();
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JListCheckbox();
	}
}
