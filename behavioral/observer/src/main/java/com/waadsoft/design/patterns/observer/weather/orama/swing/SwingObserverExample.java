package com.waadsoft.design.patterns.observer.weather.orama.swing;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Alassani ABODJI <abodjialassani[at]gmail.com>
 */
public class SwingObserverExample {

    JFrame frame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        frame = new JFrame("Swing Observer Example");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(250, 300));

        ActionListener angelListener = event -> println("Don't do it, you might regret it!"); // Using lambda expression
        //ActionListener angelListener = new AngelListener();

        ActionListener devilListener = event -> println("Come on, do it!"); // Using lambda expression
        //ActionListener devilListener = new DevilListener();

        JButton button = new JButton("Should I do it?");
        button.addActionListener(angelListener);
        button.addActionListener(devilListener);
        
        frame.add(button);
        
    }

    private void println(Object o) {
        System.out.println(o);
    }

    /* Observer defined as inner class, actionPerformed method will be called instead of update */
    class AngelListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            println("Don't do it, you might regret it!");
        }
    }

    /* Observer defined as inner class, actionPerformed method will be called instead of update */
    class DevilListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            println("Come on, do it!");
        }
    }
}

/*=============================================================================
 * Copyright 2022 Waad Soft<https://www.waadsoft.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 =============================================================================*/
