package com.itheima.gui2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Test {
    public static void main(String[] args) {
        //认识GUI的事件处理机制
        //1、创建一个窗口，有一个登录按钮
        JFrame jf = new JFrame("登录界面");//创建一个窗口
        jf.setSize(400, 300);//设置窗口大小
        jf.setLocationRelativeTo(null);//设置窗口居中
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口，退出程序

        JPanel jp = new JPanel();//创建一个面板
        jf.add(jp);//将面板添加到窗口

        JButton jb = new JButton("登录");//创建一个按钮
        jp.add(jb);//将按钮添加到面板
        //2、给登录按钮添加点击事件
        jb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //一旦点击按钮，底层触发的事件，就会执行actionPerformed方法
                //e是事件对象，封装了事件相关信息
                JOptionPane.showMessageDialog(jf, "登录成功");
            }
        });

        //3、按键事件
        //监听用户键盘上下左右四个按键的事件
        jf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //一旦按下键盘上的某个键，底层触发的事件，就会执行keyPressed方法
                //e是事件对象，封装了事件相关信息
                int keyCode = e.getKeyCode();//拿事件源头的键值
                //判断键值
                if (keyCode == KeyEvent.VK_UP) {
                    System.out.println("向上");
                } else if (keyCode == KeyEvent.VK_DOWN) {
                    System.out.println("向下");
                } else if (keyCode == KeyEvent.VK_LEFT) {
                    System.out.println("向左");
                } else if (keyCode == KeyEvent.VK_RIGHT) {
                    System.out.println("向右");
                }
            }
        });

        jf.setVisible(true);//设置窗口可见
        //让窗口成为焦点
        jf.requestFocus();
    }
}
