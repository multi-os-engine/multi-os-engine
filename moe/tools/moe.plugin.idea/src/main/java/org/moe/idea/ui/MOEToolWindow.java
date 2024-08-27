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
import com.intellij.openapi.Disposable;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.MessageType;
import com.intellij.openapi.util.Disposer;
import com.intellij.openapi.util.EmptyRunnable;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowManager;
import com.intellij.pom.Navigatable;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.util.ui.UIUtil;

import org.jetbrains.annotations.NotNull;

import javax.swing.JPanel;

import res.MOEIcons;
import res.MOEText;

public class MOEToolWindow implements Disposable {
    public static final String TOOL_WINDOW_ID = MOEText.get("Console.Title");

    protected final Project myProject;
    private JPanel mainPanel;
    private ConsoleViewImpl consoleViewImpl;

    private ToolWindow window;

    public MOEToolWindow(final Project project) {
        this.myProject = project;
    }

    public static MOEToolWindow getInstance(@NotNull Project project) {
        return ServiceManager.getService(project, MOEToolWindow.class);
    }

    public void initToolWindow(final ToolWindow window) {
        window.setToHideOnEmptyContent(true);
        this.window = window;

        ContentFactory contentFactory = ContentFactory.getInstance();
        Content content = contentFactory.createContent(consoleViewImpl.getComponent(), "", false);
        window.getContentManager().addContent(content);
    }

    public void show() {
        ApplicationManager.getApplication().assertIsDispatchThread();

        if (window == null) {
            window = ToolWindowManager.getInstance(myProject).getToolWindow(MOEText.get("Console.Title"));
            if (window == null) {
                System.err.println("Failed to initialize window");
                return;
            }
            window.setIcon(MOEIcons.MOETool);
        }

        window.activate(EmptyRunnable.getInstance());
        window.show(EmptyRunnable.getInstance());
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
        UIUtil.invokeLaterIfNeeded(new Runnable() {
            @Override
            public void run() {
                show();
            }
        });
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

    public void log(String format) {
        log(ConsoleViewContentType.SYSTEM_OUTPUT, format);
    }

    public void error(String format) {
        log(ConsoleViewContentType.ERROR_OUTPUT, format);
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

    private void log(ConsoleViewContentType type, String text) {
        if (consoleViewImpl != null) {
            consoleViewImpl.print(text, type);
        } else {
            if (type == ConsoleViewContentType.ERROR_OUTPUT) {
                System.err.print(text);
            } else {
                System.out.print(text);
            }
        }
    }

    @NotNull
    public Navigatable getNavigatable() {
        return new Navigatable() {
            @Override
            public void navigate(boolean b) {
                UIUtil.invokeLaterIfNeeded(new Runnable() {
                    @Override
                    public void run() {
                        show();
                    }
                });
            }

            @Override
            public boolean canNavigate() {
                return true;
            }

            @Override
            public boolean canNavigateToSource() {
                return false;
            }
        };
    }

    @Override
    public void dispose() {
        // HACK: avoiding a NPE that we have no idea where it comes from. refs #1021
        if (consoleViewImpl != null) {
            consoleViewImpl.dispose();
            Disposer.dispose(consoleViewImpl);
            consoleViewImpl = null;
        }
    }
}
