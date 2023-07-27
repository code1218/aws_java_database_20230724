package frame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class ProductRegisterFrame extends JFrame {

	private JPanel contentPane;
	private JTextField productNameTextField;
	private JTextField productPriceTextField;
	private JTextField productColorTextField;
	private JTextField productCategoryTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductRegisterFrame frame = new ProductRegisterFrame();
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
	public ProductRegisterFrame() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("상품 등록");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(12, 10, 410, 51);
		contentPane.add(titleLabel);
		
		JLabel productNameLabel = new JLabel("상품명");
		productNameLabel.setBounds(12, 71, 57, 15);
		contentPane.add(productNameLabel);
		
		productNameTextField = new JTextField();
		productNameTextField.setBounds(81, 65, 341, 27);
		contentPane.add(productNameTextField);
		productNameTextField.setColumns(10);
		
		JLabel productPriceLabel = new JLabel("가격");
		productPriceLabel.setBounds(12, 102, 57, 15);
		contentPane.add(productPriceLabel);
		
		productPriceTextField = new JTextField();
		productPriceTextField.setColumns(10);
		productPriceTextField.setBounds(81, 96, 341, 27);
		contentPane.add(productPriceTextField);
		
		JLabel productColorLabel = new JLabel("색상");
		productColorLabel.setBounds(12, 133, 57, 15);
		contentPane.add(productColorLabel);
		
		productColorTextField = new JTextField();
		productColorTextField.setColumns(10);
		productColorTextField.setBounds(81, 127, 341, 27);
		contentPane.add(productColorTextField);
		
		JLabel productCategoryLabel = new JLabel("분류");
		productCategoryLabel.setBounds(12, 164, 57, 15);
		contentPane.add(productCategoryLabel);
		
		productCategoryTextField = new JTextField();
		productCategoryTextField.setColumns(10);
		productCategoryTextField.setBounds(81, 158, 341, 27);
		contentPane.add(productCategoryTextField);
		
		JButton registerSubmitButton = new JButton("등록하기");
		registerSubmitButton.setBounds(12, 195, 410, 56);
		contentPane.add(registerSubmitButton);
	}
}
