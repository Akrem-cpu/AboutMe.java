package day32_arrays_split;

public class AWSZones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("===============Starting deploying of etsy to AWS zones ==============");
        String[] zonesToDeploy = zones.split(",");
        for (String each : zonesToDeploy){
            System.out.println("Deploying [" +app + "] to " + each  + "....");
            System.out.println("Deploying is complete " + each + ".....");
        }
        System.out.println("================All deployment complete==========================");

    }
}
