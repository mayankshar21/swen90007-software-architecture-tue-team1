package scripts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datasource.RecyclingServiceMapper;
import dbdomainmiddleware.UnitOfWork;
import domain.DestructionService;
import domain.RecyclingService;
import domain.ReuseService;
import domain.Status;

@WebServlet("/CreateService")
public class RequestServiceScript extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String serviceType = request.getParameter("servicetype");
		String address = request.getParameter("address");
		String serviceDescription = request.getParameter("servicedescription");
		String bookingDate = request.getParameter("bookingdate");
		String bookingTime = request.getParameter("bookingtime");
		String bookingDateTime = bookingDate + " " + bookingTime;
		
		if(serviceType.equals("Recycling")) {
			boolean result = RecyclingService.createRecyclingService("Customer1", "newAdmin", 111, address, bookingDateTime, Status.APPROVED, serviceDescription, "0%", "ME");
			PrintWriter out = response.getWriter();
			if (result) {
				out.println("successfully entered");
			} else {
				out.println("Failed");
				
				try {
					UnitOfWork.getCurrent().commit();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		} else if (serviceType.equals("Reuse")) {
			//ReuseService reuseService = new ReuseService("admin", address, bookingDateTime, serviceDescription);
		} else if (serviceType.equals("Destruction")) {
			//DestructionService destructionService = new DestructionService("admin", address, bookingDate, bookingTime, serviceDescription);
		}
	}

}
