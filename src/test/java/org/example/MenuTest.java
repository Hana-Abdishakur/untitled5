package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class MenuTest {
    private Menu menu;

    @BeforeEach
    public void setUp() {
        menu = new Menu();
    }

    @Test
    public void testNewMenuItem() {
        JMenuItem newItem = menu.New;
        newItem.doClick();
        assertEquals("New File Created", menu.getLastMessage());
    }

    @Test
    public void testOpenMenuItem() {
        JMenuItem openItem = menu.Open;
        openItem.doClick();
        assertEquals("Open File Dialog", menu.getLastMessage());
    }

    @Test
    public void testSaveMenuItem() {
        JMenuItem saveItem = menu.Save;
        saveItem.doClick();
        assertEquals("File Saved", menu.getLastMessage());
    }

    @Test
    public void testCutMenuItem() {
        JMenuItem cutItem = menu.cut;
        cutItem.doClick();
        assertEquals("Cut Action", menu.getLastMessage());
    }

    @Test
    public void testCopyMenuItem() {
        JMenuItem copyItem = menu.copy;
        copyItem.doClick();
        assertEquals("Copy Action", menu.getLastMessage());
    }

    @Test
    public void testPasteMenuItem() {
        JMenuItem pasteItem = menu.paste;
        pasteItem.doClick();
        assertEquals("Paste Action", menu.getLastMessage());
    }

    @Test
    public void testSelectAllMenuItem() {
        JMenuItem selectAllItem = menu.selectall;
        selectAllItem.doClick();
        assertEquals("Select All Action", menu.getLastMessage());
    }

    @Test
    public void testAboutMenuItem() {
        JMenuItem aboutItem = menu.about;
        aboutItem.doClick();
        assertEquals("About This Application", menu.getLastMessage());
    }
}