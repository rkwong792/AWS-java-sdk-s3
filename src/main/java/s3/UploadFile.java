package s3;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.AmazonS3Exception;

import java.io.File;

public class UploadFile {
    public static void main(String[] args) {
        final AmazonS3 s3 = AmazonS3ClientBuilder.defaultClient();

        String bucketName = "rk-testbucket123";

        // Key name is the name that will be given to the file in the S3 bucket
        String key_name = "test.txt";
        String file_path = "C:\\Users\\Richard\\Documents\\Project\\AWS-java-sdk-s3\\src\\main\\resources\\hello.txt";

        try {
            s3.putObject(bucketName, key_name, new File(file_path));
        } catch (AmazonS3Exception e) {
            // In intelliJ, use 'serr' to type out the print statement faster.
            System.err.println(e.getErrorMessage());
            System.exit(1);
        }
    }
}
