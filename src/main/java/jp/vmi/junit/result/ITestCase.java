package jp.vmi.junit.result;

/**
 * test-case interface.
 */
public interface ITestCase {

    /**
     * Get test-case name.
     *
     * @return test-case name.
     */
    String getName();

    /**
     * Get parent test-suite instance.
     *
     * @return test-suite instatnce.
     */
    ITestSuite getTestSuite();
}
