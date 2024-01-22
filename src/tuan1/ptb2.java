package tuan1;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ptb2 extends JFrame implements ActionListener {
    private JTextField ipA;
    private JTextField ipB;
    private JTextField ipC;
    private JTextField ipKQ;
    private JButton btnGiai, btnXoa, btnThoat;

    public ptb2() {
        super("noc noc");
        //setLayout(new BorderLayout());

        // Panel for the title
        JPanel jpN = new JPanel();
        jpN.setBackground(Color.CYAN);
        Label lbTitle = new Label("GIAI PHUONG TRINH BAC HAI");
        lbTitle.setFont(new Font("Roboto", Font.BOLD, 25));
        jpN.add(lbTitle);
        add(jpN, BorderLayout.NORTH);

        // Panel for the labels and text fields
        JPanel jp = new JPanel();
        //jp.setLayout(new GridLayout(4, 2, 5, 5));
        Label lbA, lbB, lbC, lbKQ;
        jp.add(lbA = new Label("Nhap a:"));
        jp.add(ipA = new JTextField(20));
        jp.add(lbB = new Label("Nhap b:"));
        jp.add(ipB = new JTextField(20));
        jp.add(lbC = new Label("Nhap c:"));
        jp.add(ipC = new JTextField(20));
        jp.add(lbKQ = new Label("Ket qua:"));
        jp.add(ipKQ = new JTextField(20));
        ipKQ.setEditable(false);
        add(jp, BorderLayout.CENTER);

        jp.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Panel for the buttons
        JPanel jpS = new JPanel();
        jpS.setBorder(BorderFactory.createTitledBorder("Chon tac vu"));
        jpS.add(btnGiai = new JButton("Giai"));
        jpS.add(btnXoa = new JButton("Xoa rong"));
        jpS.add(btnThoat = new JButton("Thoat"));
        add(jpS, BorderLayout.SOUTH);

        // Add action listeners to the buttons
        btnGiai.addActionListener(this);
        btnXoa.addActionListener(this);
        btnThoat.addActionListener(this);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(380, 300));
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new ptb2();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnGiai) {
            // Code to be executed when "Giai" button is clicked
            int a = Integer.parseInt(ipA.getText());
            int b = Integer.parseInt(ipB.getText());
            int c = Integer.parseInt(ipC.getText());

            // Perform the calculation and display the result
            // For example:
            double delta = b * b - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                ipKQ.setText("x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                ipKQ.setText("x = " + x);
            } else {
                ipKQ.setText("Phuong trinh vo nghiem");
            }
        } else if (e.getSource() == btnXoa) {
            // Code to be executed when "Xoa rong" button is clicked
            ipA.setText("");
            ipB.setText("");
            ipC.setText("");
            ipKQ.setText("");
        } else if (e.getSource() == btnThoat) {
            // Code to be executed when "Thoat" button is clicked
            System.exit(0);
        }
    }
}
