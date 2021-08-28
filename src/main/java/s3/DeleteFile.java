package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import java.util.List;

public class DeleteFile {
    public static void main(String[] args) {
        // Key name is the name that will be given to the file in the S3 bucket
        String key_name = "test.txt";
        String bucketName = "rk-testbucket123";

        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        try {
            s3.deleteObject(bucketName, key_name);
        } catch (AmazonS3Exception e) {
            System.err.println(e.getErrorMessage());
            System.exit(1);
        }

    }
}
