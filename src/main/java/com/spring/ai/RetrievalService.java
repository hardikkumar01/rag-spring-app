@Service
public class RetrievalService {

    private final RestTemplate restTemplate;

    public RetrievalService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchRelevantData(String query) {
        // Simulate retrieving relevant information based on the query
        String url = "https://api.example.com/retrieve?query=" + query;
        return restTemplate.getForObject(url, String.class);
    }
}
