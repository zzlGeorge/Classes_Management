import com.lzGeorge.app.dao.StayInSchoolMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by admin on 2017/5/8.
 */
public class CommonTest extends BaseTest {

    @Autowired
    StayInSchoolMapper mapper;

    @Test
    public void testInsert() {

    }

    @Test
    public void showMsg() {
        mapper.selectByPrimaryKey(1);
        System.out.println();
    }

    @Test
    public void common() {

    }

}
