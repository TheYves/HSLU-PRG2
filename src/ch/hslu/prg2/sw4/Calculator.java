package ch.hslu.prg2.sw4;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Yves Hohl (yves.hohl@stud.hslu.ch) on 09.10.2014.
 */
public class Calculator extends Frame implements WindowListener, ActionListener {

	private static final int OPERATOR_UNKNOWN = 0;
	private static final int OPERATOR_PLUS = 1;
	private static final int OPERATOR_MINUS = 2;
	private static final int OPERATOR_MULTIPLICATION = 3;
	private static final int OPERATOR_DIVISION = 4;

	private Panel panel = new Panel();
	private TextField textField = new TextField("0");
	private Button button0 = new Button("0");
	private Button button1 = new Button("1");
	private Button button2 = new Button("2");
	private Button button3 = new Button("3");
	private Button button4 = new Button("4");
	private Button button5 = new Button("5");
	private Button button6 = new Button("6");
	private Button button7 = new Button("7");
	private Button button8 = new Button("8");
	private Button button9 = new Button("9");
	private Button buttonDivision = new Button("/");
	private Button buttonMultiplication = new Button("*");
	private Button buttonMinus = new Button("-");
	private Button buttonPlus = new Button("+");
	private Button buttonClear = new Button("C");
	private Button buttonSign = new Button("S");
	private Button buttonEquals = new Button("=");

	public double operand1;
	public double operand2;
	public double result = 0;
	public int operator;

	public Calculator(){
		super("Calculator");

		setSize(250, 210);
		setResizable(false);
		addWindowListener(this);

		textField.setEditable(false);

		add(textField, BorderLayout.NORTH);
		add(panel, BorderLayout.SOUTH);

		panel.setLayout(new GridLayout(5, 4));

		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(buttonDivision);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(buttonMultiplication);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(buttonMinus);
		panel.add(button0);
		panel.add(buttonSign);
		panel.add(buttonEquals);
		panel.add(buttonPlus);
		panel.add(buttonClear);

		button0.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		button6.addActionListener(this);
		button7.addActionListener(this);
		button8.addActionListener(this);
		button9.addActionListener(this);
		buttonDivision.addActionListener(this);
		buttonMultiplication.addActionListener(this);
		buttonMinus.addActionListener(this);
		buttonPlus.addActionListener(this);
		buttonClear.addActionListener(this);
		buttonSign.addActionListener(this);
		buttonEquals.addActionListener(this);

		setVisible(true);
	}

	public double toggleSign() {
		if(operator == OPERATOR_UNKNOWN) {
			operand1 *= -1;
			return operand1;
		} else {
			operand2 *= -1;
			return operand2;
		}
	}

	private double numberTyped(int ch, double currentValue) {
		if(currentValue == 0) {
			return ch;
		} else {
			return Double.parseDouble(currentValue + "" + ch);
		}
	}

	private double calculate() {
		double result = 0;
		boolean hasError = false;

		switch(operator) {
			case OPERATOR_PLUS:
				result = operand1 + operand2;
				break;
			case OPERATOR_MINUS:
				result = operand1 + operand2;
				break;
			case OPERATOR_DIVISION:
				if(operand2 == 0) {
					hasError = true;
				} else {
					result = operand1 / (double) operand2;
				}
				break;
			case OPERATOR_MULTIPLICATION:
				result = operand1 * operand2;
				break;
		}

		clear();

		if(hasError) {
			updateTextField("ERROR");
			return 0;
		} else {
			updateTextField(result);
			return result;
		}
	}

	private void clear() {
		operand1 = 0;
		operand2 = 0;
		operator = OPERATOR_UNKNOWN;
		updateTextField(0);
	}

	private void changeOperator(int newOperator) {
		if(operator != OPERATOR_UNKNOWN) {
			operand1 = calculate();
		}
		operator = newOperator;
	}

	private void updateTextField(double newValue) {
		if((newValue % 1) == 0) {
			textField.setText((int) newValue + "");
		} else {
			textField.setText(newValue + "");
		}
	}

	private void updateTextField(String text) {
		textField.setText(text);
	}

	@Override
	public void windowOpened(WindowEvent windowEvent) {

	}

	@Override
	public void windowClosing(WindowEvent windowEvent) {
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent windowEvent) {

	}

	@Override
	public void windowIconified(WindowEvent windowEvent) {

	}

	@Override
	public void windowDeiconified(WindowEvent windowEvent) {

	}

	@Override
	public void windowActivated(WindowEvent windowEvent) {

	}

	@Override
	public void windowDeactivated(WindowEvent windowEvent) {

	}

	@Override
	public void actionPerformed(ActionEvent actionEvent) {
		char ch = (actionEvent.getActionCommand()).charAt(0);

		switch (ch) {
			case '+':
				changeOperator(OPERATOR_PLUS);
				break;
			case '-':
				changeOperator(OPERATOR_MINUS);
				break;
			case '*':
				changeOperator(OPERATOR_MULTIPLICATION);
				break;
			case '/':
				changeOperator(OPERATOR_DIVISION);
				break;
			case 'C':
				clear();
				break;
			case '=':
				calculate();
				break;
			case 'S':
				updateTextField(toggleSign());
				break;
			default:
				int digit = ch - '0';
				if(operator == OPERATOR_UNKNOWN) {
					operand1 = numberTyped(digit, operand1);
					updateTextField(operand1);
				} else {
					operand2 = numberTyped(digit, operand2);
					updateTextField(operand2);
				}
				break;
		}
	}

}
