package excutablefiles;

import java.io.IOException;

import org.testng.annotations.Test;

import utilites.Facebook;

public class BaseClass extends Facebook{

	@Test
	public void Login () throws Exception {
		FaceBookLogin();
	}



}
