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
		
		List<plant_details> best5=All_main_functions.get_suggestions();
		
		System.out.print("finisedh execulting the fucntion");
		
		plant_details pl1,pl2,pl3,pl4,pl5;
		
		pl1=best5.get(0);
		pl2=best5.get(1);
		pl3=best5.get(2);
		pl4=best5.get(3);
		pl5=best5.get(4);
		
		pl1.print_details();
		pl2.print_details();
		pl3.print_details();
		
		
		request.setAttribute("plant1",pl1);
        request.setAttribute("plant2",pl2);
        request.setAttribute("plant3",pl3);
        request.setAttribute("plant4",pl4);
        request.setAttribute("plant5",pl5);
        
        request.setAttribute("plt",best5);
		 
		RequestDispatcher laplist=request.getRequestDispatcher("card.jsp");
	    laplist.forward(request, response);
		
	      
	}

}
