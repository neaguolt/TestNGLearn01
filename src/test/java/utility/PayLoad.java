package utility;

public class PayLoad {
    public static String addPlace(){
        return """
                {
                    "location": {
                        "lat": -38.383494,
                        "lng": 33.427362
                    },
                    "accuracy": "50",
                    "name": "my house",
                    "phone_number": "(+91) 983 893 3937",
                    "address": "70 Summer walk, USA",
                    "types": "shoe park,shop",
                    "website": "http://google.com",
                    "language": "French-IN"
                }""";
    }
}
