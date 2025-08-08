package wd;

public class FileDownload {

	public static void main(String[] args) {
		int progress = 0;
		do {
			System.out.println("Downloading..." + progress + "%");
			progress += 20;
		}
		while (progress < 100);
		System.out.println("Download complete!");
	}
}
		
		// TODO Auto-generated method stub

	
