public class RecyclableWasteCollector extends WasteCollector {
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("recyclable")) {
            System.out.println("Recyclable waste collected and sent for recycling.");
            container.empty();
        } else {
            super.handleRequest(container);
        }
    }
}