
package DAO;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Dinh Canh
 */
public class FileTypeFiler extends FileFilter {
    
    public final String extension;
    public final String description;
    
    public FileTypeFiler(String extension, String description){
        this.extension = extension;
        this.description = description;
    }
    
    
    @Override
    public boolean accept(File f) {
        if(f.isDirectory()){
            return true;
        }
        return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription() {
       return description + String.format("(*%s)", extension);
    }
    
}
