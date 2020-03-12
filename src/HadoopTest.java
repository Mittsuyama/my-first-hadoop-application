import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

public class HadoopTest {
    public static void main(String[] args) {
        try {
            String fileName = "hdfs://localhost:9000/user/hadoop/test.txt";
            Configuration conf = new Configuration();
            FileSystem fs = FileSystem.get(conf);
            if(fs.exists((new Path(fileName)))) {
                System.out.println("File Exists!");
            } else {
                System.out.println("File does not exist");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}