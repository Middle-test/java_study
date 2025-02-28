package com.itheima.gui3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {
    public LoginFrame() {
        setTitle("登录界面");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
    }

    private void init() {
        JPanel jp = new JPanel();
        this.add(jp);

        JButton jb = new JButton("登录");
        jb.addActionListener(this);//添加监听器
        jp.add(jb);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this, "登录成功");
    }
}
