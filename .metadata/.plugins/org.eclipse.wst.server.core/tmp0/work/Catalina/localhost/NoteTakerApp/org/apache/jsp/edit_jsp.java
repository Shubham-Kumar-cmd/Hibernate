/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.63
 * Generated at: 2023-02-08 08:13:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.hibernate.Transaction;
import com.hibernate.model.Notes;
import org.hibernate.Session;
import com.hibernate.helper.FactoryProvider;
import org.hibernate.SessionFactory;

public final class edit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.jsp", Long.valueOf(1675795255741L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("org.hibernate.Transaction");
    _jspx_imports_classes.add("com.hibernate.helper.FactoryProvider");
    _jspx_imports_classes.add("org.hibernate.SessionFactory");
    _jspx_imports_classes.add("org.hibernate.Session");
    _jspx_imports_classes.add("com.hibernate.model.Notes");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    ");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<title>Header</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<nav class=\"navbar navbar-expand-lg navbar-primary bg-primary fixed-top\">\r\n");
      out.write("		<div class=\"container-fluid\">\r\n");
      out.write("			<a class=\"navbar-brand text-white\" href=\"addNotes.jsp\">NoteTaker</a>\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<ul class=\"navbar-nav me-auto mb-2 mb-lg-0\">\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link active text-white\"\r\n");
      out.write("						aria-current=\"page\" href=\"showAllNotes.jsp\">Show All Notes</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link text-white\" href=\"addNotes.jsp\">Add Notes</a></li>\r\n");
      out.write("					\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link text-white\" href=\"#\"\r\n");
      out.write("						tabindex=\"-1\" aria-disabled=\"false\">Disabled</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<form class=\"d-flex\">\r\n");
      out.write("					<input class=\"form-control me-2\" type=\"search\" placeholder=\"Search\"\r\n");
      out.write("						aria-label=\"Search\">\r\n");
      out.write("					<button class=\"btn btn-outline-light\" type=\"submit\">Search</button>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</nav>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\"\r\n");
      out.write("	integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("<title>Edit page</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container mt-5 pb-3\">\r\n");
      out.write("	<h1 class=\"title\">Add your notes</h1>\r\n");
      out.write("	");

	int noteid=Integer.parseInt(request.getParameter("note_id").trim());
	SessionFactory factory=FactoryProvider.getFactory();
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	
	Notes notes= s.get(Notes.class, noteid);
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<form action=\"updateServlet\" method=\"post\">\r\n");
      out.write("	<input type=\"hidden\" value=\"");
      out.print(notes.getId() );
      out.write("\" name=\"note_id\" />\r\n");
      out.write("		<div class=\"mb-3\">\r\n");
      out.write("			<label for=\"title\" class=\"form-label\">Title</label> \r\n");
      out.write("			<input type=\"text\" \r\n");
      out.write("			class=\"form-control\"\r\n");
      out.write("			id=\"title\" \r\n");
      out.write("			name=\"title\"\r\n");
      out.write("			aria-describedby=\"emailHelp\"\r\n");
      out.write("			placeholder=\"Enter Title\" \r\n");
      out.write("			required\r\n");
      out.write("			value=\"");
      out.print(notes.getTitle() );
      out.write("\">\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"mb-3\">\r\n");
      out.write("			<label for=\"content\" class=\"form-label\">Content</label> \r\n");
      out.write("			<textarea class=\"form-control\"\r\n");
      out.write("			id=\"content\" \r\n");
      out.write("			name=\"content\"\r\n");
      out.write("			rows=\"8\"\r\n");
      out.write("			aria-describedby=\"emailHelp\"\r\n");
      out.write("			placeholder=\"Write your content here\" \r\n");
      out.write("			required>");
      out.print(notes.getContent());
      out.write("</textarea>\r\n");
      out.write("			\r\n");
      out.write("		</div>\r\n");
      out.write("		<button type=\"submit\" class=\"btn btn-success button\">Update</button>\r\n");
      out.write("	</form>\r\n");
      out.write("	</div>\r\n");
      out.write("	");

	
	tx.commit();
	s.close();
	
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
