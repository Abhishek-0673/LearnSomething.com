package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class start_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/start.css\" rel=\"stylesheet\">\n");
      out.write("   \n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("<body>\n");
      out.write("    <style>\n");
      out.write("      .btn  a{\n");
      out.write("        text-decoration: none;\n");
      out.write("        }\n");
      out.write("        </style>\n");
      out.write("  <div id=\"particles-js\">\n");
      out.write("     \n");
      out.write("    <div class=\"img\">\n");
      out.write("        <img src=\"img/codecycle.gif\">\n");
      out.write("  <div class=\"btn btn-default ld-ext-right\" style=\"font-size:2em\">\n");
      out.write("      <a href=\"login_user.jsp\"> Lets Start</a>\n");
      out.write("  <div class=\"ld ld-ring ld-spin-fast\"></div>\n");
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("\n");
      out.write("  <script src=\"js/particles.min.js\"></script>\n");
      out.write("\n");
      out.write("  <script>\n");
      out.write("    particlesJS.load('particles-js', 'start.json', function(){\n");
      out.write("      console.log('particles.json loaded...');\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write(" ");
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
