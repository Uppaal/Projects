import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.sql.*;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
    
public class Hangman extends javax.swing.JFrame {
    public Hangman(String option) {
        setVisible(true);
        setTitle("Hangman");
        gametype=option;
        initComponents();
    }

static String gametype;
static char letter; //letter that is guessed by the user
static int n=0, score=10; //n = No of blanks in a word
static String hw="", cw="", meaning="", jw="";
static int correct=0, wrong=0; //No. of correct and incorrect guesses by the user in one game

@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Word = new javax.swing.JLabel();
        Hint = new javax.swing.JButton();
        Autoplay = new javax.swing.JButton();
        New_Game = new javax.swing.JButton();
        Quit = new javax.swing.JButton();
        H = new javax.swing.JButton();
        B = new javax.swing.JButton();
        M = new javax.swing.JButton();
        D = new javax.swing.JButton();
        F = new javax.swing.JButton();
        C = new javax.swing.JButton();
        E = new javax.swing.JButton();
        K = new javax.swing.JButton();
        J = new javax.swing.JButton();
        G = new javax.swing.JButton();
        I = new javax.swing.JButton();
        L = new javax.swing.JButton();
        N = new javax.swing.JButton();
        O = new javax.swing.JButton();
        P = new javax.swing.JButton();
        Q = new javax.swing.JButton();
        R = new javax.swing.JButton();
        S = new javax.swing.JButton();
        T = new javax.swing.JButton();
        U = new javax.swing.JButton();
        V = new javax.swing.JButton();
        W = new javax.swing.JButton();
        X = new javax.swing.JButton();
        Y = new javax.swing.JButton();
        Z = new javax.swing.JButton();
        Guess = new javax.swing.JButton();
        Hangman = new javax.swing.JLabel();
        Pic = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        A = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(java.awt.Color.white);

        Word.setFont(new java.awt.Font("Jokerman", 1, 30)); // NOI18N
        Word.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Word.setText("Your Word");

