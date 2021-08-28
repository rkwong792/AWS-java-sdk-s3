package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

public class CreateBucket {
    public static void main(String [] args) {
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();
        String bucket_name = "test_bucket123";

        try {
            s3.createBucket(bucket_name);
        } catch (AmazonS3Exception e) {
            System.err.println(e.getErrorMessage());
        }
    }
}
