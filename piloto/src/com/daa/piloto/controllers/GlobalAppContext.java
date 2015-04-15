package com.daa.piloto.controllers;

import org.springframework.context.ApplicationContext;

/**
 * Clase que permite acceder al contexto de aplicacion de spring
 * en cualquier momento
 * @author cbolanos
 *
 */
public class GlobalAppContext 
{
	public static ApplicationContext ctx;
	public static ApplicationContext getContext()
	{
		return ctx;
	}
	
	public static void setContext(ApplicationContext ac)
	{
		ctx = ac;
	}
}
