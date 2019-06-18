package test.app;


public class APp {
	
	private int a = 0;

	public APp() {
		
	}

	public static void main(String[] args) {
		
		
	    
		for(int i = 1; i < 3; i++)
			  for(int j = 3; j >= 1; j--)
			     assert i!=j : i; 
    
		/*int i = 0;
		boolean t = true;
		boolean f = false, b;
		b = (t || ((i++) == 0));
		b = (f || ((i+=2) > 0));
		System.out.println(i);*/
		
		int i,j,k,l=0;
		k = l++;
		j = ++k;
		i = j++;
		System.out.println(i);	
		
		String xml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soap=\"urn://kcbbankgroup.com/SharedResources/Schemas/SOAMessages/SoapHeader\" xmlns:card=\"urn://KCB.co.ke/Card/DataModel/Card/GetOMSAccountInfo/1.0/Card.GetOMSAccountInfo\" xmlns:ns=\"urn://KCB.co.ke/CanonicalDataModel/Card/1.0\">\r\n" + 
				"   <soapenv:Header>\r\n" + 
				"      <soap:HeaderRequest>\r\n" + 
				"         <soap:Control>\r\n" + 
				"            <soap:RequesterSystemCode>101</soap:RequesterSystemCode>\r\n" + 
				"            <soap:MessageID>?</soap:MessageID>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <soap:CorrelationID>?</soap:CorrelationID>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <soap:CreationTime>?</soap:CreationTime>\r\n" + 
				"         </soap:Control>\r\n" + 
				"         <soap:Credentials>\r\n" + 
				"            <!--Zero or more repetitions:-->\r\n" + 
				"            <soap:Credential>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <soap:SystemCode>?</soap:SystemCode>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <soap:Username>?</soap:Username>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <soap:Password>MTIzNDU2MDAwMDAwMDAwMI8XcptjQWXt8Sl7hUWZkozg8aZlyqiOLrG+Zno7UDw6H3Vd2bIduC85uzZ4eJ4szw==</soap:Password>\r\n" + 
				"            </soap:Credential>\r\n" + 
				"         </soap:Credentials>\r\n" + 
				"      </soap:HeaderRequest>\r\n" + 
				"   </soapenv:Header>\r\n" + 
				"   <soapenv:Body>\r\n" + 
				"      <card:DataInput>\r\n" + 
				"         <card:GetOMSAccountInfoInput>\r\n" + 
				"            <!--Optional:-->\r\n" + 
				"            <ns:Card>\r\n" + 
				"               <!--Optional:-->\r\n" + 
				"               <ns:number>1122018347</ns:number>\r\n" + 
				"               <ns:type>LinkList</ns:type><!-- LinkList Attributes-->\r\n" + 
				"            </ns:Card>\r\n" + 
				"         </card:GetOMSAccountInfoInput>\r\n" + 
				"      </card:DataInput>\r\n" + 
				"   </soapenv:Body>\r\n" + 
				"</soapenv:Envelope>";

	}

}
