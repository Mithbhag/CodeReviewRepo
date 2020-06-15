

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.softwareag.util.IDataMap;
import java.math.BigInteger;
// --- <<IS-END-IMPORTS>> ---

public final class pear

{
	// ---( internal utility methods )---

	final static pear _instance = new pear();

	static pear _newInstance() { return new pear(); }

	static pear _cast(Object o) { return (pear)o; }

	// ---( server methods )---




	public static final void factorial (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(factorial)>> ---
		// @sigtype java 3.5
		// [i] field:0:required n
		// [o] field:0:required factorialOfN
		IDataMap idm = new IDataMap(pipeline);
		
		String	n = idm.getAsNonEmptyString( "n" );
		
		
		long l = Long.parseLong(n);
		BigInteger f = BigInteger.ONE;
		for (long i=2; i <= l; i++) {
			f = f.multiply(BigInteger.valueOf(i));
		}
		String factorialOfN = f.toString();
		
		
		
		idm.put("factorialOfN", factorialOfN );
		
			
		// --- <<IS-END>> ---

                
	}
}

