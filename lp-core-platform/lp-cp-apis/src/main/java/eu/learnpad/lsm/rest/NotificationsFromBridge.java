/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package eu.learnpad.lsm.rest;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

import eu.learnpad.exception.LpRestException;

public interface NotificationsFromBridge {

	/** 
	 * @param questionnaireId
	 *            the id of the questionnaire the notification refers
	 * @param emailList
	 *            the list of emails of the learners started to compile a questionnaire
	 * @throws LpRestException
	 */
	@PUT
	@Path("/{questionnaireid}/started")
	void notifyLearningSessionStarted(@PathParam("questionnaireid") String questionnaireId,
			@QueryParam("list") String [] emailList) throws LpRestException;

	/** 
	 * @param questionnaireId
	 *            the id of the questionnaire the notification refers
	 * @param emailList
	 *            the list of emails of the learners completed the compilation of a questionnaire
	 * @throws LpRestException
	 */
	@PUT
	@Path("/{questionnaireid}/completed")
	void notifyLearningSessionCompleted(@PathParam("questionnaireid") String questionnaireId,
			@QueryParam("list") String [] emailList) throws LpRestException;
}
