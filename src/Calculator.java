import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculator extends JFrame {
	
	private Stack<Double> operands;
	private Stack<Operator> operators;
	private String operandInput;
	private Operator operatorInput;
	
	private static final int CALC_WIDTH = 300;
	private static final int CALC_HEIGHT = 200;
		
	private JTextField input;
	
	private JButton button1;	//data member need to use private
	private JButton button2;	//method most time use public
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton button10;
	private JButton button11;	
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JButton button16;
	private JButton button17;
	private JButton button18;
	private JButton button19;
	private JButton button20;
	
	public void init(){
		operands = new Stack<Double>();
		operators = new Stack<Operator>();
		operandInput = "0";
		operatorInput = null;
	}
	
	public Calculator(){
		init();
		
		this.setSize(CALC_WIDTH,CALC_HEIGHT);
		this.setLayout(new BorderLayout(4,4));
		JPanel keypad = new JPanel();
		keypad.setLayout(new GridLayout(4,5,4,4));
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		
		button1 = new JButton("1");
		button2 = new JButton("2");
		button3 = new JButton("3");
		button4 = new JButton("4");
		button5 = new JButton("5");
		button6 = new JButton("6");
		button7 = new JButton("7");
		button8 = new JButton("8");
		button9 = new JButton("9");
		button10 = new JButton("0");
		button11 = new JButton(".");
		button12 = new JButton("=");
		button13 = new JButton("+");
		button14 = new JButton("-");
		button15 = new JButton("*");
		button16 = new JButton("/");
		button17 = new JButton("(");
		button18 = new JButton(")");
		button19 = new JButton("^");
		button20 = new JButton("c");
		
		keypad.add(button1);
		keypad.add(button2);
		keypad.add(button3);
		keypad.add(button13);
		keypad.add(button14);
		keypad.add(button4);
		keypad.add(button5);
		keypad.add(button6);
		keypad.add(button15);
		keypad.add(button16);
		keypad.add(button7);
		keypad.add(button8);
		keypad.add(button9);
		keypad.add(button17);
		keypad.add(button18);
		keypad.add(button10);
		keypad.add(button11);
		keypad.add(button12);
		keypad.add(button19);
		keypad.add(button20);

		this.add( keypad );
		this.add( input, BorderLayout.NORTH );
		
		KeypadListener listener = new KeypadListener();
		
		button1.addActionListener(listener);
		button2.addActionListener(listener);
		button3.addActionListener(listener);
		button4.addActionListener(listener);
		button5.addActionListener(listener);
		button6.addActionListener(listener);
		button7.addActionListener(listener);
		button8.addActionListener(listener);
		button9.addActionListener(listener);
		button10.addActionListener(listener);
		button11.addActionListener(listener);
		button12.addActionListener(listener);
		button13.addActionListener(listener);
		button14.addActionListener(listener);
		button15.addActionListener(listener);
		button16.addActionListener(listener);
		button17.addActionListener(listener);
		button18.addActionListener(listener);
		button19.addActionListener(listener);
		button20.addActionListener(listener);

		button1.setMnemonic(KeyEvent.VK_1);
		button2.setMnemonic(KeyEvent.VK_2);
		button3.setMnemonic(KeyEvent.VK_3);
		button4.setMnemonic(KeyEvent.VK_4);
		button5.setMnemonic(KeyEvent.VK_5);
		button6.setMnemonic(KeyEvent.VK_6);
		button7.setMnemonic(KeyEvent.VK_7);
		button8.setMnemonic(KeyEvent.VK_8);
		button9.setMnemonic(KeyEvent.VK_9);
		button10.setMnemonic(KeyEvent.VK_0);
		button11.setMnemonic(KeyEvent.VK_PERIOD);
		button12.setMnemonic(KeyEvent.VK_EQUALS);
		button13.setMnemonic(KeyEvent.VK_PLUS);
		button14.setMnemonic(KeyEvent.VK_MINUS);
		button15.setMnemonic(KeyEvent.VK_MULTIPLY);
		button16.setMnemonic(KeyEvent.VK_DIVIDE);
		button17.setMnemonic(KeyEvent.VK_LEFT_PARENTHESIS);
		button18.setMnemonic(KeyEvent.VK_RIGHT_PARENTHESIS);
		button19.setMnemonic(KeyEvent.VK_CIRCUMFLEX);
		button20.setMnemonic(KeyEvent.VK_C);
	
	}
	
	public void removeZero(){
		if (operandInput.length() > 1 && operandInput.charAt(0) == '0' && operandInput.charAt(1) != '.'){
		operandInput = operandInput.substring(1, operandInput.length());	
		}
	}
		
	private class KeypadListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button1){
				operandInput+="1";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button2){
				operandInput+="2";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button3){
				operandInput+="3";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button4){
				operandInput+="4";
				removeZero();
				input.setText(operandInput);
			}	
			else if (e.getSource() == button5){
				operandInput+="5";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button6){
				operandInput+="6";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button7){
				operandInput+="7";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button8){
				operandInput+="8";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button9){
				operandInput+="9";
				removeZero();
				input.setText(operandInput);
			}	
			else if (e.getSource() == button10){
				operandInput+="0";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button11){
				operandInput+=".";
				removeZero();
				input.setText(operandInput);
			}
			else if (e.getSource() == button12){
				operatorInput = new EqualOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
			}
			else if (e.getSource() == button13){
				operatorInput = new AddOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
				}
			else if (e.getSource() == button14){
				operatorInput = new MinusOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
			}
			else if (e.getSource() == button15){
				operatorInput = new MultOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
			}
			else if (e.getSource() == button16){
				operatorInput = new DivOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
			}
			else if (e.getSource() == button17){
				operatorInput = new LeftParenOperator();
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
				}
			else if (e.getSource() == button18){
				operatorInput = new RightParenOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
			}
			else if (e.getSource() == button19){
				operatorInput = new PowOperator();
				operands.push(Double.valueOf(operandInput));
				removeZero();
				input.setText("" + calculate());
				operandInput = "";
			}	
			else if (e.getSource() == button20){
				init();
				removeZero();
				input.setText(operandInput);
			}
		}
	}
	
	public void run(){
		this.setVisible(true);
	}
	
	public static void main (String[] args){
		Calculator calc = new Calculator();
		calc.run();
	}

	public String calculate(){
		Double ans = (double) 0;
		if (operators.isEmpty() || operatorInput.getPriority() >= operators.peek().getPriority()){
			operators.push(operatorInput);
			operatorInput = null;
			return operandInput;
		}
		else if (operatorInput.getPriority() == 1){
			operators.push(operatorInput);
			operatorInput = null;
			return operandInput;
		}
		else if (operatorInput.getPriority() == 2){
			while(operators.peek().getPriority() != 1){
				Double b = operands.pop();
				Double a = operands.pop();
				ans = operators.pop().evaluate(a, b);
				operands.push(ans);
 			}
			operands.pop();
			operandInput = "" + ans;
			operators.pop();
			operatorInput = null;
		}
		else{
			while(!operators.isEmpty() && operatorInput.getPriority() <= operators.peek().getPriority()){
				Double b = operands.pop();
				Double a = operands.pop();
				ans = operators.pop().evaluate(a, b);
				operands.push(ans);
			}
			if (operatorInput.getPriority() != 0){
				operators.push(operatorInput);
			}
			else{
				operandInput = "" + ans;
			}
			operatorInput = null;
		}
		return operandInput;
	}
	
}
