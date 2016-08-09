/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.idea.ui;

import com.intellij.execution.filters.TextConsoleBuilderFactory;
import com.intellij.execution.impl.ConsoleViewImpl;
import com.intellij.execution.process.ProcessHandler;
import com.intellij.execution.ui.ConsoleView;
import com.intellij.execution.ui.ConsoleViewContentType;
import com.intellij.openapi.components.AbstractProjectComponent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.util.EmptyRunnable;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.util.ui.UIUtil;
import org.jetbrains.annotations.NotNull;
import res.MOEIcons;
import res.MOEText;

import javax.swing.*;

public class MOEToolWindow extends AbstractProjectComponent {
    public static final String TOOL_WINDOW_ID = MOEText.get("Console.Title");

    private JPanel mainPanel;
    private ConsoleViewImpl consoleViewImpl;

    private ToolWindow window;

    public MOEToolWindow(final Project project) {
        super(project);
    }

    public static MOEToolWindow getInstance(@NotNull Project project) {
        return project.getComponent(MOEToolWindow.class);
    }

    public void initToolWindow(final ToolWindow window) {
        window.setToHideOnEmptyContent(true);
        this.window = window;

        ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
        Content content = contentFactory.createContent(consoleViewImpl.getComponent(), "", false);
        window.getContentManager().addContent(content);
    }

    public void show() {
        if (this.window != null) {
            this.window.activate(EmptyRunnable.getInstance());
            this.window.show(null);
        }
    }

    public void showAndCreate(Project project) {
        if (this.window == null) {
            this.window = ToolWindowManager.getInstance(project).getToolWindow(MOEText.get("Console.Title"));
            this.window.setIcon(MOEIcons.MOETool);
        }
        this.show();
    }

    public void setTitle(String title) {
        if (this.window != null) {
            this.window.setTitle(title);
        }
    }

    private void createUIComponents() {
        consoleViewImpl = (ConsoleViewImpl) TextConsoleBuilderFactory.getInstance().createBuilder(myProject).getConsole();
    }

    public ConsoleView getConsoleView() {
        return this.consoleViewImpl;
    }

    public void clear() {
        this.consoleViewImpl.clear();
    }

    /**
     * Prints a message with ContentType NORMAL_OUTPUT
     *
     * @param message Message, which will be printed
     */
    public void printNormalMessage(String message) {
        this.printMessage(message, ConsoleViewContentType.NORMAL_OUTPUT);
    }

    /**
     * Prints a message with ContentType ERROR_OUTPUT
     *
     * @param message Message, which will be printed
     */
    public void printErrorMessage(String message) {
        this.printMessage(message, ConsoleViewContentType.ERROR_OUTPUT);

        //Focus the tool Window now, because we print a error message
        this.show();
    }

    /**
     * Prints a message to the console view
     *
     * @param message     Message, which will be printed
     * @param contentType ContentType, which will be used to hightlight the message
     */
    public void printMessage(String message, ConsoleViewContentType contentType) {
        consoleViewImpl.print(message, contentType);
    }

    /**
     * Attaches the underlying consoleView to the process handler
     *
     * @param processHandler ProcessHandler
     */
    public void attachConsoleViewToProcess(ProcessHandler processHandler) {
        consoleViewImpl.attachToProcess(processHandler);
    }

    @Override
    public void disposeComponent() {
        // HACK: avoiding a NPE that we have no idea where it comes from. refs #1021
        if (consoleViewImpl != null) {
            consoleViewImpl.dispose();
            Disposer.dispose(consoleViewImpl);
            consoleViewImpl = null;
        }
    }

    public void balloon(final MessageType messageType, String format, Object... args) {
        final String message = String.format(format, args) + "\n";

        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                if (myProject != null) {
                    ToolWindowManager.getInstance(myProject).notifyByBalloon(TOOL_WINDOW_ID, messageType, message);
                }
            }
        });
    }

    public void log(String format, Object... args) {
        log(ConsoleViewContentType.SYSTEM_OUTPUT, format, args);
    }

    public void error(String format, Object... args) {
        log(ConsoleViewContentType.ERROR_OUTPUT, format, args);
    }

    private void log(ConsoleViewContentType type, String format, Object... args) {

        String newLine = System.getProperty("line.separator");

        String line = "";

        try {
            line = String.format(format, args);
        } catch (Exception e) {
            System.err.println(e.getMessage());

            if (format != null) {
                line = format;
                for (Object arg : args) {
                    line += arg.toString();
                }
            }
        }

        if (!line.endsWith(newLine)) {
            line += newLine;
        }

        if (consoleViewImpl != null) {
            consoleViewImpl.print(line, type);
        } else {
            if (type == ConsoleViewContentType.ERROR_OUTPUT) {
                System.err.print(line);
            } else {
                System.out.print(line);
            }
        }
    }
}
