package stream.api;

import static stream.api.StreamFilter1.getStudent;

public class StreamMap1 {
    public static void main(String[] args) {
        System.out.println("All Student: "+getStudent());

        getStudent().stream()
                .map(s->s.name+" ")
                .forEach(System.out::print);
    }
}
