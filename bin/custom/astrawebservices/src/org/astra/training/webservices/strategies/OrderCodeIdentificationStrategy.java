/*
 * Copyright (c) 2020 SAP SE or an SAP affiliate company. All rights reserved.
 */
package org.astra.training.webservices.strategies;


/**
 * Strategy for identifying is given string is GUID.
 */
public interface OrderCodeIdentificationStrategy
{
	boolean isID(String potentialId);
}