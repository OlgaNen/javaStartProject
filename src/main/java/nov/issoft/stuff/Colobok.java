package nov.issoft.stuff;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Colobok {
    @JsonProperty("fairytale")
    private String fairytale;


    public static void main(String[] args) throws IOException {
        System.out.println(System.getProperty("fairytale.dir"));
        Colobok.class.getClassLoader().getResource("fairytale.json");
        ObjectMapper mapper = new ObjectMapper();
        Colobok colobok = mapper.readValue(new File("src/main/resources/fairytale.json"), Colobok.class);
        Pattern pattern = Pattern.compile("\\w+", Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(colobok.fairytale);
        SortedSet<String> words = new TreeSet<>();

        while (matcher.find()) {
            int count = 0;
            if (matcher.group().equals(words)) {
                count++;
            }
            System.out.println(matcher.group() + "=" + count);
        }
/*            words.add(matcher.group().toLowerCase());
        }

        for (String word : words) {
            System.out.println("word = " + word);
        }

        System.out.println(result);*/

/*        @Override
        public String toString () {
            return "Colobok{" +
                    "fairytale='" + fairytale + '\'' +
                    '}';
        }*/
    }
}


