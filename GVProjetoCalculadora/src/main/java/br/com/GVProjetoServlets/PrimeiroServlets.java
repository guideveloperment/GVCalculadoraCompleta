package br.com.GVProjetoServlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlets
 */
@WebServlet("/PrimeiroServlets")
public class PrimeiroServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PrimeiroServlets() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		int val1 = Integer.parseInt(request.getParameter("val1"));
		int val2 = Integer.parseInt(request.getParameter("val2"));
		int result = 0;
		// response.getWriter().println("Resultado = " + result);
		Calcular c = new Calcular(val1, val2);
		if (request.getParameter("btnSomar") != null) {
			result = c.somar();

		} else if (request.getParameter("btnSubtrair") != null) {
			result = c.subtrair();

		} else if (request.getParameter("btnMultiplicar") != null) {
			result = c.multiplicar();

		} else if (request.getParameter("btnDividir") != null) {
			result = c.divisao();

		}

		request.setAttribute("res", result);
		request.getRequestDispatcher("/").forward(request, response);
	}

}
