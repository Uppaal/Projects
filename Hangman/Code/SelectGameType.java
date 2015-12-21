import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SelectGameType extends JFrame implements ActionListener
{
    JButton words, movies, exit;
    SelectGameType()
    {
        words=new JButton("Words");
        movies=new JButton("Movies");
        exit=new JButton("Return to Main Menu");
        
        words.addActionListener(this);
        movies.addActionListener(this);
        exit.addActionListener(this);
        
        setSize(400,350);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints g=new GridBagConstraints();
        
        JLabel icon = new JLabel("");
        icon.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/Hangman.jpg"));
        
        g.gridy=0;        add(icon,g);
        g.gridy=1;        add(new JLabel(" "),g);
        g.gridy=2;        add(words,g);
        g.gridy=3;        add(new JLabel(" "),g);
        g.gridy=4;        add(movies,g);
        g.gridy=5;        add(new JLabel(" "),g);
        g.gridy=6;        add(new JLabel(""),g);
        g.gridy=7;        add(exit,g);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        
        if(s.equals("Words"))
            {Hangman h=new Hangman("Words");}
        
        if(s.equals("Movies"))
            {Hangman h=new Hangman("Movies");}
        
        if(s.equals("Return to Main Menu"))
            this.dispose();
    }
}