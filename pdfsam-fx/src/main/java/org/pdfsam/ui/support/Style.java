/* 
 * This file is part of the PDF Split And Merge source code
 * Created on 30/ott/2013
 * Copyright 2013 by Andrea Vacondio (andrea.vacondio@gmail.com).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.pdfsam.ui.support;

/**
 * Defines css style classes
 * 
 * @author Andrea Vacondio
 * 
 */
public enum Style {
    BUTTON("pdfsam-button"),
    BROWSE_BUTTON("pdfsam-button", "browse-button"),
    PREFERENCE("spaced-vitem"),
    TITLED_PANE("titled-pane"),
    CONTAINER("pdfsam-container"),
    INVALID("invalid"),
    MENU_BAR("pdfsam-menubar"),
    BANNER("pdfsam-banner"),
    BANNER_LOGO("pdfsam-logo"),
    BANNER_SPACER("pdfsam-logo-spacer"),
    BANNER_BUTTONS("pdfsam-container", "pdfsam-banner-buttons"),
    TOOLBAR_BUTTON("pdfsam-toolbar-button"),
    TOOLBAR_NAVIGATION_BUTTON("pdfsam-toolbar-button", "pdfsam-navigation-button"),
    NAVIGATION_BAR("navigation"),
    EXPAND_BOX("expand-navigation"),
    VITEM("spaced-vitem"),
    MAIN_PANEL("main-scroll-panel"),
    DROP_PLACEHOLDER("drag-drop-placeholder");

    private String[] classes;

    private Style(String... classes) {
        this.classes = classes;
    }

    /**
     * @return an array of css classes
     */
    public String[] css() {
        return classes;
    }
}