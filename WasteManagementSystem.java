public class WasteManagementSystem {
    public static void main(String[] args) {
        // Create waste containers
        WasteContainer organicBin = new WasteContainer("organic", 10);
        WasteContainer recyclableBin = new WasteContainer("recyclable", 10);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 10);


        organicBin.fill(10);
        recyclableBin.fill(10);
        hazardousBin.fill(10);


        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);


        organicCollector.handleRequest(organicBin);
        System.out.println("");
        organicCollector.handleRequest(recyclableBin);
        System.out.println("");
        organicCollector.handleRequest(hazardousBin);




    }
}