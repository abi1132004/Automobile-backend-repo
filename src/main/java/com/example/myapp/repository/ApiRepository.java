package com.example.myapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;

import com.example.myapp.model.ApiModel;
import com.example.myapp.service.ApiService;

//@Repository
public interface ApiRepository extends JpaRepository <ApiModel,Integer>{

	ApiModel save(ApiService e);

}