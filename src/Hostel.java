import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;

public class Hostel extends JFrame implements ActionListener {
    private int noOfRooms;
    private TenantList list;
    private JButton addButton=new JButton("Add Tenant");
    private JButton displayButton=new JButton("Display Tenant");
    private JButton removeButton=new JButton("Remove Tenant");
    private JTextField roomField=new JTextField(4);
       private JTextField nameField=new JTextField(39);
       private JButton saveAndquitButton=new JButton("save and Quit");
       private JButton quitButton=new JButton("Quit without saving");
       private JTextArea displayArea1=new JTextArea(8, 45);
       private JTextArea displayArea2=new JTextArea(8, 45);
       private JTextField monthField=new JTextField(7);
       private JTextField ammountField=new JTextField(8);
       private JButton paymentButton=new JButton(" make payment ");
    private JButton listButton=new JButton(" list payment ");
public Hostel(int numberIn){
    noOfRooms=numberIn;
    list=new TenantList(noOfRooms);
    
    setLayout(new FlowLayout());
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Hostel");
    setSize(550,450);
    setLocation(400,100);
    
    BevelBorder raiseBevel=new BevelBorder(BevelBorder.RAISED);
    add(nameField);
    roomField.setBorder(new TitledBorder("Name"));
    
    add(addButton);
    addButton.setBackground(Color.green);
    addButton.setBorder(raiseBevel);
    
    add(displayButton);
    displayButton.setBorder(raiseBevel);
    displayButton.setBackground(Color.green);
    
     add(removeButton);
    removeButton.setBorder(raiseBevel);
    removeButton.setBackground(Color.green);
    
     add(saveAndquitButton);
    saveAndquitButton.setBorder(raiseBevel);
    saveAndquitButton.setBackground(Color.green);
    
     add(quitButton);
    quitButton.setBorder(raiseBevel);
    quitButton.setBackground(Color.green);
    
    displayArea1.setBorder(new TitledBorder(new LineBorder(Color.black),"Tenants",TitledBorder.CENTER,TitledBorder.TOP));
    
    JScrollPane p1=new JScrollPane(displayArea1);
    add(p1);
    
    add(roomField);
    roomField.setBorder(new TitledBorder("Room"));
    add(monthField);
    monthField.setBorder(new TitledBorder("month"));
    add(ammountField);
    ammountField.setBorder(new TitledBorder("ammount"));
    
    add(paymentButton);
    paymentButton.setBackground(Color.green);
    paymentButton.setBorder(raiseBevel);
    
    add(listButton);
    listButton.setBackground(Color.green);
    listButton.setBorder(raiseBevel);
        
    displayArea2.setBorder(new TitledBorder(new LineBorder(Color.black),"payments",TitledBorder.CENTER,TitledBorder.TOP));
    
    JScrollPane p2=new JScrollPane(displayArea2);
    add(p2);
    addButton.addActionListener(this);
    displayButton.addActionListener(this);
    paymentButton.addActionListener(this);
    listButton.addActionListener(this);
    removeButton.addActionListener(this);
    saveAndquitButton.addActionListener(this);
    quitButton.addActionListener(this);
    
    setVisible(true);
}
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if(e.getSource()==addButton)
        {
            
        }
    }
    public static void main(String []args)
    {
        new Hostel(8);
    }
    
}
