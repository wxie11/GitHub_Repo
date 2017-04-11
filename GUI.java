//ITM311
//Programmer: Wenwen Xie
//Date: 4/6/2017
import javax.swing.*;
import java.awt.event.*;

public class JavaMenus extends JFrame {

	public JavaMenus()
	{
		super("Java Menu Example");
		
		JMenu file = new JMenu("File");
		file.setMnemonic('F');
		JMenuItem ItemNew = new JMenuItem("New");
		ItemNew.setMnemonic('N');
		file.add(ItemNew);
		JMenuItem ItemOpen = new JMenuItem("Open");
		ItemOpen.setMnemonic('O');
		file.add(ItemOpen);	
		JMenuItem ItemEdit = new JMenuItem("Edit");
		ItemEdit.setMnemonic('d');
		file.add(ItemEdit);
		JMenuItem ItemExit = new JMenuItem("Exit");
		ItemExit.setMnemonic('x');
		file.add(ItemExit);
		
		JMenu file2= new JMenu("Second File");
		file2.setMnemonic('S');
		JMenuItem ItemWelcome = new JMenuItem("Welcome");
		ItemWelcome.setMnemonic('w');
		file2.add(ItemWelcome);
		JMenuItem ItemAbout = new JMenuItem("About");
		ItemAbout.setMnemonic('a');
		file2.add(ItemAbout);	
		
		final JLabel label1 = new JLabel(" Welcome");
	     	add(label1);
	      	this.setSize(100, 100);
		setVisible(true);
				
		ItemNew.addActionListener(
		 new ActionListener() {
		  public void actionPerformed(ActionEvent e)
		  {
			label1.setText(" New");
			ImageIcon icon=new ImageIcon(JavaMenus.class.getResource("steve.jpg"));
			JOptionPane.showMessageDialog(null, "\"If roday were the last day of your life, would you want to do what you are about to do today?\"", 
			   "Result", JOptionPane.PLAIN_MESSAGE,icon);
			 }
			}
		);
		ItemOpen.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Open");
			ImageIcon icon1=new ImageIcon(JavaMenus.class.getResource("pig.jpg"));
			JOptionPane.showMessageDialog(null,"", 
			   "Result", JOptionPane.PLAIN_MESSAGE,icon1);
		    }
		   }
		);
		ItemEdit.addActionListener(
				  new ActionListener(){
				    public void actionPerformed(ActionEvent e)
				    {
					label1.setText(" Edit");
					JOptionPane.showMessageDialog(null, "User's name: Wenwen", 
					   "Result", JOptionPane.PLAIN_MESSAGE);
				    }
				  }
				);
		ItemExit.addActionListener(
		  new ActionListener(){
		    public void actionPerformed(ActionEvent e)
		    {
			label1.setText(" Exit");
			System.exit(0);
		    }
		  }
		);		
		ItemWelcome.addActionListener(
				  new ActionListener(){
				    public void actionPerformed(ActionEvent e)
				    {
					label1.setText(" Welcome");
					JOptionPane.showMessageDialog(null, "This program allows users choose item from the drop-down menus.", 
					   "Result", JOptionPane.PLAIN_MESSAGE);
				    }
				  }
				);
		ItemAbout.addActionListener(
				  new ActionListener(){
				    public void actionPerformed(ActionEvent e)
				    {
					label1.setText(" About");
					JOptionPane.showMessageDialog(null, "Programmer: Wenwen. Version: 1.0", 
					   "Result", JOptionPane.PLAIN_MESSAGE);
				    }
				  }
				);
		JMenuBar bar = new JMenuBar();
		setJMenuBar(bar);
		bar.add(file);
		bar.add(file2);
		
		getContentPane();
		setSize(250, 250);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		JavaMenus appMenu = new JavaMenus();
		appMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
