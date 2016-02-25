/*
 * Copyright 2007-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.micro.service;

import java.util.Collection;

import com.micro.entity.Customer;
import com.micro.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * Customer service implementation.
 * 
 * @author
 */
@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;
    
    @Autowired
    public CustomerServiceImpl(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer findById(Integer id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Customer> find() {
        return repository.findAll();
    }

    @Override
    public Customer save(Customer Customer) {
        return repository.saveAndFlush(Customer);
    }

    @Override
    public void delete(Integer id) {
        repository.delete(id);
    }


}
