//package com.jenkiens.test.git;
//import java.io.File;
//import java.io.IOException;
//
//import org.eclipse.jgit.api.errors.GitAPIException;
//import org.eclipse.jgit.blame.BlameResult;
//import org.eclipse.jgit.diff.RawText;
//import org.eclipse.jgit.lib.PersonIdent;
//import org.eclipse.jgit.revwalk.RevCommit;
//import org.springframework.boot.autoconfigure.info.ProjectInfoProperties.Git;
//
//public class Jgit2 {
//	
//	public static void main(String[] args) throws IOException, IllegalStateException, GitAPIException {
//	        Git git = Git.open(new File("D:\\SoFtwEre\\Eclipce\\declarative_pipline\\.git"));
//	       
//	        
//	       @SuppressWarnings("resource")
//		BlameResult result = new Git(((Object) git).getRepository()).blame().setFilePath("D:\\SoFtwEre\\Eclipce\\declarative_pipline\\JenkinsPiplinefile").call();
//	       final RawText rawText = result.getResultContents();
// 	          for (int i = 0; i < rawText.size(); i++) {
// 	            final PersonIdent sourceAuthor = result.getSourceAuthor(i);
// 	            final RevCommit sourceCommit = result.getSourceCommit(i);
// 	            System.out.println(sourceAuthor.getName() +
// 	                (sourceCommit != null ? "/" + sourceCommit.getCommitTime() + "/" + sourceCommit.getName() : "") +
// 	                ": " + rawText.getString(i));
// 	          }
// 	        }
// 	      
//}