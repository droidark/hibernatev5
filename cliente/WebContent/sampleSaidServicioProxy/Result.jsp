<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSaidServicioProxyid" scope="session" class="com.frida.www.Said.SaidServicioProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSaidServicioProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleSaidServicioProxyid.getEndpoint();
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
        com.frida.www.Said.SaidServicio_PortType getSaidServicio_PortType5mtemp = sampleSaidServicioProxyid.getSaidServicio_PortType();
if(getSaidServicio_PortType5mtemp == null){
%>
<%=getSaidServicio_PortType5mtemp %>
<%
}else{
        if(getSaidServicio_PortType5mtemp!= null){
        String tempreturnp6 = getSaidServicio_PortType5mtemp.toString();
        %>
        <%=tempreturnp6%>
        <%
        }}
break;
case 8:
        gotMethod = true;
        String folioSC_2id=  request.getParameter("folioSC31");
            java.lang.String folioSC_2idTemp = null;
        if(!folioSC_2id.equals("")){
         folioSC_2idTemp  = folioSC_2id;
        }
        String movimiento_3id=  request.getParameter("movimiento33");
            java.lang.String movimiento_3idTemp = null;
        if(!movimiento_3id.equals("")){
         movimiento_3idTemp  = movimiento_3id;
        }
        String tipoConcentracion_4id=  request.getParameter("tipoConcentracion35");
            java.lang.String tipoConcentracion_4idTemp = null;
        if(!tipoConcentracion_4id.equals("")){
         tipoConcentracion_4idTemp  = tipoConcentracion_4id;
        }
        String claveOperador_5id=  request.getParameter("claveOperador37");
            java.lang.String claveOperador_5idTemp = null;
        if(!claveOperador_5id.equals("")){
         claveOperador_5idTemp  = claveOperador_5id;
        }
        String tipoContrato_6id=  request.getParameter("tipoContrato39");
            java.lang.String tipoContrato_6idTemp = null;
        if(!tipoContrato_6id.equals("")){
         tipoContrato_6idTemp  = tipoContrato_6id;
        }
        %>
        <jsp:useBean id="com1frida1www1Said1SolicitudColonia_1id" scope="session" class="com.frida.www.Said.SolicitudColonia" />
        <%
        com1frida1www1Said1SolicitudColonia_1id.setFolioSC(folioSC_2idTemp);
        com1frida1www1Said1SolicitudColonia_1id.setMovimiento(movimiento_3idTemp);
        com1frida1www1Said1SolicitudColonia_1id.setTipoConcentracion(tipoConcentracion_4idTemp);
        com1frida1www1Said1SolicitudColonia_1id.setClaveOperador(claveOperador_5idTemp);
        com1frida1www1Said1SolicitudColonia_1id.setTipoContrato(tipoContrato_6idTemp);
        %>
        <jsp:useBean id="com1frida1www1Said1ObjetoSaidConsultaContratacionColoniaRequest_0id" scope="session" class="com.frida.www.Said.ObjetoSaidConsultaContratacionColoniaRequest" />
        <%
        com1frida1www1Said1ObjetoSaidConsultaContratacionColoniaRequest_0id.setConsulContrata(com1frida1www1Said1SolicitudColonia_1id);
        com.frida.www.Said.ObjetoSaidConsultaContratacionColoniaResponse objetoSaidConsultaContratacionColonia8mtemp = sampleSaidServicioProxyid.objetoSaidConsultaContratacionColonia(com1frida1www1Said1ObjetoSaidConsultaContratacionColoniaRequest_0id);
if(objetoSaidConsultaContratacionColonia8mtemp == null){
%>
<%=objetoSaidConsultaContratacionColonia8mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">consulContratacion:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">folioSC:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
java.lang.String typefolioSC13 = tebece0.getFolioSC();
        String tempResultfolioSC13 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefolioSC13));
        %>
        <%= tempResultfolioSC13 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">error:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">descripError:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
com.frida.www.Said.Errores tebece1=tebece0.getError();
if(tebece1 != null){
java.lang.String typedescripError17 = tebece1.getDescripError();
        String tempResultdescripError17 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripError17));
        %>
        <%= tempResultdescripError17 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">codigoError:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
com.frida.www.Said.Errores tebece1=tebece0.getError();
if(tebece1 != null){
java.lang.String typecodigoError19 = tebece1.getCodigoError();
        String tempResultcodigoError19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodigoError19));
        %>
        <%= tempResultcodigoError19 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">tipoConcentracion:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
java.lang.String typetipoConcentracion21 = tebece0.getTipoConcentracion();
        String tempResulttipoConcentracion21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetipoConcentracion21));
        %>
        <%= tempResulttipoConcentracion21 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claveOperador:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
java.lang.String typeclaveOperador23 = tebece0.getClaveOperador();
        String tempResultclaveOperador23 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaveOperador23));
        %>
        <%= tempResultclaveOperador23 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">tipoContrato:</TD>
