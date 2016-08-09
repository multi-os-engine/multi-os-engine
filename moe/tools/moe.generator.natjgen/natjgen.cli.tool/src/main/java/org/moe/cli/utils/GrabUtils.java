/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.cli.utils;

import java.io.File;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.io.FileUtils;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.net.URISyntaxException;
import java.net.URL;

import org.moe.cli.exceptions.UnsupportedTypeException;
import org.moe.cli.executable.Svn;
import org.moe.cli.executable.Svn.ConnectionException;
import org.moe.cli.executable.Svn.NotDirectoryException;
import org.moe.cli.executable.Svn.RepositoryNotFoundException;
import org.moe.cli.executable.Svn.SvnNotFoundException;

/**
 * The class should help to access any file necessary for the project
 */
public class GrabUtils {
	
	/**
	 * The method downloads file from given URI.
	 * URI can be a path to local file/directory, remote archive or a file in remote .git repository. Output file should have same format to the input.
	 * <br>Path to the file in remote .git repository should be in the format: &ltpath to repo&gt.git#&lttag/commit&gt:&ltpath to file from repo's root&gt
	 * <br>Example: https://github.com/NatJPods/Bindings.git#Example:Bindings/Google/1.3.2
	 * 
	 * @param link file to download
	 * @param dest destination
	 * @throws FileAlreadyExistsException if file has already exists
	 * @throws FileNotFoundException if source doesn't exist
	 * @throws UnsupportedTypeException if URI links to file with unsupported type
	 * @throws URISyntaxException if URI have unsupported or wrong format
	 * @throws IOException if operation couldn't be successfully completed because of other reasons
	 */
	public static void download( @NonNull URI link, @NonNull File dest ) 
			throws FileAlreadyExistsException, FileNotFoundException, UnsupportedTypeException, URISyntaxException, IOException {
	    
	    if( dest.exists() ) {
	    	throw new FileAlreadyExistsException(dest.toString() + " has already exists");
	    }
	    
	    String scheme = link.getScheme();
	    if ( scheme == null ) { //assume that FileUtils can handle it
	    	URL url = link.toURL();
	    	FileUtils.copyURLToFile(url, dest);
	    } else {
	    	String[] gitRepo = parseGitURI(link);
	    	if (gitRepo != null) { //try to parse it like a git repo
	    		URI git = new URI(gitRepo[0]);
	    		String tag = gitRepo[1];
	    		Path file = Paths.get(gitRepo[2]);
	    		downloadFileFromGit(git,tag,file,dest);
	    	} else if ( scheme.equals("file") ) {
	    		File local = new File(link);
	    		if( local.exists() ) {
	    			if ( local.isDirectory() ) {
	    				FileUtils.copyDirectory(local, dest);
	    			} else {
	    				FileUtils.copyFile(local, dest);
	    			}
	    		} else {
	    			throw new FileNotFoundException( local.toString() + " doesn't exists");
	    		}
	    	} else {//this isn't a local or git repository
	    		downloadFileFromRemote(link,dest);
	    	}
	    }
	}
	
	/**
	 * The method downloads files stored as URI in the given map and saves them to files stored as File in the map.
	 * URI can be a path to local file/directory, remote archive or a file in remote .git repository. Output file should have same format to the source.
	 * <br>Path to the file in remote .git repository should be in the format: &ltpath to repo&gt.git#&lttag/commit&gt:&ltpath to file from repo's root&gt
	 * <br>Example: https://github.com/NatJPods/Bindings.git#Example:Bindings/Google/1.3.2
	 * 
	 * @param source {@link Map}&ltsource as {@link URI}, output as {@link File}&gt
	 * @throws FileAlreadyExistsException if one or more files have already exists
	 * @throws FileNotFoundException if one or more URIs don't exist
	 * @throws UnsupportedTypeException if one or more URIs link to files with unsupported type
	 * @throws URISyntaxException if one or more URIs have unsupported or wrong format
	 * @throws IOException if operation couldn't be successfully completed because of other reasons
	 */
	public static void download( @NonNull Map<URI, File> source ) 
			throws FileAlreadyExistsException, FileNotFoundException, UnsupportedTypeException, URISyntaxException, IOException {
		for (Map.Entry<URI, File> entry : source.entrySet()) {
		    @NonNull URI link = entry.getKey();
		    @NonNull File dest = entry.getValue();
		    
		    download(link,dest);
		}
	}
	
