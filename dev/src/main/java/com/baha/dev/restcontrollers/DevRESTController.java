package com.baha.dev.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.baha.dev.entities.Dev;
import com.baha.dev.service.DevService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class DevRESTController {
@Autowired
DevService devService;
@RequestMapping(method = RequestMethod.GET)
public List<Dev> getAllDevs() {
return devService.getAllDevs();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Dev getDevById(@PathVariable("id") Long id) {
return devService.getDev(id);
 }
@RequestMapping(method = RequestMethod.POST)
public Dev createDev(@RequestBody Dev dev) {
return devService.saveDev(dev);
}
@RequestMapping(method = RequestMethod.PUT)
public Dev updateDev(@RequestBody Dev dev) {
return devService.updateDev(dev);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deleteDev(@PathVariable("id") Long id)
{
devService.deleteDevById(id);
}
@RequestMapping(value="/prodscat/{idPoj}",method = RequestMethod.GET)
public List<Dev> getDevsByCatId(@PathVariable("idPoj") Long idPoj) {
return devService.findByProjetIdCat(idPoj);
}


} 