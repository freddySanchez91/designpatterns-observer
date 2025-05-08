package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args){
        SwingObserverExample example =  new SwingObserverExample();
        example.go();
    }

    public void go(){

        frame  = new JFrame();

        JButton button =  new JButton("Should I do It");
        button.addActionListener( event -> System.out.println( "Don't do it, you might regret it!"));
        button.addActionListener(event -> System.out.println( "Come on, Do it!"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(200, 100);
        frame.setVisible(true);


    }

   /* public void go(){
        frame  = new JFrame();

        JButton button =  new JButton("Should I do It");
        button.addActionListener( new AngelListener());
        button.addActionListener(new DevilListener());
    }

    class AngelListener() implements ActionListener {
        public void actionPerformed(ActionEvent event){
            System.out.println( "Don't do it, you might regret it!");
        }
    }

    class DevilListener() implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println( "Come on, Do it!");
        }
    }*/

}
