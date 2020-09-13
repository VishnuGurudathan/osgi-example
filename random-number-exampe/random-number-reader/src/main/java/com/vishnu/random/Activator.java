/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vishnu.random;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import com.vishnu.random.generator.RandomNumberGenerator;
import com.vishnu.random.reader.RandomNumberReader;

public class Activator implements BundleActivator {

	private ServiceReference serviceReference;
	private RandomNumberReader randomNumberReader;
	
    public void start(BundleContext context) throws Exception {
    	
        System.out.println("Starting the bundle 'random-number-reader'");
        serviceReference = context.getServiceReference (RandomNumberGenerator.class.getName ());
        RandomNumberGenerator randomNumberGenerator = (RandomNumberGenerator) context.getService (serviceReference);
        
        if (randomNumberGenerator == null) {
            throw new Exception ("Error! Random service could not be found!");
        }
        this.randomNumberReader = new RandomNumberReader(randomNumberGenerator);
        this.randomNumberReader.run();
    }

    public void stop(BundleContext context) {
        System.out.println("Stopping the bundle 'random-number-reader'");
        this.randomNumberReader.stop();
    }

}