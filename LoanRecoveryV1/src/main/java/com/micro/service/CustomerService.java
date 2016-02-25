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
import org.springframework.security.access.annotation.Secured;


/**
 * Customer service interface.
 * 
 * @author David Winterfeldt
 */
public interface CustomerService {

    /**
     * Find Customer by id.
     */
    public Customer findById(Integer id);

    /**
     * Find Customers.
     */
    public Collection<Customer> find();

    /**
     * Saves Customer.
     */
    public Customer save(Customer Customer);

    /**
     * Deletes Customer.
     */
    @Secured ({"ROLE_ADMIN"})
    public void delete(Integer id);
    

}
