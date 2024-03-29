/**
 *
 * Copyright (c) 2005 ATNS GmbH & Co.KG. All Rights Reserved.
 *
 * This file may not be reproduced in any form or by any means (graphic,
 * electronic, or mechanical) without written permission from ATNS. The
 * content of this file is subject to change without notice.
 *
 * ATNS does not assume liability for the use of this file or the results
 * obtained from using it.
 *
 **/

package de.atns.printing.device;

import de.atns.printing.document.DocumentElement;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author Thomas Baum
 */
public class SwingGUIRenderDevice extends BufferedImageRenderDevice implements Device {

    private final JLabel output;

    public SwingGUIRenderDevice() {
        this.dpi = 300;
        final JFrame frame = new JFrame("");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        this.output = new JLabel();
        frame.add(this.output);
        frame.pack();
        frame.setSize(900, 1150);
        frame.setVisible(true);
    }

    @Override public void renderDocument(final DocumentElement doc, final int quantity) throws IOException {
        // TODO Auto-generated method stub
    }

    @Override protected void processImage(final BufferedImage image) {
        this.output.setIcon(new ImageIcon(image.getScaledInstance(-1, 1100, Image.SCALE_AREA_AVERAGING)));
    }
}
