package test.app;

import core.test.common.files.FileDownloaderService;
import core.test.common.files.SecurePass;
/**
 * https://mvnrepository.com/artifact/commons-net/commons-net/3.6
 * 
 * @author t_pnjeru
 *
 */
public class Peter {


	public static void main(String[] a) {

		String inputFolder = "/disk1/KCBBridge/SCF/out";
		String outputFolder = "D:\\opt\\sftp";
		String suffix = "*.csv";
		String server = "172.16.17.103";
		int port = 22; 
		String user = "quickpay";
		String pass = SecurePass.PAS;
		//-Djava.net.preferIPv4Stack=true

		FileDownloaderService.download(inputFolder, outputFolder, suffix, server, port, user, pass,true);

		__main:{
			System.out.println("hello peter");

			if(server.isEmpty()) {
				break __main;
			}
		}
		
		
		__block1:{
			
			
		}
		__block2:{
			
			
		}
		
		__block3:{
			
			
		}
		


	}


}