	/**
	 * The method downloads files stored as URI in the given set and saves them to the given folder.
	 * URI can be a path to local file/directory, remote archive or a file in remote .git repository.
	 * <br>Path to the file in remote .git repository should be in the format: &ltpath to repo&gt.git#&lttag/commit&gt:&ltpath to file from repo's root&gt
	 * <br>Example: https://github.com/NatJPods/Bindings.git#Example:Bindings/Google/1.3.2
	 * 
	 * @param source {@link Set}&ltsource as {@link URI}&gt
	 * @param output directory on the local file system where the downloaded files will be stored
	 * @throws FileAlreadyExistsException if one or more files have already exists
	 * @throws FileNotFoundException if one or more URIs don't exist
	 * @throws UnsupportedTypeException if one or more URIs link to files with unsupported type
	 * @throws URISyntaxException if one or more URIs have unsupported or wrong format
	 * @throws IOException if operation couldn't be successfully completed because of other reasons
	 */
	public static void downloadToFolder( @NonNull Set<URI> source, @NonNull File output) 
			throws FileAlreadyExistsException, FileNotFoundException, UnsupportedTypeException, URISyntaxException, IOException {
		
		if(output.exists()) {
			if (!output.isDirectory()) {
				throw new IOException(output.toString() + " should be a directory!"); 
			}
		} else if (!output.mkdir()) {
			throw new IOException("Couldn't create directory " + output);
		}
		
		Map<URI,File> map = new HashMap<URI,File>();
		for ( URI link : source ) {
			String fileName = (new File(link)).getName();
			File file = new File(output,fileName);
			map.put(link, file);
		}
		
		download(map);
	}
	
	/**
	 * Downloads file from remote .git repository with specified commit.
	 * @param git repository address with .git ending
	 * @param tag tag or commit to clone from; the latest commit will be downloaded if null
	 * @param file relative to repository's root path to file; the whole repository will be downloaded if null
	 * @param output symbolic link to the directory on the local file system where the downloaded file will be stored
	 * @throws FileAlreadyExistsException if output file has already exists
	 * @throws FileNotFoundException if repository doesn't exist
	 * @throws URISyntaxException if URI has unsupported or wrong format
	 * @throws IOException if operation couldn't be successfully completed because of other reasons
	 */
	public static void downloadFileFromGit( @NonNull URI git, @Nullable String tag, @Nullable Path file, @NonNull File output ) 
			throws FileAlreadyExistsException, FileNotFoundException, URISyntaxException, IOException{
		
		if(output.exists()) {
			throw new FileAlreadyExistsException(output.toString() + " already exists!");
		} 
		
		if(!output.mkdir()) {
			throw new IOException("Couldn't create directory " + output);
		}
		
		String gitRepo = git.toString();
		
		if ( !gitRepo.endsWith(".git") ) {
			throw new URISyntaxException(gitRepo,"doesn't match expected pattern");
		}
		String svnCommandAddress = gitRepo.substring(0, gitRepo.length() - 4) +
				(tag == null ? "/trunk/" : "/tags/" + tag + "/") + 
				(file == null ? "" : file.toString());
		try {
			Svn.export(output, svnCommandAddress);
		} catch (SvnNotFoundException e) {
			throw new IOException(e.getMessage());
		} catch (ConnectionException e) {
			throw new IOException(e.getMessage());
		} catch (RepositoryNotFoundException e) {
			throw new FileNotFoundException(e.getMessage());
		} catch (NotDirectoryException e) {
			// this is not realizable case
			e.printStackTrace();
		}
	}
	
	/**
	 * Download file from remote
	 * @param link address of remote file
	 * @param output symbolic link to the local file system where the downloaded file will be stored
	 * @throws FileAlreadyExistsException if output file has already exists
	 * @throws FileNotFoundException if link isn't present
	 * @throws UnsupportedTypeException if URI links to file with unsupported type
	 * @throws IOException if operation couldn't be successfully completed because of other reasons
	 */
	public static void downloadFileFromRemote( @NonNull URI link, @NonNull File output ) 
			throws FileAlreadyExistsException, FileNotFoundException, UnsupportedTypeException, IOException {
		
		if(output.exists()) {
			throw new FileAlreadyExistsException(output.toString() + " already exists!");
		} 
		
		String scheme = link.getScheme();
	    if ( scheme == null ) {
	    	throw new UnsupportedTypeException("Scheme should not be null!");
	    } else if ( scheme.equals("https") ) {
			// Create a new trust manager that trust all certificates
			TrustManager[] trustAllCerts = new TrustManager[]{
					   new X509TrustManager() {
				           public X509Certificate[] getAcceptedIssuers() {
				               return null;
				           }
				           public void checkClientTrusted(X509Certificate[] certs, String authType) {}
				           public void checkServerTrusted(X509Certificate[] certs, String authType) {}
				       }
			};
			
			// Activate the new trust manager
			try {
				SSLContext sc = SSLContext.getInstance("SSL");
				sc.init(null, trustAllCerts, new java.security.SecureRandom());
				HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			} catch (Exception e) {
				throw new IOException(e);
			}
		}
	    
	    URL url = link.normalize().toURL();
		FileUtils.copyURLToFile(url, output); //TODO: Timeout?...
	}
	
	private static @Nullable String[] parseGitURI(@NonNull URI git) throws URISyntaxException {
		String path = git.getPath();
		if(path.endsWith(".git")) {
			String[] toRet = new String[3]; //{git,tag,path}
			toRet[0] = new URI(git.getScheme(), git.getUserInfo(), git.getHost(), git.getPort(), path,null,null).toString(); //git
			String fragment = git.getFragment();
			if(fragment != null) {
				int colonIdx = fragment.indexOf(':');
				if (colonIdx > 0) { //tag exists
					toRet[1] = fragment.substring(0, colonIdx);
					toRet[2] = fragment.substring(colonIdx + 1);
				} else {
					toRet[2] = fragment;
				}
			}
			return toRet;
		} else {
			return null;
		}
	}
}
