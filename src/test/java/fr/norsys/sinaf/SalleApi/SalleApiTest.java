package fr.norsys.sinaf.SalleApi;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SalleApiTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SalleApiTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SalleApiTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void SalleApiApp()
    {
        assertTrue( true );
    }
}
