import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StartPage extends JFrame implements ActionListener
{
    JButton newgame, highscores, exit;
    JLabel icon;
    
    StartPage()
    {
        newgame=new JButton("New Game");
        highscores=new JButton("High Scores");
        exit=new JButton("Exit");
        
        icon=new JLabel("");
        icon.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/Hangman.jpg"));
        
        newgame.addActionListener(this);
        highscores.addActionListener(this);
        exit.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        String s=e.getActionCommand();
        
        if(s.equals("New Game"))
            {SelectGameType sgt= new SelectGameType();}
        
        if(s.equals("High Scores"))
            {HighScores hs=new HighScores();}
        
        if(s.equals("Exit"))
            {System.exit(0);}
    }
    
    public void prepareGUI()
    {
        setVisible(true);
        setSize(400,350);
        setTitle("Hangman");
        
        setLayout(new GridBagLayout());
        GridBagConstraints g=new GridBagConstraints();
        
        g.gridy=0;        add(icon,g);
        g.gridy=1;        add(new JLabel(" "),g);
        g.gridy=2;        add(newgame,g);
        g.gridy=3;        add(new JLabel(" "),g);
        g.gridy=4;        add(highscores,g);
        g.gridy=5;        add(new JLabel(" "),g);
        g.gridy=6;        add(exit,g);
    }
    
    public static void main(String args[])
    {
        StartPage s=new StartPage();
        s.prepareGUI();
    }
}