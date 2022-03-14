package practice.basicjava.serializable;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ImplMember {

    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        Member member = new Member("Jung",28L,"1234");

        mapper.configure(MapperFeature.PROPAGATE_TRANSIENT_MARKER,true);
        mapper.writeValue(new File("./test.json"),member);

        System.out.println(mapper.readValue(new File("./test.json"), new Member().getClass()));
    }


}
