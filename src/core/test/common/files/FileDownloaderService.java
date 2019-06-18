package core.test.common.files;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.net.PrintCommandListener;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPSClient;

public class FileDownloaderService {

	static java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FileDownloaderService.class.getName());

	public static boolean download(final String inputFolder, final String outputFolder,
			final String suffix, final String server, final int port, final String user, final String pass,
			final boolean secure) {
		
		 String protocol = "SSL";    // SSL/TLS

		boolean success = false;
		final FTPClient ftpClient = !secure ? new FTPClient() : new FTPSClient(protocol);
		
		try {

			ftpClient.setConnectTimeout(5000);
			
			ftpClient.addProtocolCommandListener(new PrintCommandListener(new PrintWriter(System.out)));
			
			ftpClient.connect(server);
			System.out.println("Connected to " + server + ".");
			
			ftpClient.login(user, pass);
			ftpClient.enterLocalPassiveMode();
			ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
			
		    FTPFile[] ftpFiles = ftpClient.listFiles();
            System.out.println("ftpFiles = " + ftpFiles.length);
			
		} catch (final IOException ex) {
			//ex.printStackTrace();
			logger.info("Error: "+ ex.getMessage());
			success = false;
		} finally {
			try {
				if (ftpClient.isConnected()) {
					ftpClient.logout();
					ftpClient.disconnect();
				}
			} catch (final IOException ex) {
				logger.info("Error: " + ex.getMessage());
				success = false;
			}
		}
		return success;
	}
}
