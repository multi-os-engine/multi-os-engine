/*
Copyright (C) 2016 Migeran

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

package org.moe.gradle.utils;

import org.apache.commons.lang3.StringEscapeUtils;
import org.moe.gradle.anns.IgnoreUnused;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.HashMap;

public class JUnitTestCollector {

    /**
     * JUnit test message IDs.
     */
    private class MessageIDs {

        /**
         * Test run start message ID.
         */
        private static final String TEST_RUN_START = "%TESTC  :";

        /**
         * Test definition message ID.
         */
        private static final String TEST_DEFINE = "%TESTD  :";

        /**
         * Test start message ID.
         */
        private static final String TEST_START = "%TESTS  :";

        /**
         * Test end message ID.
         */
        private static final String TEST_END = "%TESTE  :";

        /**
         * Test error message ID.
         */
        private static final String TEST_ERROR = "%ERROR  :";

        /**
         * Test failed message ID.
         */
        private static final String TEST_FAILED = "%FAILED :";

        /**
         * Test ignored message ID.
         */
        private static final String TEST_IGNORED = "%IGNORED:";

        /**
         * Test run end message ID.
         */
        private static final String TEST_RUN_END = "%RUNTIME:";
    }

    /**
     * Number of tests.
     */
    private int numTests;
    /**
     * Number of started tests.
     */
    private int numStarted;
    /**
     * Number of failed tests.
     */
    private int numFailures;
    /**
     * Number of tests with errors.
     */
    private int numErrors;
    /**
     * Number of ignored tests.
     */
    private int numIgnored;
    /**
     * Test received last message flag.
     */
    private boolean hasEnded;

    /**
     * Test suites.
     */
    private final HashMap<String, TestSuite> suites = new HashMap<>();

    /**
     * Complete input.
     */
    private final StringBuilder completeInput = new StringBuilder();

    /**
     * Class representing a test suite.
     */
    private static class TestSuite {
        /**
         * Name of the suite.
         */
        String name;
        /**
         * Suite execution time.
         */
        long time;
        /**
         * Test cases in suite.
         */
        final HashMap<String, TestCase> cases = new HashMap<>();
    }

    /**
     * Class representing a test suite.
     */
    private static class TestCase {
        /**
         * Name of the case.
         */
        String name;
        /**
         * Case execution time.
         */
        long time;
        /**
         * Failure string or null.
         */
        StringBuilder failure;
        /**
         * Case test was started.
         */
        boolean wasStarted = false;
        /**
         * Case test was ignored.
         */
        boolean wasIgnored = false;
    }

    private TestCase currentTest;

    /**
     * Append a line to the test.
     *
     * @param line line to append
     */
    public void appendLine(String line) {
        if (line == null || line.length() == 0) {
            return;
        }

        completeInput.append(line).append('\n');

        if (line.startsWith(MessageIDs.TEST_RUN_START)) {

        } else if (line.startsWith(MessageIDs.TEST_DEFINE)) {
            getTestCase(line.substring(9));
            ++numTests;

        } else if (line.startsWith(MessageIDs.TEST_START)) {
            currentTest = getTestCase(line.substring(9));
            currentTest.time = new Date().getTime();
            currentTest.wasStarted = true;
            ++numStarted;

        } else if (line.startsWith(MessageIDs.TEST_END)) {
            currentTest.time = new Date().getTime() - currentTest.time;
            currentTest = null;

        } else if (line.startsWith(MessageIDs.TEST_ERROR)) {
            // JUnit 4+ simplifies errors to failures
            ++numErrors;

        } else if (line.startsWith(MessageIDs.TEST_FAILED)) {
            if (currentTest != null) {
                currentTest.failure = new StringBuilder(line.substring(9));
                ++numFailures;
            }

        } else if (line.startsWith(MessageIDs.TEST_IGNORED)) {
            final TestCase testCase = getTestCase(line.substring(9));
            testCase.wasIgnored = true;
            ++numIgnored;

        } else if (line.startsWith(MessageIDs.TEST_RUN_END)) {
            hasEnded = true;

            suites.forEach((_skey, tSuite) -> {
                tSuite.time = 0;
                tSuite.cases.forEach((_ckey, tCase) -> {
                    tSuite.time += tCase.time;
                });
            });
        } else {
            if (currentTest != null && currentTest.failure != null) {
                currentTest.failure.append("\n").append(line);
            }
        }
    }

    /**
     * Return the complete input
     *
     * @return complete input
     */
    public String getCompleteInput() {
        return completeInput.toString();
    }

    /**
     * Return a test case for the specified name
     *
     * @param testCase Test case name
     * @return test case object
     */
    private TestCase getTestCase(String testCase) {
        try {
            int idx = testCase.lastIndexOf('-');
            final String suiteName = testCase.substring(0, idx);
            final String caseName = testCase.substring(idx + 1);

            TestSuite tSuite = suites.get(suiteName);
            if (tSuite == null) {
                tSuite = new TestSuite();
                tSuite.name = suiteName;
                suites.put(suiteName, tSuite);
            }

            TestCase tCase = tSuite.cases.get(caseName);
            if (tCase == null) {
                tCase = new TestCase();
                tCase.name = caseName;
                tSuite.cases.put(caseName, tCase);
            }

            return tCase;
        } catch (Exception ex) {
            // Ignore
        }
        return new TestCase();
    }

    private static String getXMLString(String str) {
        return StringEscapeUtils.escapeXml10(str);
    }

    public String getXMLReport() {
        StringBuilder report = new StringBuilder(16 * 1024);

        report.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        report.append("<testrun " + "tests=\"").append(numTests).append("\" ")
                .append("started=\"").append(numStarted).append("\" ")
                .append("failures=\"").append(numFailures).append("\" ")
                .append("errors=\"").append(numErrors).append("\" ")
                .append("ignored=\"").append(numIgnored).append("\">\n");

        suites.forEach((_skey, tSuite) -> {
            report.append("    ");
            report.append("<testsuite name=\"").append(getXMLString(tSuite.name)).append("\" time=\"").append(getAsSeconds(tSuite.time)).append("\">\n");
            tSuite.cases.forEach((_ckey, tCase) -> {
                report.append("        ");
                report.append("<testcase name=\"").append(getXMLString(tCase.name)).append("\" ");
                report.append("classname=\"").append(getXMLString(tSuite.name)).append("\" ");
                report.append("time=\"").append(getAsSeconds(tCase.time)).append("\" ");

                if (tCase.wasIgnored) {
                    report.append("ignored=\"true\" ");
                }

                if (tCase.failure != null) {
                    report.append(">\n");
                    report.append("            ");
                    report.append("<failure>");
                    report.append(getXMLString(tCase.failure.toString()));
                    report.append("\n            ");
                    report.append("</failure>\n");


                    report.append("        ");
                    report.append("</testcase>\n");

                } else {
                    report.append("/>\n");
                }
            });
            report.append("    ");
            report.append("</testsuite>\n");
        });


        report.append("</testrun>\n");
        return report.toString();
    }

    private static String getHTMLString(String str) {
        return StringEscapeUtils.escapeHtml4(str);
    }

    public String getHTMLReport(String targetName) {
        StringBuilder report = new StringBuilder(16 * 1024);

        report.append("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head>\n" +
                "<title>JUnit Test Results</title>\n" +
                "\t<style>\n" +
                "body { background-color: #FFFFFF; }\n" +
                "h1 { margin-left: 20px; }\n" +
                "h2 { margin-left: 30px; }\n" +
                "table { border-spacing: 0; width: 98%; margin-left: auto; margin-right: auto; border: 1px solid black; }\n" +
                "table > * > tr > td { padding: 2px 5px; border-left: 1px solid black; border-bottom: 1px solid black; }\n" +
                "table > * > tr > td:first-child { border-left: 0px solid black; }\n" +
                "table > thead { background-color: #6D6D6D; color: #FFFFFF; }\n" +
                "table > thead > tr > td { font-weight: bold; font-size: 105%; letter-spacing: 0.05em; }\n" +
                "table > tbody > tr:last-child > td { border-bottom: 0px solid black; }\n" +
                ".cases { margin: 20px; }\n" +
                ".failure { padding: 20px; }\n" +
                "\n" +
                ".color-ok { background-color: #B7E57F; }\n" +
                ".color-warn { background-color: #E4DF7C; }\n" +
                ".color-fail { background-color: #E57F84; }\n" +
                ".color-ignore { background-color: #DCDCDC; }\n" +
                "\n" +
                ".even { background-color: #FFFFFF; }\n" +
                ".odd { background-color: #D7D7D7; }\n" +
                "\t</style>\n" +
                "\t<script type=\"text/javascript\">\n" +
                "function toggleCell(name) {\n" +
                "\tvar elem = document.getElementById(name);\n" +
                "\tif (elem.style.display == 'none') {\n" +
                "\t\telem.style.display = 'table-row'\n" +
                "\t} else {\n" +
                "\t\telem.style.display = 'none'\n" +
                "\t}\n" +
                "}\n" +
                "function hideAllSuites() {\n" +
                "\tvar classes = document.querySelectorAll('.suite-cases');\n" +
                "\tfor (var i = 0; i < classes.length; i++) { classes[i].style.display = 'none'; }\n" +
                "}\n" +
                "\t</script>\n" +
                "</head>\n" +
                "<body onload=\"hideAllSuites()\">\n");
        report.append("<h1>Test report for &lt;").append(getHTMLString(targetName)).append("&gt;</h1>\n");
        report.append("<h2>Summary</h2>\n" +
                "<table class=\"summary\">\n" +
                "\t<thead>\n" +
                "\t\t<tr><td>Tests</td><td>Started</td><td>Failures</td><td>Errors</td><td>Ignored</td></tr>\n" +
                "\t</thead>\n" +
                "\t<tbody>\n" +
                "\t\t<tr>" +
                "<td>").append(numTests).append("</td>")
                .append("<td>").append(numStarted).append("</td>")
                .append("<td").append(numFailures > 0 ? " class=\"color-fail\"" : "").append(">").append(numFailures).append("</td>")
                .append("<td>").append(numErrors).append("</td>")
                .append("<td>").append(numIgnored).append("</td></tr>\n")
                .append("\t</tbody>\n").append("</table>\n");
        report.append("<h2>Results</h2>\n" +
                "<table class=\"results\">\n" +
                "\t<thead>\n" +
                "\t\t<tr><td>Suite Name</td><td>Time (sec)</td><td>Success/Failed/Ignored</td><td></td></tr>\n" +
                "\t</thead>\n" +
                "\t<tbody>\n");
        final int[] suiteIndex = {0};
        suites.forEach((_skey, tSuite) -> {
            suiteIndex[0]++;

            final int[] numSucc = {0};
            final int[] numFailed = {0};
            final int[] numIgnored = {0};
            tSuite.cases.forEach((_ckey, tCase) -> {
                if (tCase.wasIgnored) {
                    ++numIgnored[0];
                } else if (tCase.failure != null) {
                    ++numFailed[0];
                } else {
                    ++numSucc[0];
                }
            });
            int numSum = numSucc[0] + numFailed[0] + numIgnored[0];

            String sumColor = "color-ok";
            if (numSum == numIgnored[0]) {
                sumColor = "color-ignore";
            } else if (numFailed[0] == numSum - numIgnored[0]) {
                sumColor = "color-fail";
            } else if (numFailed[0] > 0) {
                sumColor = "color-warn";
            }

            report.append("\t\t<tr class=\"suite ").append(suiteIndex[0] % 2 == 0 ? "even" : "odd").append("\">")
                    .append("<td>").append(getHTMLString(tSuite.name)).append("</td>")
                    .append("<td>").append(getAsSeconds(tSuite.time)).append("</td>")
                    .append("<td class=\"").append(sumColor).append("\">").append(numSucc[0]).append("/").append(numFailed[0]).append("/").append(numIgnored[0]).append("</td>")
                    .append("<td><button onclick=\"toggleCell('suite").append(suiteIndex[0]).append("')\">Show/Hide</button></td>")
                    .append("</tr>\n");
            report.append("\t\t<tr id=\"suite").append(suiteIndex[0]).append("\" class=\"suite-cases\"><td colspan=\"3\">\n" +
                    "\t\t\t<table class=\"cases\">\n" +
                    "\t\t\t\t<thead>\n" +
                    "\t\t\t\t\t<tr><td>Name</td><td>Time (sec)</td><td>Status</td></tr>\n" +
                    "\t\t\t\t</thead>\n" +
                    "\t\t\t\t<tbody>\n");

            final int[] caseIndex = {0};
            tSuite.cases.forEach((_ckey, tCase) -> {
                caseIndex[0]++;

                report.append("\t\t\t\t\t<tr " +
                        "class=\"").append(caseIndex[0] % 2 == 0 ? "even" : "odd").append("\">" +
                        "<td>").append(getHTMLString(tCase.name)).append("</td>" +
                        "<td>").append(getAsSeconds(tCase.time)).append("</td>");
                if (tCase.wasIgnored) {
                    report.append("<td class=\"color-ignore\">Ignored</td>");
                } else if (tCase.failure != null) {
                    report.append("<td class=\"color-fail\">Failed</td>");
                } else {
                    report.append("<td class=\"color-ok\">OK</td>");
                }
                report.append("</tr>\n");

                if (tCase.failure != null) {
                    String message = tCase.failure.toString();
                    message = getHTMLString(message.trim());
                    message = message.replaceAll("\n", "<br>\n");
                    report.append("\t\t\t\t\t<tr><td class=\"failure\" colspan=\"3\"><code>").append(message).append("</code></td></tr>\n");
                }
            });
            report.append("\t\t\t\t</tbody>\n" +
                    "\t\t\t</table>\n" +
                    "\t\t</td><td></td></tr>\n");
        });

        report.append("\t</tbody>\n" +
                "</table>\n" +
                "</body>\n" +
                "</html>\n");

        return report.toString();
    }

    /**
     * Converts milliseconds to seconds.
     *
     * @param millis milliseconds
     * @return seconds
     */
    private static double getAsSeconds(long millis) {
        final double t = ((double) millis) / (1000.0);
        return new BigDecimal(t).setScale(3, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * Returns the number of tests.
     *
     * @return number of tests
     */
    @IgnoreUnused
    public int getNumTests() {
        return numTests;
    }

    /**
     * Returns the number of started tests.
     *
     * @return number of started tests
     */
    @IgnoreUnused
    public int getNumStarted() {
        return numStarted;
    }

    /**
     * Returns the number of failed tests.
     *
     * @return number of failed tests
     */
    public int getNumFailures() {
        return numFailures;
    }

    /**
     * Returns the number of tests with error.
     *
     * @return number of tests with error
     */
    public int getNumErrors() {
        return numErrors;
    }

    /**
     * Returns the number of ignored tests.
     *
     * @return number of ignored tests
     */
    @IgnoreUnused
    public int getNumIgnored() {
        return numIgnored;
    }

    /**
     * Returns the has ended flag.
     *
     * @return has ended flag
     */
    @IgnoreUnused
    public boolean getHasEnded() {
        return hasEnded;
    }

}
