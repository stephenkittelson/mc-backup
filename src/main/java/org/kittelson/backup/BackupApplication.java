package org.kittelson.backup;

import java.io.IOException;

public class BackupApplication {

	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Usage: java -jar uploader.jar <file>");
			return;
		}
		new UploaderService().upload(args[0]);
	}

}
