//package at.madeha.intelliinvoice.infrastructure;
//import jakarta.enterprise.context.ApplicationScoped; //for the framework to create the object
//import org.eclipse.microprofile.config.inject.ConfigProperties;
//import org.eclipse.microprofile.config.inject.ConfigProperty;
//
/// *
//this class is to deal with the llm service , we will the model in this class then will return the JSON data
// */
//@ApplicationScoped
//public class ClaudeSonnetLLMService  {
//    //to inject the llm config info ,in the class , like the api key and the model name ,  using @configProperty
//    @ConfigProperty(name = "anthropic.api.key")
//    String apiKey;
//    @ConfigProperty(name = "anthropic.moel")
//    String moel;
//    public String extractInvoiceData(String imageUrl) {
//        // the model call
//
//        return "LLM response placeholder";
//    }
//}
