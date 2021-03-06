package com.team7.view;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Screen extends JFrame
{
    private HomeScreen homeScreen = null;
    private MainScreen mainScreen = null;
    private UnitScreen unitScreen = null;
    private StructureScreen structureScreen = null;

    public Screen( int width, int height)
    {
        this.setTitle( "OOP" );
        this.setSize( width, height );
        addMenu();

        // GUI components
        homeScreen = new HomeScreen();
        mainScreen = new MainScreen();
        unitScreen = new UnitScreen();
        structureScreen = new StructureScreen();

        setCurrScreen("HOME");

        this.setVisible( true );
    }

    public HomeScreen getHomeScreen() {
            return homeScreen;
    }
    public MainScreen getMainScreen() {
            return mainScreen;
    }
    public UnitScreen getUnitScreen() {
            return unitScreen;
    }
    public StructureScreen getStructureScreen() {
            return structureScreen;
    }

    public void setCurrScreen(String selected_screen) {

        getContentPane().removeAll();   // clear screen

        if(selected_screen == "HOME") {
           displayHomeScreen();
        }
        else if (selected_screen == "MAIN") {
            displayMainScreen();
        }
        else if (selected_screen == "UNIT_OVERVIEW") {
           displayUnitOverviewScreen();
        }
        else if (selected_screen == "STRUCTURE_OVERVIEW") {
            displayStructureOverviewScreen();
        }

        revalidate();
        repaint();
    }

    private void displayHomeScreen() {
            this.getContentPane().add( homeScreen );
    }
    private void displayMainScreen() {
            this.getContentPane().add( mainScreen );
            mainScreen.giveCommandFocus();
    }
    private void displayUnitOverviewScreen() {
            this.getContentPane().add( unitScreen );
    }
    private void displayStructureOverviewScreen() {
            this.getContentPane().add( structureScreen );
    }

    private void addMenu()
    {                       	   // addMenu() method used to setup a frame's menu bar
        JMenu fileMenu = new JMenu( "File" );
        JMenuItem exitItem = new JMenuItem( "Exit" );
        exitItem.addActionListener( new ActionListener() 	// define what happens when this menu item is selected
        {
            public void actionPerformed( ActionEvent event )
            {
                System.exit( 0 );
            }
        } );
        fileMenu.add( exitItem );

        JMenuItem drawMapItem = new JMenuItem( "Draw Map" );
        drawMapItem.addActionListener( new ActionListener()    // define what happens when this menu item is selected
        {
            public void actionPerformed( ActionEvent event )
            {
                mainScreen.drawMap();
            }
        } );
        fileMenu.add( drawMapItem );

        JMenuItem saveItem = new JMenuItem( "Save image" );     // create a new menu item
        saveItem.addActionListener( new ActionListener()
                                   {
            public void actionPerformed( ActionEvent event )
            {
                saveImage();
            }                                                                      // given valid input, it will display an image
        } );
        fileMenu.add( saveItem );


        JMenuBar menuBar = new JMenuBar();                  // create a new menu bar
        menuBar.add( fileMenu );                           	// add the "File" menu to the menu bar
        this.setJMenuBar( menuBar );                        // attach the menu bar to this frame
    }


    private void saveImage()    // prompt the user to specify the size of the n by n image
    {

        BufferedImage temp_img = null;

        String inputString = JOptionPane.showInputDialog("ouput file?");
        try
        {
            File outputFile = new File( inputString );
            ImageIO.write( temp_img, "png", outputFile );
        }
        catch ( IOException e )
        {
            JOptionPane.showMessageDialog( this,
                                          "Error saving file",
                                          "oops!",
                                          JOptionPane.ERROR_MESSAGE );
        }
    }

}
