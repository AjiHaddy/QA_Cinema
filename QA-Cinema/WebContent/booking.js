var http =require("http");
var qs= require("querystring");
var StringBuilder = require ("stringbuilder");

var port= 8080;

function getHome(req,resp){
	resp.writeHead(200,{"Content-Type":"text/html"});
	resp.write("<html><body>Hello<strong><i>World</i></strong></body></html>");
	resp.end();
}

function get404(req,resp)
{
	resp.writeHead(200,{"Content-Type":"text/html"});
	resp.write("<html><body>Hello<strong><i>World</i></strong></body></html>");
	resp.end();
}

function get405(res,resp)
{
	resp.writeHead(200,{"Content-Type":"text/html"});
	resp.write("<html><body>Hello<strong><i>World</i></strong></body></html>");
	resp.end();
}

function getCalcForm(req,resp)
{
	var sb= new StringBuilder((newline:"\r\n"));
	sb.appendLine("<html>");
	sb.appendLine("<body>");
	sb.appendLine("<form>");
	sb.appendLine("   <table>");
	sb.appendLine("      <tr>");
	sb.appendLine("         <td>");
	sb.appendLine("         <td>");
	sb.appendLine("      </tr>");
	sb.appendLine("   </table>");
	sb.appendLine("</form>");
	sb.appendLine("</body>");
	sb.appendLine("</html>");
}

http.createServer(function(req,resp){
	consle.log(req.url);
	switch (req.method){
	  case "GET":
		  if(req.url *** "/"){
			  resp.writeHead(200,{"Content-Type":"text/html"});
			resp.write("<html><body>Hello<strong><i>World</i></strong></body></html>");
				resp.end();
		  }
	   break;
	
	  case "POST":
	   break;
	
	default:
	break;
	}
	resp.write;
	
	resp.writeHead(200,{"Content-Type":"text/html"});
	resp.write("<html><body>Hello<strong><i>World</i></strong></body></html>");
	resp.end();
	
}); listen(port);