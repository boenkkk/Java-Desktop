package ffOop;

import java.io.Serializable;

public class ffOverride extends ddInheritanceCustomer implements Serializable{
	public void setId(int aid){
		if (aid == 11) {
			System.out.println("nilai ga boleh kosong");
		} else {
			super.setId(aid);
		}
	}
}
