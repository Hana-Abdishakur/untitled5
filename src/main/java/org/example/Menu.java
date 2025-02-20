package org.example;

import javax.swing.*;

public class Menu
{
    JMenu file;
    JMenu edit;
    JMenu help;

    JMenuItem New, Open, Save;
    JMenuItem cut, copy, paste, selectall;
    JMenuItem about;
    private String lastMessage;

    public Menu(){
        JFrame f= new JFrame("Menu");
        JMenuBar mb=new JMenuBar();

        file=new JMenu("File");
        New=new JMenuItem("New");
        Open=new JMenuItem("Open");
        Save=new JMenuItem("Save");
        file.add(New); file.add(Open); file.add(Save);
        mb.add(file);

        New.addActionListener(e -> showMessage("New File Created"));
        Open.addActionListener(e -> showMessage("Open File Dialog"));
        Save.addActionListener(e -> showMessage("File Saved"));

        edit = new JMenu("Edit");
        cut=new JMenuItem("Cut");
        copy=new JMenuItem("Copy");
        paste=new JMenuItem("Paste");
        selectall=new JMenuItem("SelectAll");
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectall);
        mb.add(edit);

        cut.addActionListener(e -> showMessage("Cut Action"));
        copy.addActionListener(e -> showMessage("Copy Action"));
        paste.addActionListener(e -> showMessage("Paste Action"));
        selectall.addActionListener(e -> showMessage("Select All Action"));

        help = new JMenu("Help");
        about=new JMenuItem("About");
        help.add(about);
        mb.add(help);

        about.addActionListener(e -> showMessage("About This Application"));

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.setVisible(true);
    }
    private void showMessage(String message) {
        lastMessage = message;
        JOptionPane.showMessageDialog(null, message);
    }

    public String getLastMessage() {
        return lastMessage;
    }

}

