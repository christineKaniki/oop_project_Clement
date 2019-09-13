/*Group members 
 Kaniki Asanga 17/272/bit-j
Emmanuel Stephen 18/215/bit-j
Yisa cubaka clement  17/272/bit-j
Lula lumbila Onowale 18/947/bscs-s
Ummsalama Abdulraaman 18/UG/774/bit-s
*/
package org.iuea.oop.views;


//importing the Color class which objects will be used below to assign colors to different components
import java.awt.Color;
/*importing the Font class which objects will be used to assign font details to JComponents 
   that will be used below */
import java.awt.Font;



//importing the event.ActionListener that will make it possible things to happen when the login button is clicked
import java.awt.event.ActionListener;
//importing the event.actionEvent that will be used to determine actions that will be done once my login button is clicked
import java.awt.event.ActionEvent;

import javax.swing.*;
public class LoginView extends JFrame {
	
	//constructor that will hold all the UI components 
	public LoginView() {
		//creating the Jframe window that will host all other Jcomponent
		JFrame mainframe=new JFrame();
                mainframe.setTitle("Login View");
                //creating a Jpanel to help position all the other Jcomponents in the frame
		JPanel position=new JPanel();
		position.setBackground(Color.GRAY);
		position.setBounds(0, 0, 250, 600);
		
		/*creating the label that hosts the title of the UI, setting it's position in the frame,
                it's size, giving  it a font family, a font size and bolding it*/
		JLabel signin=new JLabel("Sign In");
		signin.setBounds(70, 50, 150, 50);
		signin.setFont(new Font("Cooper Std Black",Font.BOLD,36));
		signin.setForeground(Color.red);
		
		/*creating the second label that hosts the title to show to the user where to enter
                his username, setting the position of the label, it's dimensions, font family,color
                and size */  
		JLabel username=new JLabel("Username");
		username.setBounds(200,150 , 200, 20);
		username.setForeground(Color.red);
		username.setFont(new Font("Cooper Std Black",Font.BOLD,12));
		
		/*creating the textarea where the user will enter his username, setting it's position 
                in the frame, it's dimensions,the color of the user's writting, font family and size*/
		JTextField usernamefield=new JTextField();
		usernamefield.setBounds(80, 170, 360, 50);
		usernamefield.setForeground(Color.DARK_GRAY);
		usernamefield.setFont(new Font("Calibri",Font.ITALIC,18));
		
		/*creating the label that will show the user where to enter his password, setting it's 
                position and size,it's color, font family and font size*/
		JLabel password=new JLabel("Password");
		password.setBounds(200,250 , 200, 20);
		password.setForeground(Color.red);
		password.setFont(new Font("Cooper Std Black",Font.BOLD,12));
		
		/*creating the textfield in which the user will enter his password, setting it's position in 
		 * the frame and it's sizes, giving a font family, size and color to the user's writting */ 
		JPasswordField passwordfield=new JPasswordField();
		passwordfield.setBounds(80, 270, 360, 50);
		passwordfield.setForeground(Color.DARK_GRAY);
		passwordfield.setFont(new Font("Calibri",Font.ITALIC,18));
		
		/*creating the button where the user can press to cancel information he has given and
                leave the login page, setting the position of the button, it's size,color and font color,
                family and size*/ 
		JButton cancel=new JButton("Cancel");
		cancel.setBounds(80, 370, 150, 50);
		cancel.setForeground(Color.WHITE);
		cancel.setBackground(Color.red);
		cancel.setFont(new Font("Cooper Std Black",Font.BOLD,16));
		
		/*creating the button where the user can press to submit the information he has entered for
                approval, setting the position of the button, it's size,color and font color, family
                and size*/ 
		JButton login=new JButton("Login");
		login.setBounds(290, 370, 150, 50);
		login.setForeground(Color.WHITE);
		login.setBackground(Color.red);
		login.setFont(new Font("Cooper Std Black",Font.BOLD,16));
                
                //adding the actionlistener to the login button so that something can happen when we press the button
                login.addActionListener(new ActionListener(){
           
                //overriding the actionPerformed method that already exist in the actionListener class
                //it this actionPerformed that carries events that can happen once the login button is clicked
			@Override
			public void actionPerformed(ActionEvent e) {
		      /*declaring the variables in which we're storing the inputs we've captured from 
                      the username and password fields*/
				String username=usernamefield.getText();
				String password=passwordfield.getText();
		//setting the condition for the different events to happen
                                 //setting the inputs the system will be accepting
				if(  username.contains("christine kaniki") && password.contains("Quien")) {
                                    //adding an action to wipe the fields once submitted
					usernamefield.setText(null);
					passwordfield.setText(null);
                                     //setting the message to be displayed in case of valid input
					JOptionPane.showMessageDialog(null, "User logged in","Login message",JOptionPane.INFORMATION_MESSAGE);
					
				 //setting the error message to be displayed in case the input submitted is not the expected one
				}else {
					JOptionPane.showMessageDialog(null, "invalid Login Details","Login error",JOptionPane.ERROR_MESSAGE);
				}
				
			     }
                         });
		
		
		
		
		//adding all the jcomponents used to the jframe to make them appear in the running frame
		mainframe.add(signin);
		mainframe.add(username);
		mainframe.add(usernamefield);
		mainframe.add(password);
		mainframe.add(passwordfield);
		mainframe.add(cancel);
		mainframe.add(login);
		mainframe.add(position);
		
		//making the frame be visible when we run the project
		mainframe.setVisible(true);
		
		//making the running stop once we close the frame window
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//setting the sizes of the frame
		mainframe.setSize(500, 600);
		
		//setting the frame's layout to null
		mainframe.setLayout(null);
	}

	public static void main(String[] args) {
		//creating the object of the class to make the constructor be called
		LoginView page1=new LoginView();

	}

}


