
package at.madeha.intelliinvoice.infrastructure;
/*
this class receives the file from the upload controller , which the user will upload it , the Class will
save the file in the could storage and return the url of it , to be pass to the LLM and save in the database
 */

import at.madeha.intelliinvoice.service.StorageService;
import jakarta.enterprise.context.ApplicationScoped;
import org.jboss.resteasy.reactive.multipart.FileUpload;


@ApplicationScoped
//so that Quarkus can create the object for this class using the ID concept .
public class CloudStorageService implements StorageService {


    @Override
    public String uploadFile(FileUpload uploadInvoice) {
        // write the  cloud upload logic later on
        return "https://cloud.example.com/" + uploadInvoice.fileName(); // placeholder
    }
}
