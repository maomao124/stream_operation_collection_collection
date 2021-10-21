import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * Project name(项目名称)：Stream操作Collection集合
 * Package(包名): PACKAGE_NAME
 * Class(类名): test
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/21
 * Time(创建时间)： 18:35
 * Version(版本): 1.0
 * Description(描述)：
 * 独立使用 Stream 的步骤如下：
 * 使用 Stream 或 XxxStream 的 builder() 类方法创建该 Stream 对应的 Builder。
 * 重复调用 Builder 的 add() 方法向该流中添加多个元素。
 * 调用 Builder 的 build() 方法获取对应的 Stream。
 * 调用 Stream 的聚集方法。
 * Stream 提供了大量的方法进行聚集操作，这些方法既可以是“中间的”（intermediate），也可以是 "末端的"（terminal）。
 * 中间方法：中间操作允许流保持打开状态，并允许直接调用后续方法。上面程序中的 map() 方法就是中间方法。中间方法的返回值是另外一个流。
 * 末端方法：末端方法是对流的最终操作。当对某个 Stream 执行末端方法后，该流将会被“消耗”且不再可用。
 * sum()、count()、average() 等方法都是末端方法。
 * 除此之外，关于流的方法还有如下两个特征:
 * 有状态的方法：这种方法会给流增加一些新的属性，比如元素的唯一性、元素的最大数量、保证元素以排序的方式被处理等。有状态的方法往往需要更大的性能开销。
 * 短路方法：短路方法可以尽早结束对流的操作，不必检查所有的元素。
 * Stream 常用的中间方法。
 * 方法	                说明
 * filter(Predicate predicate)	过滤 Stream 中所有不符合 predicate 的元素
 * mapToXxx(ToXxxFunction mapper)	使用 ToXxxFunction 对流中的元素执行一对一的转换，该方法返回的新流中包含了 ToXxxFunction 转换生成的所有元素。
 * peek(Consumer action)	依次对每个元素执行一些操作，该方法返回的流与原有流包含相同的元素。该方法主要用于调试。
 * distinct()	该方法用于排序流中所有重复的元素（判断元素重复的标准是使用 equals() 比较返回 true）。这是一个有状态的方法。
 * sorted()	该方法用于保证流中的元素在后续的访问中处于有序状态。这是一个有状态的方法。
 * limit(long maxSize)	该方法用于保证对该流的后续访问中最大允许访问的元素个数。这是一个有状态的、短路方法。
 * Stream           常用的末端方法。
 * 方法	            说明
 * forEach(Consumer action)	遍历流中所有元素，对每个元素执行action
 * toArray()	将流中所有元素转换为一个数组
 * reduce()	该方法有三个重载的版本，都用于通过某种操作来合并流中的元素
 * min()	返回流中所有元素的最小值
 * max()	返回流中所有元素的最大值
 * count()	返回流中所有元素的数量
 * anyMatch(Predicate predicate)	判断流中是否至少包含一个元素符合 Predicate 条件。
 * allMatch(Predicate predicate)	判断流中是否每个元素都符合 Predicate 条件
 * noneMatch(Predicate predicate)	判断流中是否所有元素都不符合 Predicate 条件
 * findFirst()	返回流中的第一个元素
 * findAny()	返回流中的任意一个元素
 */

public class test
{
    public static void main(String... args)
    {
        //------------------------------------------------------
        long startTime = System.nanoTime();   //获取开始时间
        //------------------------------------------------------
        for (String a : args)
        {
            System.out.println(a);
        }
        IntStream is = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is1 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is2 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is3 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is4 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is5 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        IntStream is6 = IntStream.builder().add(5).add(6).add(7).add(8).add(9)
                .add(10).add(11).add(12).add(13).add(14).add(15).build();
        System.out.println("is 所有元素的最大值：" + is.max().getAsInt());
        System.out.println("is 所有元素的最小值：" + is1.min().getAsInt());
        System.out.println("is 所有元素的总和：" + is2.sum());
        System.out.println("is 所有元素的总数：" + is3.count());
        System.out.println("is 所有元素的平均值：" + is4.average());
        System.out.println("is所有元素的平方是否都大于20: " + is5.allMatch(ele -> ele * ele > 20));
        System.out.println("is是否包含任何元素的平方大于20 : " + is6.anyMatch(ele -> ele * ele > 20));

        LinkedList<String> l = new LinkedList<>();
        l.add("123");
        l.add("1234");
        l.add("12345");
        l.add("123456");
        l.add("1234567");
        l.add("12345678");
        l.add("123456789");
        l.add("1234567890");
        l.forEach(System.out::println);
        System.out.println("包含567的数量：");
        System.out.println(l.stream().filter(s -> s.contains("567")).count());
        System.out.println("长度大于7的数量：");
        System.out.println(l.stream().filter(s -> s.length() > 7).count());
        System.out.println("长度小于7的数量：");
        System.out.println(l.stream().filter(s -> s.length() < 7).count());
        {
            System.out.println("输出长度小于6的所有集合：");
            Object[] ss = (l.stream().filter(s -> s.length() < 6).toArray());
            for (Object sss : ss)
            {
                System.out.println(sss);
            }
        }
        {
            System.out.println("输出长度大于7的所有集合：");
            Object[] ss = (l.stream().filter(s -> s.length() > 7).toArray());
            for (Object sss : ss)
            {
                System.out.println(sss);
            }
        }
        {
            System.out.println("输出包含8的所有集合：");
            Object[] ss = (l.stream().filter(s -> s.contains("8")).toArray());
            for (Object sss : ss)
            {
                System.out.println(sss);
            }
        }
        //------------------------------------------------------
        long endTime = System.nanoTime(); //获取结束时间
        if ((endTime - startTime) < 1000000)
        {
            double final_runtime;
            final_runtime = (endTime - startTime);
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "微秒");
        }
        else if ((endTime - startTime) >= 1000000 && (endTime - startTime) < 10000000000L)
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 1000;
            final_runtime = final_runtime / 1000;
            System.out.println("算法运行时间： " + final_runtime + "毫秒");
        }
        else
        {
            double final_runtime;
            final_runtime = (endTime - startTime) / 10000;
            final_runtime = final_runtime / 100000;
            System.out.println("算法运行时间： " + final_runtime + "秒");
        }
        Runtime r = Runtime.getRuntime();
        float memory;
        memory = r.totalMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("JVM总内存：%.3fMB\n", memory);
        memory = r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf(" 空闲内存：%.3fMB\n", memory);
        memory = r.totalMemory() - r.freeMemory();
        memory = memory / 1024 / 1024;
        System.out.printf("已使用的内存：%.4fMB\n", memory);
        //------------------------------------------------------
    }
}
