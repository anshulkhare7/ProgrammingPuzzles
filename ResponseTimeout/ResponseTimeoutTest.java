
public class ResponseTimeoutTest {

    public static void main(String[] args) throws Exception {
        ResponseTimeout rt = new ResponseTimeout();
        Thread th = new Thread(rt.new printTimedOutResponse());
        th.start();

        Response r1 = new Response("ID_1", System.currentTimeMillis(), "start");
        rt.addResponse(r1);
        Response r2 = new Response("ID_1", System.currentTimeMillis(), "end");
        rt.addResponse(r2);

        Response r3 = new Response("ID_2", System.currentTimeMillis(), "start");
        rt.addResponse(r3);

        Response r31 = new Response("ID_3", System.currentTimeMillis(), "start");
        rt.addResponse(r31);

        Response r32 = new Response("ID_4", System.currentTimeMillis(), "start");
        rt.addResponse(r32);

        Thread.sleep(4000);
        Response r4 = new Response("ID_2", System.currentTimeMillis(), "end");
        rt.addResponse(r4);

        Response r51 = new Response("ID_5", System.currentTimeMillis(), "start");
        rt.addResponse(r51);
        Thread.sleep(4000);
        Response r52 = new Response("ID_5", System.currentTimeMillis(), "end");
        rt.addResponse(r52);
    }
    
}