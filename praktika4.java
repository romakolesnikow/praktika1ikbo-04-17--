import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Praktika4 extends JFrame implements ActionListener{

    int FRAME_WIDTH = 400;
    int FRAME_HEIGHT = 300;

    int milanScore = 0;
    int madridScore = 0;
    String winner = "";
    String lastScorerString = "";

    JLabel result = new JLabel("Result: "+milanScore+" X "+madridScore);
    JLabel lastScorer = new JLabel("Last Scorer: "+lastScorerString);
    JLabel winnerLabel = new JLabel("Winner: "+winner);

    JButton addScoreToMilan = new JButton("AC Milan");
    JButton addScoreToMadrid = new JButton("Real Madrid");

    public Main()
    {
        super("Score");

        setSize(FRAME_WIDTH,FRAME_HEIGHT);
        setLayout(null);

        //Creating the object of font
        Font fnt = new Font("Arial",Font.BOLD,20);

        //Setting position
        //For labels
        result.setBounds(20,20,200,40);
        lastScorer.setBounds(20,60,300,40);
        winnerLabel.setBounds(20,100,300,40);

        //For buttons
        addScoreToMilan.setBounds(0,170,200,40);
        addScoreToMadrid.setBounds(200,170,200,40);

        //Setting font
        result.setFont(fnt);
        lastScorer.setFont(fnt);
        winnerLabel.setFont(fnt);

        add(result);
        add(lastScorer);
        add(winnerLabel);
        add(addScoreToMadrid);
        add(addScoreToMilan);

        addScoreToMilan.addActionListener(this);
        addScoreToMadrid.addActionListener(this);

    }
    public void checkWinner()
    {
        if(madridScore > milanScore)
            winner = "Real Madrid";
        else if(madridScore < milanScore)
            winner = "AC Milan";
        else
            winner = "DRAW";
    }
    public void actionPerformed(ActionEvent evt) {
        Object src = evt.getSource();
        if (src == addScoreToMadrid) {
            madridScore++;
            lastScorerString = "Real Madrid";
            checkWinner();

            winnerLabel.setText("Winner: "+winner);
            result.setText("Result: "+milanScore+" X "+madridScore);
            lastScorer.setText("Last Scorer: "+lastScorerString);
            
        } else if (src == addScoreToMilan) {
            milanScore++;
            lastScorerString = "AC Milan";
            checkWinner();

            winnerLabel.setText("Winner: "+winner);
            result.setText("Result: "+milanScore+" X "+madridScore);
            lastScorer.setText("Last Scorer: "+lastScorerString);
        }
    }


    public static void main(String[] args)
    {
        new Main().setVisible(true);
    }
}
