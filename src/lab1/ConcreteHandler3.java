package lab1;

class ConcreteHandler3 implements Handler {
    private Handler next;
    public void setNext(Handler handler) {
        next = handler;
    }
    public void handleRequest(String request) {
        if (request.equals("Task3")) {
            System.out.println("Handled by Handler3");
        } else if (next != null) {
            System.out.println("Handler3 passing the request to next handler");
            next.handleRequest(request);
        } else {
            System.out.println("Request cannot be handled");
        }
    }
}
