import java.util.Scanner;

public class ShortestDistance{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the points number :");
        int pointsNumber = input.nextInt();
        
        int count =0;
        double [][] points= new double[pointsNumber][2];
        for (int i= 0; i<points.length; i++){
            count += 1;
            System.out.println("enter the point number "+count );
            points[i][0] =input.nextDouble();
            points[i][1] = input.nextDouble();
        
        }
        
        int p1 = 0, p2=1 ;
        double shortDistanse = distance(points[p1][0], points[p2][1], points [p2][0], points[p2][1]);
        for (int i =0; i< points.length;i++ ){
            for(int j = i+1 ; j<points.length; j++){
                double distance = distance(points[i][0], points[i][1], points[j][0], points[j][1]);
                
                if (shortDistanse>distance){
                    p1 = i;
                    p2= j;
                    shortDistanse = distance;
                }
            }
            
        }
        
        System.out.println("the shortest distance betwen the ("+points[p1][0]+ " , "+points[p1][1] +") and the ("+points[p2][0] + " , " +points[p2][1]+ ") points");
        
        
    }
    public static double distance(double x1,double y1,double x2,double y2){
        return Math.sqrt((x2-x1) * (x2 -x1) + (y2-y1)*(y2-y1));
    }
