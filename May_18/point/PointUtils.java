package club.banyuan.point;

import org.junit.Assert;
import org.junit.Test;
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class PointUtils {
    /**
     * 返回具有最大Y值的点。如果存在多个这样的点，则只需选择一个即可。
     */
    public static Point highestPoint(List<Point> points) {
        /* 这等效于实验室中提到的初始化步骤。 */
        Iterator<Point> pointIterator = points.iterator();
        // TODO 使用迭代器完成此方法!
        Point rlt = points.get(0);
        while(pointIterator.hasNext()){
            Point next = pointIterator.next();
            if (next.getY() > rlt.getY()){
                rlt = next;
            }
        }
        return rlt;
    }

    /**
     * 返回一个新点，新点的X值是所有给定点的X值的平均值，Y值是所有给定点的Y值的平均值。
     */
    public static Point centroid(List<Point> points) {
        if (points == null || points.size() == 0){
            return null;
        }

        Iterator<Point> pointIterator = points.iterator();
        // TODO 使用迭代器完成此方法!
        int sumX = 0;
        int sumY = 0;
        while (pointIterator.hasNext()){
            Point point = pointIterator.next();
            sumX += point.getX();
            sumY += point.getY();
        }
        return new Point(sumX / points.size(),sumY / points.size());
    }

    public void test() {
        List<Point> points = new LinkedList<>();
        points.add(new Point(1, 1));
        points.add(new Point(1, 3));
        points.add(new Point(3, 1));
        points.add(new Point(3, 3));

        /* 应该是Point [x = 3，y = 3]或Point [x = 1，y = 3] */
        Point x = highestPoint(points);
        System.out.println(x);
        // TODO 编写一个单元测试
        Assert.assertEquals(3, highestPoint(points).getY());
        Assert.assertTrue(x.equals(new Point(1,3)) || x.equals(new Point(3,3)));
        // assert 结果是[x = 3，y = 3] 或  [x = 1，y = 3]中的一个

        // 应该是Point[x=2,y=2]
        Point centroid = centroid(points);
        System.out.println(centroid);
        // TODO 编写一个单元测试测试结果
        Assert.assertEquals(2,centroid.getX());
        Assert.assertEquals(2,centroid.getY());
        
        points = new LinkedList<Point>();
        points.add(new Point(1, 1));
        points.add(new Point(1, -1));
        points.add(new Point(-1, 1));
        points.add(new Point(-1, -1));

        /* 应该是Point[x=1,y=1] 或[x=-1,y=1] */
        x = highestPoint(points);
        System.out.println(x);
        // TODO 编写一个单元测试
        Assert.assertTrue(x.equals(new Point(1,1)) || x.equals(new Point(-1 , 1)));
        // assert 结果是[x=1,y=1] 或  [x=-1,y=1]中的一个

        Assert.assertEquals(1,1);
        // 应该是[x=0,y=0]
        Point centroid1 = centroid(points);
        System.out.println(centroid1);
        // TODO 编写一个单元测试测试结果
        Assert.assertEquals(1,centroid1.getX());
        Assert.assertEquals(1,centroid1.getY());
    }
}
