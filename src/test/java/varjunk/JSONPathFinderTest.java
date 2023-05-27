package varjunk;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.assertj.core.api.Assertions.assertThat;
import static varjunk.JSONPathFinder.findElementByTwoValues;

public class JSONPathFinderTest {

    public JSONObject jsonLoader(String path) throws IOException {
        String jsonString = new String(Files.readAllBytes(Paths.get(path)));
        JSONObject jsonObject = new JSONObject(jsonString);
        return jsonObject;
    }

    @Test
    public void data0() throws IOException {
        String path = "src/main/resources/json/sample.json";
        String targetValue1 = "a1";
        String targetValue2 = "do";
        String expected = "hoba.oba.data[0]";
        String elementPath = findElementByTwoValues(jsonLoader(path), targetValue1, targetValue2);
        assertThat(elementPath).isEqualTo(expected);
    }

    @Test
    public void data1() throws IOException {
        String path = "src/main/resources/json/sample.json";
        String targetValue1 = "do";
        String targetValue2 = "a2";
        String expected = "hoba.oba.data[1]";
        String elementPath = findElementByTwoValues(jsonLoader(path), targetValue1, targetValue2);
        assertThat(elementPath).isEqualTo(expected);
    }

    @Test
    public void data2() throws IOException {
        String path = "src/main/resources/json/sample.json";
        String targetValue1 = "da";
        String targetValue2 = "a1";
        String expected = "hoba.oba.data[2]";
        String elementPath = findElementByTwoValues(jsonLoader(path), targetValue1, targetValue2);
        assertThat(elementPath).isEqualTo(expected);
    }

    @Test
    public void data3() throws IOException {
        String path = "src/main/resources/json/sample.json";
        String targetValue1 = "da";
        String targetValue2 = "a2";
        String expected = "hoba.oba.data[3]";
        String elementPath = findElementByTwoValues(jsonLoader(path), targetValue1, targetValue2);
        assertThat(elementPath).isEqualTo(expected);
    }
}
