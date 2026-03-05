package at.madeha.intelliinvoice.restapi;

/*
 * endpoint: download/upload the Invoice file talks to Stoarge store teh file  and to the LLM to send the file for processing
 * UploadController handles the upload request , upload the file Invoice image and pass it to the LLM/Stoarge
 * connection to the service layer and implement the endpoint
 * need to  use the storage service and processing service  , so that can store and process the invoice
 * inject the class means , instead of creating the instant  by myself, the framework do that for me, @inject invoiceproccservice
 * instead of writing something like PostprocessingService invc  = new  invoicerproceetime() each time ,
 * the framework creates once and could be used many times ,which makes the code cleaner
 *  that calls (dependency injection ) in quarkus
 */
public class UploadController {
}
