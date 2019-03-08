package com.cps;

 

import java.io.IOException;
import java.util.UUID;

import org.apache.log4j.Logger;

import com.westgroup.publishingservices.uuidgenerator.UUIDFactory;


 

/**

* Class that uses uuid.jar file to generate UUID.

* Replacement of snowflake jar file.

*

*

*/

public class UUIDGenerator {


    private static UUIDFactory uuidFactory;

    private static Logger LOGGER = Logger.getLogger(UUIDGenerator.class);

 

    static {

        try {

            uuidFactory = new UUIDFactory();

        } catch (IOException e) {

            LOGGER.error("Unable to create instance of UUIDFactory: ", e);

            uuidFactory = null;

        } catch (InterruptedException e) {

            LOGGER.error("Unable to create instance of UUIDFactory: ", e);

            uuidFactory = null;

        }

    }

    /**

     * Return uuid as string

     * @return

     * @throws IOException

     * @throws InterruptedException

     */

    public static String generateUuid() throws IOException, InterruptedException {

    

        if (uuidFactory == null) {

            throw new RuntimeException("No instance of UUIDFactory was created. Hence cannot generate Uuid");

        } else {

            com.westgroup.publishingservices.uuidgenerator.UUID uuid = uuidFactory.getUUIDThreadSafe();

            return uuid.toString();

        }

    }

 
public static void main(String args[])throws Exception{
	System.out.println("hi");
	String uuid = generateUuid();
	System.out.println(uuid);
}}

