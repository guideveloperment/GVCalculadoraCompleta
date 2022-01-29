package br.com.GVProjetoServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calc
 */
@WebServlet("/calc")
public class calc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if((request.getParameter("val1") != null) && (request.getParameter("val2") !=null)) {
			int val1 = Integer.parseInt(request.getParameter("val1"));
			int val2 = Integer.parseInt(request.getParameter("val2"));
			
			Calcular c = new Calcular(val1, val2);
			int resultado = c.somar();
			
			request.setAttribute("res", resultado);
			
		}
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
		
	}


