@RestController
@RequestMapping("/api/ask")
public class AskController {

    private final RetrievalService retrievalService;
    private final GenerativeService generativeService;

    public AskController(RetrievalService retrievalService, GenerativeService generativeService) {
        this.retrievalService = retrievalService;
        this.generativeService = generativeService;
    }

    @GetMapping
    public String askQuestion(@RequestParam String query) {
        // Fetch relevant data from a source (e.g., database or API)
        String context = retrievalService.fetchRelevantData(query);

        // Use the generative model to create an augmented response
        return generativeService.generateResponse(context);
    }
}
