package tuan2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class qLyNhanVien extends JFrame {
	private JButton btnTim,btnThem,btnXoaRong,btnXoa,btnLuu;
	private JRadioButton btnNam,btnNu;
	public qLyNhanVien() {
		super("^-^");
		JPanel jpN = new JPanel();
		Label lbTitle,lbMaNV,lbHo,lbTen,lbTuoi,lbPhai,lbTL;
		JTextField ipMaNV,ipHo,ipTen,ipTuoi,ipTL;

		jpN.add(lbTitle = new Label("THONG TIN NHAN VIEN"));
		lbTitle.setForeground(Color.BLUE);
		lbTitle.setFont(new Font("Arial",Font.BOLD,25));
		
		JPanel jp = new JPanel();
		
		JPanel jpMaNV = new JPanel();
		jpMaNV.add(lbMaNV = new Label("Ma Nhan vien:"));
		jpMaNV.add(ipMaNV = new JTextField(40));
		JPanel jpHo = new JPanel();
		jpHo.add(lbHo = new Label("Ho:"));
		jpHo.add(ipHo = new JTextField(40));
		JPanel jpTen = new JPanel();
		jpTen.add(lbTen = new Label("Ten nhan vien:"));
		jpTen.add(ipTen = new JTextField(40));
		JPanel jpTuoi = new JPanel();
		jpTuoi.add(lbTuoi = new Label("Tuoi:"));
		jpTuoi.add(ipTuoi = new JTextField(20));
		JPanel jpPhai = new JPanel();
		jpPhai.add(lbPhai = new Label("Phai:"));

		jpPhai.add(btnNam = new JRadioButton("Nam"));
		jpPhai.add(btnNu = new JRadioButton("Nữ"));
		ButtonGroup grPhai = new ButtonGroup();
		grPhai.add(btnNam);
		grPhai.add(btnNu);	
		jpTuoi.add(jpPhai);
		
		JPanel jpTL = new JPanel();
		jpTL.add(lbTL = new Label("Tien luong:"));
		jpTL.add(ipTL = new JTextField(40));
		
		jp.add(jpMaNV);
		jp.add(jpHo);
		jp.add(jpTen);
		jp.add(jpTuoi);
		jp.add(jpTL);
		
		JPanel jpTb = new JPanel();
		jpTb.setPreferredSize(new Dimension(1000, 120));
		Object [][] data= {
				 {1111, "Nguyễn", "Hoàng", "Nam", 26, "4,500.0$"},
		         {2222, "Lê", "Thu", "Nữ", 28, "5,5000.0$"},
		         {3333, "Hoàng", "Lê", "Nam", 30, "5,5000.0$"},
		         {4444, "Trần", "Lan", "Nữ", 27, "3,500.0$"}
		};
		String[] columnNames = {"MaVN","Ho","Ten","Tuoi","Phai","Tien luong"};
		JTable nv = new JTable(data,columnNames);
		JScrollPane scrollPane = new JScrollPane(nv, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jpTb.add(scrollPane, BorderLayout.EAST);
		jp.add(jpTb);
		
		JPanel jpS = new JPanel();
		JPanel jpS1 = new JPanel();
		JPanel jpS2 = new JPanel();
		jpS.add(jpS1);
		jpS.add(jpS2);
		Label lbTim;
		jpS1.add(lbTim = new Label("Nhap ma so can tim:"));
		JTextField ipTim;
		jpS1.add(ipTim = new JTextField(10));
		jpS1.add(btnTim = new JButton("Tìm"));
		jpS2.add(btnThem = new JButton("Thêm"));
		jpS2.add(btnXoaRong = new JButton("Xóa rỗng"));
		jpS2.add(btnXoa = new JButton("Xóa"));
		jpS2.add(btnLuu = new JButton("Lưu"));


		add(jpN,BorderLayout.NORTH);
		add(jp,BorderLayout.CENTER);
		add(jpS,BorderLayout.SOUTH);
		setPreferredSize(new Dimension(800, 450));
		pack();
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new qLyNhanVien();
	}


}
