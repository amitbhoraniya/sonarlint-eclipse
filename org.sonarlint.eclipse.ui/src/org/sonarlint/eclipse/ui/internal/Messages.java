/*
 * SonarLint for Eclipse
 * Copyright (C) 2015 SonarSource
 * sonarqube@googlegroups.com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonarlint.eclipse.ui.internal;

import org.eclipse.osgi.util.NLS;

public final class Messages extends NLS {
  private static final String BUNDLE_NAME = "org.sonarlint.eclipse.ui.internal.messages"; //$NON-NLS-1$

  static {
    // load message values from bundle file
    NLS.initializeMessages(BUNDLE_NAME, Messages.class);
  }

  private Messages() {
  }

  public static String SonarConsole_title;

  public static String SonarProjectPropertyPage_title;

  public static String SonarPreferencePage_title;
  public static String SonarPreferencePage_description;
  public static String SonarPreferencePage_label_marker_severity;
  public static String SonarPreferencePage_label_extra_args;
  public static String SonarPreferencePage_label_test_file_regexps;
  public static String SonarProjectPropertyBlock_label_override_workspace_settings;

  public static String SonarConsoleRemoveAction_tooltip;

  public static String SonarDebugOutputAction_tooltip;

  public static String SonarShowConsoleAction_tooltip;
  public static String SonarShowConsoleAction_never_text;
  public static String SonarShowConsoleAction_onOutput_text;
  public static String SonarShowConsoleAction_onError_text;

  public static String PropertyAndPreferencePage_useprojectsettings_label;
  public static String PropertyAndPreferencePage_useworkspacesettings_change;
  public static String PropertyAndPreferencePage_showprojectspecificsettings_label;

}