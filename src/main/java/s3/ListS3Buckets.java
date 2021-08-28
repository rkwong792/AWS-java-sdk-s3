package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class ListS3Buckets {
    public static void main(String[] args) {
        // Create the S3 client
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        // List all the buckets
        List<Bucket> buckets = s3.listBuckets();

        // In intelliJ, use 'sout' to type out the print statement faster.
        System.out.println("Your Amazon S3 buckets are:");

        buckets.forEach(bucket -> System.out.println("Bucket Name: " + bucket.getName() + ", Bucket Owner : " + bucket.getOwner().getDisplayName()
                + ", Bucket Creation Date: " + bucket.getCreationDate()));
    }
}
