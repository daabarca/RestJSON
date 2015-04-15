package com.daa.piloto.controllers;
 
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.daa.piloto.model.EMFService;
import com.daa.piloto.model.Todo;




 
@Controller
@RequestMapping("/piloto")
public class MovieController {
 
	//DI via Spring
	String message;
	EMFService emf;
 
	@RequestMapping(value="init", method = RequestMethod.GET)
	public ModelAndView getMovie( HttpServletRequest req,HttpServletResponse resp ) {
		ModelAndView mv = new ModelAndView("init");
		Todo todo = new Todo();
		 
        todo.setSummary("This is my todo");
 
        EntityManager em = emf.getEMF().createEntityManager();
        List<Todo> todos = null;
        try {
            em.persist(todo);
            Query q = em.createQuery("select t from Todo t");
            todos = new ArrayList(q.getResultList());
        } finally {
            em.close();
        }
 
        
		
		//System.out.println("------------------------------ "+req.getParameter("name"));
		//model.addAttribute("movie", todos.size());
		//model.addAttribute("message", this.message);
        mv.addObject("movie", todos.size());
       // mv.addObject("message", "HOLAAAA");
		//return to jsp page, configured in mvc-dispatcher-servlet.xml, view resolver
		return mv;
 
	}
 
	public void setMessage(String message) {
		this.message = message;
	}

	public EMFService getEmf() {
		return emf;
	}

	public void setEmf(EMFService emf) {
		this.emf = emf;
	}
 
}