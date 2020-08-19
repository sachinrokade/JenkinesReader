//package com.jenkiens.git;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.eclipse.jgit.blame.BlameResult;
//import org.eclipse.jgit.diff.RawText;
//import org.eclipse.jgit.diff.RawTextComparator;
//import org.eclipse.jgit.lib.PersonIdent;
//import org.eclipse.jgit.lib.Repository;
//import org.eclipse.jgit.revwalk.RevCommit;
//import org.eclipse.jgit.storage.file.FileRepositoryBuilder;
//import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;
//
//public class JGitTest {
//
//	public static void main(String args[]) throws IOException {
//		
//		//Git git = Git.open( new File( "D:\\microservice_demo-master\\.git" ) );
//	    try (Repository repo = openJGitCookbookRepository()) {
//	        final String[] list = new File(".").list();
//	        if(list == null) {
//	          throw new IllegalStateException("Did not find any files at " + new File(".").getAbsolutePath());
//	        }
//
//	        for(String file : list) {
//	          if(new File(file).isDirectory()) {
//	            continue;
//	          }
//
//	          System.out.println("Blaming " + file);
//	         
//	         
//	          final BlameResult result = new Git(repo).blame().setFilePath(file)
//	            .setTextComparator(RawTextComparator.WS_IGNORE_ALL).call();
//	          final RawText rawText = result.getResultContents();
//	          for (int i = 0; i < rawText.size(); i++) {
//	            final PersonIdent sourceAuthor = result.getSourceAuthor(i);
//	            final RevCommit sourceCommit = result.getSourceCommit(i);
//	            System.out.println(sourceAuthor.getName() +
//	                (sourceCommit != null ? "/" + sourceCommit.getCommitTime() + "/" + sourceCommit.getName() : "") +
//	                ": " + rawText.getString(i));
//	          }
//	        }
//	      }
//	    }
//
//		public static Repository openJGitCookbookRepository() throws IOException {
//	        FileRepositoryBuilder builder = new FileRepositoryBuilder();
//	        return builder
//	                .readEnvironment() // scan environment GIT_* variables
//	                .findGitDir() // scan up the file system tree
//	                .build();
//	    }
//	}
