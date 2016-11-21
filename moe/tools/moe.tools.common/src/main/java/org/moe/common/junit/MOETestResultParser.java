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

package org.moe.common.junit;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@SuppressWarnings("restriction")
public class MOETestResultParser {
	
	private MOEITestRunListener listener;
	
	public static final String TEST_IGNORED = "%IGNORED";
	
	public static final String TEST_RUN_DEFINE = "%TESTD  ";
	
	/** unfinished message line, stored for next packet */
    private String mUnfinishedLine = null;

    private final ArrayList<String> mArray = new ArrayList<String>();
    
    private boolean mTrimLines = true;
    
    StringBuffer errorBuffer;
    
    MOETestIdentifier failTest = null;
	
	public MOETestResultParser(MOEITestRunListener l) {
		this.listener = l;
		this.errorBuffer = new StringBuffer();
		this.failTest = null;
	}

	public void addOutput(byte[] buffer, int i, int read) {
		try {
			addOutput(new String(buffer, 0, read, "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			addOutput(new String(buffer, 0, read));
		}
		
	}

	public final void addOutput(String s) {
        if (isCancelled() == false) {

            // ok we've got a string
            if (s != null) {
                // if we had an unfinished line we add it.
                if (mUnfinishedLine != null) {
                    s = mUnfinishedLine + s;
                    mUnfinishedLine = null;
                }

                // now we split the lines
                mArray.clear();
                int start = 0;
                do {
                    int index = s.indexOf("\n", start); //$NON-NLS-1$

                    // if \r\n was not found, this is an unfinished line
                    // and we store it to be processed for the next packet
                    if (index == -1) {
                        mUnfinishedLine = s.substring(start);
                        break;
                    }

                    // so we found a \r\n;
                    // extract the line
                    String line = s.substring(start, index);
                    if (mTrimLines) {
                        line = line.trim();
                    }
                    mArray.add(line);

                    // move start to after the \r\n we found
                    start = index + 1;
                } while (true);

                if (mArray.size() > 0) {
                    // at this point we've split all the lines.
                    // make the array
                    String[] lines = mArray.toArray(new String[mArray.size()]);

                    // send it for final processing
                    processNewLines(lines);
                }
            }
        }
    }

	private boolean isCancelled() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void processNewLines(String[] lines) {
		
        for (String line : lines) {
            parse(normalizeLine(line));
        }
    }

	private void parse(String line) {
		
		if (line.startsWith(MessageIds.TEST_RUN_START)) {
			String num = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			int testCount = Integer.valueOf(num);
			listener.testRunStarted("", testCount);
			
		} else if (line.startsWith(MessageIds.TEST_START)) {
			String test = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			String testClass = test.substring(0, test.indexOf("-"));
			String testMethod = test.substring(test.indexOf("-") + 1, test.length());
			listener.testStarted(new MOETestIdentifier(testClass, testMethod));
			
		} else if (line.startsWith(MessageIds.TEST_END)) {
			if (failTest != null) {
				listener.testFailed(failTest, errorBuffer.toString());
				this.errorBuffer = new StringBuffer();
				this.failTest = null;
			}
			String test = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			String testClass = test.substring(0, test.indexOf("-"));
			String testMethod = test.substring(test.indexOf("-") + 1, test.length());
            Map<String, String> runMetrics = new HashMap<String, String>();
			listener.testEnded(new MOETestIdentifier(testClass, testMethod), runMetrics);
			
		} else if (line.startsWith(MessageIds.TEST_FAILED)) {
			String test = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			String testMethod = test.substring(0, test.indexOf("("));
			String testClass = test.substring(test.indexOf("(") + 1, test.indexOf(")"));
			String errorMsg = test.substring(test.indexOf(":") + 1, test.length());
			errorBuffer.append(errorMsg);
			failTest = new MOETestIdentifier(testClass, testMethod);
		
		} else if (line.startsWith(MessageIds.TEST_RUN_END)) {
			if (failTest != null) {
				listener.testFailed(failTest, errorBuffer.toString());
				this.errorBuffer = new StringBuffer();
				this.failTest = null;
			}
			String time = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
            Map<String, String> runMetrics = new HashMap<String, String>();
            listener.testRunEnded(Integer.valueOf(time), runMetrics);
			
		} else if (line.startsWith(TEST_IGNORED)) {
			String test = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			String testClass = test.substring(0, test.indexOf("-"));
			String testMethod = test.substring(test.indexOf("-") + 1, test.length());
			MOETestIdentifier ignoredTest = new MOETestIdentifier(testClass, testMethod);
			ignoredTest.setIgnored(true);
            listener.testStarted(ignoredTest);
			listener.testIgnored(ignoredTest);
			
		} else if (line.startsWith(TEST_RUN_DEFINE)) {
			String test = line.substring(MessageIds.MSG_HEADER_LENGTH + 1, line.length());
			String testClass = test.substring(0, test.indexOf("-"));
			String testMethod = test.substring(test.indexOf("-") + 1, test.length());
			listener.testDefined(new MOETestIdentifier(testClass, testMethod));
			
		} else {
			if (failTest != null) {
				errorBuffer.append("\n");
				errorBuffer.append(line);
			}
		}
	}

	private String normalizeLine(String s) {
		int index = 0;
		if ((index = s.indexOf(MessageIds.TEST_RUN_START)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(MessageIds.TEST_START)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(MessageIds.TEST_END)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(MessageIds.TEST_FAILED)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(MessageIds.TEST_RUN_END)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(MessageIds.TEST_IGNORED)) > 0) {
			s = s.substring(index, s.length());
		} else if ((index = s.indexOf(TEST_RUN_DEFINE)) > 0) {
			s = s.substring(index, s.length());
		}
		return s;
	}

    public class MessageIds {

        public static final int MSG_HEADER_LENGTH = 8;

        public static final String TEST_RUN_START = "%TESTC  ";

        public static final String TEST_DEFINE = "%TESTD  ";

        public static final String TEST_START = "%TESTS  ";

        public static final String TEST_END = "%TESTE  ";

        public static final String TEST_ERROR = "%ERROR  ";

        public static final String TEST_FAILED = "%FAILED ";

        public static final String TEST_IGNORED = "%IGNORED";

        public static final String TEST_RUN_END = "%RUNTIME";
    }
	
}