<TD>
<%
if(objetoSaidConsultaContratacionColonia8mtemp != null){
com.frida.www.Said.ConsultaColonia tebece0=objetoSaidConsultaContratacionColonia8mtemp.getConsulContratacion();
if(tebece0 != null){
java.lang.String typetipoContrato25 = tebece0.getTipoContrato();
        String tempResulttipoContrato25 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetipoContrato25));
        %>
        <%= tempResulttipoContrato25 %>
        <%
}}%>
</TD>
</TABLE>
<%
}
break;
case 41:
        gotMethod = true;
        String folioSC_9id=  request.getParameter("folioSC62");
            java.lang.String folioSC_9idTemp = null;
        if(!folioSC_9id.equals("")){
         folioSC_9idTemp  = folioSC_9id;
        }
        String movimiento_10id=  request.getParameter("movimiento64");
            java.lang.String movimiento_10idTemp = null;
        if(!movimiento_10id.equals("")){
         movimiento_10idTemp  = movimiento_10id;
        }
        String tipoConcentracion_11id=  request.getParameter("tipoConcentracion66");
            java.lang.String tipoConcentracion_11idTemp = null;
        if(!tipoConcentracion_11id.equals("")){
         tipoConcentracion_11idTemp  = tipoConcentracion_11id;
        }
        String claveOperador_12id=  request.getParameter("claveOperador68");
            java.lang.String claveOperador_12idTemp = null;
        if(!claveOperador_12id.equals("")){
         claveOperador_12idTemp  = claveOperador_12id;
        }
        String tipoContrato_13id=  request.getParameter("tipoContrato70");
            java.lang.String tipoContrato_13idTemp = null;
        if(!tipoContrato_13id.equals("")){
         tipoContrato_13idTemp  = tipoContrato_13id;
        }
        %>
        <jsp:useBean id="com1frida1www1Said1SolicitudPCAI_8id" scope="session" class="com.frida.www.Said.SolicitudPCAI" />
        <%
        com1frida1www1Said1SolicitudPCAI_8id.setFolioSC(folioSC_9idTemp);
        com1frida1www1Said1SolicitudPCAI_8id.setMovimiento(movimiento_10idTemp);
        com1frida1www1Said1SolicitudPCAI_8id.setTipoConcentracion(tipoConcentracion_11idTemp);
        com1frida1www1Said1SolicitudPCAI_8id.setClaveOperador(claveOperador_12idTemp);
        com1frida1www1Said1SolicitudPCAI_8id.setTipoContrato(tipoContrato_13idTemp);
        %>
        <jsp:useBean id="com1frida1www1Said1ObjetoSaidRequest_7id" scope="session" class="com.frida.www.Said.ObjetoSaidRequest" />
        <%
        com1frida1www1Said1ObjetoSaidRequest_7id.setPcai(com1frida1www1Said1SolicitudPCAI_8id);
        com.frida.www.Said.ObjetoSaidResponse objetoSaid41mtemp = sampleSaidServicioProxyid.objetoSaid(com1frida1www1Said1ObjetoSaidRequest_7id);
if(objetoSaid41mtemp == null){
%>
<%=objetoSaid41mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD COLSPAN="2" ALIGN="LEFT">objSc:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">folioSC:</TD>
<TD>
<%
if(objetoSaid41mtemp != null){
com.frida.www.Said.ObjectSc tebece0=objetoSaid41mtemp.getObjSc();
if(tebece0 != null){
java.lang.String typefolioSC46 = tebece0.getFolioSC();
        String tempResultfolioSC46 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typefolioSC46));
        %>
        <%= tempResultfolioSC46 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">err:</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">descripError:</TD>
<TD>
<%
if(objetoSaid41mtemp != null){
com.frida.www.Said.ObjectSc tebece0=objetoSaid41mtemp.getObjSc();
if(tebece0 != null){
com.frida.www.Said.Errores tebece1=tebece0.getErr();
if(tebece1 != null){
java.lang.String typedescripError50 = tebece1.getDescripError();
        String tempResultdescripError50 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typedescripError50));
        %>
        <%= tempResultdescripError50 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="0" ALIGN="LEFT">codigoError:</TD>
<TD>
<%
if(objetoSaid41mtemp != null){
com.frida.www.Said.ObjectSc tebece0=objetoSaid41mtemp.getObjSc();
if(tebece0 != null){
com.frida.www.Said.Errores tebece1=tebece0.getErr();
if(tebece1 != null){
java.lang.String typecodigoError52 = tebece1.getCodigoError();
        String tempResultcodigoError52 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typecodigoError52));
        %>
        <%= tempResultcodigoError52 %>
        <%
}}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">tipoConcentracion:</TD>
<TD>
<%
if(objetoSaid41mtemp != null){
com.frida.www.Said.ObjectSc tebece0=objetoSaid41mtemp.getObjSc();
if(tebece0 != null){
java.lang.String typetipoConcentracion54 = tebece0.getTipoConcentracion();
        String tempResulttipoConcentracion54 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typetipoConcentracion54));
        %>
        <%= tempResulttipoConcentracion54 %>
        <%
}}%>
</TD>
<TR>
<TD WIDTH="5%"></TD>
<TD WIDTH="5%"></TD>
<TD COLSPAN="1" ALIGN="LEFT">claveOperador:</TD>
<TD>
<%
if(objetoSaid41mtemp != null){
com.frida.www.Said.ObjectSc tebece0=objetoSaid41mtemp.getObjSc();
if(tebece0 != null){
java.lang.String typeclaveOperador56 = tebece0.getClaveOperador();
        String tempResultclaveOperador56 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(typeclaveOperador56));
        %>
        <%= tempResultclaveOperador56 %>
        <%
}}%>
</TD>
</TABLE>
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