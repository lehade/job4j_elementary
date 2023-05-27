package varjunk;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONPathFinder {

    public static String findElementByTwoValues(JSONObject json, String targetValue1, String targetValue2) {
        String resultPath = null;
        String currentPath = "";
        if (json != null) {
            resultPath = findElementByTwoValues(json, targetValue1, targetValue2, currentPath);
        }
        return resultPath;
    }

    public static String findElementByTwoValues(JSONObject json, String targetValue1, String targetValue2, String path) {
        String resultPath = null;

        for (String key : json.keySet()) {
            Object value = json.get(key);
            String currentPath = (path.isEmpty()) ? key : path + "." + key;

            if (value instanceof JSONObject) {
                resultPath = findElementByTwoValues((JSONObject) value, targetValue1, targetValue2, currentPath);
                if (resultPath != null) {
                    break;
                }
            } else if (value instanceof JSONArray) {
                resultPath = findElementByTwoValuesInArray((JSONArray) value, targetValue1, targetValue2, currentPath);
                if (resultPath != null) {
                    break;
                }
            }
        }

        return resultPath;
    }

    public static String findElementByTwoValuesInArray(JSONArray array, String targetValue1, String targetValue2, String path) {
        String resultPath = null;

        for (int i = 0; i < array.length(); i++) {
            Object value = array.get(i);
            String currentPath = path + "[" + i + "]";

            if (value instanceof JSONObject) {
                if (checkSiblingValue((JSONObject) value, targetValue1, targetValue2)) {
                    resultPath = currentPath;
                    break;
                }
            }
        }

        return resultPath;
    }

    public static boolean checkSiblingValue(JSONObject json, String targetValue1, String targetValue2) {
        boolean hasTarget1 = false;
        boolean hasTarget2 = false;

        for (String key : json.keySet()) {
            Object value = json.get(key);

            if (value.toString().equals(targetValue1)) {
                hasTarget1 = true;
            } else if (value.toString().equals(targetValue2)) {
                hasTarget2 = true;
            }

            if (hasTarget1 && hasTarget2) {
                return true;
            }
        }

        return false;
    }

}
