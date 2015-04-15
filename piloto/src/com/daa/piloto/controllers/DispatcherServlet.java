package com.daa.piloto.controllers;

import org.springframework.beans.BeansException;
import org.springframework.web.context.WebApplicationContext;

public class DispatcherServlet extends	org.springframework.web.servlet.DispatcherServlet 
{
	/**
	 * Metodo que actualiza variable estatica de contexto despues de 
	 * inicializarlo
	 */
	public WebApplicationContext initWebApplicationContext()throws BeansException
	{
		WebApplicationContext wa = super.initWebApplicationContext();
		GlobalAppContext.setContext(wa);
		return wa;
	}
}
