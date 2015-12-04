package com.telmex.wdm.pojo;

public class NodosWdm {
	
	private String label;
	private String tecnologia;
	private String topologico;
	
	public NodosWdm(String label, String tecnologia, String topologico) {
		this.label = label;
		this.tecnologia = tecnologia;
		this.topologico = topologico;
	}
	
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTecnologia() {
		return tecnologia;
	}
	public void setTecnologia(String tecnologia) {
		this.tecnologia = tecnologia;
	}
	public String getTopologico() {
		return topologico;
	}
	public void setTopologico(String topologico) {
		this.topologico = topologico;
	}
	
	

}
