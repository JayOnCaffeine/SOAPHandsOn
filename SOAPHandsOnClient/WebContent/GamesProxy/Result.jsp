<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="GamesProxyid" scope="session" class="com.olympics.GamesProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
GamesProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = GamesProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        GamesProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        com.olympics.Games getGames10mtemp = GamesProxyid.getGames();
if(getGames10mtemp == null){
%>
<%=getGames10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String gameName_1id=  request.getParameter("gameName18");
            java.lang.String gameName_1idTemp = null;
        if(!gameName_1id.equals("")){
         gameName_1idTemp  = gameName_1id;
        }
        java.lang.String getGameInfo15mtemp = GamesProxyid.getGameInfo(gameName_1idTemp);
if(getGameInfo15mtemp == null){
%>
<%=getGameInfo15mtemp %>
<%
}else{
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getGameInfo15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String gameName_2id=  request.getParameter("gameName23");
            java.lang.String gameName_2idTemp = null;
        if(!gameName_2id.equals("")){
         gameName_2idTemp  = gameName_2id;
        }
        java.lang.String getPlayerDetails20mtemp = GamesProxyid.getPlayerDetails(gameName_2idTemp);
if(getPlayerDetails20mtemp == null){
%>
<%=getPlayerDetails20mtemp %>
<%
}else{
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getPlayerDetails20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
}
break;
case 25:
        gotMethod = true;
        java.lang.String getGameList25mtemp = GamesProxyid.getGameList();
if(getGameList25mtemp == null){
%>
<%=getGameList25mtemp %>
<%
}else{
        String tempResultreturnp26 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getGameList25mtemp));
        %>
        <%= tempResultreturnp26 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>