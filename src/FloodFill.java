import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2;
        System.out.println(Arrays.deepToString(floodFill(image, sr, sc, color)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        // 记录原来的点的颜色
        int raw = image[sr][sc];
        if(raw != color){
            help(image, sr, sc, color, raw);
        }
        return image;
    }

    public static void help(int[][] image, int sr, int sc, int color, int raw){
        if (image[sr][sc] == color){
            return;
        }
        // 修改点的颜色
        image[sr][sc] = color;
        // 递归该点上下左右四个方向
        if(sr - 1 > -1 && image[sr - 1][sc] == raw){ // 上
            help(image, sr - 1, sc, color, raw);
        }
        if (sr + 1 < image.length && image[sr + 1][sc] == raw){ // 下
            help(image, sr + 1, sc, color, raw);
        }
        if(sc - 1 > -1 && image[sr][sc - 1] == raw){
            help(image, sr, sc - 1, color, raw);
        }
        if (sc + 1 < image[0].length && image[sr][sc + 1] == raw){
            help(image, sr, sc + 1, color, raw);
        }
    }
}