        Hint.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Hint.setText("Hint");
        Hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HintActionPerformed(evt);
            }
        });

        Autoplay.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Autoplay.setText("Autoplay");
        Autoplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutoplayActionPerformed(evt);
            }
        });

        New_Game.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        New_Game.setText("New Game");
        New_Game.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                New_GameActionPerformed(evt);
            }
        });

        Quit.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Quit.setText("Return to Menu");
        Quit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuitActionPerformed(evt);
            }
        });

        H.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        B.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        M.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        D.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        F.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        C.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        E.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        K.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        J.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        G.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        I.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        L.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        N.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        O.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        P.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        Q.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        R.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        S.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        T.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        U.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        V.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        W.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        X.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        Y.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        Z.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        Guess.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        Guess.setText("Guess");
        Guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuessActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Rheeya\\Desktop\\Second Year\\Java and Web Technologies\\Project\\IP Project - Hangman\\Hangman\\Pictures\\Final\\Hangman.jpg")); // NOI18N

        A.setFont(new java.awt.Font("Jokerman", 1, 16)); // NOI18N
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(Hint, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)
                                        .addComponent(Guess, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(New_Game))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Word, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(S, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(M, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(G)
                                                .addComponent(A, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(B, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(H, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(N, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(T, javax.swing.GroupLayout.Alignment.TRAILING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(Y, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(C, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(I, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(O, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(U))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(D, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(J, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(P, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(V, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Z, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(E, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(K, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Q, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(W, javax.swing.GroupLayout.Alignment.LEADING))
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(R, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(L, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(F)))))
                                .addGap(58, 58, 58))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Autoplay)
                                .addGap(18, 18, 18)
                                .addComponent(Quit)
                                .addGap(88, 88, 88)))
                        .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(172, 172, 172)
                        .addComponent(Hangman)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel1)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hangman)
                            .addComponent(jLabel2)))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Word)
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(F, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(E, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(D, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(A, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(L, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(K, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(J, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(I, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(H, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(G, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(R, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Q, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(P, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(O, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(M, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(X, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(W, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(V, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(U, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(S, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Z, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Y, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Hint)
                            .addComponent(New_Game)
                            .addComponent(Guess))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Autoplay)
                            .addComponent(Quit)))
                    .addComponent(Pic, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>                        

private void QuitActionPerformed(java.awt.event.ActionEvent evt) {                                     
this.dispose();
}                                    

private void New_GameActionPerformed(java.awt.event.ActionEvent evt) {                                         
    A.setEnabled(false);
    B.setEnabled(true);
    C.setEnabled(true);
    D.setEnabled(true);
    E.setEnabled(false);
    F.setEnabled(true);
    G.setEnabled(true);
    H.setEnabled(true);
    I.setEnabled(false);
    J.setEnabled(true);
    K.setEnabled(true);
    L.setEnabled(true);
    M.setEnabled(true);
    N.setEnabled(true);
    O.setEnabled(false);
    P.setEnabled(true);
    Q.setEnabled(true);
    R.setEnabled(true);
    S.setEnabled(true);
    T.setEnabled(true);
    U.setEnabled(false);
    V.setEnabled(true);
    W.setEnabled(true);
    X.setEnabled(true);
    Y.setEnabled(true);
    Z.setEnabled(true);
    Hint.setEnabled(true);
    Guess.setEnabled(true);
    Autoplay.setEnabled(true);  
    
    Word.setText("Your Word");
    Pic.setIcon(new ImageIcon(""));
    wrong=0;
    correct=0;
    n=0;
    score=10;
    
    int co=0, gn;
    //Input Game number
    String GN="";
    if(gametype.equals("Words"))
        GN=JOptionPane.showInputDialog(this,"Please enter a Game Number between 1 and 150");
    if(gametype.equals("Movies"))
        GN=JOptionPane.showInputDialog(this,"Please enter a Game Number between 1 and 10"); 
    gn=Integer.parseInt(GN);
    
    /*Connectivity Statements*/
    try
    {
        Class.forName("java.sql.DriverManager");
        Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Hangman","root","MySQL");
        Statement st=(Statement)con.createStatement();
        
        //Select game type
        String query="";
        if(gametype.equals("Words"))
            query="select * from Words where No="+gn+";";
        if(gametype.equals("Movies"))
            query="select * from Movies where No="+gn+";";
        ResultSet rs=st.executeQuery(query);
                
        //Extract corresponding gn, word and hword from sql
        while(rs.next())
        {
            cw=rs.getString("Word");
            hw=rs.getString("HWord");
            meaning=rs.getString("Meaning");
            jw=rs.getString("Jword");
        }
        
        rs.close();
        st.close();
        con.close();
    }
    catch(Exception e)
        {JOptionPane.showMessageDialog(null,"Error");}
    
    Word.setText(hw);
    for(int i=0; i<hw.length();i++)
    {
        if(hw.charAt(i)=='_')
                n++;
    }
}                                        

private void BActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='B';
B.setEnabled(false);
}                                 
private void CActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='C';
C.setEnabled(false);
}                                 
private void DActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='D';
D.setEnabled(false);
}                                 
private void EActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='E';
E.setEnabled(false);
}                                 
private void FActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='F';
F.setEnabled(false);
}                                 
private void GActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='G';
G.setEnabled(false);
}                                 
private void HActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='H';
H.setEnabled(false);
}                                 
private void IActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='I';
I.setEnabled(false);
}                                 
private void JActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='J';
J.setEnabled(false);
}                                 
private void KActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='K';
K.setEnabled(false);
}                                 
private void LActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='L';
L.setEnabled(false);
}                                 
private void MActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='M';
M.setEnabled(false);
}                                 
private void NActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='N';
N.setEnabled(false);
}                                 
private void OActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='O';
O.setEnabled(false);
}                                 
private void PActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='P';
P.setEnabled(false);
}                                 
private void QActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='Q';
Q.setEnabled(false);
}                                 
private void RActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='R';
R.setEnabled(false);
}                                 
private void SActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='S';
S.setEnabled(false);
}                                 
private void TActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='T';
T.setEnabled(false);
}                                 
private void UActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='U';
U.setEnabled(false);
}                                 
private void VActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='V';
V.setEnabled(false);
}                                 
private void WActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='W';
W.setEnabled(false);
}                                 
private void XActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='X';
X.setEnabled(false);
}                                 
private void YActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='Y';
Y.setEnabled(false);
}                                 
private void ZActionPerformed(java.awt.event.ActionEvent evt) {                                  
letter='Z';
Z.setEnabled(false);
}                                 

private void AutoplayActionPerformed(java.awt.event.ActionEvent evt) {                                         
JOptionPane.showMessageDialog(null,"The Correct word is "+cw+". \n Meaning: "+meaning+".");
Hint.setEnabled(false);
Guess.setEnabled(false);
Autoplay.setEnabled(false);
}                                        

