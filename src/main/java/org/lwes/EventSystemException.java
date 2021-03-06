/*======================================================================*
 * Copyright (c) 2008, Yahoo! Inc. All rights reserved.                 *
 *                                                                      *
 * Licensed under the New BSD License (the "License"); you may not use  *
 * this file except in compliance with the License.  Unless required    *
 * by applicable law or agreed to in writing, software distributed      *
 * under the License is distributed on an "AS IS" BASIS, WITHOUT        *
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.     *
 * See the License for the specific language governing permissions and  *
 * limitations under the License. See accompanying LICENSE file.        *
 *======================================================================*/

package org.lwes;

/**
 * This is the parent class of all the Exceptions thrown by the event system
 * 
 * @author Anthony Molinaro
 */
public class EventSystemException extends RuntimeException {
	/**
	 * Overrides <tt>Exception</tt> constructor
	 * @param e the parent exception
	 */
	public EventSystemException(Throwable e) {
		super(e);
	}
	
	/**
	 * Overrides <tt>Exception</tt> constructor
	 * @param s the exception message
	 */
	public EventSystemException(String s) {
		super(s);
	}
	
	/**
	 * Overrides the <tt>Exception</tt> constructor
	 * @param s the exception message
	 * @param e the parent exception
	 */
	public EventSystemException(String s, Throwable e) {
		super(s, e);
	}
}
