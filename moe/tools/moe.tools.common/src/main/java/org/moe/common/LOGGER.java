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

package org.moe.common;


import org.moe.common.utils.OsUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;


public class LOGGER {

    public static final String ERR_BUILD_LOG_NAME = "ErrBuildLog.txt";

    private static Level m_Level = Level.INFO;
    private static String LOG_FILE_PREFIX = "build_log";
    private static String CURRENT_DATE_PREFIX = null;

    ////////////////////////////////////////////////////////////////////////////////////////////////////
    private static Boolean m_IsConsoleOutEnabled = false;
    private static File logFile = null;
    private static File logErrFile = null;
    private static BufferedWriter m_FileLogger = null;
    private static BufferedWriter m_ErrFileLogger = null;
    private static Object writerLock = new Object();
    private static Object writerErrLock = new Object();
    private static final SimpleDateFormat m_OutputDateFormat = new SimpleDateFormat("HH:mm:ss.SSS");
    private static final String m_LineSeparator = System.getProperty("line.separator");
    private static Timer m_FileLoggerFlushTimer = null;
    private static boolean m_bFileFlushTimerEnabled = false;

    private LOGGER() {
    }

    public static SimpleDateFormat getDefaultDateFormat() {
        return new SimpleDateFormat("yyyy.MM.dd_HH.mm.ssZ");
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static boolean isLogFileDefined() {
        try {
            m_FileLogger.flush();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void SetLogFilePath(String sPath) {

        sPath = OsUtils.concatenateToLocalPath(sPath, getDatePrefix() + "_" + LOG_FILE_PREFIX + ".txt");

        FileWriter writer;
        File tmpFile = new File(sPath);
        try {
            tmpFile.getParentFile().mkdirs();
            writer = new FileWriter(tmpFile);
        } catch (IOException e) {
            SEVERE("Log file \"" + sPath + "\" cannot be created!");
            return;
        }
        logFile = tmpFile;

        synchronized (writerLock) {
            if (m_FileLogger != null) {
                try {
                    m_FileLogger.close();
                } catch (IOException e) {
                    SEVERE("File stream cannot be closed");
                    try {
                        writer.close();
                    } catch (IOException ignored) {
                    }
                    return;
                }
            }

            m_FileLogger = new BufferedWriter(writer);
        }

        System.out.println("\nLog file: \"" + sPath + "\".");
    }

    public static String getDatePrefix() {
        String result = CURRENT_DATE_PREFIX;

        if (result == null) {
            result = getDefaultDateFormat().format(new Date());
        }
        CURRENT_DATE_PREFIX = result;

        return result;
    }

    public static void SetErrLogFilePath(String sPath) {
        sPath = OsUtils.concatenateToLocalPath(sPath , ERR_BUILD_LOG_NAME);

        FileWriter writer;
        File fTmp = new File(sPath);
        try {
            fTmp.getParentFile().mkdirs();
            writer = new FileWriter(fTmp);
        } catch (IOException e) {
            SEVERE("Log file \"" + sPath + "\" cannot be created: " + e.getMessage());
            return;
        }
        logErrFile = fTmp;

        synchronized (writerErrLock) {
            if (m_ErrFileLogger != null) {
                try {
                    m_ErrFileLogger.close();
                } catch (IOException e) {
                    SEVERE("File stream cannot be closed: " + e.getMessage());
                    try {
                        writer.close();
                    } catch (IOException ignored) {
                    }
                    return;
                }
            }

            m_ErrFileLogger = new BufferedWriter(writer);
        }
    }

    public static boolean moveCurrentLogFile(String dstPath) {
        boolean result = false;

        if ((logFile == null) || !logFile.exists()) {
            SetLogFilePath(dstPath);
            return result;
        } else if (logFile.getParent().equals(dstPath)) {
            return true;
        }

        synchronized (writerLock) {
            if (m_FileLogger != null) {
                try {
                    m_FileLogger.close();
                } catch (IOException e) {
                    System.err.println("Log file was not moved. File stream cannot be closed.");
                    return result;
                }
            }

            dstPath = OsUtils.concatenateToLocalPath(dstPath, logFile.getName());
            File tmpFile = new File(dstPath);

            FileWriter writer;
            try {
                tmpFile.getParentFile().mkdirs();
                result = logFile.renameTo(tmpFile);
                if (result) {
                    logFile = tmpFile;
                }
                writer = new FileWriter(logFile, true);
            } catch (IOException e) {
                System.err.println("moveCurrentLogFile(): Log file \"" + dstPath + "\" cannot be moved!\n" + e.getMessage());
                return result;
            }

            m_FileLogger = new BufferedWriter(writer);
        }

        System.out.println("\nLog file: \"" + dstPath + "\".");
        return result;
    }

    public static boolean moveCurrentErrLogFile(String dstPath) {
        boolean result = false;

        if ((logErrFile == null) || !logErrFile.exists()) {
            SetErrLogFilePath(dstPath);
            return result;
        } else if (logErrFile.getParent().equals(dstPath)) {
            return true;
        }

        synchronized (writerErrLock) {
            if (m_ErrFileLogger != null) {
                try {
                    m_ErrFileLogger.close();
                } catch (IOException e) {
                    System.err.println("Log file was not moved. File stream cannot be closed.");
                    return result;
                }
            }

            dstPath = OsUtils.concatenateToLocalPath(dstPath, logErrFile.getName());
            File tmpFile = new File(dstPath);

            FileWriter writer;
            try {
                tmpFile.getParentFile().mkdirs();
                result = logErrFile.renameTo(tmpFile);
                if (result) {
                    logErrFile = tmpFile;
                }
                writer = new FileWriter(logErrFile, true);
            } catch (IOException e) {
                System.err.println("moveCurrentLogFile(): Log file \"" + dstPath + "\" cannot be created!");
                return result;
            }

            m_ErrFileLogger = new BufferedWriter(writer);
        }

        System.out.println("\nLog file: \"" + dstPath + "\".");
        return result;
    }

    public static void EnableFileFlushTimer(boolean bEnable) {
        if (bEnable) {
            if (!m_bFileFlushTimerEnabled) {
                m_bFileFlushTimerEnabled = true;

                if (m_FileLoggerFlushTimer != null) {
                    m_FileLoggerFlushTimer.cancel();
                }
                m_FileLoggerFlushTimer = new Timer();
                m_FileLoggerFlushTimer.schedule(new TimerTask() {
                    public void run() {
                        if (m_FileLogger != null) {
                            try {
                                m_FileLogger.flush();
                            } catch (IOException e) {
                                System.out.println("File flushing error: " + e.getMessage());
                            }
                        } else {
                            this.cancel();
                        }
                    }
                }, 1000, 1000);
            }
        } else {
            m_bFileFlushTimerEnabled = false;
            if (m_FileLoggerFlushTimer != null) {
                m_FileLoggerFlushTimer.cancel();
                m_FileLoggerFlushTimer = null;
            }
        }

    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void EnableConsoleOutLog(Boolean bEnable) {
        m_IsConsoleOutEnabled = bEnable;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void setLogLevel(Level level) {
        m_Level = level;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static Level getLogLevel() {
        return m_Level;
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void setLogLevel(String sLevel) {
        String sUpperLevel = sLevel.toUpperCase();

        if (sUpperLevel.equals("SEVERE")) {
            setLogLevel(Level.SEVERE);
        } else if (sUpperLevel.equals("WARNING")) {
            setLogLevel(Level.WARNING);
        } else if (sUpperLevel.equals("INFO")) {
            setLogLevel(Level.INFO);
        } else if (sUpperLevel.equals("CONFIG")) {
            setLogLevel(Level.CONFIG);
        } else if (sUpperLevel.equals("FINE")) {
            setLogLevel(Level.FINE);
        } else if (sUpperLevel.equals("FINER")) {
            setLogLevel(Level.FINER);
        } else if (sUpperLevel.equals("FINEST")) {
            setLogLevel(Level.FINEST);
        } else if (sUpperLevel.equals("ALL")) {
            setLogLevel(Level.ALL);
        } else {
            System.out.println("Incorrect LOG Level \"" + sLevel + "\"!");
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void SEVERE(Object... args) {
        LOG(Level.SEVERE, args);
    }

    public static void WARNING(Object... args) {
        LOG(Level.WARNING, args);
    }

    public static void INFO(Object... args) {
        LOG(Level.INFO, args);
    }

    public static void CONFIG(Object... args) {
        LOG(Level.CONFIG, args);
    }

    public static void FINE(Object... args) {
        LOG(Level.FINE, args);
    }

    public static void FINER(Object... args) {
        LOG(Level.FINER, args);
    }

    public static void FINEST(Object... args) {
        LOG(Level.FINEST, args);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void LOG(Level level, Object... args) {
        if (level.intValue() < m_Level.intValue()) {
            return;
        }

        StackTraceElement StackTraceElement = Thread.currentThread().getStackTrace()[3];

        StringBuffer sBuff = new StringBuffer(512);

        sBuff.append(m_LineSeparator);

        sBuff.append(m_OutputDateFormat.format(new Date()));
        sBuff.append(' ');
        sBuff.append(level);
        /*sBuff.append(' ');
        sBuff.append(StackTraceElement.getClassName());*/
        sBuff.append(' ');
        sBuff.append(StackTraceElement.getMethodName());
        sBuff.append("(): ");
        for (Object obj : args) {
            sBuff.append(obj);
        }
        sBuff.append(m_LineSeparator);

        Print(level, sBuff);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void PureLOG(Level level, Object... args) {
        if (level.intValue() < m_Level.intValue()) {
            return;
        }

        StringBuffer sBuff = new StringBuffer(512);

        for (Object obj : args) {
            sBuff.append(obj);
        }

        Print(level, sBuff);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    private static void Print(Level level, StringBuffer toPrint) {
        try {
            if (level == Level.SEVERE) {
                System.err.print(toPrint);
                synchronized (writerErrLock) {
                    if (m_ErrFileLogger != null) {
                        m_ErrFileLogger.write(toPrint.toString(), 0, toPrint.length());
                        m_ErrFileLogger.flush();
                    }
                }
            } else if (m_IsConsoleOutEnabled) {
                System.out.print(toPrint);
            }
            synchronized (writerLock) {
                if (m_FileLogger != null) {
                    m_FileLogger.write(toPrint.toString(), 0, toPrint.length());
                    if (!m_bFileFlushTimerEnabled) {
                        m_FileLogger.flush();
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Cannot write into log file: " + e.getMessage());
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void Terminate() {
        CURRENT_DATE_PREFIX = null;

        if (m_FileLoggerFlushTimer != null) {
            m_FileLoggerFlushTimer.cancel();
            m_FileLoggerFlushTimer = null;
        }
        try {
            synchronized (writerLock) {
                if (m_FileLogger != null) {
                    m_FileLogger.close();
                    m_FileLogger = null;
                }
            }
            synchronized (writerErrLock) {
                if (m_ErrFileLogger != null) {
                    m_ErrFileLogger.close();
                    m_ErrFileLogger = null;
                }
            }
        } catch (IOException e) {
            System.err.println("LOGGER.Terminate: " + e.getMessage());
        }
    }
////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void SetLogFilePrefix(String prefix) {
        LOG_FILE_PREFIX = prefix;
    }

    public static void SetDatePrefix(String dataPrefix) {
        CURRENT_DATE_PREFIX = dataPrefix;
    }


    protected void finalize() throws Throwable {
        Terminate();
    }
////////////////////////////////////////////////////////////////////////////////////////////////////
}
