import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

public class ResponseTimeout {

    LinkedBlockingQueue<Response> eventList = new LinkedBlockingQueue<Response>();
    // id, event
    Map<String, Response> eventMap = new HashMap<>();

    class printTimedOutResponse implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    Response response = eventList.take();
                    //System.out.println("Got new response: " + response);
                    long now = System.currentTimeMillis();
                    if (now - response.ts < 3000) {
                      //  System.out.println("Going to sleep for: " + ((response.ts + 3000) - now));
                        Thread.sleep((response.ts + 3000) - now);
                    }
                    if (eventMap.containsKey(response.id)) {
                        eventMap.remove(response.id);
                        System.out.println("Timedout: " + response);
                    }
                    else {
                        System.out.println("Response is not timeout: " + response);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public void addResponse(Response response) throws InterruptedException {
        if ("start".equals(response.event)) {
            //System.out.println("Adding response" + response);
            eventList.put(response);
            eventMap.put(response.id, response);
        }
        else {
           // System.out.println("Removing response: " + response);
            eventMap.remove(response.id);
        }
    }

}
