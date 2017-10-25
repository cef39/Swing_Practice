import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe {
	JFrame _frame = new JFrame("Tic-Tac-Toe");
	JPanel _ttt = new JPanel();
	JPanel _newPanel = new JPanel();

	JButton[] _buttons = new JButton[9];

	public static void main(String [] args){
		new TicTacToe();
	}

	public TicTacToe(){

		_frame.setSize(400, 400);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		_ttt.setLayout(new GridLayout(3, 3));
		_newPanel.setLayout(new FlowLayout());

		_frame.add(_ttt, BorderLayout.NORTH);
		_frame.add(_newPanel, BorderLayout.SOUTH);

		for (int i = 0; i < 9; i++){
			_buttons[i] = new JButton("_");

			ActionListener buttonListener = new ButtonListener();
			_buttons[i].addActionListener(buttonListener);

			_buttons[i].setFont(new Font("Courier", Font.PLAIN, 48));

			_ttt.add(_buttons[i]);
		}

		_frame.setVisible(true);
	}

	class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent e){
			JButton source = (JButton) e.getSource();
			String currentText = source.getText();
			if (currentText.equals("_")){
				source.setText("X");
			} else {
				source.setText("_");
			}
		}
	}
}