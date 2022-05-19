import com._4paradigm.openmldb.sdk.SdkOption;
import com._4paradigm.openmldb.sdk.SqlException;
import com._4paradigm.openmldb.sdk.impl.SqlClusterExecutor;

public class Main {
    public static void main(String[] args) throws SqlException {
        SdkOption option = new SdkOption();
        option.setHost("127.0.0.1");
        option.setPort(6527);
        option.setClusterMode(false);
        option.setSessionTimeout(10000);
        option.setRequestTimeout(60000);
        SqlClusterExecutor sqlExecutor = new SqlClusterExecutor(option);
    }
}
