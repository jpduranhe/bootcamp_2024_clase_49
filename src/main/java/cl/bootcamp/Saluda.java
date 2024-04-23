package cl.bootcamp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Saluda
 */
public class Saluda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		
		String variableNombre=request.getParameter("nombre");
		
		String html= """
				<html>
					<head>
						<title>Primer Java Web</title>
					</head>
					<body>
						<h1>Hola __variableNombre__</h1>					
						
					</body>
				</html>
				""".replace("__variableNombre__", variableNombre);
		out.println(html);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		
		String variableNombre=request.getParameter("nombre");
		
		String html= """
				<html>
					<head>
						<title>Primer Java Web</title>
					</head>
					<body>
						<h1>(POST)Hola __variableNombre__</h1>					
						
					</body>
				</html>
				""".replace("__variableNombre__", variableNombre);
		out.println(html);
	}
}
