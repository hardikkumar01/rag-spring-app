@Service
public class GenerativeService {

    private final RestTemplate restTemplate;
    private final String openAiApiKey = "openai-api-key";
    private final String openAiUrl = " ";

    public GenerativeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String generateResponse(String context) {
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + openAiApiKey);
        headers.set("Content-Type", "application/json");

        String payload = "{\n" +
                "\"model\": \"gpt-3.5-turbo\",\n" +  // Or use gpt-4 if you want
                "\"prompt\": \"" + context + "\",\n" +
                "\"max_tokens\": 150\n" +
                "}";

        HttpEntity<String> entity = new HttpEntity<>(payload, headers);

        ResponseEntity<String> response = restTemplate.exchange(
                openAiUrl, HttpMethod.POST, entity, String.class);

        return response.getBody();
    }
}
