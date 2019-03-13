package com.everis.vivo.fsreader;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Reader extends HttpServlet {

	public void init() throws ServletException {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("XXX go...");

		response.setContentType("application/json");

		PrintWriter out = response.getWriter();

		String test = request.getParameter("test");
		if (test != null) {
			System.out.println(" XXX test !!!");

			out.println("EBA D");
		} else {
			
			
			File file = new File("/tmp/regression_test/data.json");
			FileInputStream fis = null;
			try {
				fis = new FileInputStream(file);

				int content;
				while ((content = fis.read()) != -1) {
					out.print((char) content);
				}
				out.println();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					if (fis != null)
						fis.close();
				} catch (IOException ex) {
					ex.printStackTrace();
				}
			}
			
			
			
		
		
		
		
		
		
		
		
		}

	}

	public void destroy() {
	}


}