package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.DonorEntity;
import com.example.demo.repository.Repo;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	Repo r;
	public DonorEntity savedonor(DonorEntity de)
	{
		return r.save(de);
	}
	public List<DonorEntity> savedetails(List<DonorEntity> de)
	{
		return (List<DonorEntity>)r.saveAll(de);
	}
	public List<DonorEntity> showinfo()
	{
		return r.findAll();
	}
	public Optional<DonorEntity> showbyid(int id)
	{
		return r.findById(id);
	}
	public DonorEntity changeinfo(DonorEntity de)
	{
		return r.saveAndFlush(de);
	}
	public void deleteinfo(DonorEntity de)
	{
		r.delete(de);
	}
	public void deleteid(int id)
	{
		r.deleteById(id);
	}
}