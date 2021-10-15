package br.senai.sp.jandira.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class tela {

    public void CriarTela(){
        JFrame tela = new JFrame();
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(300,300);
        tela.setTitle("Nome do App");
        tela.setLayout(null);

        JLabel lblNome = new JLabel();
        lblNome.setText("Digite o seu nome:");
        lblNome.setBounds(10, 10, 150, 30);

        JTextField txtNome = new JTextField();
        txtNome.setBounds(10, 45, 100, 30);

        JButton btnOK = new JButton();
        btnOK.setText("OK");
        btnOK.setBounds(115, 45, 80, 30);

        JLabel lblCumprimento = new JLabel();
        lblCumprimento.setText("Adicionar o resultado");
        lblCumprimento.setBounds(10, 80, 150, 30);

        tela.getContentPane().add(lblCumprimento);
        tela.getContentPane().add(lblNome);
        tela.getContentPane().add(txtNome);
        tela.getContentPane().add(btnOK);
        tela.getContentPane().add(lblNome);

        tela.setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome =  txtNome.getText();
                lblCumprimento.setText("Olá, " + nome);

            }
        });


    }

}
