package tuan1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SoNguyenTo extends JFrame implements ActionListener{
	private JPanel jp;
	private JTextField text;
	private JButton gen;
	private JTextArea list;
	private Object a;

	public SoNguyenTo() {
		setTitle("Primes");
		jp = new JPanel();
		jp.add(text = new JTextField(30));
		jp.add(gen = new JButton("Generate"));
		jp.add(list = new JTextArea(20, 30));
		
		add(jp);
		gen.addActionListener(this);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	
	}

	public static void main(String[] args) {
		new SoNguyenTo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == gen) {
            list.setText("");
            String input = text.getText();

            try {
                int n = Integer.parseInt(input);

                if (n >= 1) {
                    int dem = 0;
                    int i = 2;

                    while (dem < n) {
                        if (isPrime(i)) {
                            list.append(i + "\n");
                            dem++;
                        }
                        i++;
                    }
                } else {
                    list.append("Vui lòng nhập lại số lớn hơn 1!");
                }
            } catch (NumberFormatException ex) {
                list.append("Chú ý: nhập số nguyên!");
            }
        }
    }

    // Hàm kiểm tra số nguyên tố
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    
	}
}