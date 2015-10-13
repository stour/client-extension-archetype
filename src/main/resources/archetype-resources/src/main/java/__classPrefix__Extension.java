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

import org.eclipse.che.ide.api.action.ActionManager;
import org.eclipse.che.ide.api.action.DefaultActionGroup;
import org.eclipse.che.ide.api.constraints.Constraints;
import org.eclipse.che.ide.api.extension.Extension;

import com.google.inject.Inject;
import com.google.inject.Singleton;

import static org.eclipse.che.ide.api.action.IdeActions.GROUP_MAIN_MENU;

@Singleton
@Extension(title = "${classPrefix} Extension", version = "1.0.0")
public class ${classPrefix}Extension {

    @Inject
    public ${classPrefix}Extension(${classPrefix}Resources resources, ActionManager actionManager, ${classPrefix}Action ${classPrefix}Action) {

        DefaultActionGroup mainMenu = (DefaultActionGroup) actionManager.getAction(GROUP_MAIN_MENU);

        DefaultActionGroup ${classPrefix}Menu = new DefaultActionGroup("${classPrefix} Menu", true, actionManager);
        actionManager.registerAction("${classPrefix}MenuID", ${classPrefix}Menu);
        mainMenu.add(${classPrefix}Menu, Constraints.LAST);

        actionManager.registerAction("${classPrefix}ActionID", ${classPrefix}Action);
        ${classPrefix}Menu.add(${classPrefix}Action);

    }
}
