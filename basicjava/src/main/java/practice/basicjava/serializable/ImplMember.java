package practice.basicjava.serializable;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ImplMember {

    public static void main(String[] args) throws IOException {

        String path = "./src/main/java/practice/basicjava/serializable/test.json";

        ObjectMapper mapper = new ObjectMapper();

        Member member = new Member("jung",28L,"5678");

        mapper.configure(MapperFeature.PROPAGATE_TRANSIENT_MARKER,true);
        mapper.writeValue(new File(path),member);

        System.out.println(mapper.readValue(new File(path), new Member().getClass()));
    }
}
