package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.Bucket;

import java.util.List;

public class CreateBucket {
    public static void main(String [] args) {
        // Create the S3 client
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        String bucketName = "rk-testbucket123";

        // Create a new S3 bucket
        try {
            s3.createBucket(bucketName);
        } catch (AmazonS3Exception e) {
            System.err.println(e.getErrorMessage());
        }
    }
}
