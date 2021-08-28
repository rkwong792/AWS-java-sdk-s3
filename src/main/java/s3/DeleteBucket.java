package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class DeleteBucket {
    public static void main(String [] args) {
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        String bucketName = "rk-testbucket123";

        try {
            s3.deleteBucket(bucketName);
        } catch (AmazonS3Exception e) {
            System.err.println(e.getErrorMessage());
        }
    }
}
