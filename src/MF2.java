import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class MF2 extends JFrame {
    Container cp;
    JTextField t1=new JTextField();
    JPanel p1=new JPanel(new GridLayout(3,3,10,10));
    JButton b[]=new JButton[9];
    private Dimension ddd=Toolkit.getDefaultToolkit().getScreenSize();
    private int FW=500  ,FH=300;
    MainFrame ll;
    public MF2(MainFrame ADF){
        ll=ADF;
        init();
    }
    private void init(){
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout());
        this.setBounds(ddd.width/2-FW/2,ddd.height/2-FH/2,FW,FH);
        cp.add(t1,BorderLayout.NORTH);
        cp.add(p1,BorderLayout.CENTER);
        for(int i=0;i<9;i++){
            b[i]=new JButton(Integer.toString(i));
            p1.add(b[i]);
        }
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ll.setVisible(true);
            }
        });
        for(int i=0;i<9;i++){
            b[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton p=(JButton)e.getSource();
                    t1.setText(t1.getText()+p.getText());
                }
            });
        }


    }
}
