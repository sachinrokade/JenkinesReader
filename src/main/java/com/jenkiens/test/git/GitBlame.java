package com.jenkiens.test.git;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GitBlame {

	public static void main(String[] args) {

		List<String> commands=new ArrayList<>();
		
		commands.add("cmd.exe");
		commands.add("/c");//cmd closed
		commands.add("git blame SchoolController.java");
		
		ProcessBuilder processBuilder = new ProcessBuilder();

        processBuilder.command(commands);
        processBuilder.directory(new File("D:\\microservice_demo-master\\Admin_Server_Cilent_1\\src\\main\\java\\com\\admin_client\\contoller\\"));

        // can also run the java file like this
        // processBuilder.command("java", "Hello");

        try {

            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

	}

}
