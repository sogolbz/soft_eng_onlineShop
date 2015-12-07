/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaftpclient;

import java.io.File;
import java.io.IOException;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Sam
 */
class DirectoryRestrictedFileSystemView extends FileSystemView
{
    //salammmmmmmmm
    //sogolllllllll
    
    private final File[] rootDirectories;
    DirectoryRestrictedFileSystemView(File rootDirectory)
    {
        this.rootDirectories = new File[] {rootDirectory};
    }
    DirectoryRestrictedFileSystemView(File[] rootDirectories)
    {
        this.rootDirectories = rootDirectories;
    }
    public File createNewFolder(File containingDir) throws IOException
    {
        throw new UnsupportedOperationException("Unable to create directory");
    }
    public File[] getRoots()
    {
        return rootDirectories;
    }
    public boolean isRoot(File file)
    {
        for (File root : rootDirectories) 
        {
            if (root.equals(file)) 
            {
                return true;
            }
        }
        return false;
        
    }
    
    
}