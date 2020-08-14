package collection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class MainTest {

    @Test
    public void test() {
        //等号左边设置为什么类型看Main.java里面的collecthu函数的返回值类型
        Map<String, List<User>> usermap = Main.collect(
                Arrays.asList(
                        new User(1, "张三", 40, "技术部"),
                        new User(2, "李四", 30, "技术部"),
                        new User(3, "王五", 40, "市场部"),
                        new User(4, "王六", 50, "市场部"))
        );
        Assertions.assertEquals(
                Arrays.asList(30, 40),
                usermap.get("技术部").stream().map(User::getAge).collect(Collectors.toList())
        );

        Assertions.assertEquals(
                Arrays.asList(40, 50),
                usermap.get("市场部").stream().map(User::getAge).collect(Collectors.toList())
        );
    }
}

/**
 * 编写测试三部曲:
 * 1.输入数据
 * 2.调用你所测试的那个方法
 * 3.断言
 */

