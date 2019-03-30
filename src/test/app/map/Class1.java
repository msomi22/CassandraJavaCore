package test.app.map;

public class Class1 {

	public Class1() {
		
	}

	public static void main(String[] args) {
		
		
		soap = removeCDATA(soap);
		
		System.out.println(soap);
		

	}

	/**
	 * 
	 */
	private static String removeCDATA(String soap) {
		soap = soap.replaceAll("!", "");
		soap = soap.replace("[", "");
		soap = soap.replaceAll("CDATA", "");
		soap = soap.replaceAll("]]", "");
		soap = soap.replaceAll("<<", "<");
		soap = soap.replaceAll(">>", ">");
		return soap; 
	}

	
	
	
	
	
	
	static String soap = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:tns=\"urn://kcbbankgroup.com/SharedResources/Schemas/SOAMessages/SoapHeader\">\r\n" + 
			"   <soapenv:Header>\r\n" + 
			"      <tns:HeaderReply>\r\n" + 
			"         <tns:Control>\r\n" + 
			"            <tns:RequesterSystemCode>041</tns:RequesterSystemCode>\r\n" + 
			"            <tns:MessageID>FT10030015</tns:MessageID>\r\n" + 
			"            <tns:CorrelationID>4db0d44a-35fe-11e9-82d4-7f0000010000659</tns:CorrelationID>\r\n" + 
			"            <tns:aaData>\r\n" + 
			"               <tns:authenticationStatus>true</tns:authenticationStatus>\r\n" + 
			"               <tns:datapowerTID>155216407</tns:datapowerTID>\r\n" + 
			"            </tns:aaData>\r\n" + 
			"            <tns:ElapsedTime>1131</tns:ElapsedTime>\r\n" + 
			"         </tns:Control>\r\n" + 
			"         <tns:StatusMessages>\r\n" + 
			"            <tns:StatusMessage>\r\n" + 
			"               <MessageCode>0</MessageCode>\r\n" + 
			"               <MessageDescription><![CDATA[<ipayMsg client=\"KCBBANK\" term=\"00001\" seqNum=\"4271\" time=\"2019-02-21 20:13:23 +0300\"><elecMsg ver=\"2.44\" finAdj=\"-100\"><vendRes supGrpRef=\"600309\" tariffIdx=\"01\" keyRevNum=\"1\" tokenTechCode=\"02\" algCode=\"07\" resource=\"elec\"><ref>052202904271</ref><res code=\"elec000\">OK</res><util addr=\"\" taxRef=\"\" distId=\"6001065228315\">KPLC</util><tariff>Domestic Lifeline</tariff><stdToken units=\"0.06\" amt=\"67\" tax=\"0\" desc=\"Resource\" rctNum=\"KCBOVS86252293\">27563291768281112328</stdToken><fixed rctNum=\"KCBOVS86252293\" amt=\"12\" tax=\"0\">Total All Taxes</fixed><fixed rctNum=\"KCBOVS86252293\" amt=\"17\" tax=\"0\">Fuel Index Charge</fixed><fixed rctNum=\"KCBOVS86252293\" amt=\"3\" tax=\"0\">REP Charge</fixed><fixed rctNum=\"KCBOVS86252293\" amt=\"1\" tax=\"0\">Inflation Adjustment</fixed><customerMsg>Credit Vend</customerMsg></vendRes></elecMsg></ipayMsg>]]></MessageDescription>\r\n" + 
			"            </tns:StatusMessage>\r\n" + 
			"         </tns:StatusMessages>\r\n" + 
			"      </tns:HeaderReply>\r\n" + 
			"   </soapenv:Header>\r\n" + 
			"   <soapenv:Body>\r\n" + 
			"      <NS1:DataOutput xmlns:NS1=\"urn://KCB.co.ke/Customer/DataModel/CustomerVooma/BillerNotification/1.0/CustomerVooma.BillerNotification\">\r\n" + 
			"         <NS1:BillerNotificationOutput/>\r\n" + 
			"      </NS1:DataOutput>\r\n" + 
			"   </soapenv:Body>\r\n" + 
			"</soapenv:Envelope>\r\n" + 
			"";
}
