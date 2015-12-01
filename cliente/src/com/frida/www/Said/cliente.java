package com.frida.www.Said;

import java.rmi.RemoteException;

import org.apache.catalina.connector.Request;

public class cliente {

	public static void main(String[] args) {
		SolicitudPCAI j=new SolicitudPCAI();
		j.setClaveOperador("wqlwjqwklj");
		j.setFolioSC("sddswdsdsd");
		j.setMovimiento("CONASULTA");
		String[] siglas={"ar","gtr","ajshjahsj","assakaskjdhjsd","cdjsgdhsgdh","sdsdhfjkdsfhj"};
		j.setSiglas(siglas);
		j.setTipoContrato("sasdsdsd");
		j.setTipoConcentracion("CLIENTE JAVA2");
		ObjetoSaidRequest oj=new ObjetoSaidRequest();
		oj.setPcai(j);
		
		
		SaidServicio_ServiceLocator servicio=new SaidServicio_ServiceLocator();
		try {
			SaidServicio_PortType k=servicio.getSaidServicioSoap11();
			try {
				ObjetoSaidResponse ki=k.objetoSaid(oj);
				ObjectSc objeto=ki.getObjSc();
				Errores  issu=objeto.getErr();
				try{
					issu=null;
					if(issu.getCodigoError()!=null){
						System.out.println("ESTAN MAL");
					}
				
						
				}
				catch(NullPointerException e){
					System.out.println("Correcto");
					System.out.println(objeto.getClaveOperador());
					System.out.println(objeto.getRegion());
					Regiones[] reg= objeto.getRegion();		
				System.out.println(reg.length);
				
				Centrales cent=new Centrales();
				int cont=0;
	for(Regiones objetoRegion: reg){
		
		System.out.println(cont+" "+objetoRegion.getIdRegion());
		System.out.println(cont+" "+objetoRegion.getPc1Central());
		System.out.println(cont+" "+objetoRegion.getPc1Siglas());
		System.out.println(cont+" "+objetoRegion.getPc2Siglas());
		Centrales[] chango=objetoRegion.getCentral();
		for(Centrales objetoCentral: chango){
			System.out.println(cont+" "+objetoCentral.getNcaiCentral());
			System.out.println(cont+" "+objetoCentral.getNcaiId());
			System.out.println(cont+" "+objetoCentral.getNcaiSiglas());
			
		}
		cont++;
	}				
					
				}
				//System.out.println(issu.getDescripError());
				
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
