public record PointWithDis(Integer x, Integer y, Double diss) {}

class Solution {

    public int[][] kClosest(int[][] points, int k) {
        List<PointWithDis> list = new ArrayList();

        for(var point: points) {
            var x = point[0];
            var y = point[1];
            var diss = Math.sqrt(x*x + y*y);
            list.add(new PointWithDis(x,y, diss));
        }

        list.sort((a, b) -> Double.compare(a.diss(), b.diss()));

        return list.stream()
        .limit(k)
        .map(el -> new int[] {el.x(), el.y()})
        .toArray(int[][]::new);
    }

}
