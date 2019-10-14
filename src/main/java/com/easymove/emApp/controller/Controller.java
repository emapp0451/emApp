package com.easymove.emApp.controller;

import java.sql.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.easymove.emApp.model.Area;
import com.easymove.emApp.model.City;
import com.easymove.emApp.model.College;
import com.easymove.emApp.model.CollegeAndArea;
import com.easymove.emApp.model.Contact;
import com.easymove.emApp.model.Header;
import com.easymove.emApp.model.Hospital;
import com.easymove.emApp.model.HospitalAndArea;
import com.easymove.emApp.repository.AreaRepository;
import com.easymove.emApp.repository.CityRepository;
import com.easymove.emApp.repository.CollegeRepository;
import com.easymove.emApp.repository.ContactRepository;
import com.easymove.emApp.repository.HeaderRepository;
import com.easymove.emApp.repository.HospitalRepository;

@RestController
@ComponentScan(basePackages= "com.easymove.emApp.service")
@RequestMapping(path = "/test")
public class Controller {
		    
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	/*@GetMapping(value= "/sample",  	method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ArrayList<Sample> run(){
        System.out.println("Our DataSource is = " + dataSource);
        Iterable<Sample> systemlist = systemRepository.findAll();
        ArrayList<Sample> sList = new ArrayList<>();
        for(Sample systemmodel:systemlist){
        	sList.add(systemmodel);
            System.out.println("Here is a system: " + systemmodel.toString());
        }
        return sList;
    }*/
	
	 @Autowired
	    DataSource dataSource;
	 
	    @Autowired
	    AreaRepository areaRepository;
	    
	    @Autowired
	    CityRepository cityRepository;
	    
	    @Autowired
	    HeaderRepository headerRepository;
	    
	    @Autowired
	    HospitalRepository hospitalRepository;
	    
	    @Autowired
	    CollegeRepository collegeRepository;
	    
	    @Autowired
	    ContactRepository contactRepository;

	@RequestMapping(
			value = "/findallArea",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Area>> findAllArea(){
		return new ResponseEntity<Iterable<Area>>(areaRepository.findAll(), HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/findallCity",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
	public ResponseEntity<Iterable<City>> findAllCity() {
		//try {
			//throw new RuntimeException("CREATED EXCEPTION");
			return new ResponseEntity<Iterable<City>>(cityRepository.findAll(), HttpStatus.OK);
		/*} catch (Exception e) {
			return new ResponseEntity<Iterable<Area>>(HttpStatus.BAD_REQUEST);
		}
*/
	}
	
	@RequestMapping(
			value = "/findallCityByCityName",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
		)
	public ResponseEntity<Iterable<City>> findAllCityByCityName(@RequestParam("cityName") String cityName) {
		//try {
			//throw new RuntimeException("CREATED EXCEPTION");
			return new ResponseEntity<Iterable<City>>(cityRepository.findAllCityByCityName(cityName), HttpStatus.OK);
		/*} catch (Exception e) {
			return new ResponseEntity<Iterable<Area>>(HttpStatus.BAD_REQUEST);
		}
*/
	}
	
	@RequestMapping(
			value = "/findallHeader",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Header>> findAllHeader(){
		return new ResponseEntity<Iterable<Header>>(headerRepository.findAll(), HttpStatus.OK);
	}
		
	@RequestMapping(
			value = "/findallHospital",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Hospital>> findAllHospital(){
		return new ResponseEntity<Iterable<Hospital>>(hospitalRepository.findAll(), HttpStatus.OK);
	}
	@RequestMapping(
			value = "/findallHospitalByCityId",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Hospital>> findAllHospitalByCity(@RequestParam("cityName") String cityName){
		return new ResponseEntity<Iterable<Hospital>>(hospitalRepository.findAllHospitalByCityId(cityName), HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/findallHeaderByName",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<Header>> findAllHeaderByName(@RequestParam("headerName") String headerName){
		return new ResponseEntity<Iterable<Header>>(headerRepository.findAllHeaderByHeaderName(headerName), HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/findallHospitalAndArea",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<HospitalAndArea>> findAllHospitalAndArea(@RequestParam("spec") String spec, @RequestParam("cityName") String cityName){
		return new ResponseEntity<Iterable<HospitalAndArea>>(hospitalRepository.findAllHospitalAndArea(spec, cityName), HttpStatus.OK);
	}
	
	@RequestMapping(
			value = "/findallCollegeByCityId",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<College>> findAllCollegeByCity(@RequestParam("cityName") String cityName){
		return new ResponseEntity<Iterable<College>>(collegeRepository.findAllCollegeByCityId(cityName), HttpStatus.OK);
	}
	@RequestMapping(
			value = "/findallCollegeAndArea",
			method = RequestMethod.GET,
			produces = { MimeTypeUtils.APPLICATION_JSON_VALUE },
			headers = "Accept=application/json"
			)
	public ResponseEntity<Iterable<CollegeAndArea>> findAllCollegeAndArea(@RequestParam("type") String type, @RequestParam("cityName") String cityName){
		return new ResponseEntity<Iterable<CollegeAndArea>>(collegeRepository.findCollegeAndArea(type, cityName), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/persistContact", method = RequestMethod.POST,
			consumes = {MimeTypeUtils.APPLICATION_JSON_VALUE})
	  public ResponseEntity<String> persistPerson(@RequestBody Contact contact) {
			if(contact != null) {
				contact.setContactId(0);
				long millis=System.currentTimeMillis(); 
				Date messageDate = new Date(millis);
				contact.setMessageDate(messageDate);
	    	contactRepository.save(contact);
	      return ResponseEntity.status(HttpStatus.CREATED).build();
			}
			return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).build();
	  }
	
}
