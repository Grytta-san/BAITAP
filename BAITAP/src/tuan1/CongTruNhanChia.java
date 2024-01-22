package tuan1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;

public class CongTruNhanChia extends JFrame {
    private JButton btnGiai, btnXoa, btnThoat;
    private JRadioButton btnC, btnT, btnN, btnChia;
    private JTextField ipA, ipB, ipkq;
    public CongTruNhanChia() {
        JPanel jpN = new JPanel();
        Label lbTitle;
        jpN.add(lbTitle = new Label("Cộng Trừ Nhân Chia"));
        lbTitle.setForeground(Color.BLUE);
        lbTitle.setFont(new Font("Arial", Font.BOLD, 30));

        
        
        JPanel jpW = new JPanel();
        jpW.setLayout(new BoxLayout(jpW, BoxLayout.Y_AXIS));
        jpW.setBorder(BorderFactory.createTitledBorder("Chọn tác vụ"));
        jpW.setPreferredSize(new Dimension(100, HEIGHT));
        
        btnGiai = new JButton("Giải");
        btnGiai.setAlignmentX(Component.CENTER_ALIGNMENT); 
        btnGiai.setMaximumSize(new Dimension(80, 30));
        jpW.add(Box.createVerticalStrut(10));
        jpW.add(btnGiai);

        btnXoa = new JButton("Xóa");
        btnXoa.setAlignmentX(Component.CENTER_ALIGNMENT); 
        btnXoa.setMaximumSize(new Dimension(80, 30));
        jpW.add(Box.createVerticalStrut(10));
        jpW.add(btnXoa);

        btnThoat = new JButton("Thoát");
        btnThoat.setAlignmentX(Component.CENTER_ALIGNMENT); 
        btnThoat.setMaximumSize(new Dimension(80, 30));
        jpW.add(Box.createVerticalStrut(10));
        jpW.add(btnThoat);



        JPanel jp = new JPanel();
        jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
        jp.setBorder(BorderFactory.createTitledBorder("Tính toán"));
        
        Label lbA, lbB, lbkq;
        JPanel jpA = new JPanel();
        jpA.add(lbA = new Label("Nhập a:"));
        jpA.add(ipA = new JTextField(30));
       
        JPanel jpB = new JPanel();
        jpB.add(lbB = new Label("Nhập b:"));
        jpB.add(ipB = new JTextField(30));
        
        
        JPanel jp1 = new JPanel(new GridLayout(2, 2));
        jp1.setBorder(BorderFactory.createTitledBorder("Phép toán"));
        jp1.setBorder(BorderFactory.createCompoundBorder(
        	    BorderFactory.createEmptyBorder(0, 80, 0, 20), // Add a 10-pixel margin on the left side
        	    jp1.getBorder()
        	));
  
        jp1.add(btnC = new JRadioButton("Cộng"));
        jp1.add(btnT = new JRadioButton("Trừ"));
        jp1.add(btnN = new JRadioButton("Nhân"));
        jp1.add(btnChia = new JRadioButton("Chia"));
        ButtonGroup grP = new ButtonGroup();
        grP.add(btnC);
        grP.add(btnT);
        grP.add(btnN);
        grP.add(btnChia);

        JPanel jpKQ = new JPanel();
        jpKQ.add(lbkq = new Label("Kết quả:"));
        jpKQ.add(ipkq = new JTextField(30));
        ipkq.setEditable(false);
        
        jp.add(jpA);
        jp.add(jpB);
        jp.add(jp1);
        jp.add(jpKQ);
        
        
        JPanel jpS = new JPanel();
        jpS.setBackground(Color.pink);
        jpS.setPreferredSize(new Dimension(10,40));
		jpS.setBackground(Color.pink);
		JPanel pnL = new JPanel();
		pnL.setBackground(Color.BLUE);
		pnL.setPreferredSize(new Dimension(20, 20));
		jpS.add(pnL);
		JPanel pnR = new JPanel();
		pnR.setBackground(Color.red);
		pnR.setPreferredSize(new Dimension(20, 20));
		jpS.add(pnR);
		JPanel pnY = new JPanel();
		pnY.setBackground(Color.yellow);
		pnY.setPreferredSize(new Dimension(20, 20));
		jpS.add(pnY);
        
		
        pack();
        setLayout(new BorderLayout());
        add(jpN, BorderLayout.NORTH);
        add(jpW, BorderLayout.WEST);
        add(jp, BorderLayout.CENTER);
        add(jpS, BorderLayout.SOUTH);
        setSize(530, 350);
        setVisible(true);
        
        btnGiai.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double a = Double.parseDouble(ipA.getText());
				double b = Double.parseDouble(ipB.getText());
				if (btnC.isSelected()) {
					double kq = a+b;
					ipkq.setText(String.valueOf(kq));
				}
				else if (btnT.isSelected()) {
					double kq = a-b;
					ipkq.setText(String.valueOf(kq));
			}
				else if (btnN.isSelected()) {
					double kq = a*b;
					ipkq.setText(String.valueOf(kq));
				}
				else if (btnChia.isSelected()) {
					
					if(b !=0) {
						double kq = a/b;
						ipkq.setText(String.valueOf(kq));
					}else
						ipkq.setText("Can't divide");
						
			}}
		});
        btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ipA.setText("");
				ipB.setText("");
				ipkq.setText("");
				
			}
		});
        btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
        
    }

    
    public static void main(String[] args) {
        new CongTruNhanChia();
    }

    
}
