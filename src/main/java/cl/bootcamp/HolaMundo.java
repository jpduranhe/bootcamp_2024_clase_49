package cl.bootcamp;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HolaMundo
 */
public class HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		response.setContentType("text/html");
		
		PrintWriter out=  response.getWriter();
		
		String html= """
				<html>
					<head>
						<title>Primer Java Web</title>
					</head>
					<body>
						<h1>Hola Mundo</h1>
						<h2>Primer Java Web</h2>						
						<form action="Saluda" method="post">
						<label>Nombre</label>
						 <input type="text" name="nombre"/>
						 <input type = "submit" value = "Enviar" />
						</form>
					</body>
				</html>
				""";
		out.println(html);
		
	}

}
