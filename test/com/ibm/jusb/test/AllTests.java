package com.ibm.jusb.test;

/**
 * Copyright (c) 1999 - 2001, International Business Machines Corporation.
 * All Rights Reserved.
 *
 * This software is provided and licensed under the terms and conditions
 * of the Common Public License:
 * http://oss.software.ibm.com/developerworks/opensource/license-cpl.html
 */

import junit.framework.*;

/**
 * A TestSuite that puts together all the test classes from
 * the com.ibm.jusb.test package
 * @author E. Michael Maximilien
 * @author Kevin H. Bell
 */
public class AllTests extends TestSuite
{
	//-------------------------------------------------------------------------
	// Public class methods
	//

	public static TestSuite suite()
	{
		TestSuite suite = new TestSuite();

		suite.addTestSuite( JUnitUtilityTestCase.class );

		return suite;
	}
}
