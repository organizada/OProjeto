package br.edu.ifms.tads.dbf2.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/busca")

public class TesteBusca extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String filtro=req.getParameter("filtro");
		
		PrintWriter writer = resp.getWriter();
		writer.println("<html> <body>");
		writer.println("Procura");
		writer.println("<ul>");
			
		if(filtro.equals("doces"))
		{
			for(String doces:BuscaTipo.doces())
			{
			writer.println("<li>"+doces+"</li>");
			}	
		}else
		if(filtro.equals("salgados"))
		{
			for(String salgados:BuscaTipo.salgados())
			{
			writer.println("<li>"+salgados+"</li>");
			}	
		}
		else
		{
			writer.println("Nada encontrado!");
		}
		writer.println("</ul>");
		writer.println("</body> </html>");
		
		
	}

	
}
