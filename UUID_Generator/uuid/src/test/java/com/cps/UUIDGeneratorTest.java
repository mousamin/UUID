package com.cps;
import static org.junit.Assert.*;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
//import org.powermock.modules.junit4.PowerMockRunner;


//import org.springframework.beans.factory.annotation.Autowired;
import com.westgroup.publishingservices.uuidgenerator.UUID;
import com.westgroup.publishingservices.uuidgenerator.UUIDFactory;

/*@RunWith(PowerMockRunner.class)
@PrepareForTest*/

/*@Autowired
private UUI
 
	public class UUIDGeneratorTest {
	
    private static UUIDFactory uuidFactory;

    private static Logger LOGGER = Logger.getLogger(UUIDGenerator.class);
    
    @Before
    public void setup(){
    	uuidFactory = new UUIDFactory();
    	LOGGER=mock(UUIDGenerator.class);
    }
	
	@Test
	public void testGenerateUuid() {
		
		mockStatic(UUID.class);
		given(UUID.randomUUID()).willreturn(uuid);
		given(uuid.toString()).willReturn("my uuid");
		
		String actual=uuidFactory.testGenerateUuid();
		assertEquals("mygenerateduuid",actual);
	}


}*/


public class UUIDGeneratorTest {
	
	 private static UUIDFactory uuidFactory;
	@Test
	public void testGenerateUuidWithNull() throws IOException, InterruptedException{
		
		UUIDFactory u = new UUIDFactory();

		    Object obj = false;

		    u.equals(obj);
		    assertSame(obj instanceof UUIDFactory, false);

		}

		

//	@Test
//	public void testGenerateUuidNotNull() throws IOException, InterruptedException{
//		Object obj =true;
//		
//		UUIDFactory other = (UUIDFactory) obj;
//	   assertSame(other.equals(obj), true);
//	    assertEquals(obj, other);
//		
//	}
	
	
}

