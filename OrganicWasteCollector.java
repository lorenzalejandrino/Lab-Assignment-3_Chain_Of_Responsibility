public class OrganicWasteCollector extends WasteCollector {
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("organic")) {
            System.out.println("Organic waste collected and disposed of.");
            container.empty();
        } else {
            super.handleRequest(container);
        }
    }
}