package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class LoginJsp_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.html");
    _jspx_dependants.add("/footer.html");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<title>W3.CSS Template</title>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://fonts.googleapis.com/css?family=Raleway\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("<style>\n");
      out.write("body,h1 {font-family: \"Raleway\", Arial, sans-serif}\n");
      out.write("h1 {letter-spacing: 6px}\n");
      out.write(".w3-row-padding img {margin-bottom: 12px}\n");
      out.write(".background{background-color: #dedede;}\n");
      out.write("</style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- !PAGE CONTENT! -->\n");
      out.write("<!--<div class=\"w3-content\" style=\"max-width:1500px\">-->\n");
      out.write("\n");
      out.write("<!-- Header -->\n");
      out.write("<header class=\"w3-panel background w3-center w3-opacity\" style=\"margin:50px 16px\">\n");
      out.write("  <h1>National University Of Modern Languages</h1>\n");
      out.write("  \n");
      out.write("  <div class=\"w3-padding-32\">\n");
      out.write("    <div class=\"w3-bar w3-border\">\n");
      out.write("      <a href=\"mainjsp.jsp\" class=\"w3-bar-item w3-button\">Home</a>\n");
      out.write("      <a href=\"login.jsp\" class=\"w3-bar-item w3-button\">Login</a>\n");
      out.write("      <a href=\"ViewRecords.jsp\" class=\"w3-bar-item w3-button\">View</a>\n");
      out.write("      <a href=\"#\" class=\"w3-bar-item w3-button\">Register</a>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</header>");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1>Login</h1>  \n");
      out.write("    <form action=\"LoginServlet\" method=\"post\">  \n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"name\">Name:</label>\n");
      out.write("            <input type=\"text\" class=\"form-control\" name=\"name\" id=\"name\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <label for=\"password\">Password:</label>\n");
      out.write("            <input type=\"password\" class=\"form-control\" name=\"password\" id=\"password\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Login</button>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <a href=\"SignUpJsp.jsp\" type=\"submit\" class=\"btn btn-primary\">SignUp</a>\n");
      out.write("        </div>\n");
      out.write("    </form>  \n");
      out.write("    <br/>  \n");
      out.write("</div>\n");
      out.write("<!--</div>-->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      out.write("<footer class=\"w3-container w3-padding-64 w3-light-grey w3-center w3-large\"> \n");
      out.write("  <i class=\"fa fa-facebook-official w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-instagram w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-snapchat w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-pinterest-p w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-twitter w3-hover-opacity\"></i>\n");
      out.write("  <i class=\"fa fa-linkedin w3-hover-opacity\"></i>\n");
      out.write("  <p>Powered by <a href=\"https://www.w3schools.com/w3css/default.asp\" target=\"_blank\" class=\"w3-hover-text-green\">w3.css</a></p>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("</body>\n");
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
