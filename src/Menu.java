
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static java.awt.Color.DARK_GRAY;

public class Menu extends JFrame implements ActionListener{
    JButton RegUs, cua, rec,tri;
    String operacion= "";
    JLabel nombre;
    public Menu() {


        // --- Imagen Cuadrado ---
        JLabel img1 = new JLabel(); //JLabel Creation
        ImageIcon imageIcon1 = new ImageIcon(new ImageIcon("src/cuadrado.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        img1.setIcon(imageIcon1);
        img1.setVisible(false);
        img1.setOpaque(true);
        img1.setBounds(700,0,250,250);

        this.add(img1);
        // --- Imagen Circulo ---
        JLabel img2 = new JLabel(); //JLabel Creation
        ImageIcon imageIcon2 = new ImageIcon(new ImageIcon("src/circulo.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        img2.setIcon(imageIcon2);
        img2.setOpaque(true);
        img2.setVisible(false);
        img2.setBounds(700,0,250,250);
        this.add(img2);
        // --- Imagen Rectangulo  ---
        JLabel img3 = new JLabel(); //JLabel Creation
        ImageIcon imageIcon3 = new ImageIcon(new ImageIcon("src/rectangulo.png").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        img3.setIcon(imageIcon3);
        img3.setOpaque(true);
        img3.setVisible(false);
        img3.setBounds(700,0,250,250);
        this.add(img3);
        // --- Imagen Triangulo ---
        JLabel img4 = new JLabel(); //JLabel Creation
        ImageIcon imageIcon4 = new ImageIcon(new ImageIcon("src/triangulo.jpg").getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
        img4.setIcon(imageIcon4);
        img4.setOpaque(true);
        img4.setVisible(false);
        img4.setBounds(700,0,250,250);
        this.add(img4);


        // ---- Label ----
        JLabel para1 = new JLabel("-----");
        para1.setBounds(350, 115, 250, 25);
        para1.setVisible(false);
        para1.setFont(new java.awt.Font("Cambria", 1, 20));
        this.add(para1);

        // ---- TextField ----
        JTextField textfield1 = new JTextField();
        textfield1.setFont(new java.awt.Font("Cambria", 0, 28));
        textfield1.setHorizontalAlignment(JTextField.CENTER);
        textfield1.setVisible(false);
        textfield1.setBounds(350, 140, 250, 35);
        this.add(textfield1);

        // ---- Label ----
        JLabel para2 = new JLabel("Radio: ");
        para2.setVisible(false);
        para2.setBounds(350, 190, 250, 25);
        para2.setFont(new java.awt.Font("Cambria", 1, 20));
        this.add(para2);

        // ---- TextField ----

        JTextField textfield2 =new JTextField();
        textfield2.setVisible(false);
        textfield2.setFont(new java.awt.Font("Cambria", 0, 28));
        textfield2.setHorizontalAlignment(JTextField.CENTER);

        textfield2.setBounds(350,215,250,35);
        this.add(textfield2);


        // BOTON CIRCULO
        RegUs = new JButton("CIRCULO");
        RegUs.setBounds(0, 80, 300, 80);
        RegUs.setBackground(DARK_GRAY);
        RegUs.setForeground(Color.white);
        RegUs.setFont(new java.awt.Font("Cambria", 1, 14));

        RegUs.addActionListener(this);
        RegUs.setBorderPainted(false);
        RegUs.setFocusPainted(false);
        RegUs.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                RegUs.setBackground(Color.gray);
            }

            public void mouseExited(MouseEvent evt) {
                RegUs.setBackground(DARK_GRAY);
            }
        });
        RegUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                img1.setVisible(false);
                img3.setVisible(false);
                img4.setVisible(false);
                img2.setVisible(true);
                nombre.setText("Circulo");
                para1.setVisible(true);
                para1.setText("Ingrese Radio:");
                textfield1.setVisible(true);
                textfield1.setText("");
                operacion = "circulo";
            }
        });
        this.add(RegUs);






        // BOTON Cuadrado
        cua = new JButton("CUADRADO");
        cua.setBounds(0, 160, 300, 80);
        cua.setBackground(DARK_GRAY);
        cua.setForeground(Color.white);
        cua.setFont(new java.awt.Font("Cambria", 1, 14));

        cua.addActionListener(this);
        cua.setBorderPainted(false);
        cua.setFocusPainted(false);
        cua.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                cua.setBackground(Color.gray);
            }

