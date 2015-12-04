package com.telmex.wdm.model;

import java.util.Date;

public class CatWdm {
	
	private int id;
	private String siglasCentral;
	private String clliCentral;
	private String wdm;
	private String proveedorTx;
	private String nodoAdmConexAdsl;
	private String clliAdmConexAdsl;
	private String admUninet;
	private String clliAdmUninet;
	private String estado;
	private String area;
	private String region;
	private String ciudad;
	private String ciudad2;
	private String division;
	private String ubiNodoAdm;
	private String sitio;
	private String dominioGest;
	private String repadmConxadsl;
	private String capacidad;
	private String tecnologia;
	private String nodoGne;
	private String cllie;
	private String anilloPp;
	private String tipoWdm;
	private String ospf;
	private String repisa;
	private String refSisa;
	private String idNodo;
	private String ipSistema;
	private String idInterSistema;
	private String ipGestion;
	private String idInterGestion;
	private String interGest;
	private String clliEquipo;
	private String repisaBdfo;
	private String clliEquipoRepisaBdfo;
	private String trayectorias;
	private String estatusCns;
	private String fase;
	private String faseCeth;
	private String login;
	private Date fechaAlta;
	private Date fechaOperacion;
	private String ptoOrigenRcdt;
	private String ipOrigenRcdt;
	private String idPuertoOrigenRcdt;
	private String topologia;
	private String topologico;
	private String otNodo;
	private String numOtFrida;
	private String observaciones;
	private Date fechaEstatusCns;
	private String versionNodo;
	private String remateCd1;
	private String longCable1;
	private String calCable1;
	private String bdcd1;
	private String capBreak1;
	private String remateCd2;
	private String longCable2;
	private String calCable2;
	private String bdcd2;
	private String capBreak2;
	private String anexoOt;
	private String pdu1CapBreak1;
	private String pdu1PosBreak1;
	private String pdu1PosBreak2;
	private String pdu2CapBreak1;
	private String pdu2PosBreak1;
	private String pdu2PosBreak2;
	private String pdu3CapBreak1;
	private String pdu3PosBreak1;
	private String pdu3PosBreak2;
	private String bitacora;
	private String numIntervencion;
	private String neid;
	private String repadmConxadslDet;
	
	public CatWdm(){}
	
