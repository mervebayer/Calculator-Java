import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 


public class Calculator extends JFrame implements ActionListener{
	
	private JButton btn1,btn2,btn3,btnMul,btn4,btn5,btn6, btnSub,btn7,btn8,btn9, btnAdd,btnCal, btnClr, btnDiv, btn0;
	private JTextField txtResult;
	int hold,number,answer;
	double divnumber,divanswer;
	

	// constructor...
	
	public Calculator() {	
		
		setLayout(null);
		init();	
		
		// window parameters
				setSize(405,480); //size of calculator
				setTitle("Calculator"); //title of calculator
				setVisible(true); //visibility of calculator
				setResizable(false);
	}
	
	
		private void init() {
		
			JTextField txtResult= new JTextField();
			txtResult.setLocation(0,0);
			txtResult.setVisible(true);
			txtResult.setSize(445,40);
			add (txtResult);
			//txtResult.setEditable(false);
			
			//buttons....
			JButton btn1 = new JButton("1");
 			btn1.setLocation(0,40);
 			btn1.setSize(100,100);
 			add (btn1);
 			// register button to respond action
 			btn1.addActionListener(this);
 			
 			btn1.addActionListener(new ActionListener() {
					
					@Override
				public void actionPerformed(ActionEvent e) {
						// TODO Auto-generated method stub
						txtResult.setText(btn1.getText());
						
					}
				});
 			
 			JButton btn2 = new JButton("2");
 			btn2.setLocation(100,40);
 			btn2.setSize(100,100);
 			add (btn2);
 			// register button to respond action
 			btn2.addActionListener(this);
 			
 			btn2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					txtResult.setText(btn2.getText());
					
				}
			});
 			
 			JButton btn3 = new JButton("3");
 			btn3.setLocation(200,40);
 			btn3.setSize(100,100);
 			add (btn3);
 			// register button to respond action
 			btn3.addActionListener(this);
 			
 			btn3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					txtResult.setText(btn3.getText());
					
				}
			});
 			
 			//button of multiplication
 			JButton btnMul= new JButton("*");
 			btnMul.setLocation(300,40);
 			btnMul.setSize(100,100);
 			add (btnMul);
 			// register button to respond action
 			btnMul.addActionListener(this);
 			
 			btnMul.addActionListener(new ActionListener() {
				
 				public void actionPerformed(ActionEvent e) {
					
 				number = Integer.parseInt(txtResult.getText());
 				hold = 3;
				}
			});
 			
 			JButton btn4 = new JButton("4");
 			btn4.setLocation(0,140);
 			btn4.setSize(100,100);
 			add (btn4);
 			// register button to respond action
 			btn4.addActionListener(this);
 			
 			btn4.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
					txtResult.setText(btn4.getText());
					
				}
			});
 			
 			
 			JButton btn5 = new JButton("5");
 			btn5.setLocation(100,140);
 			btn5.setSize(100,100);
 			add (btn5);
 			// register button to respond action
 			btn5.addActionListener(this);
 			
 			btn5.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 txtResult.setText(btn5.getText());
					
				}
			});
 			
 			
 			JButton btn6 = new JButton("6");
 			btn6.setLocation(200,140);
 			btn6.setSize(100,100);
 			add (btn6);
 			// register button to respond action
 			btn6.addActionListener(this);
 			
 			btn6.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					 txtResult.setText(btn6.getText());
					
				}
			});
 			
 			//button of subtraction
 			JButton btnSub = new JButton("-");
 			btnSub.setLocation(300,140);
 			btnSub.setSize(100,100);
 			add (btnSub);
 			// register button to respond action
 			btnSub.addActionListener(this);
 			
 			btnSub.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
		
 	            number = Integer.parseInt(txtResult.getText());
 	            hold = 2;
				}
			});
 			
 			
 		
 			JButton btn7 = new JButton("7");
 			btn7.setLocation(0,240);
 			btn7.setSize(100,100);
 			add (btn7);
 			// register button to respond action
 			btn7.addActionListener(this);
 			
 			btn7.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					 txtResult.setText(btn7.getText());
					
				}
			});
 			
 			JButton btn8 = new JButton("8");
 			btn8.setLocation(100,240);
 			btn8.setSize(100,100);
 			add (btn8);
 			// register button to respond action
 			btn8.addActionListener(this);
 			
 			btn8.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					 txtResult.setText(btn8.getText());
					
				}
			});
 			
 			
 			JButton btn9 = new JButton("9");
 			btn9.setLocation(200,240);
 			btn9.setSize(100,100);
 			add (btn9);
 			// register button to respond action
 			btn9.addActionListener(this);
 			
 			btn9.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					 txtResult.setText(btn9.getText());
					
				}
			});
 			
 			//button of addition
 			JButton btnAdd = new JButton("+");
 			btnAdd.setLocation(300,240);
 			btnAdd.setSize(100,100);
 			add (btnAdd);
 			// register button to respond action
 			btnAdd.addActionListener(this);
 			
 			btnAdd.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
				
 	            number = Integer.parseInt(txtResult.getText());
 	            hold = 1;
				}
			});
 		
 			
 			//button of calculator
 			JButton btnCal = new JButton("Calculate");
 			btnCal.setLocation(0,340);
 			btnCal.setSize(100,100);
 			add (btnCal);
 			// register button to respond action
 			btnCal.addActionListener(this);
 	
 			btnCal.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
					
					
					switch (hold) {
					case 1:	//for addition
						answer = number + Integer.parseInt(txtResult.getText());
						txtResult.setText(Integer.toString(answer));
                    break;
                    
					case 2: //for subtraction
						answer= number - Integer.parseInt(txtResult.getText());
						txtResult.setText(Integer.toString(answer));
	                    break;
	                    
					case 3: //for multiplying
						answer= number * Integer.parseInt(txtResult.getText());
						txtResult.setText(Integer.toString(answer));
	                    break;
	                    
					case 4: //for division
						divanswer= divnumber / Double.parseDouble(txtResult.getText());
						txtResult.setText(Double.toString(divanswer));
						//to throw unnecessary .0
						if(Double.toString(divanswer).endsWith(".0")) {
							txtResult.setText(Double.toString(divanswer).replace(".0", ""));
						}
	                    break;
					
					}
				}
			});
 			
 			
 			JButton btn0 = new JButton("0");
 			btn0.setLocation(100,340);
 			btn0.setSize(100,100);
 			add (btn0);
 			// register button to respond action
 			btn0.addActionListener(this);
 			
 			btn0.addActionListener(new ActionListener() {
				
				
				public void actionPerformed(ActionEvent e) {
		
					 txtResult.setText(btn0.getText());
					
				}
			});
 			
 			//Button of Clear
 			JButton btnClr = new JButton("Clear");
 			btnClr.setLocation(200,340);
 			btnClr.setSize(100,100);
 			add (btnClr);
 			// register button to respond action
 			btnClr.addActionListener(this);
 			
 			btnClr.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					 txtResult.setText("");
					
				}
			});
 	
 			//button of division
 			JButton btnDiv = new JButton("/");
 			btnDiv.setLocation(300,340);
 			btnDiv.setSize(100,100);
 			add (btnDiv);
 			// register button to respond action
 			btnDiv.addActionListener(this);
 			
 			btnDiv.addActionListener(new ActionListener() {
				
	
				public void actionPerformed(ActionEvent e) {
				divnumber = Integer.parseInt(txtResult.getText());
 	            hold = 4;
				}
			});
 			
 			
 		
 			
	}


	//to get action
	public void actionPerformed(ActionEvent e)

		{

			if(e.getSource().equals(btn1))
				txtResult.setText(txtResult.getText()+"1");

			if(e.getSource().equals(btn2))

				txtResult.setText(txtResult.getText()+"2");

			if(e.getSource().equals(btn3))

				txtResult.setText(txtResult.getText()+"3");

			if(e.getSource().equals(btn4))
				
				txtResult.setText(txtResult.getText()+"4");

			if(e.getSource().equals(btn5))

				txtResult.setText(txtResult.getText()+"5");
			
			if(e.getSource().equals(btn6))

				txtResult.setText(txtResult.getText()+"6");

			if(e.getSource().equals(btn7))

				txtResult.setText(txtResult.getText()+"7");

			if(e.getSource().equals(btn8))

				txtResult.setText(txtResult.getText()+"8");

			if(e.getSource().equals(btn9))

				txtResult.setText(txtResult.getText()+"9");

			if(e.getSource().equals(btn0))

				txtResult.setText(txtResult.getText()+"0");
			
			if(e.getSource().equals(btnClr))

				txtResult.setText("");	


		}
	
	//main method
	public static void main(String[] args) {
		new Calculator();
		
		
		
	}//end of the main



	
}	//end of the class
		
	
	

	