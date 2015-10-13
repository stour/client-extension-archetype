#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/*******************************************************************************
 * Copyright (c) 2012-2015 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package ${package};

import org.eclipse.che.ide.api.action.Action;
import org.eclipse.che.ide.api.action.ActionEvent;

import com.google.inject.Inject;
import org.eclipse.che.ide.api.notification.NotificationManager;

public class ${classPrefix}Action extends Action {

private NotificationManager notificationManager;

    @Inject
    public ${classPrefix}Action(${classPrefix}Resources resources, NotificationManager notificationManager) {
        super("${classPrefix} Action", "${classPrefix} Action Description", null, resources.${classPrefix}ProjectTypeIcon());
        this.notificationManager = notificationManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            notificationManager.showInfo("It's ${classPrefix} action !");
    }
}
