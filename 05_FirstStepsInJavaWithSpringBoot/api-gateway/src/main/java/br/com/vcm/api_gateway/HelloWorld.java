package br.com.vcm.api_gateway;

public class HelloWorld {
    private final long id;
    private final String content;

    public HelloWorld(long id, String name) {
        this.id = id;
        this.content = name;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
