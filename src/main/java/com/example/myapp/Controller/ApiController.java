package com.example.myapp.Controller;

	import java.util.List;
	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

import com.example.myapp.service.ApiService;
import com.example.myapp.model.ApiModel;

	@RestController
	@CrossOrigin
	public class ApiController {
		@Autowired
		ApiService stuService;
		@PostMapping("/addDetails")
		public ApiModel addinfo(@RequestBody ApiModel st) {
			return stuService.saveDetails(st);
		}
		
		@GetMapping("/showDetails")
		public List<ApiModel> fetchDetails(){
			return stuService.getDetails();
		}	
		@PutMapping("/updateDetails")
		public ApiModel updateInfo(@RequestBody ApiModel st1) {
			return stuService.updateDetails(st1);
		}	
		@DeleteMapping("/deleteDetails/{id}")
		public String deleteInfo(@PathVariable("id") int id) {
			stuService.deleteDetails(id);
			return "Details is Deleted Successfully";		
		}
		@GetMapping("/product/{field}")
		public List<ApiModel> getWithSort(@PathVariable String field) {
			return stuService.getSorted(field);
		}

		@GetMapping("/product/{offset}/{pageSize}")
		public List<ApiModel> productsWithPagination(@PathVariable int offset, @PathVariable int pageSize) {
			return stuService.getWithPagination(offset,pageSize);
		}
		
}
