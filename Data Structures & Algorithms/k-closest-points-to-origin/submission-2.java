public record PointWithDis(Integer x, Integer y, Double diss) {}

class Solution {

    public int[][] kClosest(int[][] points, int k) {
        List<PointWithDis> list = new ArrayList();
        PriorityQueue<PointWithDis> queue = new PriorityQueue(
            Comparator.comparingDouble(PointWithDis::diss).reversed()
        );

        for(var point: points) {
            var x = point[0];
            var y = point[1];
            var diss = Math.sqrt(x*x + y*y);
            queue.offer(new PointWithDis(x,y, diss));
            if(queue.size() > k) {
                queue.poll();
            }
        }

        int[][] result = new int[queue.size()][2];
        for(int i = 0; i < result.length; i++) {
            var point = queue.poll();
            result[i] = new int[] {point.x(), point.y()};
        }
        return result;
    }

}
