package pwo.lab10.chain;

public class _run {

    public static void main(String[] args) {

        TxtProc procChain = new TxtProcUp();
        procChain.add(new TxtProcDown());
        procChain.add(new TxtProcReverse());
        procChain.add(new TxtProcDeleteDigits());

        Request request0 = new Request("Ala Ma Kota", "up");
        Request request1 = new Request("Ala Ma Kota", "down");
        Request request2 = new Request("Ala Ma Kota", "reverse");
        Request request3 = new Request("Ala Ma Kota", "?");
        Request request4 = new Request("A1l2a M3a K4o5t6a", "delete");

        System.out.println(procChain.processRequest(request0));
        System.out.println(procChain.processRequest(request1));
        System.out.println(procChain.processRequest(request2));
        System.out.println(procChain.processRequest(request3));
        System.out.println(procChain.processRequest(request4));
    }
}