public abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    public void handleRequest(WasteContainer container) {
        if (nextCollector != null) {
            nextCollector.handleRequest(container);
        } else {
            System.out.println("No collector found for this kind of waste: " + container.getType());
        }
    }
}