public class Response {
        String id;
        long ts;
        String event;

        public Response(String id, long ts, String event) {
            this.id = id;
            this.ts = ts;
            this.event = event;
        }

        @Override
        public String toString() {
            return "Response{" +
                    "id='" + id + '\'' +
                    ", ts=" + ts +
                    ", event='" + event + '\'' +
                    '}';
        }
}
