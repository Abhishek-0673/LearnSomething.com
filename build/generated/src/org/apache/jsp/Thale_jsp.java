package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Thale_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"Thale.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\" >\n");
      out.write("            <div class=\"container1\" style=\"border:2px solid #122b40\" style=\"border-radius:20px \">\n");
      out.write("                <center>\n");
      out.write("                <h1>Enter The Credentials</h1>\n");
      out.write("                </center>\n");
      out.write("            </div>\n");
      out.write("            <!--<center>-->\n");
      out.write("            <form action=\"Continue\" method=\"get\" class=\"sir\">\n");
      out.write("            <label>Firstname</label>\n");
      out.write("      <input type=\"text\" name=\"firstname\" placeholder=\"Firstname\" required>\n");
      out.write("     <br><br>\n");
      out.write("       <label for=\"lname\">Lastname</label>\n");
      out.write("      <input type=\"text\"  name=\"lastname\" placeholder=\"Lastname\" required>\n");
      out.write("      <br><br>\n");
      out.write("      <label for=\"usn\">USN</label>\n");
      out.write("    <input type=\"text\" name=\"usn\"  placeholder=\"USN\" required>\n");
      out.write("    <br><br>\n");
      out.write("     <label for=\"email\">E-mail</label>\n");
      out.write("    <input type=\"email\"  name=\"email\" placeholder=\"E-mail\" required>\n");
      out.write("    <br><br>\n");
      out.write("    <label for=\"phone\">Phone</label>\n");
      out.write("    <input type=\"text\" name=\"phone\" placeholder=\"Phone\" required>\n");
      out.write("    <br><br>\n");
      out.write("     <label for=\"course\">Course</label>\n");
      out.write("      <select  name=\"course\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"BE\">BE</option>\n");
      out.write("        <option value=\"Diplomo\">Diplomo</option>\n");
      out.write("        <option value=\"Btech\">Btech</option>\n");
      out.write("      </select>\n");
      out.write("      &nbsp; &nbsp; &nbsp;\n");
      out.write("      <label  for=\"branch\">Branch</label>\n");
      out.write("      <select  name=\"branch\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"CSE\">CSE</option>\n");
      out.write("        <option value=\"ECE\">ECE</option>\n");
      out.write("        <option value=\"ME\">ME</option>\n");
      out.write("      </select>\n");
      out.write("      <br><br>\n");
      out.write("      <label for=\"semester\">Semester</label>\n");
      out.write("      <select  name=\"semester\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"I\">I</option>\n");
      out.write("        <option value=\"II\">II</option>\n");
      out.write("        <option value=\"III\">III</option>\n");
      out.write("        <option value=\"IV\">IV</option>\n");
      out.write("        <option value=\"V\">V</option>\n");
      out.write("      </select>\n");
      out.write("      &nbsp; &nbsp; &nbsp;\n");
      out.write("      <label for=\"type\">Type</label>\n");
      out.write("      <select name=\"type\" required>\n");
      out.write("        <option selected>Choose..</option>\n");
      out.write("        <option value=\"User\">User</option>\n");
      out.write("        <option value=\"Admin\">Admin</option>\n");
      out.write("        \n");
      out.write("      </select>\n");
      out.write("      <br><br>\n");
      out.write("       <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\n");
      out.write("       </form>\n");
      out.write("                       <!--</center>-->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
