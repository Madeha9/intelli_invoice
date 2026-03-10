package at.madeha.intelliinvoice.infrastructure;

import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

@ApplicationScoped
public class LlmTest {

    @Inject
    InvoiceExtractor invoiceExtractor; //the interface that call the llm model

    /**
     * This method tells Quarkus: "As soon as the application starts,
     * run the runTest() method automatically."
     */
    void onStart(@Observes StartupEvent ev) {
        runTest();
    }

    public void runTest() {
        //the url of the image
        String sampleImageUrl = "https://raw.githubusercontent.com/nirajrajgor/html-invoice-templates/master/assets/invoice-2-2x.jpg";
        String result = invoiceExtractor.extract(sampleImageUrl);
        // This will throw an error if the LLM returns nothing
        assert result != null && !result.isBlank() : "LLM returned an empty response!";
        System.out.println("LLM Response: " + result);
    }
}