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

package de.atns.printing.renderer.buffer;

import de.atns.printing.device.Device;
import de.atns.printing.document.BarcodeElement;
import de.atns.printing.document.ImageElement;
import de.atns.printing.document.TextElement;
import de.atns.printing.renderer.AbstractRendererFactory;

/**
 * @author Thomas Baum
 */
public class RendererFactory extends AbstractRendererFactory<DocumentRenderer> {

    public RendererFactory(final Device device) {
        super(new DocumentRenderer(device));
        this.renderes.put(BarcodeElement.class, new BarcodeRenderer(getDocumentRenderer()));
        this.renderes.put(ImageElement.class, new ImageRenderer(getDocumentRenderer()));
        this.renderes.put(TextElement.class, new TextRenderer(getDocumentRenderer()));
    }
}