private void HintActionPerformed(java.awt.event.ActionEvent evt) {                                     
JOptionPane.showMessageDialog(null,""+meaning);
}                                    

    private void GuessActionPerformed(java.awt.event.ActionEvent evt) {                                      
    char g=letter;
    int len=jw.length(), i, j, co=0;
    for(i=0; i<len; i+=2)
    {
        char c=jw.charAt(i);
        if(g==c) //Replace
        {
            String s1, s2;
            s1=hw.substring(0,i);
            s2=hw.substring(i+1,len);
            hw=s1+c+s2;
            correct++;
            co++;
            Word.setText(hw);
	}
    }
    if(co==0)
    {
        wrong++;
        score--;
    }
    
    //Won Game
    int cor=0;
    for(i=0;i<hw.length();i++)
        if(hw.charAt(i)=='_')
            cor++;
    if(correct==n) //You Win!
    {
        JOptionPane.showMessageDialog(null,"Congratulations! You Win! Your score is "+score+"/10!"); 

        //Check if a High Score is possible
        try
        {
            Class.forName("java.sql.DriverManager");
            java.sql.Connection con=(java.sql.Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Hangman","root","MySQL");
            java.sql.Statement st=(java.sql.Statement)con.createStatement();
            
            //Receive existing scores
            String q1= "select * from HighScores;";
            ResultSet rs=st.executeQuery(q1);
            
            //Compare to see if score is greater than others
            int hs=0;   //Flag bit
            while(rs.next())
            {
                int s=Integer.parseInt(rs.getString("Score"));
                if(score>s)
                    hs=1;
            }
            
            if(hs==1)   //High Score
            {
                String n=JOptionPane.showInputDialog(null,"High Score! Name:");
                String q2="insert into HighScores values('"+n+"',"+score+",null);";
                String q3="delete from HighScores where No=5;";
                st.executeUpdate(q2);       //Add to high score table
                st.executeUpdate(q3);       //Delete lowest high score
            }
            
            st.close();
            con.close();
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,"Error");
            System.out.println(e.getMessage());
        }
        
        Hint.setEnabled(false);
        Autoplay.setEnabled(false);
        Guess.setEnabled(false);
        B.setEnabled(false);
        C.setEnabled(false);
        D.setEnabled(false);
        F.setEnabled(false);
        G.setEnabled(false);
        H.setEnabled(false);
        J.setEnabled(false);
        K.setEnabled(false);
        L.setEnabled(false);
        M.setEnabled(false);
        N.setEnabled(false);
        P.setEnabled(false);
        Q.setEnabled(false);
        R.setEnabled(false);
        S.setEnabled(false);
        T.setEnabled(false);
        V.setEnabled(false);
        W.setEnabled(false);
        X.setEnabled(false);
        Y.setEnabled(false);
        Z.setEnabled(false);
    }
    else
        if(co==0) //If after one guess, you don't get any letters
        {
            switch(wrong)
            {
                case 1: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/1.jpg"));
                        break;
                case 2: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/2.jpg"));
                        break;
                case 3: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/3.jpg"));
                        break;
                case 4: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/4.jpg"));
                        break;
                case 5: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/5.jpg"));
                        break;
                case 6: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/6.jpg"));
                        break;
                case 7: Pic.setIcon(new ImageIcon("C:/Users/Rheeya/Desktop/Second Year/Java and Web Technologies/Project/Hangman/Pictures/7.jpg"));
                        JOptionPane.showMessageDialog(null,"Game Over");
                        Word.setText(jw);
                        Hint.setEnabled(false);
                        Autoplay.setEnabled(false);
                        Guess.setEnabled(false);
                        B.setEnabled(false);
                        C.setEnabled(false);
                        D.setEnabled(false);
                        F.setEnabled(false);
                        G.setEnabled(false);
                        H.setEnabled(false);
                        J.setEnabled(false);
                        K.setEnabled(false);
                        L.setEnabled(false);
                        M.setEnabled(false);
                        N.setEnabled(false);
                        P.setEnabled(false);
                        Q.setEnabled(false);
                        R.setEnabled(false);
                        S.setEnabled(false);
                        T.setEnabled(false);
                        V.setEnabled(false);
                        W.setEnabled(false);
                        X.setEnabled(false);
                        Y.setEnabled(false);
                        Z.setEnabled(false);
                        //You lose
            }
        }    
    }                                     

    private void AActionPerformed(java.awt.event.ActionEvent evt) {                                  

    }                                 

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hangman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Hangman(gametype).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JButton A;
    private javax.swing.JButton Autoplay;
    private javax.swing.JButton B;
    private javax.swing.JButton C;
    private javax.swing.JButton D;
    private javax.swing.JButton E;
    private javax.swing.JButton F;
    private javax.swing.JButton G;
    private javax.swing.JButton Guess;
    private javax.swing.JButton H;
    private javax.swing.JLabel Hangman;
    private javax.swing.JButton Hint;
    private javax.swing.JButton I;
    private javax.swing.JButton J;
    private javax.swing.JButton K;
    private javax.swing.JButton L;
    private javax.swing.JButton M;
    private javax.swing.JButton N;
    private javax.swing.JButton New_Game;
    private javax.swing.JButton O;
    private javax.swing.JButton P;
    private javax.swing.JLabel Pic;
    private javax.swing.JButton Q;
    private javax.swing.JButton Quit;
    private javax.swing.JButton R;
    private javax.swing.JButton S;
    private javax.swing.JButton T;
    private javax.swing.JButton U;
    private javax.swing.JButton V;
    private javax.swing.JButton W;
    private javax.swing.JLabel Word;
    private javax.swing.JButton X;
    private javax.swing.JButton Y;
    private javax.swing.JButton Z;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration                   
}