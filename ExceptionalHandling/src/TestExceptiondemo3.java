

import com.demo.Service.MyService;
import com.demo.exceptions.NegativeSalaryException;

public class TestExceptiondemo3 {
		public static void main(String[] args) {
			MyService ms=new MyService();
			try {
				ms.acceptData();
			} catch (NegativeSalaryException e) {
				System.out.println(e.getMessage());
			}

		}

	}