	public CatWdm(int id, String siglasCentral, String clliCentral, String wdm, String proveedorTx,
			String nodoAdmConexAdsl, String clliAdmConexAdsl, String admUninet, String clliAdmUninet, String estado,
			String area, String region, String ciudad, String ciudad2, String division, String ubiNodoAdm, String sitio,
			String dominioGest, String repadmConxadsl, String capacidad, String tecnologia, String nodoGne,
			String cllie, String anilloPp, String tipoWdm, String ospf, String repisa, String refSisa, String idNodo,
			String ipSistema, String idInterSistema, String ipGestion, String idInterGestion, String interGest,
			String clliEquipo, String repisaBdfo, String clliEquipoRepisaBdfo, String trayectorias, String estatusCns,
			String fase, String faseCeth, String login, Date fechaAlta, Date fechaOperacion, String ptoOrigenRcdt,
			String ipOrigenRcdt, String idPuertoOrigenRcdt, String topologia, String topologico, String otNodo,
			String numOtFrida, String observaciones, Date fechaEstatusCns, String versionNodo, String remateCd1,
			String longCable1, String calCable1, String bdcd1, String capBreak1, String remateCd2, String longCable2,
			String calCable2, String bdcd2, String capBreak2, String anexoOt, String pdu1CapBreak1,
			String pdu1PosBreak1, String pdu1PosBreak2, String pdu2CapBreak1, String pdu2PosBreak1,
			String pdu2PosBreak2, String pdu3CapBreak1, String pdu3PosBreak1, String pdu3PosBreak2, String bitacora,
			String numIntervencion, String neid, String repadmConxadslDet) {
		super();
		this.id = id;
		this.siglasCentral = siglasCentral;
		this.clliCentral = clliCentral;
		this.wdm = wdm;
		this.proveedorTx = proveedorTx;
		this.nodoAdmConexAdsl = nodoAdmConexAdsl;
		this.clliAdmConexAdsl = clliAdmConexAdsl;
		this.admUninet = admUninet;
		this.clliAdmUninet = clliAdmUninet;
		this.estado = estado;
		this.area = area;
		this.region = region;
		this.ciudad = ciudad;
		this.ciudad2 = ciudad2;
		this.division = division;
		this.ubiNodoAdm = ubiNodoAdm;
		this.sitio = sitio;
		this.dominioGest = dominioGest;
		this.repadmConxadsl = repadmConxadsl;
		this.capacidad = capacidad;
		this.tecnologia = tecnologia;
		this.nodoGne = nodoGne;
		this.cllie = cllie;
		this.anilloPp = anilloPp;
		this.tipoWdm = tipoWdm;
		this.ospf = ospf;
		this.repisa = repisa;
		this.refSisa = refSisa;
		this.idNodo = idNodo;
		this.ipSistema = ipSistema;
		this.idInterSistema = idInterSistema;
		this.ipGestion = ipGestion;
		this.idInterGestion = idInterGestion;
		this.interGest = interGest;
		this.clliEquipo = clliEquipo;
		this.repisaBdfo = repisaBdfo;
		this.clliEquipoRepisaBdfo = clliEquipoRepisaBdfo;
		this.trayectorias = trayectorias;
		this.estatusCns = estatusCns;
		this.fase = fase;
		this.faseCeth = faseCeth;
		this.login = login;
		this.fechaAlta = fechaAlta;
		this.fechaOperacion = fechaOperacion;
		this.ptoOrigenRcdt = ptoOrigenRcdt;
		this.ipOrigenRcdt = ipOrigenRcdt;
		this.idPuertoOrigenRcdt = idPuertoOrigenRcdt;
		this.topologia = topologia;
		this.topologico = topologico;
		this.otNodo = otNodo;
		this.numOtFrida = numOtFrida;
		this.observaciones = observaciones;
		this.fechaEstatusCns = fechaEstatusCns;
		this.versionNodo = versionNodo;
		this.remateCd1 = remateCd1;
		this.longCable1 = longCable1;
		this.calCable1 = calCable1;
		this.bdcd1 = bdcd1;
		this.capBreak1 = capBreak1;
		this.remateCd2 = remateCd2;
		this.longCable2 = longCable2;
		this.calCable2 = calCable2;
		this.bdcd2 = bdcd2;
		this.capBreak2 = capBreak2;
		this.anexoOt = anexoOt;
		this.pdu1CapBreak1 = pdu1CapBreak1;
		this.pdu1PosBreak1 = pdu1PosBreak1;
		this.pdu1PosBreak2 = pdu1PosBreak2;
		this.pdu2CapBreak1 = pdu2CapBreak1;
		this.pdu2PosBreak1 = pdu2PosBreak1;
		this.pdu2PosBreak2 = pdu2PosBreak2;
		this.pdu3CapBreak1 = pdu3CapBreak1;
		this.pdu3PosBreak1 = pdu3PosBreak1;
		this.pdu3PosBreak2 = pdu3PosBreak2;
		this.bitacora = bitacora;
		this.numIntervencion = numIntervencion;
		this.neid = neid;
		this.repadmConxadslDet = repadmConxadslDet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSiglasCentral() {
		return siglasCentral;
	}
	public void setSiglasCentral(String siglasCentral) {
		this.siglasCentral = siglasCentral;
	}
	public String getClliCentral() {
		return clliCentral;
	}
	public void setClliCentral(String clliCentral) {
		this.clliCentral = clliCentral;
	}
	public String getWdm() {
		return wdm;
	}
	public void setWdm(String wdm) {
		this.wdm = wdm;
	}
	public String getProveedorTx() {
		return proveedorTx;
	}
	public void setProveedorTx(String proveedorTx) {
		this.proveedorTx = proveedorTx;
	}
	public String getNodoAdmConexAdsl() {
		return nodoAdmConexAdsl;
	}
	public void setNodoAdmConexAdsl(String nodoAdmConexAdsl) {
		this.nodoAdmConexAdsl = nodoAdmConexAdsl;
	}
	public String getClliAdmConexAdsl() {
		return clliAdmConexAdsl;
	}
	public void setClliAdmConexAdsl(String clliAdmConexAdsl) {
		this.clliAdmConexAdsl = clliAdmConexAdsl;
	}
	public String getAdmUninet() {
		return admUninet;
	}
	public void setAdmUninet(String admUninet) {
		this.admUninet = admUninet;
	}
	public String getClliAdmUninet() {
		return clliAdmUninet;
	}
	public void setClliAdmUninet(String clliAdmUninet) {
		this.clliAdmUninet = clliAdmUninet;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getCiudad2() {
		return ciudad2;
	}
	public void setCiudad2(String ciudad2) {
		this.ciudad2 = ciudad2;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getUbiNodoAdm() {
		return ubiNodoAdm;
	}
	public void setUbiNodoAdm(String ubiNodoAdm) {
		this.ubiNodoAdm = ubiNodoAdm;
	}
	public String getSitio() {
		return sitio;
	}
	public void setSitio(String sitio) {
		this.sitio = sitio;
	}
	public String getDominioGest() {
		return dominioGest;
	}
	public void setDominioGest(String dominioGest) {
		this.dominioGest = dominioGest;
	}
	public String getRepadmConxadsl() {
		return repadmConxadsl;
	}
	public void setRepadmConxadsl(String repadmConxadsl) {
		this.repadmConxadsl = repadmConxadsl;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String getNodoGne() {
		return nodoGne;
	}
	public void setNodoGne(String nodoGne) {
		this.nodoGne = nodoGne;
	}
	public String getCllie() {
		return cllie;
	}
	public void setCllie(String cllie) {
		this.cllie = cllie;
	}
	public String getAnilloPp() {
		return anilloPp;
	}
	public void setAnilloPp(String anilloPp) {
		this.anilloPp = anilloPp;
	}
	public String getTipoWdm() {
		return tipoWdm;
	}
	public void setTipoWdm(String tipoWdm) {
		this.tipoWdm = tipoWdm;
	}
	public String getOspf() {
		return ospf;
	}
	public void setOspf(String ospf) {
		this.ospf = ospf;
	}
	public String getRepisa() {
		return repisa;
	}
	public void setRepisa(String repisa) {
		this.repisa = repisa;
	}
	public String getRefSisa() {
		return refSisa;
	}
	public void setRefSisa(String refSisa) {
		this.refSisa = refSisa;
	}
	public String getIdNodo() {
		return idNodo;
	}
	public void setIdNodo(String idNodo) {
		this.idNodo = idNodo;
	}
	public String getIpSistema() {
		return ipSistema;
	}
	public void setIpSistema(String ipSistema) {
		this.ipSistema = ipSistema;
	}
	public String getIdInterSistema() {
		return idInterSistema;
	}
	public void setIdInterSistema(String idInterSistema) {
		this.idInterSistema = idInterSistema;
	}
	public String getIpGestion() {
		return ipGestion;
	}
	public void setIpGestion(String ipGestion) {
		this.ipGestion = ipGestion;
	}
	public String getIdInterGestion() {
		return idInterGestion;
	}
	public void setIdInterGestion(String idInterGestion) {
		this.idInterGestion = idInterGestion;
	}
	public String getInterGest() {
		return interGest;
	}
	public void setInterGest(String interGest) {
		this.interGest = interGest;
	}
	public String getClliEquipo() {
		return clliEquipo;
	}
	public void setClliEquipo(String clliEquipo) {
		this.clliEquipo = clliEquipo;
	}
	public String getRepisaBdfo() {
		return repisaBdfo;
	}
	public void setRepisaBdfo(String repisaBdfo) {
		this.repisaBdfo = repisaBdfo;
	}
	public String getClliEquipoRepisaBdfo() {
		return clliEquipoRepisaBdfo;
	}
	public void setClliEquipoRepisaBdfo(String clliEquipoRepisaBdfo) {
		this.clliEquipoRepisaBdfo = clliEquipoRepisaBdfo;
	}
	public String getTrayectorias() {
		return trayectorias;
	}
	public void setTrayectorias(String trayectorias) {
		this.trayectorias = trayectorias;
	}
	public String getEstatusCns() {
		return estatusCns;
	}
	public void setEstatusCns(String estatusCns) {
		this.estatusCns = estatusCns;
	}
	public String getFase() {
		return fase;
	}
	public void setFase(String fase) {
		this.fase = fase;
	}
	public String getFaseCeth() {
		return faseCeth;
	}
	public void setFaseCeth(String faseCeth) {
		this.faseCeth = faseCeth;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public String getPtoOrigenRcdt() {
		return ptoOrigenRcdt;
	}
	public void setPtoOrigenRcdt(String ptoOrigenRcdt) {
		this.ptoOrigenRcdt = ptoOrigenRcdt;
	}
	public String getIpOrigenRcdt() {
		return ipOrigenRcdt;
	}
	public void setIpOrigenRcdt(String ipOrigenRcdt) {
		this.ipOrigenRcdt = ipOrigenRcdt;
	}
	public String getIdPuertoOrigenRcdt() {
		return idPuertoOrigenRcdt;
	}
	public void setIdPuertoOrigenRcdt(String idPuertoOrigenRcdt) {
		this.idPuertoOrigenRcdt = idPuertoOrigenRcdt;
	}
	public String getTopologia() {
		return topologia;
	}
	public void setTopologia(String topologia) {
		this.topologia = topologia;
	}
	public String getTopologico() {
		return topologico;
	}
	public void setTopologico(String topologico) {
		this.topologico = topologico;
	}
	public String getOtNodo() {
		return otNodo;
	}
	public void setOtNodo(String otNodo) {
		this.otNodo = otNodo;
	}
	public String getNumOtFrida() {
		return numOtFrida;
	}
	public void setNumOtFrida(String numOtFrida) {
		this.numOtFrida = numOtFrida;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Date getFechaEstatusCns() {
		return fechaEstatusCns;
	}
	public void setFechaEstatusCns(Date fechaEstatusCns) {
		this.fechaEstatusCns = fechaEstatusCns;
	}
	public String getVersionNodo() {
		return versionNodo;
	}
	public void setVersionNodo(String versionNodo) {
		this.versionNodo = versionNodo;
	}
	public String getRemateCd1() {
		return remateCd1;
	}
	public void setRemateCd1(String remateCd1) {
		this.remateCd1 = remateCd1;
	}
	public String getLongCable1() {
		return longCable1;
	}
	public void setLongCable1(String longCable1) {
		this.longCable1 = longCable1;
	}
	public String getCalCable1() {
		return calCable1;
	}
	public void setCalCable1(String calCable1) {
		this.calCable1 = calCable1;
	}
	public String getBdcd1() {
		return bdcd1;
	}
	public void setBdcd1(String bdcd1) {
		this.bdcd1 = bdcd1;
	}
	public String getCapBreak1() {
		return capBreak1;
	}
	public void setCapBreak1(String capBreak1) {
		this.capBreak1 = capBreak1;
	}
	public String getRemateCd2() {
		return remateCd2;
	}
	public void setRemateCd2(String remateCd2) {
		this.remateCd2 = remateCd2;
	}
	public String getLongCable2() {
		return longCable2;
	}
	public void setLongCable2(String longCable2) {
		this.longCable2 = longCable2;
	}
	public String getCalCable2() {
		return calCable2;
	}
	public void setCalCable2(String calCable2) {
		this.calCable2 = calCable2;
	}
	public String getBdcd2() {
		return bdcd2;
	}
	public void setBdcd2(String bdcd2) {
		this.bdcd2 = bdcd2;
	}
	public String getCapBreak2() {
		return capBreak2;
	}
	public void setCapBreak2(String capBreak2) {
		this.capBreak2 = capBreak2;
	}
	public String getAnexoOt() {
		return anexoOt;
	}
	public void setAnexoOt(String anexoOt) {
		this.anexoOt = anexoOt;
	}
	public String getPdu1CapBreak1() {
		return pdu1CapBreak1;
	}
	public void setPdu1CapBreak1(String pdu1CapBreak1) {
		this.pdu1CapBreak1 = pdu1CapBreak1;
	}
	public String getPdu1PosBreak1() {
		return pdu1PosBreak1;
	}
	public void setPdu1PosBreak1(String pdu1PosBreak1) {
		this.pdu1PosBreak1 = pdu1PosBreak1;
	}
	public String getPdu1PosBreak2() {
		return pdu1PosBreak2;
	}
	public void setPdu1PosBreak2(String pdu1PosBreak2) {
		this.pdu1PosBreak2 = pdu1PosBreak2;
	}
	public String getPdu2CapBreak1() {
		return pdu2CapBreak1;
	}
	public void setPdu2CapBreak1(String pdu2CapBreak1) {
		this.pdu2CapBreak1 = pdu2CapBreak1;
	}
	public String getPdu2PosBreak1() {
		return pdu2PosBreak1;
	}
	public void setPdu2PosBreak1(String pdu2PosBreak1) {
		this.pdu2PosBreak1 = pdu2PosBreak1;
	}
	public String getPdu2PosBreak2() {
		return pdu2PosBreak2;
	}
	public void setPdu2PosBreak2(String pdu2PosBreak2) {
		this.pdu2PosBreak2 = pdu2PosBreak2;
	}
	public String getPdu3CapBreak1() {
		return pdu3CapBreak1;
	}
	public void setPdu3CapBreak1(String pdu3CapBreak1) {
		this.pdu3CapBreak1 = pdu3CapBreak1;
	}
	public String getPdu3PosBreak1() {
		return pdu3PosBreak1;
	}
	public void setPdu3PosBreak1(String pdu3PosBreak1) {
		this.pdu3PosBreak1 = pdu3PosBreak1;
	}
	public String getPdu3PosBreak2() {
		return pdu3PosBreak2;
	}
	public void setPdu3PosBreak2(String pdu3PosBreak2) {
		this.pdu3PosBreak2 = pdu3PosBreak2;
	}
	public String getBitacora() {
		return bitacora;
	}
	public void setBitacora(String bitacora) {
		this.bitacora = bitacora;
	}
	public String getNumIntervencion() {
		return numIntervencion;
	}
	public void setNumIntervencion(String numIntervencion) {
		this.numIntervencion = numIntervencion;
	}
	public String getNeid() {
		return neid;
	}
	public void setNeid(String neid) {
		this.neid = neid;
	}
	public String getRepadmConxadslDet() {
		return repadmConxadslDet;
	}
	public void setRepadmConxadslDet(String repadmConxadslDet) {
		this.repadmConxadslDet = repadmConxadslDet;
	}
}
