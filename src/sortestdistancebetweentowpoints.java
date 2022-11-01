public class sortestdistancebetweentowpoints {
    public static void main(String[] args) {
        double[][]points={{1,2},{0.5,1.6},{1,6},{2,4},{0.9,5}};//insallisation 2D dimenstial array
        int p1=0;int p2=1;
        //starting shortest distance we take
        double shortestdistance=distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
        for (int i=0;i<points.length;i++){
            for (int j=i+1;j<points.length;j++){
                double Distance=distance(points[i][0],points[i][1],points[j][0],points[j][1]);
                if (shortestdistance>Distance){
                    p1=i;
                    p2=j;
                    shortestdistance=Distance;//updtate the distance
                }

            }
        }
        System.out.println("the closest two points are "+"("+points[p1][0]+","+points[p1][1]+")"+"and"+"("+
                points[p2][0]+","+points[p2][1]);

    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));

    }
}
