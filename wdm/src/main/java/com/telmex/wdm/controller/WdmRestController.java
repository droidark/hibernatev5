package com.telmex.wdm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telmex.wdm.pojo.NodosWdm;
import com.telmex.wdm.query.LaunchApp;

@RestController
public class WdmRestController {
	
	
	@RequestMapping("/suppliers")
	public @ResponseBody List<String> providers(){
		LaunchApp prov = new LaunchApp();
		return prov.getSuppliers();
	}
	
	@RequestMapping(value = "/nodes/{supplier}/{wdm}", 
			method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<NodosWdm> getNodos(
			@PathVariable("supplier") String supplier,
			@PathVariable("wdm") String wdm){
		LaunchApp prov = new LaunchApp();
		return prov.getWdm(supplier, wdm);
	}

}
