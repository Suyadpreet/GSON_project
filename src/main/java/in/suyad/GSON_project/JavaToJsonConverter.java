package in.suyad.GSON_project;

import java.io.File;
import java.io.IOException;

import com.google.gson.Gson;

public class JavaToJsonConverter
{

	public JavaToJsonConverter() 
	{
		AddressClass adr = new AddressClass();
		adr.setCity("Sanghol");
		adr.setState("Punjab");
		adr.setCountry("India");
		Customer c = new Customer();
		c.setId(10);
		c.setName("Suyadpreet");
		c.setEmail("Suyadpreet@gmail.com");
		c.setPhno(95015L);
		c.setAddr(adr);
		
		Gson mapper = new Gson();
		try 
		{
			String json = mapper.toJson( c);
			System.out.println(json);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
