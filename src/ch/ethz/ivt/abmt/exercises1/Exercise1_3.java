/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2013 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */
package ch.ethz.ivt.abmt.exercises1;

/**
 * @author thibautd
 */
public class Exercise1_3 {
	public static void main( String[] args ) {
		int[] myArray = {1,2,3,4,5};

		for ( int i = 0; i < 24; i++ ) {
			if ( Exercise1Utils.arrayContains( myArray , i ) ) {
				System.out.println( i+" is in the array" );
			}
			else {
				System.out.println( i+" is NOT in the array" );
			}
		}
	}

}