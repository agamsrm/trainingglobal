package com.assessment.ProjectCRUD.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.ProjectCRUD.Entity.Product;
import com.assessment.ProjectCRUD.Repository.ProductRepo;
import com.assessment.ProjectCRUD.Service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	ProductRepo productrepo;

	@Override
	public String createProduct(Product product) {
		// TODO Auto-generated method stub

		productrepo.save(product);
		return "Product Added Successfully";

	}

	@Override
	public Product getProduct(long id) {
		// TODO Auto-generated method stub

		return productrepo.findById(id).get();
	}

	@Override
	public Product updateProduct(Product product) {
		// TODO Auto-generated method stub
		productrepo.save(product);
		return productrepo.findById(product.getId()).get();
	}

	@Override
	public String deleteProduct(long id) {
		// TODO Auto-generated method stub
		productrepo.deleteById(id);
		return "Data Deleted Successfully";
	}

}
