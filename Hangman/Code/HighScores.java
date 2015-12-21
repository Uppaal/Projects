import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.*;

public class HighScores extends JFrame implements ActionListener
{
    JButton exit;
    JTable t;
    JLabel l1, l2, l3;
    HighScores()
    {
        t=new JTable(0,2);
        l1=new JLabel("Name");
        l2=new JLabel("Score");
        l3=new JLabel("HIGH SCORES");
        exit=new JButton("Return to Main Menu");
        exit.addActionListener(this);
        
        setSize(100,200);
        setVisible(true);  
        setTitle("Hangman");
        setLayout(new GridBagLayout());
        GridBagConstraints g=new GridBagConstraints();
        
        g.gridx=0;  g.gridy=0;  g.gridwidth=2;  add(l3,g);
        g.gridx=0;  g.gridy=1;  g.gridwidth=1;  add(new JLabel(""),g);
        g.gridx=0;  g.gridy=2;  g.gridwidth=1;  add(l1,g);
        g.gridx=1;  g.gridy=2;  g.gridwidth=1;  add(l2,g);
        g.gridx=0;  g.gridy=3;  g.gridwidth=1;  add(new JLabel(""),g);
        g.gridx=0;  g.gridy=4;  g.gridwidth=2;  add(t,g); 
        g.gridx=0;  g.gridy=5;  g.gridwidth=1;  add(new JLabel(""),g);
        g.gridx=0;  g.gridy=6;  g.gridwidth=2;  add(exit,g);
        
        
        //Connectivity Statements
        try
        {
            DefaultTableModel obj=(DefaultTableModel)t.getModel();
            Class.forName("java.sql.DriverManager");
            Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Hangman","root","MySQL");
            Statement st=(Statement)con.createStatement();
            String query= "select Name, Score from HighScores order by Score desc;";
            ResultSet rs=st.executeQuery(query);
            
            while(rs.next())
            {
                String name=rs.getString("Name");
                String score=rs.getString("Score");
                obj.addRow(new Object[]{name,score});
            }
            rs.close();
            st.close();
            con.close();
        }
        catch(Exception e)
            {JOptionPane.showMessageDialog(null,"Error");}
    }
    
    public void actionPerformed(ActionEvent e)
    {this.dispose();}
}