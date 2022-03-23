package ps;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/index_to_suggestions_serv")
public class index_to_suggestions_serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		All_main_functions.retrive_current_enviroment_and_soil_conditions();
		 
		RequestDispatcher laplist=request.getRequestDispatcher("recormadations.jsp");
	    laplist.forward(request, response);
		
	      
	}

}
