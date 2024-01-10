public class Client {
    public static void main(String[] args) {
        //client talks to controllers->service->repo->db
        //then db-> repo->service(if any business logic it happes here) -> controller -> client
    }
}
