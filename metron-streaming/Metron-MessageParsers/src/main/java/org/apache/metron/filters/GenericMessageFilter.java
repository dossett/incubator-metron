package org.apache.metron.filters;
import java.io.Serializable;

import org.json.simple.JSONObject;

import org.apache.metron.parser.interfaces.MessageFilter;

public class GenericMessageFilter implements MessageFilter,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3626397212398318852L;

	public boolean emitTuple(JSONObject message) {
		return true;
	}

}
