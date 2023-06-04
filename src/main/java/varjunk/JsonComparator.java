package varjunk;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JsonComparator {
    public static void main(String[] args) {

        String path1 = "src/main/resources/json/sample.json";
        String path2 = "src/main/resources/json/second.json";

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node1 = mapper.readTree(jsonLoader(path1));
            JsonNode node2 = mapper.readTree(jsonLoader(path2));

            List<String> excludedFields = new ArrayList<>();
            excludedFields.add("$.body.output.screens[1].widgets[0].properties.products[0].linkUuid");
            excludedFields.add("$.body.output.screens[1].widgets[0].properties.products[1].linkUuid");
            excludedFields.add("$.body.output.screens[1].widgets[0].properties.products[2].linkUuid");
            excludedFields.add("$.body.output.screens[1].widgets[0].properties.products[3].linkUuid");
            excludedFields.add("$.body.pid");
            excludedFields.add("$.body.history[0].id");
            excludedFields.add("$.body.history[1].id");

            List<String> differingFields = new ArrayList<>();
            compareJsonNodes(node1, node2, "$", excludedFields, differingFields);

            if (!differingFields.isEmpty()) {
                System.out.println("JSONs are different. Differing fields with values:");

                for (String field : differingFields) {
                    System.out.println(field);
                }
            } else {
                System.out.println("JSONs are equal.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void compareJsonNodes(JsonNode node1, JsonNode node2, String path, List<String> excludedFields, List<String> differingFields) {
        if (!excludedFields.contains(path) && !node1.equals(node2)) {
            if (node1.isObject() && node2.isObject()) {
                Iterator<String> fieldNames = node1.fieldNames();
                while (fieldNames.hasNext()) {
                    String fieldName = fieldNames.next();
                    compareJsonNodes(node1.get(fieldName), node2.get(fieldName), path + "." + fieldName, excludedFields, differingFields);
                }
            } else if (node1.isArray() && node2.isArray()) {
                for (int i = 0; i < node1.size(); i++) {
                    compareJsonNodes(node1.get(i), node2.get(i), path + "[" + i + "]", excludedFields, differingFields);
                }
            } else {
                differingFields.add(path + " (" + node1.asText() + " not match " + node2.asText() + ")");
            }
        }
    }

    public static String jsonLoader(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

}
