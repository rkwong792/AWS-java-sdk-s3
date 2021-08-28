package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import java.util.List;

public class ListFiles {
    public static void main(String[] args) {
        String bucketName = "rk-testbucket123";

        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        ObjectListing ol = s3.listObjects(bucketName);

        System.out.println("The files currently in the bucket " + bucketName + " are:");
        List<S3ObjectSummary> objects = ol.getObjectSummaries();
        objects.forEach(object -> System.out.println(object.getKey()));
    }
}
