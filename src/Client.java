public class Client {
    public void filter() throws Exception {
        RandomListFacade randomListFacade = new RandomListFacade(30);
        randomListFacade.filter();
    }

    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.filter();
    }
}
