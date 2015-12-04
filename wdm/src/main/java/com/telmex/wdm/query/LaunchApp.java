package com.telmex.wdm.query;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.telmex.wdm.dao.HibernateUtil;
import com.telmex.wdm.model.CatWdm;
import com.telmex.wdm.pojo.NodosWdm;

public class LaunchApp {
	
	private List<String> providers;
	
	public List<String> getSuppliers(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Query query = session.createQuery("select c.proveedorTx "
				+ "from CatWdm c group by c.proveedorTx");
		providers = query.list();
		session.close();
		HibernateUtil.close();
		return providers;
	}
	
	public ArrayList<NodosWdm> getWdm(String supplier, String wdm){
		wdm = "%" + wdm + "%";
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Iterator queryWdm = session.createQuery("select c.wdm,c.tecnologia,"
				+ "c.topologia from CatWdm c where wdm like :wdm and "
				+ "proveedorTx = :supplier group by wdm order by wdm")
				.setParameter("supplier", supplier).setParameter("wdm", wdm)
				.list()
				.iterator();
		ArrayList<NodosWdm> datosWdm = new ArrayList<NodosWdm>();
		while(queryWdm.hasNext()){
			Object[] truple = (Object[]) queryWdm.next();
			datosWdm.add(new NodosWdm((String) truple[0], (String) truple[1],
					(String) truple[2]));
		}
		return datosWdm;
	}
	
	public static void main(String[] args){
//		LaunchApp test = new LaunchApp();
//		System.out.println(test.getWdm("HUAWEI", "12").get(0).getLabel());
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		Criteria cr = session.createCriteria(CatWdm.class)
				.setProjection(Projections.projectionList()
						.add(Projections.property("id"),"id")
						.add(Projections.property("tecnologia"), "tecnologia"))
				.setResultTransformer(Transformers.aliasToBean(CatWdm.class));
		
		List<CatWdm> list = cr.list();
		System.out.println(list);
		for(CatWdm h:list){
			System.out.println(h.getId());
			System.out.println(h.getTecnologia());
		} 
	}
}