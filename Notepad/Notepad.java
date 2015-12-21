import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.*;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.*;

public class Notepad extends JFrame implements ActionListener
{
    Notepad n;
    JMenuBar mb;
    JMenu file, edit, format, help;
    JMenuItem  news, open, exit, save, cut,copy,paste,selectall, selectfont, findandreplace, viewhelp;
    JTextArea ta;
    JFileChooser fileChooser;
    
    Notepad()
    {
        //Menu Bar
        mb= new JMenuBar();
       // mb.setBounds(0,0,100,30);

        //Menu Bar Items
        JMenu file=new JMenu("File");             mb.add(file);
        JMenu edit=new JMenu("Edit");             mb.add(edit);
        JMenu format=new JMenu("View");           mb.add(format);
        JMenu help=new JMenu("Help");             mb.add(help);
        
        //Menu Sub-Items - File
        JMenuItem news=new JMenuItem("New");                   news.addActionListener(this);           file.add(news);
        JMenuItem open=new JMenuItem("Open");                  open.addActionListener(this);           file.add(open);
        JMenuItem save=new JMenuItem("Save");                  save.addActionListener(this);           file.add(save);
        JMenuItem exit=new JMenuItem("Exit");                  exit.addActionListener(this);           file.add(exit);

        //Menu Sub-Items - Edit
        JMenuItem cut=new JMenuItem("Cut");                    cut.addActionListener(this);            edit.add(cut);
        JMenuItem copy=new JMenuItem("Copy");                  copy.addActionListener(this);           edit.add(copy);
        JMenuItem paste=new JMenuItem("Paste");                paste.addActionListener(this);          edit.add(paste);
        JMenuItem selectall=new JMenuItem("Select All");       selectall.addActionListener(this);      edit.add(selectall);
        
        //Menu Sub-Items - Format
        JMenuItem selectfont=new JMenuItem("Select Font");         selectfont.addActionListener(this);         format.add(selectfont);
        JMenuItem findandreplace=new JMenuItem("Find and Replace");     findandreplace.addActionListener(this);     format.add(findandreplace);
        
        //Menu Sub-Items - Help
        JMenuItem viewhelp=new JMenuItem("View Help");         viewhelp.addActionListener(this);       help.add(viewhelp);
        
        fileChooser=new JFileChooser();
        
        //Text Area
        ta= new JTextArea();
        ta.setBounds(100,100,100,100);
        ta.setBackground(Color.white);
        ta.setForeground(Color.black);      
    }
    
    
    void prepareGUI()
    {
       setLayout(new BorderLayout());
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       setJMenuBar(mb);
       add(mb);
       add(ta);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();

        //File
        if(s.equalsIgnoreCase("new"))
            ta.setText("");
            
        if(s.equalsIgnoreCase("open"))
        {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(n))
            {
		File file = fileChooser.getSelectedFile();
		ta.setText("");
		Scanner in = null;
		try 
                {
                    in = new Scanner(file);
                    while(in.hasNext())
                    {
			String line = in.nextLine();
			ta.append(line+"\n");
                    }
		} 
                catch (Exception ex) 
                {   ex.printStackTrace();   }
                finally
                {   in.close();             }
            }
        }
            
        if(s.equalsIgnoreCase("save"))
        {
            if (JFileChooser.APPROVE_OPTION == fileChooser.showSaveDialog(n))
            {
		File file = fileChooser.getSelectedFile();
		PrintWriter out = null;
		try {
			out = new PrintWriter(file);
			String output = ta.getText();
			System.out.println(output);
			out.println(output); }
		catch (Exception ex) 
                    {ex.printStackTrace();}
		finally
                    {	try {out.flush();} catch(Exception ex1) {}
			try {out.close();} catch(Exception ex1) {} }
            }
        }
            
         if(s.equalsIgnoreCase("exit"))
              System.exit(0);
        
        //Edit
        if(s.equalsIgnoreCase("cut"))
            ta.cut();
        if(s.equalsIgnoreCase("copy"))
            ta.copy();
        if(s.equalsIgnoreCase("paste"))
            ta.paste();
        if(s.equalsIgnoreCase("select all"))
            ta.selectAll();

        //Help
        if(s.equalsIgnoreCase("view help"))
        {
            JOptionPane op= new JOptionPane("For more help, please visit http://www.notepad.com");
        }
    }
    
    public static void main(String srgs[])
    {
        Notepad n= new Notepad();
        n.setSize(500,500);
        n.setVisible(true);
        n.prepareGUI();
    }
}