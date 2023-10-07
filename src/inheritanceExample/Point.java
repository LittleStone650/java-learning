package inheritanceExample;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Point))  // 在object中写判断，看obj是不是Point的实例，如果是的话判断，如果不是的话直接返回false
//            return false;
//
//        var other =  (Point) obj; // using down casting
//        return other.x == x && other.y == y;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x,y);
//    }



    // 学会使用小工具来构造equals和hashcode的方法。比自己写简单
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
