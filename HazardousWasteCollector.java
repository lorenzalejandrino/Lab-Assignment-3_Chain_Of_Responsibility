public class HazardousWasteCollector extends WasteCollector {
    @Override
    public void handleRequest(WasteContainer container) {
        if (container.getType().equalsIgnoreCase("hazardous")) {
            System.out.println("Hazardous waste collected and safely processed.");
            container.empty();
        } else {
            super.handleRequest(container);
        }
    }
}