            public void mouseExited(MouseEvent evt) {
                cua.setBackground(DARK_GRAY);
            }
        });
        cua.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                img2.setVisible(false);
                img3.setVisible(false);
                img4.setVisible(false);
                img1.setVisible(true);
                nombre.setText("Cuadrado");
                para1.setVisible(true);
                para1.setText("Ingrese la Base:");
                textfield1.setVisible(true);
                textfield1.setText("");
                operacion = "cuadrado";
            }
        });
        this.add(cua);

        // BOTON RECTANGULO
        rec = new JButton("RECTANGULO");
        rec.setBounds(0, 240, 300, 80);
        rec.setBackground(DARK_GRAY);
        rec.setForeground(Color.white);
        rec.setFont(new java.awt.Font("Cambria", 1, 14));

        rec.addActionListener(this);
        rec.setBorderPainted(false);
        rec.setFocusPainted(false);
        rec.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                rec.setBackground(Color.gray);
            }

            public void mouseExited(MouseEvent evt) {
                rec.setBackground(DARK_GRAY);
            }
        });
        rec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                img2.setVisible(false);
                img1.setVisible(false);
                img4.setVisible(false);
                img3.setVisible(true);
                nombre.setText("Rectangulo");
                para1.setVisible(true);
                para1.setText("Ingrese la Base:");
                para2.setVisible(true);
                para2.setText("Ingrese la Altura:");
                textfield1.setVisible(true);
                textfield1.setText("");
                textfield2.setVisible(true);
                textfield2.setText("");
                operacion = "rectangulo";
            }
        });
        this.add(rec);

        // BOTON Triangulo
        tri = new JButton("TRIANGULO");
        tri.setBounds(0, 310, 300, 80);
        tri.setBackground(DARK_GRAY);
        tri.setForeground(Color.white);
        tri.setFont(new java.awt.Font("Cambria", 1, 14));

        tri.addActionListener(this);
        tri.setBorderPainted(false);
        tri.setFocusPainted(false);
        tri.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent evt) {
                tri.setBackground(Color.gray);
            }

            public void mouseExited(MouseEvent evt) {
                tri.setBackground(DARK_GRAY);
            }
        });
        tri.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                img2.setVisible(false);
                img1.setVisible(false);
                img3.setVisible(false);
                img4.setVisible(true);
                nombre.setText("Triangulo");
                para1.setVisible(true);
                para1.setText("Ingrese la Base:");
                para2.setVisible(true);
                para2.setText("Ingrese la Altura:");
                textfield1.setVisible(true);
                textfield1.setText("");
                textfield2.setVisible(true);
                textfield2.setText("");
                operacion = "triangulo";
            }
        });
        this.add(tri);
        nombre = new JLabel("fsdafasd");
        nombre.setVerticalAlignment(1);
        nombre.setBounds(780, 260,150,25);
        nombre.setFont(new java.awt.Font("Cambria", 1, 20));
        this.add(nombre);


        JLabel totalT = new JLabel("Total: ");
        totalT.setBounds(420,360,200,40);
        totalT.setFont(new java.awt.Font("Cambria", 1, 25));
        this.add(totalT);

        JButton total = new JButton("Calcular");
        total.setHorizontalAlignment(2);
        total.setBounds(725,360,200,40);
        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (operacion == "circulo"){
                    float total = (float) (Integer.parseInt(textfield1.getText()) * Integer.parseInt(textfield1.getText()) * 3.14);
                    totalT.setText("Total: "+ total);
                }
                if (operacion == "cuadrado"){
                    float total = (float) (Integer.parseInt(textfield1.getText()) * Integer.parseInt(textfield1.getText()));
                    totalT.setText("Total: "+ total);
                }
                if (operacion == "rectangulo"){
                    float total = (float) (Integer.parseInt(textfield1.getText()) * Integer.parseInt(textfield2.getText()));
                    totalT.setText("Total: "+ total);
                }
                if (operacion == "triangulo"){
                    float total = (float) (Integer.parseInt(textfield1.getText()) * Integer.parseInt(textfield2.getText()));
                    totalT.setText("Total: "+ total);
                }

            }
        });
        this.add(total);


    //Ventana Desing
        this.setTitle("Figuras");
        this.setLayout(null);
        this.setBounds(0,0,950,509);
        this.getContentPane().setBackground(Color.lightGray);
        this.setBackground(Color.lightGray);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    setLocationRelativeTo(null);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
