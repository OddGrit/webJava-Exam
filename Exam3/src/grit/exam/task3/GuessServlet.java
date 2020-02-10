package grit.exam.task3;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GuessServlet
 */
@WebServlet("/guess")
public class GuessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuessServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//cannot receive player
		Player player = (Player)request.getAttribute("player"); 
		
		if (player.guess(request.getParameter("guess"))) {
		
			response.getWriter().append("you won");
			player.restart();
			
		}
		
		
		request.getRequestDispatcher("play.jsp").include(request, response);
	}

}
